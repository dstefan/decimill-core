// Generated from QueryLexer.g4 by ANTLR 4.2

    package decimill.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, INLINE=2, BLOCK=3, ANY=4, UDIST=5, NAME=6, ID=7, NUM=8, STRING=9, 
		EQ=10, COMMA=11, LPR=12, RPR=13, APOS=14, DOT=15, PLUS=16, MINUS=17, TIMES=18, 
		DIV=19, POW=20, LT=21, GT=22, LBR=23, RBR=24, LCB=25, RCB=26, BNL=27, 
		BREAK=28, NL=29, WS=30, ERR=31;
	public static final int Code = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "Code"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"EOL", "INLINE", "BLOCK", "ANY", "'u'", "NAME", "ID", "NUM", "STRING", 
		"'='", "','", "'('", "')'", "'''", "'.'", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'<'", "'>'", "'['", "']'", "'{'", "'}'", "BNL", "BREAK", "NL", 
		"WS", "ERR"
	};
	public static final String[] ruleNames = {
		"EOL", "INLINE", "BLOCK", "ANY", "UDIST", "NAME", "ID", "NUM", "STRING", 
		"EQ", "COMMA", "LPR", "RPR", "APOS", "DOT", "PLUS", "MINUS", "TIMES", 
		"DIV", "POW", "LT", "GT", "LBR", "RBR", "LCB", "RCB", "BNL", "BREAK", 
		"NL", "WS", "ERR"
	};


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QueryLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00cd\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\7\7a\n\7"+
		"\f\7\16\7d\13\7\3\7\5\7g\n\7\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\6\tq"+
		"\n\t\r\t\16\tr\3\t\3\t\6\tw\n\t\r\t\16\tx\5\t{\n\t\3\n\3\n\6\n\177\n\n"+
		"\r\n\16\n\u0080\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00a8\n\34"+
		"\r\34\16\34\u00a9\3\34\3\34\3\34\3\34\3\34\5\34\u00b1\n\34\3\34\7\34\u00b4"+
		"\n\34\f\34\16\34\u00b7\13\34\6\34\u00b9\n\34\r\34\16\34\u00ba\3\35\3\35"+
		"\3\35\3\35\3\36\6\36\u00c2\n\36\r\36\16\36\u00c3\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \2\2!\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r"+
		"\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33"+
		"\66\348\35:\36<\37> @!\4\2\3\13\4\2\f\f\17\17\4\2\13\13\"\"\3\2C\\\6\2"+
		"\"\"\62;C\\c|\5\2\62;C\\c|\3\2c|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17"+
		"$$\u00da\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2\2\2\3"+
		"\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3"+
		"\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3"+
		"$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60"+
		"\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2"+
		"\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\4C\3\2\2\2\6G\3\2\2\2\bP\3\2\2\2\nZ"+
		"\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20h\3\2\2\2\22p\3\2\2\2\24|\3\2\2\2\26"+
		"\u0084\3\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u008e\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u0094\3\2\2\2"+
		"(\u0096\3\2\2\2*\u0098\3\2\2\2,\u009a\3\2\2\2.\u009c\3\2\2\2\60\u009e"+
		"\3\2\2\2\62\u00a0\3\2\2\2\64\u00a2\3\2\2\2\66\u00a4\3\2\2\28\u00b8\3\2"+
		"\2\2:\u00bc\3\2\2\2<\u00c1\3\2\2\2>\u00c7\3\2\2\2@\u00cb\3\2\2\2BD\t\2"+
		"\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\7b\2\2HI\3\2"+
		"\2\2IJ\b\3\2\2J\7\3\2\2\2KQ\7\13\2\2LM\7\"\2\2MN\7\"\2\2NO\7\"\2\2OQ\7"+
		"\"\2\2PK\3\2\2\2PL\3\2\2\2QU\3\2\2\2RT\t\3\2\2SR\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\b\4\2\2Y\t\3\2\2\2Z[\13\2\2\2["+
		"\13\3\2\2\2\\]\7w\2\2]\r\3\2\2\2^f\t\4\2\2_a\t\5\2\2`_\3\2\2\2ad\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2eg\t\6\2\2fb\3\2\2\2fg\3\2\2"+
		"\2g\17\3\2\2\2hl\t\7\2\2ik\t\b\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\21\3\2\2\2nl\3\2\2\2oq\t\t\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2sz\3\2\2\2tv\7\60\2\2uw\t\t\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy"+
		"\3\2\2\2y{\3\2\2\2zt\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|~\7$\2\2}\177\n\n\2"+
		"\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7$\2\2\u0083\25\3\2\2\2\u0084\u0085\7?\2\2"+
		"\u0085\27\3\2\2\2\u0086\u0087\7.\2\2\u0087\31\3\2\2\2\u0088\u0089\7*\2"+
		"\2\u0089\33\3\2\2\2\u008a\u008b\7+\2\2\u008b\35\3\2\2\2\u008c\u008d\7"+
		")\2\2\u008d\37\3\2\2\2\u008e\u008f\7\60\2\2\u008f!\3\2\2\2\u0090\u0091"+
		"\7-\2\2\u0091#\3\2\2\2\u0092\u0093\7/\2\2\u0093%\3\2\2\2\u0094\u0095\7"+
		",\2\2\u0095\'\3\2\2\2\u0096\u0097\7\61\2\2\u0097)\3\2\2\2\u0098\u0099"+
		"\7`\2\2\u0099+\3\2\2\2\u009a\u009b\7>\2\2\u009b-\3\2\2\2\u009c\u009d\7"+
		"@\2\2\u009d/\3\2\2\2\u009e\u009f\7]\2\2\u009f\61\3\2\2\2\u00a0\u00a1\7"+
		"_\2\2\u00a1\63\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3\65\3\2\2\2\u00a4\u00a5"+
		"\7\177\2\2\u00a5\67\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b0\3\2"+
		"\2\2\u00ab\u00b1\7\13\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7\"\2\2\u00ae"+
		"\u00af\7\"\2\2\u00af\u00b1\7\"\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2"+
		"\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00a7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb9\3\2\2\2\u00bc\u00bd\7b\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\b\35\3\2\u00bf;\3\2\2\2\u00c0\u00c2\t\2\2\2"+
		"\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\36\3\2\u00c6=\3\2\2\2\u00c7"+
		"\u00c8\t\3\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\37\4\2\u00ca?\3\2\2\2"+
		"\u00cb\u00cc\13\2\2\2\u00ccA\3\2\2\2\23\2\3EPUbflrxz\u0080\u00a9\u00b0"+
		"\u00b5\u00ba\u00c3\5\7\3\2\6\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}