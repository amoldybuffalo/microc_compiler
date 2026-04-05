# Generated from python/MicroC.g4 by ANTLR 4.9.1
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



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
from MicroCCompiler.ast.StatementListNode import StatementListNode
from MicroCCompiler.ast.ASTNode import ASTNode
from MicroCCompiler.ast.BinaryOpNode import BinaryOpNode
from MicroCCompiler.ast.UnaryOpNode import UnaryOpNode



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 ")
        buf.write("\u00d0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6")
        buf.write("\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13")
        buf.write("\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16")
        buf.write("\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17")
        buf.write("\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23")
        buf.write("\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30")
        buf.write("\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0099\n\32\f\32\16")
        buf.write("\32\u009c\13\32\3\33\6\33\u009f\n\33\r\33\16\33\u00a0")
        buf.write("\3\34\7\34\u00a4\n\34\f\34\16\34\u00a7\13\34\3\34\3\34")
        buf.write("\6\34\u00ab\n\34\r\34\16\34\u00ac\3\35\3\35\7\35\u00b1")
        buf.write("\n\35\f\35\16\35\u00b4\13\35\3\35\3\35\3\36\3\36\3\36")
        buf.write("\3\36\7\36\u00bc\n\36\f\36\16\36\u00bf\13\36\3\36\3\36")
        buf.write("\3\36\3\36\3\36\3\37\6\37\u00c7\n\37\r\37\16\37\u00c8")
        buf.write("\3\37\3\37\3 \3 \3!\3!\3\u00bd\2\"\3\3\5\4\7\5\t\6\13")
        buf.write("\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37")
        buf.write("\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34")
        buf.write("\67\359\36;\37= ?\2A\2\3\2\5\3\2$$\5\2\13\f\17\17\"\"")
        buf.write("\4\2C\\c|\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2")
        buf.write("\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21")
        buf.write("\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3")
        buf.write("\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2")
        buf.write("\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2")
        buf.write("\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2")
        buf.write("\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2")
        buf.write("\2\2\3C\3\2\2\2\5E\3\2\2\2\7L\3\2\2\2\tN\3\2\2\2\13R\3")
        buf.write("\2\2\2\rX\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2")
        buf.write("\25c\3\2\2\2\27e\3\2\2\2\31j\3\2\2\2\33p\3\2\2\2\35w\3")
        buf.write("\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0084")
        buf.write("\3\2\2\2\'\u0087\3\2\2\2)\u008a\3\2\2\2+\u008d\3\2\2\2")
        buf.write("-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095")
        buf.write("\3\2\2\2\65\u009e\3\2\2\2\67\u00a5\3\2\2\29\u00ae\3\2")
        buf.write("\2\2;\u00b7\3\2\2\2=\u00c6\3\2\2\2?\u00cc\3\2\2\2A\u00ce")
        buf.write("\3\2\2\2CD\7=\2\2D\4\3\2\2\2EF\7u\2\2FG\7v\2\2GH\7t\2")
        buf.write("\2HI\7k\2\2IJ\7p\2\2JK\7i\2\2K\6\3\2\2\2LM\7?\2\2M\b\3")
        buf.write("\2\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2Q\n\3\2\2\2RS\7h\2\2")
        buf.write("ST\7n\2\2TU\7q\2\2UV\7c\2\2VW\7v\2\2W\f\3\2\2\2XY\7o\2")
        buf.write("\2YZ\7c\2\2Z[\7k\2\2[\\\7p\2\2\\\16\3\2\2\2]^\7*\2\2^")
        buf.write("\20\3\2\2\2_`\7+\2\2`\22\3\2\2\2ab\7}\2\2b\24\3\2\2\2")
        buf.write("cd\7\177\2\2d\26\3\2\2\2ef\7t\2\2fg\7g\2\2gh\7c\2\2hi")
        buf.write("\7f\2\2i\30\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7k\2\2mn\7p\2")
        buf.write("\2no\7v\2\2o\32\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7v\2\2st\7")
        buf.write("w\2\2tu\7t\2\2uv\7p\2\2v\34\3\2\2\2wx\7y\2\2xy\7j\2\2")
        buf.write("yz\7k\2\2z{\7n\2\2{|\7g\2\2|\36\3\2\2\2}~\7/\2\2~ \3\2")
        buf.write("\2\2\177\u0080\7>\2\2\u0080\"\3\2\2\2\u0081\u0082\7>\2")
        buf.write("\2\u0082\u0083\7?\2\2\u0083$\3\2\2\2\u0084\u0085\7@\2")
        buf.write("\2\u0085\u0086\7?\2\2\u0086&\3\2\2\2\u0087\u0088\7?\2")
        buf.write("\2\u0088\u0089\7?\2\2\u0089(\3\2\2\2\u008a\u008b\7#\2")
        buf.write("\2\u008b\u008c\7?\2\2\u008c*\3\2\2\2\u008d\u008e\7@\2")
        buf.write("\2\u008e,\3\2\2\2\u008f\u0090\7,\2\2\u0090.\3\2\2\2\u0091")
        buf.write("\u0092\7\61\2\2\u0092\60\3\2\2\2\u0093\u0094\7-\2\2\u0094")
        buf.write("\62\3\2\2\2\u0095\u009a\5? \2\u0096\u0099\5? \2\u0097")
        buf.write("\u0099\5A!\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099")
        buf.write("\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2")
        buf.write("\u009b\64\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5A!")
        buf.write("\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e")
        buf.write("\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\66\3\2\2\2\u00a2\u00a4")
        buf.write("\5A!\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3")
        buf.write("\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7")
        buf.write("\u00a5\3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00ab\5A!\2")
        buf.write("\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3")
        buf.write("\2\2\2\u00ac\u00ad\3\2\2\2\u00ad8\3\2\2\2\u00ae\u00b2")
        buf.write("\7$\2\2\u00af\u00b1\n\2\2\2\u00b0\u00af\3\2\2\2\u00b1")
        buf.write("\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2")
        buf.write("\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7")
        buf.write("$\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9")
        buf.write("\7,\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2\u00bb")
        buf.write("\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2")
        buf.write("\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3")
        buf.write("\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3")
        buf.write("\3\2\2\2\u00c3\u00c4\b\36\2\2\u00c4<\3\2\2\2\u00c5\u00c7")
        buf.write("\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8")
        buf.write("\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2")
        buf.write("\u00ca\u00cb\b\37\2\2\u00cb>\3\2\2\2\u00cc\u00cd\t\4\2")
        buf.write("\2\u00cd@\3\2\2\2\u00ce\u00cf\4\62;\2\u00cfB\3\2\2\2\13")
        buf.write("\2\u0098\u009a\u00a0\u00a5\u00ac\u00b2\u00bd\u00c8\3\b")
        buf.write("\2\2")
        return buf.getvalue()


class MicroCLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    T__13 = 14
    T__14 = 15
    T__15 = 16
    T__16 = 17
    T__17 = 18
    T__18 = 19
    T__19 = 20
    T__20 = 21
    T__21 = 22
    T__22 = 23
    T__23 = 24
    IDENTIFIER = 25
    INT_LITERAL = 26
    FLOAT_LITERAL = 27
    STR_LITERAL = 28
    COMMENT = 29
    WS = 30

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "';'", "'string'", "'='", "'int'", "'float'", "'main'", "'('", 
            "')'", "'{'", "'}'", "'read'", "'print'", "'return'", "'while'", 
            "'-'", "'<'", "'<='", "'>='", "'=='", "'!='", "'>'", "'*'", 
            "'/'", "'+'" ]

    symbolicNames = [ "<INVALID>",
            "IDENTIFIER", "INT_LITERAL", "FLOAT_LITERAL", "STR_LITERAL", 
            "COMMENT", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "T__15", "T__16", "T__17", "T__18", "T__19", 
                  "T__20", "T__21", "T__22", "T__23", "IDENTIFIER", "INT_LITERAL", 
                  "FLOAT_LITERAL", "STR_LITERAL", "COMMENT", "WS", "LETTER", 
                  "DIGIT" ]

    grammarFileName = "MicroC.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def setSymbolTable(self, st: SymbolTable):
      self.st = st

    def getSymbolTable(self) -> SymbolTable:
      return self.st

    def setAST(self, node: ASTNode):
      self.ast = node

    def getAST(self) -> ASTNode:
      return self.ast


