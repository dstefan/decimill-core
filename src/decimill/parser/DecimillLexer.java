// Generated from DecimillLexer.g4 by ANTLR 4.4

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
public class DecimillLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		InlineStart=1, BlockStart=2, EOL=3, Character=4, Word=5, Text=6, ID=7, 
		Int=8, Dbl=9, Procent=10, Allowed=11, Str=12, Dot=13, Colon=14, Comma=15, 
		Quote=16, FromTo=17, Refinement=18, Equals=19, PlusEq=20, MinusEq=21, 
		TimesEq=22, DivEq=23, Plus=24, Minus=25, Times=26, Div=27, Power=28, LowerThan=29, 
		GreaterThan=30, IsEqual=31, LBracket=32, RBracket=33, UBracket=34, LParent=35, 
		RParent=36, LCurly=37, RCurly=38, InlineEnd=39, BlockEnd=40, WS=41, BNL=42, 
		Comment=43, ERR=44;
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
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','"
	};
	public static final String[] ruleNames = {
		"InlineStart", "BlockStart", "EOL", "Character", "Word", "Text", "ID", 
		"Int", "Dbl", "Procent", "Allowed", "Str", "Dot", "Colon", "Comma", "Quote", 
		"FromTo", "Refinement", "Equals", "PlusEq", "MinusEq", "TimesEq", "DivEq", 
		"Plus", "Minus", "Times", "Div", "Power", "LowerThan", "GreaterThan", 
		"IsEqual", "LBracket", "RBracket", "UBracket", "LParent", "RParent", "LCurly", 
		"RCurly", "InlineEnd", "BlockEnd", "WS", "BNL", "Comment", "ERR"
	};


	public DecimillLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecimillLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0124\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\6\3b\n\3\r\3\16\3c\3\3\3\3\3\3\3\3\3"+
		"\3\5\3k\n\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3\3\3\4\6\4v\n\4\r\4\16\4"+
		"w\3\4\3\4\3\5\6\5}\n\5\r\5\16\5~\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086"+
		"\13\6\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\5\7\u0090\n\7\3\b"+
		"\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\t\5\t\u009a\n\t\3\t\6\t\u009d"+
		"\n\t\r\t\16\t\u009e\3\n\3\n\3\n\6\n\u00a4\n\n\r\n\16\n\u00a5\5\n\u00a8"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		"(\3(\3)\6)\u00f8\n)\r)\16)\u00f9\3)\3)\3*\6*\u00ff\n*\r*\16*\u0100\3*"+
		"\3*\3+\6+\u0106\n+\r+\16+\u0107\3+\3+\3+\3+\3+\5+\u010f\n+\3+\7+\u0112"+
		"\n+\f+\16+\u0115\13+\3+\3+\3,\3,\3,\3,\6,\u011d\n,\r,\16,\u011e\3,\3,"+
		"\3-\3-\3\u00b1\2.\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32"+
		"\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66"+
		"\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\4\2\3\n\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\5\2\f\f\17\17bb\3\2C\\\7\2((\62;C\\aac|\b\2\"\"((\62;C"+
		"\\aac|\3\2c|\3\2\62;\u0136\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2"+
		"\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3"+
		"\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2"+
		"\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2"+
		"\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3"+
		"\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2"+
		"\2\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3"+
		"R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\4\\\3\2\2\2\6a\3"+
		"\2\2\2\bu\3\2\2\2\n|\3\2\2\2\f\u0080\3\2\2\2\16\u0087\3\2\2\2\20\u0091"+
		"\3\2\2\2\22\u0099\3\2\2\2\24\u00a0\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3"+
		"\2\2\2\32\u00ad\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2"+
		"\2\"\u00bc\3\2\2\2$\u00be\3\2\2\2&\u00c1\3\2\2\2(\u00c4\3\2\2\2*\u00c6"+
		"\3\2\2\2,\u00c9\3\2\2\2.\u00cc\3\2\2\2\60\u00cf\3\2\2\2\62\u00d2\3\2\2"+
		"\2\64\u00d4\3\2\2\2\66\u00d6\3\2\2\28\u00d8\3\2\2\2:\u00da\3\2\2\2<\u00dc"+
		"\3\2\2\2>\u00de\3\2\2\2@\u00e0\3\2\2\2B\u00e3\3\2\2\2D\u00e5\3\2\2\2F"+
		"\u00e7\3\2\2\2H\u00ea\3\2\2\2J\u00ec\3\2\2\2L\u00ee\3\2\2\2N\u00f0\3\2"+
		"\2\2P\u00f2\3\2\2\2R\u00f7\3\2\2\2T\u00fe\3\2\2\2V\u0105\3\2\2\2X\u0118"+
		"\3\2\2\2Z\u0122\3\2\2\2\\]\7b\2\2]^\3\2\2\2^_\b\2\2\2_\5\3\2\2\2`b\t\2"+
		"\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dj\3\2\2\2ef\7\"\2\2fg\7\""+
		"\2\2gh\7\"\2\2hk\7\"\2\2ik\7\13\2\2je\3\2\2\2ji\3\2\2\2ko\3\2\2\2ln\t"+
		"\3\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\b"+
		"\3\2\2s\7\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy"+
		"\3\2\2\2yz\b\4\3\2z\t\3\2\2\2{}\n\4\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\13\3\2\2\2\u0080\u0084\t\5\2\2\u0081\u0083\t\6\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\r\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008f\t\5\2\2\u0088\u008a"+
		"\t\7\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\t\6"+
		"\2\2\u008f\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\17\3\2\2\2\u0091\u0095"+
		"\t\b\2\2\u0092\u0094\5\30\f\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\21\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\7/\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u009d\t\t\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a7"+
		"\5\22\t\2\u00a1\u00a3\7\60\2\2\u00a2\u00a4\t\t\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9"+
		"\u00aa\7\'\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\t\6\2\2\u00ac\31\3\2\2\2\u00ad"+
		"\u00b1\7$\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7$\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\60\2"+
		"\2\u00b7\35\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7"+
		".\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7)\2\2\u00bd#\3\2\2\2\u00be\u00bf\7/"+
		"\2\2\u00bf\u00c0\7@\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3"+
		"\7/\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5)\3\2\2\2\u00c6\u00c7"+
		"\7-\2\2\u00c7\u00c8\7?\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb-\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\7?\2\2\u00ce/\3"+
		"\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\7?\2\2\u00d1\61\3\2\2\2\u00d2"+
		"\u00d3\7-\2\2\u00d3\63\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\65\3\2\2\2\u00d6"+
		"\u00d7\7,\2\2\u00d7\67\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d99\3\2\2\2\u00da"+
		"\u00db\7`\2\2\u00db;\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd=\3\2\2\2\u00de\u00df"+
		"\7@\2\2\u00df?\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00e2\7?\2\2\u00e2A\3"+
		"\2\2\2\u00e3\u00e4\7]\2\2\u00e4C\3\2\2\2\u00e5\u00e6\7_\2\2\u00e6E\3\2"+
		"\2\2\u00e7\u00e8\7_\2\2\u00e8\u00e9\7w\2\2\u00e9G\3\2\2\2\u00ea\u00eb"+
		"\7*\2\2\u00ebI\3\2\2\2\u00ec\u00ed\7+\2\2\u00edK\3\2\2\2\u00ee\u00ef\7"+
		"}\2\2\u00efM\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f1O\3\2\2\2\u00f2\u00f3"+
		"\7b\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b(\4\2\u00f5Q\3\2\2\2\u00f6\u00f8"+
		"\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b)\4\2\u00fcS\3\2\2\2\u00fd"+
		"\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b*\3\2\u0103"+
		"U\3\2\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010e\3\2\2\2\u0109\u010a"+
		"\7\"\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7\"\2\2\u010c\u010f\7\"\2\2\u010d"+
		"\u010f\7\13\2\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0113\3"+
		"\2\2\2\u0110\u0112\t\3\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0117\b+\3\2\u0117W\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a"+
		"\7\61\2\2\u011a\u011c\3\2\2\2\u011b\u011d\n\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\b,\3\2\u0121Y\3\2\2\2\u0122\u0123\13\2\2\2\u0123"+
		"[\3\2\2\2\30\2\3cjow~\u0084\u008b\u008f\u0095\u0099\u009e\u00a5\u00a7"+
		"\u00b1\u00f9\u0100\u0107\u010e\u0113\u011e\5\7\3\2\2\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}