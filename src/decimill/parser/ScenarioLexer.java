// Generated from ScenarioLexer.g4 by ANTLR 4.2

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
public class ScenarioLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, INLINE=2, BLOCK=3, ANY=4, UDIST=5, NAME=6, ID=7, NUM=8, EQ=9, PEQ=10, 
		MEQ=11, TEQ=12, DEQ=13, COMMA=14, DOT=15, LPR=16, RPR=17, PLUS=18, MINUS=19, 
		TIMES=20, DIV=21, POW=22, LT=23, GT=24, LBR=25, RBR=26, BNL=27, WS=28, 
		BREAK=29, NL=30, ERR=31;
	public static final int Code = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "Code"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'\n'", "INLINE", "BLOCK", "ANY", "'u'", "NAME", "ID", "NUM", "'='", "'+='", 
		"'-='", "'*='", "'/='", "','", "'.'", "'('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'<'", "'>'", "'['", "']'", "BNL", "WS", "BREAK", "NL", 
		"ERR"
	};
	public static final String[] ruleNames = {
		"EOL", "INLINE", "BLOCK", "ANY", "UDIST", "NAME", "ID", "NUM", "EQ", "PEQ", 
		"MEQ", "TEQ", "DEQ", "COMMA", "DOT", "LPR", "RPR", "PLUS", "MINUS", "TIMES", 
		"DIV", "POW", "LT", "GT", "LBR", "RBR", "BNL", "WS", "BREAK", "NL", "ERR"
	};


	public ScenarioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScenarioLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00c5\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7"+
		"\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\t\6\tk\n\t\r\t\16\tl\3\t\3\t\6\tq\n"+
		"\t\r\t\16\tr\5\tu\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00a9\n\34\3\34\7\34\u00ac\n\34\f\34\16\34\u00af\13\34\6\34\u00b1\n\34"+
		"\r\34\16\34\u00b2\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\6\37\u00be"+
		"\n\37\r\37\16\37\u00bf\3\37\3\37\3 \3 \2\2!\4\3\6\4\b\5\n\6\f\7\16\b\20"+
		"\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27"+
		".\30\60\31\62\32\64\33\66\348\35:\36<\37> @!\4\2\3\t\4\2\13\13\"\"\3\2"+
		"C\\\5\2\62;C\\c|\3\2c|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\u00cf\2\4"+
		"\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2"+
		"\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32"+
		"\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3"+
		"&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62"+
		"\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3"+
		">\3\2\2\2\3@\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bM\3\2\2\2\nW\3\2\2\2\fY\3"+
		"\2\2\2\16[\3\2\2\2\20b\3\2\2\2\22j\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30"+
		"{\3\2\2\2\32~\3\2\2\2\34\u0081\3\2\2\2\36\u0084\3\2\2\2 \u0086\3\2\2\2"+
		"\"\u0088\3\2\2\2$\u008a\3\2\2\2&\u008c\3\2\2\2(\u008e\3\2\2\2*\u0090\3"+
		"\2\2\2,\u0092\3\2\2\2.\u0094\3\2\2\2\60\u0096\3\2\2\2\62\u0098\3\2\2\2"+
		"\64\u009a\3\2\2\2\66\u009c\3\2\2\28\u00b0\3\2\2\2:\u00b4\3\2\2\2<\u00b8"+
		"\3\2\2\2>\u00bd\3\2\2\2@\u00c3\3\2\2\2BC\7\f\2\2C\5\3\2\2\2DE\7b\2\2E"+
		"F\3\2\2\2FG\b\3\2\2G\7\3\2\2\2HN\7\13\2\2IJ\7\"\2\2JK\7\"\2\2KL\7\"\2"+
		"\2LN\7\"\2\2MH\3\2\2\2MI\3\2\2\2NR\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b\4\2\2V\t\3\2\2\2WX\13\2"+
		"\2\2X\13\3\2\2\2YZ\7w\2\2Z\r\3\2\2\2[_\t\3\2\2\\^\t\4\2\2]\\\3\2\2\2^"+
		"a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2a_\3\2\2\2bf\t\5\2\2ce\t\6\2"+
		"\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ik\t\7"+
		"\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mt\3\2\2\2np\7\60\2\2oq\t"+
		"\7\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tn\3\2\2\2tu\3"+
		"\2\2\2u\23\3\2\2\2vw\7?\2\2w\25\3\2\2\2xy\7-\2\2yz\7?\2\2z\27\3\2\2\2"+
		"{|\7/\2\2|}\7?\2\2}\31\3\2\2\2~\177\7,\2\2\177\u0080\7?\2\2\u0080\33\3"+
		"\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7?\2\2\u0083\35\3\2\2\2\u0084"+
		"\u0085\7.\2\2\u0085\37\3\2\2\2\u0086\u0087\7\60\2\2\u0087!\3\2\2\2\u0088"+
		"\u0089\7*\2\2\u0089#\3\2\2\2\u008a\u008b\7+\2\2\u008b%\3\2\2\2\u008c\u008d"+
		"\7-\2\2\u008d\'\3\2\2\2\u008e\u008f\7/\2\2\u008f)\3\2\2\2\u0090\u0091"+
		"\7,\2\2\u0091+\3\2\2\2\u0092\u0093\7\61\2\2\u0093-\3\2\2\2\u0094\u0095"+
		"\7`\2\2\u0095/\3\2\2\2\u0096\u0097\7>\2\2\u0097\61\3\2\2\2\u0098\u0099"+
		"\7@\2\2\u0099\63\3\2\2\2\u009a\u009b\7]\2\2\u009b\65\3\2\2\2\u009c\u009d"+
		"\7_\2\2\u009d\67\3\2\2\2\u009e\u00a0\t\b\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a8\3\2"+
		"\2\2\u00a3\u00a9\7\13\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7\"\2\2\u00a6"+
		"\u00a7\7\"\2\2\u00a7\u00a9\7\"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2"+
		"\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u009f\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b39\3\2\2\2\u00b4\u00b5\t\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\35\3\2\u00b7;\3\2\2\2\u00b8\u00b9\7"+
		"b\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\36\4\2\u00bb=\3\2\2\2\u00bc\u00be"+
		"\t\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\37\4\2\u00c2?\3\2\2\2"+
		"\u00c3\u00c4\13\2\2\2\u00c4A\3\2\2\2\20\2\3MR_flrt\u00a1\u00a8\u00ad\u00b2"+
		"\u00bf\5\7\3\2\2\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}