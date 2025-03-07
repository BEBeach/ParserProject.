// Generated from c:\Users\qpt10\Desktop\Program work\POP\Group.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroupLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Variable_expr=4, ID=5, INTEGER=6, SRING=7, BOOL=8, 
		ASSIGN=9, ADD=10, MINUS=11, MULTIPLY=12, DIVIDE=13, MOD=14, ADD_ASSIGN=15, 
		SUB_ASSIGN=16, MUL_ASSIGN=17, DIV_ASSIGN=18, TRUE=19, FALSE=20, BREAK=21, 
		CONTINUE=22, LOOPCONTROL=23, ASSIGNS=24, COMMENTS=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Variable_expr", "ID", "INTEGER", "SRING", "BOOL", 
			"ASSIGN", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TRUE", "FALSE", "BREAK", "CONTINUE", 
			"LOOPCONTROL", "ASSIGNS", "COMMENTS", "WHITESPACE", "NON_ZERO_DIGIT", 
			"DIGIT", "SPACES", "ID_START", "ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'('", "')'", null, null, null, null, null, "'='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'True'", 
			"'False'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Variable_expr", "ID", "INTEGER", "SRING", "BOOL", 
			"ASSIGN", "ADD", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "TRUE", "FALSE", "BREAK", "CONTINUE", 
			"LOOPCONTROL", "ASSIGNS", "COMMENTS", "WHITESPACE"
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


	public GroupLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Group.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7"+
		"\3\7\7\7S\n\7\f\7\16\7V\13\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\7\b_\n\b\f\b"+
		"\16\bb\13\b\3\b\3\b\3\t\3\t\5\th\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\5\30\u009e\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00a5\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u00b3"+
		"\n\36\r\36\16\36\u00b4\3\37\5\37\u00b8\n\37\3 \3 \5 \u00bc\n \2\2!\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\2?\2\3"+
		"\2\t\4\2C\\c|\3\2\f\f\3\2\63;\3\2\62;\5\2\13\13\17\17\"\"\5\2C\\aac|\6"+
		"\2\62;C\\aac|\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3A\3\2"+
		"\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rX\3\2\2\2\17Z\3\2\2"+
		"\2\21g\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2"+
		"\2\2\35s\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#{\3\2\2\2%~\3\2\2\2\'\u0081\3\2"+
		"\2\2)\u0086\3\2\2\2+\u008c\3\2\2\2-\u0092\3\2\2\2/\u009d\3\2\2\2\61\u00a4"+
		"\3\2\2\2\63\u00a6\3\2\2\2\65\u00a9\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2"+
		"\2\2;\u00b2\3\2\2\2=\u00b7\3\2\2\2?\u00bb\3\2\2\2AB\7\f\2\2B\4\3\2\2\2"+
		"CD\7*\2\2D\6\3\2\2\2EF\7+\2\2F\b\3\2\2\2GH\5\13\6\2H\n\3\2\2\2IM\5=\37"+
		"\2JL\5? \2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\f\3\2\2\2OM\3\2\2"+
		"\2PT\5\67\34\2QS\59\35\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2"+
		"\2\2VT\3\2\2\2WY\7\62\2\2XP\3\2\2\2XW\3\2\2\2Y\16\3\2\2\2Z`\3\2\2\2[_"+
		"\t\2\2\2\\_\5;\36\2]_\7\f\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2"+
		"`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\3\2\2\2d\20\3\2\2\2eh\5\'\24"+
		"\2fh\5)\25\2ge\3\2\2\2gf\3\2\2\2h\22\3\2\2\2ij\7?\2\2j\24\3\2\2\2kl\7"+
		"-\2\2l\26\3\2\2\2mn\7/\2\2n\30\3\2\2\2op\7,\2\2p\32\3\2\2\2qr\7\61\2\2"+
		"r\34\3\2\2\2st\7\'\2\2t\36\3\2\2\2uv\7-\2\2vw\7?\2\2w \3\2\2\2xy\7/\2"+
		"\2yz\7?\2\2z\"\3\2\2\2{|\7,\2\2|}\7?\2\2}$\3\2\2\2~\177\7\61\2\2\177\u0080"+
		"\7?\2\2\u0080&\3\2\2\2\u0081\u0082\7V\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7g\2\2\u0085(\3\2\2\2\u0086\u0087\7H\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b"+
		"*\3\2\2\2\u008c\u008d\7d\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7m\2\2\u0091,\3\2\2\2\u0092\u0093\7e\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7p\2\2\u0098\u0099\7w\2\2\u0099\u009a\7g\2\2\u009a.\3\2\2"+
		"\2\u009b\u009e\5+\26\2\u009c\u009e\5-\27\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\60\3\2\2\2\u009f\u00a5\5\23\n\2\u00a0\u00a5\5\37\20\2\u00a1"+
		"\u00a5\5!\21\2\u00a2\u00a5\5#\22\2\u00a3\u00a5\5%\23\2\u00a4\u009f\3\2"+
		"\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7%\2\2\u00a7\u00a8\n\3\2\2"+
		"\u00a8\64\3\2\2\2\u00a9\u00aa\5;\36\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\b\33\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\t\5\2\2\u00b0:\3\2\2\2\u00b1\u00b3\t\6\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5<\3\2\2\2"+
		"\u00b6\u00b8\t\7\2\2\u00b7\u00b6\3\2\2\2\u00b8>\3\2\2\2\u00b9\u00bc\5"+
		"=\37\2\u00ba\u00bc\t\b\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"@\3\2\2\2\16\2MTX^`g\u009d\u00a4\u00b4\u00b7\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}