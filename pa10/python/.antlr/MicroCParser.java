// Generated from /Users/mckinnec/github/csc363-s26-dev/pa10-master/python/MicroC.g4 by ANTLR 4.13.1


from typing import List

from MicroCCompiler.compiler.SymbolTable import SymbolTable
from MicroCCompiler.compiler.Scope import Scope
from MicroCCompiler.ast.IntLitNode import IntLitNode
from MicroCCompiler.ast.FloatLitNode import FloatLitNode
from MicroCCompiler.ast.AssignNode import AssignNode
from MicroCCompiler.ast.VarNode import VarNode
from MicroCCompiler.ast.WriteNode import WriteNode
from MicroCCompiler.ast.ReadNode import ReadNode
from MicroCCompiler.ast.ReturnNode import ReturnNode
from MicroCCompiler.ast.CondNode import CondNode
from MicroCCompiler.ast.CallNode import CallNode
from MicroCCompiler.ast.IfStatementNode import IfStatementNode
from MicroCCompiler.ast.WhileNode import WhileNode
from MicroCCompiler.ast.StatementListNode import StatementListNode
from MicroCCompiler.ast.ASTNode import ASTNode
from MicroCCompiler.ast.BinaryOpNode import BinaryOpNode
from MicroCCompiler.ast.UnaryOpNode import UnaryOpNode
from MicroCCompiler.ast.FunctionListNode import FunctionListNode
from MicroCCompiler.ast.FunctionNode import FunctionNode

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MicroCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, IDENTIFIER=27, INT_LITERAL=28, FLOAT_LITERAL=29, STR_LITERAL=30, 
		COMMENT=31, WS=32;
	public static final int
		RULE_program = 0, RULE_decls = 1, RULE_var_decls = 2, RULE_ident = 3, 
		RULE_var_decl = 4, RULE_str_decl = 5, RULE_base_type = 6, RULE_func_decl = 7, 
		RULE_functions = 8, RULE_function = 9, RULE_params = 10, RULE_params_rest = 11, 
		RULE_param = 12, RULE_statements = 13, RULE_statement = 14, RULE_base_stmt = 15, 
		RULE_read_stmt = 16, RULE_print_stmt = 17, RULE_return_stmt = 18, RULE_assign_stmt = 19, 
		RULE_if_stmt = 20, RULE_while_stmt = 21, RULE_primary = 22, RULE_unaryminus_expr = 23, 
		RULE_call_expr = 24, RULE_arg_list = 25, RULE_args_rest = 26, RULE_expr = 27, 
		RULE_term = 28, RULE_cond = 29, RULE_cmpop = 30, RULE_mulop = 31, RULE_addop = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decls", "var_decls", "ident", "var_decl", "str_decl", "base_type", 
			"func_decl", "functions", "function", "params", "params_rest", "param", 
			"statements", "statement", "base_stmt", "read_stmt", "print_stmt", "return_stmt", 
			"assign_stmt", "if_stmt", "while_stmt", "primary", "unaryminus_expr", 
			"call_expr", "arg_list", "args_rest", "expr", "term", "cond", "cmpop", 
			"mulop", "addop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'string'", "'='", "'int'", "'float'", "'('", "')'", "'{'", 
			"'}'", "','", "'read'", "'print'", "'return'", "'if'", "'else'", "'while'", 
			"'-'", "'<'", "'<='", "'>='", "'=='", "'!='", "'>'", "'*'", "'/'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFIER", "INT_LITERAL", "FLOAT_LITERAL", "STR_LITERAL", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MicroC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	def setSymbolTable(self, st: SymbolTable):
	  self.st = st

	def getSymbolTable(self) -> SymbolTable:
	  return self.st

	def setAST(self, node: ASTNode):
	  self.ast = node

	def getAST(self) -> ASTNode:
	  return self.ast

	def addParams(self, types: List[Scope.Type], names: List[str]):
	  for i in reversed(range(len(types))):
	    self.st.addArgument(types[i], names[i])


	public MicroCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunctionsContext functions;
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			decls();
			setState(67);
			((ProgramContext)_localctx).functions = functions();
			self.setAST(((ProgramContext)_localctx).functions.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclsContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public Str_declContext str_decl() {
			return getRuleContext(Str_declContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				var_decl();
				setState(71);
				decls();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				str_decl();
				setState(74);
				decls();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				func_decl();
				setState(77);
				decls();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declsContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_declsContext var_decls() {
			return getRuleContext(Var_declsContext.class,0);
		}
		public Var_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decls; }
	}

	public final Var_declsContext var_decls() throws RecognitionException {
		Var_declsContext _localctx = new Var_declsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decls);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				var_decl();
				setState(83);
				var_decls();
				}
				break;
			case T__8:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MicroCParser.IDENTIFIER, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public Base_typeContext base_type;
		public IdentContext ident;
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((Var_declContext)_localctx).base_type = base_type();
			setState(91);
			((Var_declContext)_localctx).ident = ident();
			setState(92);
			match(T__0);
			self.st.addVariable(((Var_declContext)_localctx).base_type.t, (((Var_declContext)_localctx).ident!=null?_input.getText(((Var_declContext)_localctx).ident.start,((Var_declContext)_localctx).ident.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Str_declContext extends ParserRuleContext {
		public IdentContext ident;
		public Token val;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode STR_LITERAL() { return getToken(MicroCParser.STR_LITERAL, 0); }
		public Str_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_decl; }
	}

	public final Str_declContext str_decl() throws RecognitionException {
		Str_declContext _localctx = new Str_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
			((Str_declContext)_localctx).ident = ident();
			setState(97);
			match(T__2);
			setState(98);
			((Str_declContext)_localctx).val = match(STR_LITERAL);
			setState(99);
			match(T__0);
			self.st.addVariable(Scope.Type.STRING, (((Str_declContext)_localctx).ident!=null?_input.getText(((Str_declContext)_localctx).ident.start,((Str_declContext)_localctx).ident.stop):null), (((Str_declContext)_localctx).val!=null?((Str_declContext)_localctx).val.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_typeContext extends ParserRuleContext {
		public Scope.Type t;
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_base_type);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__3);
				((Base_typeContext)_localctx).t =  Scope.Type.INT;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__4);
				((Base_typeContext)_localctx).t =  Scope.Type.FLOAT;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declContext extends ParserRuleContext {
		public Base_typeContext base_type;
		public IdentContext ident;
		public ParamsContext params;
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((Func_declContext)_localctx).base_type = base_type();
			setState(109);
			((Func_declContext)_localctx).ident = ident();
			setState(110);
			match(T__5);
			setState(111);
			((Func_declContext)_localctx).params = params();
			setState(112);
			match(T__6);
			setState(113);
			match(T__0);
			self.st.addFunction(((Func_declContext)_localctx).base_type.t, (((Func_declContext)_localctx).ident!=null?_input.getText(((Func_declContext)_localctx).ident.start,((Func_declContext)_localctx).ident.stop):null), ((Func_declContext)_localctx).params.types);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionListNode node;
		public FunctionContext function;
		public FunctionsContext functions;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functions);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((FunctionsContext)_localctx).function = function();
				setState(117);
				((FunctionsContext)_localctx).functions = functions();
				((FunctionsContext)_localctx).node =  FunctionListNode(((FunctionsContext)_localctx).function.node, ((FunctionsContext)_localctx).functions.node);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((FunctionsContext)_localctx).node =  FunctionListNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionNode node;
		public Base_typeContext base_type;
		public IdentContext ident;
		public ParamsContext params;
		public StatementsContext statements;
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Var_declsContext var_decls() {
			return getRuleContext(Var_declsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((FunctionContext)_localctx).base_type = base_type();
			setState(124);
			((FunctionContext)_localctx).ident = ident();
			setState(125);
			match(T__5);
			setState(126);
			((FunctionContext)_localctx).params = params();
			setState(127);
			match(T__6);

			# Add FunctionSymbolTable entry to global scope
			ste = self.st.getSymbolTableEntry((((FunctionContext)_localctx).ident!=null?_input.getText(((FunctionContext)_localctx).ident.start,((FunctionContext)_localctx).ident.stop):null));
			if ste is None or not ste.isDefined():
			  self.st.addFunction(((FunctionContext)_localctx).base_type.t, (((FunctionContext)_localctx).ident!=null?_input.getText(((FunctionContext)_localctx).ident.start,((FunctionContext)_localctx).ident.stop):null), ((FunctionContext)_localctx).params.types);          
			  ste = self.st.getSymbolTableEntry((((FunctionContext)_localctx).ident!=null?_input.getText(((FunctionContext)_localctx).ident.start,((FunctionContext)_localctx).ident.stop):null));
			  ste.setDefined(True);
			else:
			  raise Exception("Function already defined");
			self.st.pushScope((((FunctionContext)_localctx).ident!=null?_input.getText(((FunctionContext)_localctx).ident.start,((FunctionContext)_localctx).ident.stop):null));
			self.addParams(((FunctionContext)_localctx).params.types, ((FunctionContext)_localctx).params.names);

			setState(129);
			match(T__7);
			setState(130);
			var_decls();
			setState(131);
			((FunctionContext)_localctx).statements = statements();
			setState(132);
			match(T__8);

			# Create FunctionNode
			funcScope = self.st.currentScope();
			((FunctionContext)_localctx).node =  FunctionNode(((FunctionContext)_localctx).statements.node, (((FunctionContext)_localctx).ident!=null?_input.getText(((FunctionContext)_localctx).ident.start,((FunctionContext)_localctx).ident.stop):null), funcScope);

			# Done with this scope, so pop the scope
			self.st.popScope();

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public list names;
		public list types;
		public ParamContext param;
		public Params_restContext params_rest;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Params_restContext params_rest() {
			return getRuleContext(Params_restContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((ParamsContext)_localctx).param = param();
				setState(136);
				((ParamsContext)_localctx).params_rest = params_rest();

				((ParamsContext)_localctx).names =  [];
				((ParamsContext)_localctx).types =  [];
				_localctx.names.append(((ParamsContext)_localctx).param.name);
				_localctx.names.extend(((ParamsContext)_localctx).params_rest.names);
				_localctx.types.append(((ParamsContext)_localctx).param.type);
				_localctx.types.extend(((ParamsContext)_localctx).params_rest.types);

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{

				((ParamsContext)_localctx).names =  [];
				((ParamsContext)_localctx).types =  [];

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Params_restContext extends ParserRuleContext {
		public list names;
		public list types;
		public ParamContext param;
		public Params_restContext params_rest;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Params_restContext params_rest() {
			return getRuleContext(Params_restContext.class,0);
		}
		public Params_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_rest; }
	}

	public final Params_restContext params_rest() throws RecognitionException {
		Params_restContext _localctx = new Params_restContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params_rest);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__9);
				setState(143);
				((Params_restContext)_localctx).param = param();
				setState(144);
				((Params_restContext)_localctx).params_rest = params_rest();

				((Params_restContext)_localctx).names =  [];
				((Params_restContext)_localctx).types =  [];
				_localctx.names.append(((Params_restContext)_localctx).param.name);
				_localctx.names.extend(((Params_restContext)_localctx).params_rest.names);
				_localctx.types.append(((Params_restContext)_localctx).param.type);
				_localctx.types.extend(((Params_restContext)_localctx).params_rest.types);

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{

				((Params_restContext)_localctx).names =  [];
				((Params_restContext)_localctx).types =  [];

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public str name;
		public Scope.Type type;
		public Base_typeContext base_type;
		public IdentContext ident;
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((ParamContext)_localctx).base_type = base_type();
			setState(151);
			((ParamContext)_localctx).ident = ident();

			((ParamContext)_localctx).name =  (((ParamContext)_localctx).ident!=null?_input.getText(((ParamContext)_localctx).ident.start,((ParamContext)_localctx).ident.stop):null);
			((ParamContext)_localctx).type =  ((ParamContext)_localctx).base_type.t;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementListNode node;
		public StatementContext statement;
		public StatementsContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statements);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((StatementsContext)_localctx).statement = statement();
				setState(155);
				((StatementsContext)_localctx).s = statements();
				((StatementsContext)_localctx).node =  StatementListNode(((StatementsContext)_localctx).statement.node, ((StatementsContext)_localctx).s.node.getStatements());
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((StatementsContext)_localctx).node =  StatementListNode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementNode node;
		public Base_stmtContext base_stmt;
		public If_stmtContext if_stmt;
		public While_stmtContext while_stmt;
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				((StatementContext)_localctx).base_stmt = base_stmt();
				setState(162);
				match(T__0);
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).base_stmt.node;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((StatementContext)_localctx).if_stmt = if_stmt();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).if_stmt.node;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				((StatementContext)_localctx).while_stmt = while_stmt();
				((StatementContext)_localctx).node =  ((StatementContext)_localctx).while_stmt.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_stmtContext extends ParserRuleContext {
		public StatementNode node;
		public Assign_stmtContext assign_stmt;
		public Read_stmtContext read_stmt;
		public Print_stmtContext print_stmt;
		public Return_stmtContext return_stmt;
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_base_stmt);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((Base_stmtContext)_localctx).assign_stmt = assign_stmt();
				((Base_stmtContext)_localctx).node =  ((Base_stmtContext)_localctx).assign_stmt.node;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((Base_stmtContext)_localctx).read_stmt = read_stmt();
				((Base_stmtContext)_localctx).node =  ((Base_stmtContext)_localctx).read_stmt.node;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				((Base_stmtContext)_localctx).print_stmt = print_stmt();
				((Base_stmtContext)_localctx).node =  ((Base_stmtContext)_localctx).print_stmt.node;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				((Base_stmtContext)_localctx).return_stmt = return_stmt();
				((Base_stmtContext)_localctx).node =  ((Base_stmtContext)_localctx).return_stmt.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Read_stmtContext extends ParserRuleContext {
		public ReadNode node;
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__10);
			setState(188);
			match(T__5);
			setState(189);
			((Read_stmtContext)_localctx).ident = ident();
			setState(190);
			match(T__6);
			((Read_stmtContext)_localctx).node =  ReadNode(VarNode((((Read_stmtContext)_localctx).ident!=null?_input.getText(((Read_stmtContext)_localctx).ident.start,((Read_stmtContext)_localctx).ident.stop):null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public WriteNode node;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__11);
			setState(194);
			match(T__5);
			setState(195);
			((Print_stmtContext)_localctx).expr = expr(0);
			setState(196);
			match(T__6);
			((Print_stmtContext)_localctx).node =  WriteNode(((Print_stmtContext)_localctx).expr.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public ReturnNode node;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__12);
			setState(200);
			((Return_stmtContext)_localctx).expr = expr(0);
			((Return_stmtContext)_localctx).node =  ReturnNode(((Return_stmtContext)_localctx).expr.node, self.st.getFunctionSymbol(self.st.currentScope().getName()));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public AssignNode node;
		public IdentContext ident;
		public ExprContext expr;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((Assign_stmtContext)_localctx).ident = ident();
			setState(204);
			match(T__2);
			setState(205);
			((Assign_stmtContext)_localctx).expr = expr(0);
			((Assign_stmtContext)_localctx).node =  AssignNode(VarNode((((Assign_stmtContext)_localctx).ident!=null?_input.getText(((Assign_stmtContext)_localctx).ident.start,((Assign_stmtContext)_localctx).ident.stop):null)), ((Assign_stmtContext)_localctx).expr.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public IfStatementNode node;
		public CondContext cond;
		public StatementsContext statements;
		public StatementsContext ts;
		public StatementsContext es;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_stmt);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__13);
				setState(209);
				match(T__5);
				setState(210);
				((If_stmtContext)_localctx).cond = cond();
				setState(211);
				match(T__6);
				setState(212);
				match(T__7);
				setState(213);
				((If_stmtContext)_localctx).statements = statements();
				setState(214);
				match(T__8);
				((If_stmtContext)_localctx).node =  IfStatementNode(((If_stmtContext)_localctx).cond.node, StatementListNode(None, ((If_stmtContext)_localctx).statements.node.getStatements()), None);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__13);
				setState(218);
				match(T__5);
				setState(219);
				((If_stmtContext)_localctx).cond = cond();
				setState(220);
				match(T__6);
				setState(221);
				match(T__7);
				setState(222);
				((If_stmtContext)_localctx).ts = statements();
				setState(223);
				match(T__8);
				setState(224);
				match(T__14);
				setState(225);
				match(T__7);
				setState(226);
				((If_stmtContext)_localctx).es = statements();
				setState(227);
				match(T__8);
				((If_stmtContext)_localctx).node =  IfStatementNode(((If_stmtContext)_localctx).cond.node, StatementListNode(None, ((If_stmtContext)_localctx).ts.node.getStatements()), StatementListNode(None, ((If_stmtContext)_localctx).es.node.getStatements()));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public WhileNode node;
		public CondContext cond;
		public StatementsContext statements;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__15);
			setState(233);
			match(T__5);
			setState(234);
			((While_stmtContext)_localctx).cond = cond();
			setState(235);
			match(T__6);
			setState(236);
			match(T__7);
			setState(237);
			((While_stmtContext)_localctx).statements = statements();
			setState(238);
			match(T__8);
			((While_stmtContext)_localctx).node =  WhileNode(((While_stmtContext)_localctx).cond.node, StatementListNode(((While_stmtContext)_localctx).statements.node));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionNode node;
		public IdentContext ident;
		public ExprContext expr;
		public Unaryminus_exprContext unaryminus_expr;
		public Call_exprContext call_expr;
		public Token il;
		public Token fl;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unaryminus_exprContext unaryminus_expr() {
			return getRuleContext(Unaryminus_exprContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(MicroCParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(MicroCParser.FLOAT_LITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((PrimaryContext)_localctx).ident = ident();
				((PrimaryContext)_localctx).node =  VarNode((((PrimaryContext)_localctx).ident!=null?_input.getText(((PrimaryContext)_localctx).ident.start,((PrimaryContext)_localctx).ident.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__5);
				setState(245);
				((PrimaryContext)_localctx).expr = expr(0);
				setState(246);
				match(T__6);
				((PrimaryContext)_localctx).node =  ((PrimaryContext)_localctx).expr.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((PrimaryContext)_localctx).unaryminus_expr = unaryminus_expr();
				((PrimaryContext)_localctx).node =  ((PrimaryContext)_localctx).unaryminus_expr.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				((PrimaryContext)_localctx).call_expr = call_expr();
				((PrimaryContext)_localctx).node =  ((PrimaryContext)_localctx).call_expr.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				((PrimaryContext)_localctx).il = match(INT_LITERAL);
				((PrimaryContext)_localctx).node =  IntLitNode((((PrimaryContext)_localctx).il!=null?((PrimaryContext)_localctx).il.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				((PrimaryContext)_localctx).fl = match(FLOAT_LITERAL);
				((PrimaryContext)_localctx).node =  FloatLitNode((((PrimaryContext)_localctx).fl!=null?((PrimaryContext)_localctx).fl.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unaryminus_exprContext extends ParserRuleContext {
		public ExpressionNode node;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unaryminus_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryminus_expr; }
	}

	public final Unaryminus_exprContext unaryminus_expr() throws RecognitionException {
		Unaryminus_exprContext _localctx = new Unaryminus_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryminus_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__16);
			setState(262);
			((Unaryminus_exprContext)_localctx).expr = expr(0);
			((Unaryminus_exprContext)_localctx).node =  UnaryOpNode(((Unaryminus_exprContext)_localctx).expr.node, '-');
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_exprContext extends ParserRuleContext {
		public CallNode node;
		public IdentContext ident;
		public Arg_listContext arg_list;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((Call_exprContext)_localctx).ident = ident();
			setState(266);
			match(T__5);
			setState(267);
			((Call_exprContext)_localctx).arg_list = arg_list();
			setState(268);
			match(T__6);
			((Call_exprContext)_localctx).node =  CallNode((((Call_exprContext)_localctx).ident!=null?_input.getText(((Call_exprContext)_localctx).ident.start,((Call_exprContext)_localctx).ident.stop):null), ((Call_exprContext)_localctx).arg_list.args);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public list args;
		public ExprContext expr;
		public Args_restContext args_rest;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Args_restContext args_rest() {
			return getRuleContext(Args_restContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arg_list);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__16:
			case IDENTIFIER:
			case INT_LITERAL:
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((Arg_listContext)_localctx).expr = expr(0);
				setState(272);
				((Arg_listContext)_localctx).args_rest = args_rest();

				((Arg_listContext)_localctx).args =  [];
				_localctx.args.append(((Arg_listContext)_localctx).expr.node);
				_localctx.args.extend(((Arg_listContext)_localctx).args_rest.args);

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				((Arg_listContext)_localctx).args =  [];
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Args_restContext extends ParserRuleContext {
		public list args;
		public ExprContext expr;
		public Args_restContext args_rest;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Args_restContext args_rest() {
			return getRuleContext(Args_restContext.class,0);
		}
		public Args_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_rest; }
	}

	public final Args_restContext args_rest() throws RecognitionException {
		Args_restContext _localctx = new Args_restContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_args_rest);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__9);
				setState(279);
				((Args_restContext)_localctx).expr = expr(0);
				setState(280);
				((Args_restContext)_localctx).args_rest = args_rest();

				((Args_restContext)_localctx).args =  [];
				_localctx.args.append(((Args_restContext)_localctx).expr.node);
				_localctx.args.extend(((Args_restContext)_localctx).args_rest.args);

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				((Args_restContext)_localctx).args =  [];
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExpressionNode node;
		public ExprContext e1;
		public TermContext term;
		public AddopContext addop;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			((ExprContext)_localctx).term = term(0);
			((ExprContext)_localctx).node =  ((ExprContext)_localctx).term.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					((ExprContext)_localctx).addop = addop();
					setState(292);
					((ExprContext)_localctx).term = term(0);
					((ExprContext)_localctx).node =  BinaryOpNode(((ExprContext)_localctx).e1.node, ((ExprContext)_localctx).term.node, (((ExprContext)_localctx).addop!=null?_input.getText(((ExprContext)_localctx).addop.start,((ExprContext)_localctx).addop.stop):null));
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public ExpressionNode node;
		public TermContext t1;
		public PrimaryContext primary;
		public MulopContext mulop;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301);
			((TermContext)_localctx).primary = primary();
			((TermContext)_localctx).node =  ((TermContext)_localctx).primary.node;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					((TermContext)_localctx).mulop = mulop();
					setState(306);
					((TermContext)_localctx).primary = primary();
					((TermContext)_localctx).node =  BinaryOpNode(((TermContext)_localctx).t1.node, ((TermContext)_localctx).primary.node, (((TermContext)_localctx).mulop!=null?_input.getText(((TermContext)_localctx).mulop.start,((TermContext)_localctx).mulop.stop):null));
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondNode node;
		public ExprContext e1;
		public CmpopContext cmpop;
		public ExprContext e2;
		public CmpopContext cmpop() {
			return getRuleContext(CmpopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			((CondContext)_localctx).e1 = expr(0);
			setState(315);
			((CondContext)_localctx).cmpop = cmpop();
			setState(316);
			((CondContext)_localctx).e2 = expr(0);
			((CondContext)_localctx).node =  CondNode(((CondContext)_localctx).e1.node, ((CondContext)_localctx).e2.node, (((CondContext)_localctx).cmpop!=null?_input.getText(((CondContext)_localctx).cmpop.start,((CondContext)_localctx).cmpop.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CmpopContext extends ParserRuleContext {
		public CmpopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpop; }
	}

	public final CmpopContext cmpop() throws RecognitionException {
		CmpopContext _localctx = new CmpopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmpop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 28:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006k\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008d\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0095"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00a0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ac\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ba\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00e7\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0104"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0115\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u011d\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0128"+
		"\b\u001b\n\u001b\f\u001b\u012b\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0136\b\u001c\n\u001c\f\u001c\u0139\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0000\u000268!\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@\u0000\u0003\u0001\u0000\u0012\u0017\u0001\u0000\u0018"+
		"\u0019\u0002\u0000\u0011\u0011\u001a\u001a\u013c\u0000B\u0001\u0000\u0000"+
		"\u0000\u0002P\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006"+
		"X\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000"+
		"\u0000\fj\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"y\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u008c\u0001"+
		"\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000\u0000\u0018\u0096\u0001"+
		"\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c\u00ab\u0001"+
		"\u0000\u0000\u0000\u001e\u00b9\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000"+
		"\u0000\u0000\"\u00c1\u0001\u0000\u0000\u0000$\u00c7\u0001\u0000\u0000"+
		"\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000\u0000\u0000*"+
		"\u00e8\u0001\u0000\u0000\u0000,\u0103\u0001\u0000\u0000\u0000.\u0105\u0001"+
		"\u0000\u0000\u00000\u0109\u0001\u0000\u0000\u00002\u0114\u0001\u0000\u0000"+
		"\u00004\u011c\u0001\u0000\u0000\u00006\u011e\u0001\u0000\u0000\u00008"+
		"\u012c\u0001\u0000\u0000\u0000:\u013a\u0001\u0000\u0000\u0000<\u013f\u0001"+
		"\u0000\u0000\u0000>\u0141\u0001\u0000\u0000\u0000@\u0143\u0001\u0000\u0000"+
		"\u0000BC\u0003\u0002\u0001\u0000CD\u0003\u0010\b\u0000DE\u0006\u0000\uffff"+
		"\uffff\u0000E\u0001\u0001\u0000\u0000\u0000FG\u0003\b\u0004\u0000GH\u0003"+
		"\u0002\u0001\u0000HQ\u0001\u0000\u0000\u0000IJ\u0003\n\u0005\u0000JK\u0003"+
		"\u0002\u0001\u0000KQ\u0001\u0000\u0000\u0000LM\u0003\u000e\u0007\u0000"+
		"MN\u0003\u0002\u0001\u0000NQ\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000"+
		"\u0000PF\u0001\u0000\u0000\u0000PI\u0001\u0000\u0000\u0000PL\u0001\u0000"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000\u0000\u0000"+
		"RS\u0003\b\u0004\u0000ST\u0003\u0004\u0002\u0000TW\u0001\u0000\u0000\u0000"+
		"UW\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\u0005\u0001\u0000\u0000\u0000XY\u0005\u001b\u0000\u0000Y\u0007"+
		"\u0001\u0000\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0003\u0006\u0003\u0000"+
		"\\]\u0005\u0001\u0000\u0000]^\u0006\u0004\uffff\uffff\u0000^\t\u0001\u0000"+
		"\u0000\u0000_`\u0005\u0002\u0000\u0000`a\u0003\u0006\u0003\u0000ab\u0005"+
		"\u0003\u0000\u0000bc\u0005\u001e\u0000\u0000cd\u0005\u0001\u0000\u0000"+
		"de\u0006\u0005\uffff\uffff\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0004\u0000\u0000gk\u0006\u0006\uffff\uffff\u0000hi\u0005\u0005\u0000"+
		"\u0000ik\u0006\u0006\uffff\uffff\u0000jf\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0003\f\u0006\u0000mn"+
		"\u0003\u0006\u0003\u0000no\u0005\u0006\u0000\u0000op\u0003\u0014\n\u0000"+
		"pq\u0005\u0007\u0000\u0000qr\u0005\u0001\u0000\u0000rs\u0006\u0007\uffff"+
		"\uffff\u0000s\u000f\u0001\u0000\u0000\u0000tu\u0003\u0012\t\u0000uv\u0003"+
		"\u0010\b\u0000vw\u0006\b\uffff\uffff\u0000wz\u0001\u0000\u0000\u0000x"+
		"z\u0006\b\uffff\uffff\u0000yt\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0003\f\u0006\u0000|}\u0003\u0006"+
		"\u0003\u0000}~\u0005\u0006\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f"+
		"\u0080\u0005\u0007\u0000\u0000\u0080\u0081\u0006\t\uffff\uffff\u0000\u0081"+
		"\u0082\u0005\b\u0000\u0000\u0082\u0083\u0003\u0004\u0002\u0000\u0083\u0084"+
		"\u0003\u001a\r\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086\u0006"+
		"\t\uffff\uffff\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"\u0018\f\u0000\u0088\u0089\u0003\u0016\u000b\u0000\u0089\u008a\u0006\n"+
		"\uffff\uffff\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008d\u0006"+
		"\n\uffff\uffff\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\n\u0000\u0000\u008f\u0090\u0003\u0018\f\u0000\u0090\u0091\u0003\u0016"+
		"\u000b\u0000\u0091\u0092\u0006\u000b\uffff\uffff\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0006\u000b\uffff\uffff\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0017"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003\f\u0006\u0000\u0097\u0098\u0003"+
		"\u0006\u0003\u0000\u0098\u0099\u0006\f\uffff\uffff\u0000\u0099\u0019\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u009c\u0003"+
		"\u001a\r\u0000\u009c\u009d\u0006\r\uffff\uffff\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0006\r\uffff\uffff\u0000\u009f\u009a\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u001b\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0005"+
		"\u0001\u0000\u0000\u00a3\u00a4\u0006\u000e\uffff\uffff\u0000\u00a4\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003(\u0014\u0000\u00a6\u00a7\u0006"+
		"\u000e\uffff\uffff\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0003*\u0015\u0000\u00a9\u00aa\u0006\u000e\uffff\uffff\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab\u00a5"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u001d"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003&\u0013\u0000\u00ae\u00af\u0006"+
		"\u000f\uffff\uffff\u0000\u00af\u00ba\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0003 \u0010\u0000\u00b1\u00b2\u0006\u000f\uffff\uffff\u0000\u00b2\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\"\u0011\u0000\u00b4\u00b5\u0006"+
		"\u000f\uffff\uffff\u0000\u00b5\u00ba\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0003$\u0012\u0000\u00b7\u00b8\u0006\u000f\uffff\uffff\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ad\u0001\u0000\u0000\u0000\u00b9\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b6"+
		"\u0001\u0000\u0000\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005\u000b\u0000\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\u00be"+
		"\u0003\u0006\u0003\u0000\u00be\u00bf\u0005\u0007\u0000\u0000\u00bf\u00c0"+
		"\u0006\u0010\uffff\uffff\u0000\u00c0!\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\f\u0000\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0003"+
		"6\u001b\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5\u00c6\u0006\u0011"+
		"\uffff\uffff\u0000\u00c6#\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\r"+
		"\u0000\u0000\u00c8\u00c9\u00036\u001b\u0000\u00c9\u00ca\u0006\u0012\uffff"+
		"\uffff\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u0006\u0003"+
		"\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce\u00036\u001b\u0000"+
		"\u00ce\u00cf\u0006\u0013\uffff\uffff\u0000\u00cf\'\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\u000e\u0000\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000"+
		"\u00d2\u00d3\u0003:\u001d\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4"+
		"\u00d5\u0005\b\u0000\u0000\u00d5\u00d6\u0003\u001a\r\u0000\u00d6\u00d7"+
		"\u0005\t\u0000\u0000\u00d7\u00d8\u0006\u0014\uffff\uffff\u0000\u00d8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000e\u0000\u0000\u00da\u00db"+
		"\u0005\u0006\u0000\u0000\u00db\u00dc\u0003:\u001d\u0000\u00dc\u00dd\u0005"+
		"\u0007\u0000\u0000\u00dd\u00de\u0005\b\u0000\u0000\u00de\u00df\u0003\u001a"+
		"\r\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000"+
		"\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000"+
		"\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00e5\u0006\u0014\uffff\uffff\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00d0\u0001\u0000\u0000\u0000"+
		"\u00e6\u00d9\u0001\u0000\u0000\u0000\u00e7)\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u0010\u0000\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea"+
		"\u00eb\u0003:\u001d\u0000\u00eb\u00ec\u0005\u0007\u0000\u0000\u00ec\u00ed"+
		"\u0005\b\u0000\u0000\u00ed\u00ee\u0003\u001a\r\u0000\u00ee\u00ef\u0005"+
		"\t\u0000\u0000\u00ef\u00f0\u0006\u0015\uffff\uffff\u0000\u00f0+\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0003\u0006\u0003\u0000\u00f2\u00f3\u0006"+
		"\u0016\uffff\uffff\u0000\u00f3\u0104\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0006\u0000\u0000\u00f5\u00f6\u00036\u001b\u0000\u00f6\u00f7\u0005"+
		"\u0007\u0000\u0000\u00f7\u00f8\u0006\u0016\uffff\uffff\u0000\u00f8\u0104"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003.\u0017\u0000\u00fa\u00fb\u0006"+
		"\u0016\uffff\uffff\u0000\u00fb\u0104\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u00030\u0018\u0000\u00fd\u00fe\u0006\u0016\uffff\uffff\u0000\u00fe\u0104"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001c\u0000\u0000\u0100\u0104"+
		"\u0006\u0016\uffff\uffff\u0000\u0101\u0102\u0005\u001d\u0000\u0000\u0102"+
		"\u0104\u0006\u0016\uffff\uffff\u0000\u0103\u00f1\u0001\u0000\u0000\u0000"+
		"\u0103\u00f4\u0001\u0000\u0000\u0000\u0103\u00f9\u0001\u0000\u0000\u0000"+
		"\u0103\u00fc\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104-\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005\u0011\u0000\u0000\u0106\u0107\u00036\u001b\u0000\u0107\u0108"+
		"\u0006\u0017\uffff\uffff\u0000\u0108/\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0003\u0006\u0003\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010c"+
		"\u00032\u0019\u0000\u010c\u010d\u0005\u0007\u0000\u0000\u010d\u010e\u0006"+
		"\u0018\uffff\uffff\u0000\u010e1\u0001\u0000\u0000\u0000\u010f\u0110\u0003"+
		"6\u001b\u0000\u0110\u0111\u00034\u001a\u0000\u0111\u0112\u0006\u0019\uffff"+
		"\uffff\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0115\u0006\u0019"+
		"\uffff\uffff\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u01153\u0001\u0000\u0000\u0000\u0116\u0117\u0005\n"+
		"\u0000\u0000\u0117\u0118\u00036\u001b\u0000\u0118\u0119\u00034\u001a\u0000"+
		"\u0119\u011a\u0006\u001a\uffff\uffff\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0006\u001a\uffff\uffff\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d5\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0006\u001b\uffff\uffff\u0000\u011f\u0120\u00038\u001c"+
		"\u0000\u0120\u0121\u0006\u001b\uffff\uffff\u0000\u0121\u0129\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\n\u0001\u0000\u0000\u0123\u0124\u0003@ \u0000"+
		"\u0124\u0125\u00038\u001c\u0000\u0125\u0126\u0006\u001b\uffff\uffff\u0000"+
		"\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a7\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0006\u001c\uffff\uffff\u0000"+
		"\u012d\u012e\u0003,\u0016\u0000\u012e\u012f\u0006\u001c\uffff\uffff\u0000"+
		"\u012f\u0137\u0001\u0000\u0000\u0000\u0130\u0131\n\u0001\u0000\u0000\u0131"+
		"\u0132\u0003>\u001f\u0000\u0132\u0133\u0003,\u0016\u0000\u0133\u0134\u0006"+
		"\u001c\uffff\uffff\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0130"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u01389\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"6\u001b\u0000\u013b\u013c\u0003<\u001e\u0000\u013c\u013d\u00036\u001b"+
		"\u0000\u013d\u013e\u0006\u001d\uffff\uffff\u0000\u013e;\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0007\u0000\u0000\u0000\u0140=\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0007\u0001\u0000\u0000\u0142?\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0007\u0002\u0000\u0000\u0144A\u0001\u0000\u0000\u0000\u000fPV"+
		"jy\u008c\u0094\u009f\u00ab\u00b9\u00e6\u0103\u0114\u011c\u0129\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}