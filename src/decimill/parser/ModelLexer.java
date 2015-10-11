// Generated from ModelLexer.g4 by ANTLR 4.4

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
public class ModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, INLINE=2, BLOCK=3, ANY=4, UDIST=5, NODE=6, GOAL=7, ASSM=8, VAR=9, 
		NAME=10, ID=11, NUM=12, REF=13, EQ=14, COMMA=15, LPR=16, RPR=17, PLUS=18, 
		MINUS=19, TIMES=20, DIV=21, POW=22, LT=23, GT=24, LBR=25, RBR=26, BNL=27, 
		BREAK=28, NL=29, WS=30, ERR=31;
	public static final int Code = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "Code"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"EOL", "INLINE", "BLOCK", "ANY", "UDIST", "NODE", "GOAL", "ASSM", "VAR", 
		"NAME", "ID", "NUM", "REF", "EQ", "COMMA", "LPR", "RPR", "PLUS", "MINUS", 
		"TIMES", "DIV", "POW", "LT", "GT", "LBR", "RBR", "BNL", "BREAK", "NL", 
		"WS", "ERR"
	};


	public ModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ModelLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00d1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\7\4Q\n\4\f"+
		"\4\16\4T\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\3\r\6"+
		"\r\u0082\n\r\r\r\16\r\u0083\3\r\3\r\6\r\u0088\n\r\r\r\16\r\u0089\5\r\u008c"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\6\34\u00ac\n\34\r\34\16\34\u00ad\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u00b5\n\34\3\34\7\34\u00b8\n\34\f\34\16\34\u00bb\13\34\6\34\u00bd"+
		"\n\34\r\34\16\34\u00be\3\35\3\35\3\35\3\35\3\36\6\36\u00c6\n\36\r\36\16"+
		"\36\u00c7\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \2\2!\4\3\6\4\b\5\n\6\f\7"+
		"\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25"+
		"*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!\4\2\3\t\4\2\13\13"+
		"\"\"\3\2C\\\t\2\"\"((//\61;C\\aac|\3\2c|\6\2\62;C\\aac|\3\2\62;\4\2\f"+
		"\f\17\17\u00db\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3\2"+
		"\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2"+
		"\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3"+
		"\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2"+
		"\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3"+
		"\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bM\3\2\2"+
		"\2\nW\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20a\3\2\2\2\22g\3\2\2\2\24m\3\2\2"+
		"\2\26r\3\2\2\2\30y\3\2\2\2\32\u0081\3\2\2\2\34\u008d\3\2\2\2\36\u0090"+
		"\3\2\2\2 \u0092\3\2\2\2\"\u0094\3\2\2\2$\u0096\3\2\2\2&\u0098\3\2\2\2"+
		"(\u009a\3\2\2\2*\u009c\3\2\2\2,\u009e\3\2\2\2.\u00a0\3\2\2\2\60\u00a2"+
		"\3\2\2\2\62\u00a4\3\2\2\2\64\u00a6\3\2\2\2\66\u00a8\3\2\2\28\u00bc\3\2"+
		"\2\2:\u00c0\3\2\2\2<\u00c5\3\2\2\2>\u00cb\3\2\2\2@\u00cf\3\2\2\2BC\7\f"+
		"\2\2C\5\3\2\2\2DE\7b\2\2EF\3\2\2\2FG\b\3\2\2G\7\3\2\2\2HN\7\13\2\2IJ\7"+
		"\"\2\2JK\7\"\2\2KL\7\"\2\2LN\7\"\2\2MH\3\2\2\2MI\3\2\2\2NR\3\2\2\2OQ\t"+
		"\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\b"+
		"\4\2\2V\t\3\2\2\2WX\13\2\2\2X\13\3\2\2\2YZ\7w\2\2Z\r\3\2\2\2[\\\7p\2\2"+
		"\\]\7q\2\2]^\7f\2\2^_\7g\2\2_`\7<\2\2`\17\3\2\2\2ab\7i\2\2bc\7q\2\2cd"+
		"\7c\2\2de\7n\2\2ef\7<\2\2f\21\3\2\2\2gh\7c\2\2hi\7u\2\2ij\7u\2\2jk\7o"+
		"\2\2kl\7<\2\2l\23\3\2\2\2mn\7x\2\2no\7c\2\2op\7t\2\2pq\7<\2\2q\25\3\2"+
		"\2\2rv\t\3\2\2su\t\4\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\27\3"+
		"\2\2\2xv\3\2\2\2y}\t\5\2\2z|\t\6\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\31\3\2\2\2\177}\3\2\2\2\u0080\u0082\t\7\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u008b\3\2\2\2\u0085\u0087\7\60\2\2\u0086\u0088\t\7\2\2\u0087\u0086\3"+
		"\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u008c\3\2\2\2\u008c\33\3\2\2"+
		"\2\u008d\u008e\7>\2\2\u008e\u008f\7/\2\2\u008f\35\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091\37\3\2\2\2\u0092\u0093\7.\2\2\u0093!\3\2\2\2\u0094\u0095"+
		"\7*\2\2\u0095#\3\2\2\2\u0096\u0097\7+\2\2\u0097%\3\2\2\2\u0098\u0099\7"+
		"-\2\2\u0099\'\3\2\2\2\u009a\u009b\7/\2\2\u009b)\3\2\2\2\u009c\u009d\7"+
		",\2\2\u009d+\3\2\2\2\u009e\u009f\7\61\2\2\u009f-\3\2\2\2\u00a0\u00a1\7"+
		"`\2\2\u00a1/\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\61\3\2\2\2\u00a4\u00a5\7"+
		"@\2\2\u00a5\63\3\2\2\2\u00a6\u00a7\7]\2\2\u00a7\65\3\2\2\2\u00a8\u00a9"+
		"\7_\2\2\u00a9\67\3\2\2\2\u00aa\u00ac\t\b\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b4\3\2"+
		"\2\2\u00af\u00b5\7\13\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7\"\2\2\u00b2"+
		"\u00b3\7\"\2\2\u00b3\u00b5\7\"\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\t\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00ab\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf9\3\2\2\2\u00c0\u00c1\7b\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\b\35\3\2\u00c3;\3\2\2\2\u00c4\u00c6\t\b\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\36\3\2\u00ca=\3\2\2\2\u00cb"+
		"\u00cc\t\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\37\4\2\u00ce?\3\2\2\2"+
		"\u00cf\u00d0\13\2\2\2\u00d0A\3\2\2\2\20\2\3MRv}\u0083\u0089\u008b\u00ad"+
		"\u00b4\u00b9\u00be\u00c7\5\7\3\2\6\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}