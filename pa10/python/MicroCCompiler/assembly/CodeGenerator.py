import sys
import os
from typing import List

from .CodeObject import CodeObject
from .InstructionList import InstructionList
from .instructions import *
from ..compiler import *
from ..ast import *
from ..ast.visitor.AbstractASTVisitor import AbstractASTVisitor

class CodeGenerator(AbstractASTVisitor):

  def __init__(self):
    self.intRegCount = 1
    self.floatRegCount = 1
    self.intTempPrefix = 't'
    self.floatTempPrefix = 'f'
    self.loopLabel = 0
    self.elseLabel = 0
    self.outLabel = 0
    self.currFunc = None
    self.numCtrlStructs = 0;

  def getIntRegCount(self):
    return self.intRegCount

  def getFloatRegCount(self):
    return self.floatRegCount



  def postprocessVarNode(self, node: VarNode) -> CodeObject:
    sym = node.getSymbol()

    co = CodeObject(sym)
    co.lval = True
    co.type = node.getType()

    return co
  
  def postprocessIntLitNode(self, node: IntLitNode) -> CodeObject:
      co = CodeObject()
      temp = self.generateTemp(Scope.Type.INT)
      val = node.getVal()
      co.code.append(Li(temp, val))
      co.temp = temp
      co.lval = False
      co.type = node.getType()


      return co

  def postprocessFloatLitNode(self, node: FloatLitNode) -> CodeObject:
    co = CodeObject()

    temp = self.generateTemp(Scope.Type.FLOAT)
    val = node.getVal()
  
    co.code.append(FImm(temp, val))
    co.temp = temp
    co.lval = False
    co.type = node.getType()

    return co

  def postprocessBinaryOpNode(self, node: BinaryOpNode, left: CodeObject, right: CodeObject) -> CodeObject:
    ''' 
    Copy from PA8
    '''
    co = CodeObject()
    newcode = CodeObject()

    optype = str(node.op) # Get string corresponding to the operation (+, -, *, /)
    #Step 1: add code from left child
    
    #Step 1a: check if left child is an lval or rval; if lval, rvalify
    if left.lval == True:
      left = self.rvalify(left) # create new code object, fix this, this is bad?
      #print("Left type after rvalify:", left.type)
    co.code.extend(left.code)

    #Step 2: add code from right child

    if right.lval == True:
      right = self.rvalify(right)
    
    co.code.extend(right.code)
  
    #Step 2a: check if left child is an lval or rval; if lval, rvalify

    #Step 3: generate correct binop.  8 cases for 4 ops, float vs. int. for 4 arithmetic ops.

    if left.type != right.type:
      print("Incompatible types in binary operation!\n")
    
    # Get appropriate new temporary for result of operation
    if left.type == Scope.Type.INT:
      #print("Processing binop with INTs")
      newtemp = self.generateTemp(Scope.Type.INT)
      if optype == "OpType.ADD":
        newcode = Add(left.temp, right.temp, newtemp)
      elif optype == "OpType.SUB":
        newcode = Sub(left.temp, right.temp, newtemp)
      elif optype == "OpType.MUL":
        newcode = Mul(left.temp, right.temp, newtemp)
      elif optype == "OpType.DIV":
        newcode = Div(left.temp, right.temp, newtemp)
      else:
        print("Bad operation in binop!\n")


    elif left.type == Scope.Type.FLOAT:
      newtemp = self.generateTemp(Scope.Type.FLOAT)
      if optype == "OpType.ADD":
        newcode = FAdd(left.temp, right.temp, newtemp)
      elif optype == "OpType.SUB":
        newcode = FSub(left.temp, right.temp, newtemp)
      elif optype == "OpType.MUL":
        newcode = FMul(left.temp, right.temp, newtemp)
      elif optype == "OpType.DIV":
        newcode = FDiv(left.temp, right.temp, newtemp)
      else:
        print("Bad operation in binop!\n")

    else:
      print("Bad type in binary op!\n")


  


    co.code.append(newcode)
    co.lval = False
    co.temp = newtemp
    co.type = left.type
    #print(newcode)
    return co
	 


  def postprocessUnaryOpNode(self, node: UnaryOpNode, expr: CodeObject) -> CodeObject:
    co = CodeObject()  # Step 0

    if expr.lval:
      expr = self.rvalify(expr)

    co.code.extend(expr.code) # Add in all the code required to get expr after rvalifying


    if expr.type == Scope.Type.INT:
      temp = self.generateTemp(Scope.Type.INT)
      co.code.append(Neg(src=expr.temp, dest=temp))
      

    elif expr.type == Scope.Type.FLOAT:
      temp = self.generateTemp(Scope.Type.FLOAT)
      co.code.append(FNeg(src=expr.temp, dest=temp))

    else:
      raise Exception("Non int/float type in unary op!")

    co.type = expr.type
    co.temp = temp
    co.lval = False 

    return co


  def postprocessAssignNode(self, node: AssignNode, left: CodeObject, right: CodeObject) -> CodeObject:
    co = CodeObject()
    if right.lval:
      right = self.rvalify(right)
    co.code.extend(right.code)
    assert(left.isVar())
    temp = self.generateTemp(Scope.Type.INT)
    if left.getSTE()._isLocal:
      if left.getType() == Scope.Type.FLOAT:
        co.code.append(Fsw(right.temp, "fp", self.generateAddrFromVariable(left)))
      else:
         co.code.append(Sw(right.temp, "fp", self.generateAddrFromVariable(left)))
    else:
      co.code.append(La(temp, self.generateAddrFromVariable(left)))
      if left.getType() == Scope.Type.FLOAT:
        co.code.append(Fsw(right.temp, temp, "0"))
      else:
        co.code.append(Sw(right.temp, temp, "0"))

    return co


  def postprocessStatementListNode(self, node: StatementListNode, statements: list) -> CodeObject:
    co = CodeObject()

    for subcode in statements:
      co.code.extend(subcode.code)

    co.type = None
    return co

  def postprocessReadNode(self, node: ReadNode, var: CodeObject) -> CodeObject:
 
    co = CodeObject()

    assert(var.isVar())

    if var.type is Scope.Type.INT:
      temp = self.generateTemp(Scope.Type.INT)
      co.code.append(GetI(temp))
      address = self.generateAddrFromVariable(var)
      if var.getSTE()._isLocal:
        co.code.append(Sw(temp, "fp", address))
      else:
        temp2 = self.generateTemp(Scope.Type.INT)
        co.code.append(La(temp2, address))
        co.code.append(Sw(temp, temp2, '0'))

    elif var.type is Scope.Type.FLOAT:
      temp = self.generateTemp(Scope.Type.FLOAT)
      co.code.append(GetF(temp))
      address = self.generateAddrFromVariable(var)
      if var.getSTE()._isLocal:
        co.code.append(Fsw(temp, "fp", address))
      else:
        temp2 = self.generateTemp(Scope.Type.INT)
        co.code.append(La(temp2, address))
        co.code.append(Fsw(temp, temp2, '0'))

    else:
      raise Exception("Bad type in read node")


    return co




  def postprocessWriteNode(self, node: WriteNode, expr: CodeObject) -> CodeObject:
    co = CodeObject()
    if expr.lval:
      expr = self.rvalify(expr)

    co.code.extend(expr.code)


    if expr.type is Scope.Type.INT:
      co.code.append(PutI(expr.temp))

    elif expr.type is Scope.Type.FLOAT:
      co.code.append(PutF(expr.temp))

    elif expr.type is Scope.Type.STRING:
      co.code.append(PutS(expr.temp))

    return co
	
  def postprocessCondNode(self, node: CondNode, left: CodeObject, right: CodeObject) -> CodeObject:
    node.setOp(node.getReversedOp(node.getOpFromString(node.getOp()))) # Reverse comparison type
    if left.lval:
      left = self.rvalify(left)
    if right.lval:
      right = self.rvalify(right)
    node.setLeft(left)
    node.setRight(right)
    co = CodeObject()
    co.code.extend(left.code)
    co.code.extend(right.code)
    
    return co


  def postprocessIfStatementNode(self, node: IfStatementNode, cond: CodeObject, tlist: CodeObject, elist: CodeObject) -> CodeObject:
    self._incrnumCtrlStruct()
    labelnum = self._getnumCtrlStruct()
   
    co = CodeObject()
    co.code.extend(cond.code)

    expression = node.getCondExpr()
    left = expression.left
    right = expression.right

    left_temp = left.temp
    right_temp = right.temp


    expression_string = str(expression.getOp())
    if left.type == Scope.Type.FLOAT:
      temp = self.generateTemp(Scope.Type.INT)
      if expression_string == "OpType.LT":
        co.code.append(Flt(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"else{labelnum}"))
      elif expression_string == "OpType.GT":
        co.code.append(Fle(right_temp, left_temp, temp))
        co.code.append(Beq(temp, "x0", f"else{labelnum}"))
      elif expression_string == "OpType.EQ":
        co.code.append(Feq(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"else{labelnum}"))
      elif expression_string == "OpType.NE":
        co.code.append(Feq(left_temp, right_temp, temp))
        co.code.append(Beq(temp, "x0", f"else{labelnum}"))
      elif expression_string == "OpType.LE":
        co.code.append(Fle(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"else{labelnum}"))
      elif expression_string == "OpType.GE":
        co.code.append(Flt(left_temp, right_temp, temp))
        co.code.append(Beq(temp, "x0", f"else{labelnum}"))

      

    else:
      if expression_string == "OpType.LT":
        co.code.append(Blt(left_temp, right_temp, f"else{labelnum}"))
      elif expression_string == "OpType.GT":
        co.code.append(Bgt(left_temp, right_temp, f"else{labelnum}"))
      elif expression_string == "OpType.EQ":
        co.code.append(Beq(left_temp, right_temp,f"else{labelnum}" ))
      elif expression_string == "OpType.NE":
        co.code.append(Bne(left_temp, right_temp, f"else{labelnum}" ))
      elif expression_string == "OpType.LE":
        co.code.append(Ble(left_temp, right_temp, f"else{labelnum}" ))
      elif expression_string == "OpType.GE":
        co.code.append(Bge(left_temp, right_temp, f"else{labelnum}" ))

    co.code.append(tlist.code)
    co.code.append(J(f"done{labelnum}"))
    
    co.code.append(Label(f"else{labelnum}")) #keeping the else label no matter what for reasons
    if not (elist is None):
      co.code.append(elist.code) 
    co.code.append(Label(f"done{labelnum}"))
    
    return co

  def postprocessWhileNode(self, node: WhileNode, cond: CodeObject, wlist:
  CodeObject) -> CodeObject:
    self._incrnumCtrlStruct()
    labelnum = self._getnumCtrlStruct()
    co = CodeObject()
    co.code.append(Label(f"while{labelnum}"))
    co.code.extend(cond.code)

   
    expression = node.getCondExpr()
    left = expression.left
    right = expression.right

    left_temp = left.temp
    right_temp = right.temp

    expression_string = str(expression.getOp())
    if left.type == Scope.Type.FLOAT:
      temp = self.generateTemp(Scope.Type.INT)
      if expression_string == "OpType.LT":
        co.code.append(Flt(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"exit{labelnum}"))
      elif expression_string == "OpType.GT":
        co.code.append(Flt(left_temp, right_temp, temp))
        co.code.append(Beq(temp, "x0", f"exit{labelnum}"))
      elif expression_string == "OpType.EQ":
        co.code.append(Feq(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"exit{labelnum}"))
      elif expression_string == "OpType.NE":
        co.code.append(Feq(left_temp, right_temp, temp))
        co.code.append(Beq(temp, "x0", f"exit{labelnum}"))
      elif expression_string == "OpType.LE":
        co.code.append(Fle(left_temp, right_temp, temp))
        co.code.append(Bne(temp, "x0", f"exit{labelnum}"))
      elif expression_string == "OpType.GE":
        co.code.append(Fle(left_temp, right_temp, temp))
        co.code.append(Beq(temp, "x0", f"exit{labelnum}")) 

    else:
      if expression_string == "OpType.LT":
        co.code.append(Blt(left_temp, right_temp, f"exit{labelnum}"))
      elif expression_string == "OpType.GT":
        co.code.append(Bgt(left_temp, right_temp, f"exit{labelnum}"))
      elif expression_string == "OpType.EQ":
        co.code.append(Beq(left_temp, right_temp, f"exit{labelnum}" ))
      elif expression_string == "OpType.NE":
        co.code.append(Bne(left_temp, right_temp, f"exit{labelnum}" ))
      elif expression_string == "OpType.LE":
        co.code.append(Ble(left_temp, right_temp, f"exit{labelnum}" ))
      elif expression_string == "OpType.GE":
        co.code.append(Bge(left_temp, right_temp, f"exit{labelnum}" ))

    co.code.extend(wlist.code)
    co.code.append(J(f"while{labelnum}"))
    co.code.append(Label(f"exit{labelnum}"))

    return co

  def postprocessReturnNode(self, node: ReturnNode, retExpr: CodeObject) -> CodeObject:
    '''
    This is responsible for handing things like "return b" or "return".  
    Notably, this part will NOT generate a RET instruction.
    Step 1: rvalify (if necessary) code for the retExpr
    Step 2: add in retExpr code
    Step 3: store return value from retExpr's temporary to the return value spot in the stack (8 up from FP)
    
    '''
    co = CodeObject()
    if retExpr.lval:
      retExpr = self.rvalify(retExpr)
    co.code.append(retExpr.code)
    if retExpr.getType() == Scope.Type.FLOAT:
      co.code.append(Fsw(retExpr.temp, "fp", "8"))
    else:
      co.code.append(Sw(retExpr.temp, "fp", "8"))
    return co

  def preprocessFunctionNode(self, node: FunctionNode):
    co = CodeObject()
    self.currFunc = node.getFuncName()

    self.intRegCount = 0
    self.floatRegCount = 0
    



  def postprocessFunctionNode(self, node: FunctionNode, body: CodeObject) -> CodeObject:
    '''
    Responsible for actually putting together a function's code
    Step 1: Set up stack frame
    Step 2: Save temporaries
    Step 3: Add in body code (this will include a return node)
    Step 4: Load temporaries
    Step 5: Undo stack frame
    Step 6: Append the RET instruction
    '''

    co = CodeObject()
    co.code.append(Label(self._generateFunctionEntryLabel(node.getFuncName())))
    local_var_count = node.getScope().getNumLocals()
    co.code.append(Sw("fp", "sp", "0"))
    co.code.append(Mv("sp", "fp"))
    co.code.append(Addi("sp", "-4", "sp"))

    # space for locals
    co.code.append(Addi("sp", f"{-4*local_var_count}", "sp")) 

    int_temp_count = self.getIntRegCount() 
    #int_temp_count = 5
 
    float_temp_count = self.getFloatRegCount()

    #store int temps
    for i in range(int_temp_count):
      co.code.append(Sw(f"t{i}", "sp", "0"))
      co.code.append(Addi("sp", f"-4", "sp")) 

    #store float temps
    for i in range(float_temp_count):
      co.code.append(Fsw(f"f{i}", "sp", "0"))
      co.code.append(Addi("sp",  "-4", "sp")) 

    co.code.append(body)

    #load float temps
    
    for i in reversed(range(float_temp_count)):
      co.code.append(Addi("sp",  "4", "sp"))
      co.code.append(Flw(f"f{i}", "sp", "0"))
     

    # load int temps
    for i in reversed(range(int_temp_count)):
      co.code.append(Addi("sp",  "4", "sp"))
      co.code.append(Lw(f"t{i}", "sp", "0"))
    
    # undo locals
    # co.code.append(Addi("sp", f"{4*local_var_count}", "sp")) 

    # co.code.append(Addi("sp", "4", "sp")) 
    co.code.append(Mv("fp", "sp"))
    co.code.append(Lw("fp", "fp", "0"))
    co.code.append(Ret())

    return co


	

  def postprocessFunctionListNode(self, node: FunctionListNode, functions: List[CodeObject]) -> CodeObject:
    '''
    Generate code for the list of functions. This is the "top level" code generation function
    Step 1: Set fp to point to sp
    Step 2: Insert a JR to main
    Step 3: Insert a HALT
    Step 4: Include all the code of the functions
    '''

    co = CodeObject()

    co.code.append(Mv("sp", "fp"))
    co.code.append(Jr(self._generateFunctionEntryLabel("main")))
    co.code.append(Halt())
    co.code.append(Blank())

    # Add code for each of the functions
    for c in functions:
      co.code.extend(c.code)
      co.code.append(Blank())
    
    return co


  def postprocessCallNode(self, node: CallNode, args: List[CodeObject]) -> CodeObject:
    '''
    Responsible for handling when we actually make a function call, for example, something like a = foo(b)
    The call node would be the foo(b) call.
    Step 1: For each argument, insert rvalified code object and push result to stack
    Step 2: Allocate space for return value (what if there isn't one?)
    Step 3: Push ra to stack
    Step 4: JR to function
    Step 5: Pop ra back from stack
    Step 6: Pop return value into fresh temporary
    Step 7: Remove arguments from stack (move sp up, no need to keep these values)
    '''

    co = CodeObject()

    for arg in args:
      if arg.lval:
        arg = self.rvalify(arg)
      co.code.append(arg.code)
      if arg.getType() ==  Scope.Type.FLOAT:
        co.code.append(Fsw(arg.temp, "sp", "0"))
      else:
        co.code.append(Sw(arg.temp, "sp", "0"))
      co.code.append(Addi("sp", "-4", "sp"))

    co.code.append(Addi("sp", "-4", "sp")) # return value space

    co.code.append(Sw("ra", "sp", "0")) # save ra
    co.code.append(Addi("sp","-4", "sp"))

    co.code.append(Jr(self._generateFunctionEntryLabel(node.getFuncName())))

    co.code.append(Addi("sp", "4", "sp")) 
    co.code.append(Lw("ra", "sp", "0"))
    
    
    co.code.append(Addi("sp", "4", "sp")) 
    if node.type == Scope.Type.FLOAT:
      temp = self.generateTemp(Scope.Type.FLOAT)
      co.code.append(Flw(temp, "sp", "0"))
    else:
      temp = self.generateTemp(Scope.Type.INT)
      co.code.append(Lw(temp, "sp", "0"))      
    

    co.code.append(Addi("sp", f"{4*len(args)}", "sp")) # Get rid of arguments

    co.temp = temp
    co.type = node.type
    co.lval = False
    return co


  
  def generateTemp(self, t: Scope.Type) -> str:
    if t == Scope.Type.INT:
      s = self.intTempPrefix + str(self.intRegCount)
      self.intRegCount += 1
      return s
    elif t == Scope.Type.FLOAT:
      s = self.floatTempPrefix + str(self.floatRegCount)
      self.floatRegCount += 1
      return s
    else:
      raise Exception("Generating temp for bad type")



  def rvalify(self, lco : CodeObject) -> CodeObject:
    assert(lco.lval is True)
    assert(lco.isVar() is True)
    
    co = CodeObject()

    address = self.generateAddrFromVariable(lco)
    
    if lco.getSTE()._isLocal:
      if lco.type is Scope.Type.INT:
        temp2 = self.generateTemp(Scope.Type.INT)
        co.code.append(Lw(temp2, 'fp', address))

      elif lco.type is Scope.Type.FLOAT:
        temp2 = self.generateTemp(Scope.Type.FLOAT)
        co.code.append(Flw(temp2, 'fp', address))
    else:  
      temp1 = self.generateTemp(Scope.Type.INT) # Addresses are always ints
      co.code.append(La(temp1, address)) # Load address (global only)

      if lco.type is Scope.Type.INT:
        temp2 = self.generateTemp(Scope.Type.INT)
        co.code.append(Lw(temp2, temp1, '0'))

      elif lco.type is Scope.Type.FLOAT:
        temp2 = self.generateTemp(Scope.Type.FLOAT)
        co.code.append(Flw(temp2, temp1, '0'))

      elif lco.type is Scope.Type.STRING:
        temp2 = temp1
      else:
        raise Exception("Bad type in rvalify!")

    co.type = lco.type
    co.lval = False
    co.temp = temp2


    return co


  def generateAddrFromVariable(self, lco: CodeObject) -> str:
    ''' 
    Copy from PA8/9
    Don't use the exact same thing as in PA8...use this to get addresses
    symbol = lco.getSTE()
    address = symbol.addressToString()
    Otherwise the hex addresses for globals will get mangled
    '''
    symbol = lco.getSTE()
    address = symbol.addressToString()

    return address


  def _incrnumCtrlStruct(self):
    self.numCtrlStructs += 1

  def _getnumCtrlStruct(self) -> int:
    return self.numCtrlStructs
  
  def _generateThenLabel(self, num: int) -> str:
    return "then"+str(num)

  def _generateElseLabel(self, num: int) -> str:
    return "else"+str(num)

  def _generateLoopLabel(self, num: int) -> str:
    return "loop"+str(num)

  def _generateDoneLabel(self, num: int) -> str:
    return "done"+str(num)
  


  
  def _generateFunctionEntryLabel(self, func = None) -> str:
    if func is None:
      return "func_entry_" + self.currFunc
    else:
      return "func_entry_" + func
    
  def _generateFunctionCodeLabel(self, func = None) -> str:
    if func is None:
      return "func_code_" + self.currFunc
    else:
      return "func_code_" + func  


  def _generateFunctionRetLabel(self) -> str:
    return "func_ret_" + self.currFunc