# Generated from Group.g4 by ANTLR 4.9.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f")
        buf.write(":\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2\3\2\3\3\3\3\3\4")
        buf.write("\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\3\t\5\t-\n\t\3\n\6\n\60\n\n\r\n\16\n\61\3\13\6")
        buf.write("\13\65\n\13\r\13\16\13\66\3\13\3\13\2\2\f\3\3\5\4\7\5")
        buf.write("\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\3\2\62;\4\2\13")
        buf.write("\13\"\"\2<\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2")
        buf.write("\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2")
        buf.write("\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2")
        buf.write("\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r!\3\2\2\2\17")
        buf.write("#\3\2\2\2\21,\3\2\2\2\23/\3\2\2\2\25\64\3\2\2\2\27\30")
        buf.write("\7,\2\2\30\4\3\2\2\2\31\32\7\61\2\2\32\6\3\2\2\2\33\34")
        buf.write("\7\'\2\2\34\b\3\2\2\2\35\36\7-\2\2\36\n\3\2\2\2\37 \7")
        buf.write("/\2\2 \f\3\2\2\2!\"\7*\2\2\"\16\3\2\2\2#$\7+\2\2$\20\3")
        buf.write("\2\2\2%&\7d\2\2&\'\7{\2\2\'-\7g\2\2()\7g\2\2)*\7z\2\2")
        buf.write("*+\7k\2\2+-\7v\2\2,%\3\2\2\2,(\3\2\2\2-\22\3\2\2\2.\60")
        buf.write("\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2")
        buf.write("\2\2\62\24\3\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\65\66\3")
        buf.write("\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\13")
        buf.write("\2\29\26\3\2\2\2\6\2,\61\66\3\b\2\2")
        return buf.getvalue()


class GroupLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    BYE = 8
    INT = 9
    WS = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'" ]

    symbolicNames = [ "<INVALID>",
            "BYE", "INT", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "BYE", "INT", "WS" ]

    grammarFileName = "Group.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


