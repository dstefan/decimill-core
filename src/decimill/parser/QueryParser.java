// Generated from QueryParser.g4 by ANTLR 4.4

    package decimill.parser;
    import decimill.*;
    import decimill.lang.*;
    import decimill.query.*;
    import decimill.expression.*;
    import org.apache.commons.lang3.StringUtils;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
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
		ERR=43;
	public static final String[] tokenNames = {
		"<INVALID>", "InlineStart", "BlockStart", "EOL", "Character", "Word", 
		"Text", "ID", "Int", "Dbl", "Procent", "Allowed", "Str", "Dot", "Colon", 
		"Comma", "Quote", "FromTo", "Refinement", "Equals", "PlusEq", "MinusEq", 
		"TimesEq", "DivEq", "Plus", "Minus", "Times", "Div", "Power", "LowerThan", 
		"GreaterThan", "IsEqual", "LBracket", "RBracket", "UBracket", "LParent", 
		"RParent", "LCurly", "RCurly", "InlineEnd", "BlockEnd", "WS", "BNL", "ERR"
	};
	public static final int
		RULE_parse = 0, RULE_element = 1, RULE_str = 2, RULE_inlineCode = 3, RULE_blockCode = 4, 
		RULE_period = 5, RULE_assign = 6, RULE_assignAndPrint = 7, RULE_evalAndPrint = 8, 
		RULE_eval = 9, RULE_assignment = 10, RULE_varAssignment = 11, RULE_refAssignment = 12, 
		RULE_expression = 13, RULE_expr_add = 14, RULE_expr_sub = 15, RULE_expr_mult = 16, 
		RULE_expr_div = 17, RULE_expr_pow = 18, RULE_expr_lt = 19, RULE_expr_gt = 20, 
		RULE_expr_eq = 21, RULE_expr_atom = 22, RULE_variable = 23, RULE_reference = 24, 
		RULE_evaluate = 25, RULE_array = 26, RULE_assoc_array = 27, RULE_function = 28, 
		RULE_string = 29, RULE_constant = 30, RULE_num_int = 31, RULE_num_double = 32, 
		RULE_num_procent = 33, RULE_dist = 34, RULE_val = 35, RULE_name = 36, 
		RULE_namespace = 37;
	public static final String[] ruleNames = {
		"parse", "element", "str", "inlineCode", "blockCode", "period", "assign", 
		"assignAndPrint", "evalAndPrint", "eval", "assignment", "varAssignment", 
		"refAssignment", "expression", "expr_add", "expr_sub", "expr_mult", "expr_div", 
		"expr_pow", "expr_lt", "expr_gt", "expr_eq", "expr_atom", "variable", 
		"reference", "evaluate", "array", "assoc_array", "function", "string", 
		"constant", "num_int", "num_double", "num_procent", "dist", "val", "name", 
		"namespace"
	};

	@Override
	public String getGrammarFileName() { return "QueryParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Context context;
	    QueryCompiler compiler;
	    Rewriter rewriter;
	    int offset;
	    String carriage;

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Context c;
		public QueryCompiler q;
		public Rewriter r;
		public TerminalNode EOF() { return getToken(QueryParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParseContext(ParserRuleContext parent, int invokingState, Context c, QueryCompiler q, Rewriter r) {
			super(parent, invokingState);
			this.c = c;
			this.q = q;
			this.r = r;
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse(Context c,QueryCompiler q,Rewriter r) throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState(), c, q, r);
		enterRule(_localctx, 0, RULE_parse);

		        context = c;
		        compiler = q;
		        rewriter = r;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76); element();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InlineStart) | (1L << BlockStart) | (1L << Character))) != 0) );
			setState(81); match(EOF);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QueryParser.EOF, 0); }
		public StrContext str(int i) {
			return getRuleContext(StrContext.class,i);
		}
		public TerminalNode InlineEnd() { return getToken(QueryParser.InlineEnd, 0); }
		public List<StrContext> str() {
			return getRuleContexts(StrContext.class);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public TerminalNode BlockStart() { return getToken(QueryParser.BlockStart, 0); }
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public TerminalNode BlockEnd() { return getToken(QueryParser.BlockEnd, 0); }
		public TerminalNode InlineStart() { return getToken(QueryParser.InlineStart, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			int _alt;
			setState(96);
			switch (_input.LA(1)) {
			case Character:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(83); str();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case InlineStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(InlineStart);
				setState(89); inlineCode();
				setState(90); match(InlineEnd);
				}
				break;
			case BlockStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(BlockStart);
				setState(93); blockCode();
				setState(94);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==BlockEnd) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class StrContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(QueryParser.EOL, 0); }
		public List<TerminalNode> Character() { return getTokens(QueryParser.Character); }
		public TerminalNode Character(int i) {
			return getToken(QueryParser.Character, i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_str);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(98); match(Character);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(104);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(103); match(EOL);
				}
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

	public static class InlineCodeContext extends ParserRuleContext {
		public AssignAndPrintContext assignAndPrint;
		public EvalAndPrintContext evalAndPrint;
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public AssignAndPrintContext assignAndPrint() {
			return getRuleContext(AssignAndPrintContext.class,0);
		}
		public EvalAndPrintContext evalAndPrint() {
			return getRuleContext(EvalAndPrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public RefAssignmentContext refAssignment() {
			return getRuleContext(RefAssignmentContext.class,0);
		}
		public InlineCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterInlineCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitInlineCode(this);
		}
	}

	public final InlineCodeContext inlineCode() throws RecognitionException {
		InlineCodeContext _localctx = new InlineCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inlineCode);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); period();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); ((InlineCodeContext)_localctx).assignAndPrint = assignAndPrint();

				        try {
				            rewriter.rewriteQueryInline(((InlineCodeContext)_localctx).assignAndPrint, ((InlineCodeContext)_localctx).assignAndPrint.value);
				        } catch (RuntimeException e) {
				            throw new CompilerException(e.getMessage(), (((InlineCodeContext)_localctx).assignAndPrint!=null?(((InlineCodeContext)_localctx).assignAndPrint.start):null).getLine(), (((InlineCodeContext)_localctx).assignAndPrint!=null?(((InlineCodeContext)_localctx).assignAndPrint.start):null).getCharPositionInLine());
				        }
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111); ((InlineCodeContext)_localctx).evalAndPrint = evalAndPrint();

				        try {
				            rewriter.rewriteQueryInline(((InlineCodeContext)_localctx).evalAndPrint, ((InlineCodeContext)_localctx).evalAndPrint.value);
				        } catch (RuntimeException e) {
				            throw new CompilerException(e.getMessage(), (((InlineCodeContext)_localctx).evalAndPrint!=null?(((InlineCodeContext)_localctx).evalAndPrint.start):null).getLine(), (((InlineCodeContext)_localctx).evalAndPrint!=null?(((InlineCodeContext)_localctx).evalAndPrint.start):null).getCharPositionInLine());
				        }
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114); refAssignment();
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

	public static class BlockCodeContext extends ParserRuleContext {
		public AssignAndPrintContext assignAndPrint;
		public EvalAndPrintContext evalAndPrint;
		public RefAssignmentContext refAssignment(int i) {
			return getRuleContext(RefAssignmentContext.class,i);
		}
		public List<AssignAndPrintContext> assignAndPrint() {
			return getRuleContexts(AssignAndPrintContext.class);
		}
		public List<EvalAndPrintContext> evalAndPrint() {
			return getRuleContexts(EvalAndPrintContext.class);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<RefAssignmentContext> refAssignment() {
			return getRuleContexts(RefAssignmentContext.class);
		}
		public EvalAndPrintContext evalAndPrint(int i) {
			return getRuleContext(EvalAndPrintContext.class,i);
		}
		public AssignAndPrintContext assignAndPrint(int i) {
			return getRuleContext(AssignAndPrintContext.class,i);
		}
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitBlockCode(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(117); assign();
					}
					break;
				case 2:
					{
					setState(118); ((BlockCodeContext)_localctx).assignAndPrint = assignAndPrint();

					            try {
					                rewriter.rewriteQueryBlock(((BlockCodeContext)_localctx).assignAndPrint, ((BlockCodeContext)_localctx).assignAndPrint.value);
					            } catch (RuntimeException e) {
					                throw new CompilerException(e.getMessage(), (((BlockCodeContext)_localctx).assignAndPrint!=null?(((BlockCodeContext)_localctx).assignAndPrint.start):null).getLine(), (((BlockCodeContext)_localctx).assignAndPrint!=null?(((BlockCodeContext)_localctx).assignAndPrint.start):null).getCharPositionInLine());
					            }
					        
					}
					break;
				case 3:
					{
					setState(121); ((BlockCodeContext)_localctx).evalAndPrint = evalAndPrint();

					            try {
					                rewriter.rewriteQueryBlock(((BlockCodeContext)_localctx).evalAndPrint, ((BlockCodeContext)_localctx).evalAndPrint.value);
					            } catch (RuntimeException e) {
					                throw new CompilerException(e.getMessage(), (((BlockCodeContext)_localctx).evalAndPrint!=null?(((BlockCodeContext)_localctx).evalAndPrint.start):null).getLine(), (((BlockCodeContext)_localctx).evalAndPrint!=null?(((BlockCodeContext)_localctx).evalAndPrint.start):null).getCharPositionInLine());
					            }
					        
					}
					break;
				case 4:
					{
					setState(124); refAssignment();
					}
					break;
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << ID) | (1L << Equals))) != 0) );
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

	public static class PeriodContext extends ParserRuleContext {
		public Num_intContext from;
		public Num_intContext to;
		public Num_intContext num_int(int i) {
			return getRuleContext(Num_intContext.class,i);
		}
		public List<Num_intContext> num_int() {
			return getRuleContexts(Num_intContext.class);
		}
		public TerminalNode FromTo() { return getToken(QueryParser.FromTo, 0); }
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitPeriod(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((PeriodContext)_localctx).from = num_int();
			setState(130); match(FromTo);
			setState(131); ((PeriodContext)_localctx).to = num_int();


			        int from = ((PeriodContext)_localctx).from.value;
			        int to = ((PeriodContext)_localctx).to.value;
			        
			        if (from < 1 || to < 1) {
			            throw new CompilerException("Time values must be both greater than 0.", (((PeriodContext)_localctx).from!=null?(((PeriodContext)_localctx).from.start):null).getLine(), (((PeriodContext)_localctx).from!=null?(((PeriodContext)_localctx).from.start):null).getCharPositionInLine());
			        } else if (from > to) {
			            throw new CompilerException("'From' time must be less than or equal to 'to' time.", (((PeriodContext)_localctx).from!=null?(((PeriodContext)_localctx).from.start):null).getLine(), (((PeriodContext)_localctx).from!=null?(((PeriodContext)_localctx).from.start):null).getCharPositionInLine());
			        }

			        compiler.setFrom(((PeriodContext)_localctx).from.value - 1);
			        compiler.setTo(((PeriodContext)_localctx).to.value - 1);
			    
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

	public static class AssignContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); assignment();
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

	public static class AssignAndPrintContext extends ParserRuleContext {
		public DM_Object value;
		public AssignmentContext assignment;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode Equals() { return getToken(QueryParser.Equals, 0); }
		public AssignAndPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAndPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterAssignAndPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitAssignAndPrint(this);
		}
	}

	public final AssignAndPrintContext assignAndPrint() throws RecognitionException {
		AssignAndPrintContext _localctx = new AssignAndPrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignAndPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(Equals);
			setState(137); ((AssignAndPrintContext)_localctx).assignment = assignment();
			 ((AssignAndPrintContext)_localctx).value =  ((AssignAndPrintContext)_localctx).assignment.value; 
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

	public static class EvalAndPrintContext extends ParserRuleContext {
		public DM_Object value;
		public EvalContext eval;
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public TerminalNode Equals() { return getToken(QueryParser.Equals, 0); }
		public EvalAndPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evalAndPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterEvalAndPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitEvalAndPrint(this);
		}
	}

	public final EvalAndPrintContext evalAndPrint() throws RecognitionException {
		EvalAndPrintContext _localctx = new EvalAndPrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_evalAndPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(Equals);
			setState(141); ((EvalAndPrintContext)_localctx).eval = eval();
			 ((EvalAndPrintContext)_localctx).value =  ((EvalAndPrintContext)_localctx).eval.value; 
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

	public static class EvalContext extends ParserRuleContext {
		public DM_Object value;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); ((EvalContext)_localctx).expression = expression();

			        try {
			            ((EvalContext)_localctx).value =  compiler.eval(((EvalContext)_localctx).expression.node);
			        } catch (RuntimeException e) {
			            throw new CompilerException(e.getMessage(), (((EvalContext)_localctx).expression!=null?(((EvalContext)_localctx).expression.start):null).getLine(), (((EvalContext)_localctx).expression!=null?(((EvalContext)_localctx).expression.start):null).getCharPositionInLine());
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

	public static class AssignmentContext extends ParserRuleContext {
		public DM_Object value;
		public VarAssignmentContext varAssignment;
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); ((AssignmentContext)_localctx).varAssignment = varAssignment();
			 ((AssignmentContext)_localctx).value =  ((AssignmentContext)_localctx).varAssignment.value; 
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public DM_Object value;
		public VariableContext variable;
		public ExpressionContext expression;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(QueryParser.Equals, 0); }
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitVarAssignment(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); ((VarAssignmentContext)_localctx).variable = variable();
			setState(151); match(Equals);
			setState(152); ((VarAssignmentContext)_localctx).expression = expression();

			        try {
			            ((VarAssignmentContext)_localctx).value =  compiler.eval(((VarAssignmentContext)_localctx).variable.node.toPointer(), ((VarAssignmentContext)_localctx).expression.node);
			        } catch (RuntimeException e) {
			            throw new CompilerException(e.getMessage(), (((VarAssignmentContext)_localctx).expression!=null?(((VarAssignmentContext)_localctx).expression.start):null).getLine(), (((VarAssignmentContext)_localctx).expression!=null?(((VarAssignmentContext)_localctx).expression.start):null).getCharPositionInLine());
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

	public static class RefAssignmentContext extends ParserRuleContext {
		public ReferenceContext reference;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(QueryParser.Equals, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public RefAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterRefAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitRefAssignment(this);
		}
	}

	public final RefAssignmentContext refAssignment() throws RecognitionException {
		RefAssignmentContext _localctx = new RefAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_refAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); ((RefAssignmentContext)_localctx).reference = reference();
			setState(156); match(Equals);
			setState(157); ((RefAssignmentContext)_localctx).expression = expression();
			 context.assign(((RefAssignmentContext)_localctx).reference.node.toReference(), ((RefAssignmentContext)_localctx).expression.node); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_addContext expr_add;
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); ((ExpressionContext)_localctx).expr_add = expr_add();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).expr_add.node; 
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

	public static class Expr_addContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_subContext expr_sub;
		public TerminalNode Plus(int i) {
			return getToken(QueryParser.Plus, i);
		}
		public List<TerminalNode> Plus() { return getTokens(QueryParser.Plus); }
		public Expr_subContext expr_sub(int i) {
			return getRuleContext(Expr_subContext.class,i);
		}
		public List<Expr_subContext> expr_sub() {
			return getRuleContexts(Expr_subContext.class);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); ((Expr_addContext)_localctx).expr_sub = expr_sub();
			 ((Expr_addContext)_localctx).node =  ((Expr_addContext)_localctx).expr_sub.node; 
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus) {
				{
				{
				setState(165); match(Plus);
				setState(166); ((Expr_addContext)_localctx).expr_sub = expr_sub();
				 ((Expr_addContext)_localctx).node =  new PlusNode(_localctx.node, ((Expr_addContext)_localctx).expr_sub.node); 
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_subContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_multContext expr_mult;
		public TerminalNode Minus(int i) {
			return getToken(QueryParser.Minus, i);
		}
		public List<Expr_multContext> expr_mult() {
			return getRuleContexts(Expr_multContext.class);
		}
		public Expr_multContext expr_mult(int i) {
			return getRuleContext(Expr_multContext.class,i);
		}
		public List<TerminalNode> Minus() { return getTokens(QueryParser.Minus); }
		public Expr_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_sub(this);
		}
	}

	public final Expr_subContext expr_sub() throws RecognitionException {
		Expr_subContext _localctx = new Expr_subContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); ((Expr_subContext)_localctx).expr_mult = expr_mult();
			 ((Expr_subContext)_localctx).node =  ((Expr_subContext)_localctx).expr_mult.node; 
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(176); match(Minus);
				setState(177); ((Expr_subContext)_localctx).expr_mult = expr_mult();
				 ((Expr_subContext)_localctx).node =  new MinusNode(_localctx.node, ((Expr_subContext)_localctx).expr_mult.node); 
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_multContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_divContext expr_div;
		public List<Expr_divContext> expr_div() {
			return getRuleContexts(Expr_divContext.class);
		}
		public List<TerminalNode> Times() { return getTokens(QueryParser.Times); }
		public TerminalNode Times(int i) {
			return getToken(QueryParser.Times, i);
		}
		public Expr_divContext expr_div(int i) {
			return getRuleContext(Expr_divContext.class,i);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); ((Expr_multContext)_localctx).expr_div = expr_div();
			 ((Expr_multContext)_localctx).node =  ((Expr_multContext)_localctx).expr_div.node; 
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Times) {
				{
				{
				setState(187); match(Times);
				setState(188); ((Expr_multContext)_localctx).expr_div = expr_div();
				 ((Expr_multContext)_localctx).node =  new TimesNode(_localctx.node, ((Expr_multContext)_localctx).expr_div.node); 
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_divContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_powContext expr_pow;
		public TerminalNode Div(int i) {
			return getToken(QueryParser.Div, i);
		}
		public List<TerminalNode> Div() { return getTokens(QueryParser.Div); }
		public Expr_powContext expr_pow(int i) {
			return getRuleContext(Expr_powContext.class,i);
		}
		public List<Expr_powContext> expr_pow() {
			return getRuleContexts(Expr_powContext.class);
		}
		public Expr_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_div(this);
		}
	}

	public final Expr_divContext expr_div() throws RecognitionException {
		Expr_divContext _localctx = new Expr_divContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); ((Expr_divContext)_localctx).expr_pow = expr_pow();
			 ((Expr_divContext)_localctx).node =  ((Expr_divContext)_localctx).expr_pow.node; 
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Div) {
				{
				{
				setState(198); match(Div);
				setState(199); ((Expr_divContext)_localctx).expr_pow = expr_pow();
				 ((Expr_divContext)_localctx).node =  new DivNode(_localctx.node, ((Expr_divContext)_localctx).expr_pow.node); 
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_powContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_ltContext expr_lt;
		public List<TerminalNode> Power() { return getTokens(QueryParser.Power); }
		public List<Expr_ltContext> expr_lt() {
			return getRuleContexts(Expr_ltContext.class);
		}
		public TerminalNode Power(int i) {
			return getToken(QueryParser.Power, i);
		}
		public Expr_ltContext expr_lt(int i) {
			return getRuleContext(Expr_ltContext.class,i);
		}
		public Expr_powContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_pow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_pow(this);
		}
	}

	public final Expr_powContext expr_pow() throws RecognitionException {
		Expr_powContext _localctx = new Expr_powContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); ((Expr_powContext)_localctx).expr_lt = expr_lt();
			 ((Expr_powContext)_localctx).node =  ((Expr_powContext)_localctx).expr_lt.node; 
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Power) {
				{
				{
				setState(209); match(Power);
				setState(210); ((Expr_powContext)_localctx).expr_lt = expr_lt();
				 ((Expr_powContext)_localctx).node =  new PowNode(_localctx.node, ((Expr_powContext)_localctx).expr_lt.node); 
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_ltContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_gtContext expr_gt;
		public Expr_gtContext expr_gt(int i) {
			return getRuleContext(Expr_gtContext.class,i);
		}
		public TerminalNode LowerThan(int i) {
			return getToken(QueryParser.LowerThan, i);
		}
		public List<Expr_gtContext> expr_gt() {
			return getRuleContexts(Expr_gtContext.class);
		}
		public List<TerminalNode> LowerThan() { return getTokens(QueryParser.LowerThan); }
		public Expr_ltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_lt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_lt(this);
		}
	}

	public final Expr_ltContext expr_lt() throws RecognitionException {
		Expr_ltContext _localctx = new Expr_ltContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_lt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); ((Expr_ltContext)_localctx).expr_gt = expr_gt();
			 ((Expr_ltContext)_localctx).node =  ((Expr_ltContext)_localctx).expr_gt.node; 
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LowerThan) {
				{
				{
				setState(220); match(LowerThan);
				setState(221); ((Expr_ltContext)_localctx).expr_gt = expr_gt();
				 ((Expr_ltContext)_localctx).node =  new LTNode(_localctx.node, ((Expr_ltContext)_localctx).expr_gt.node); 
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_gtContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_eqContext expr_eq;
		public List<Expr_eqContext> expr_eq() {
			return getRuleContexts(Expr_eqContext.class);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(QueryParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(QueryParser.GreaterThan, i);
		}
		public Expr_eqContext expr_eq(int i) {
			return getRuleContext(Expr_eqContext.class,i);
		}
		public Expr_gtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_gt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_gt(this);
		}
	}

	public final Expr_gtContext expr_gt() throws RecognitionException {
		Expr_gtContext _localctx = new Expr_gtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_gt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); ((Expr_gtContext)_localctx).expr_eq = expr_eq();
			 ((Expr_gtContext)_localctx).node =  ((Expr_gtContext)_localctx).expr_eq.node; 
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GreaterThan) {
				{
				{
				setState(231); match(GreaterThan);
				setState(232); ((Expr_gtContext)_localctx).expr_eq = expr_eq();
				 ((Expr_gtContext)_localctx).node =  new GTNode(_localctx.node, ((Expr_gtContext)_localctx).expr_eq.node); 
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_eqContext extends ParserRuleContext {
		public ExprNode node;
		public Expr_atomContext expr_atom;
		public Expr_atomContext expr_atom(int i) {
			return getRuleContext(Expr_atomContext.class,i);
		}
		public List<TerminalNode> IsEqual() { return getTokens(QueryParser.IsEqual); }
		public List<Expr_atomContext> expr_atom() {
			return getRuleContexts(Expr_atomContext.class);
		}
		public TerminalNode IsEqual(int i) {
			return getToken(QueryParser.IsEqual, i);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); ((Expr_eqContext)_localctx).expr_atom = expr_atom();
			 ((Expr_eqContext)_localctx).node =  ((Expr_eqContext)_localctx).expr_atom.node; 
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IsEqual) {
				{
				{
				setState(242); match(IsEqual);
				setState(243); ((Expr_eqContext)_localctx).expr_atom = expr_atom();
				 ((Expr_eqContext)_localctx).node =  new EQNode(_localctx.node, ((Expr_eqContext)_localctx).expr_atom.node); 
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Expr_atomContext extends ParserRuleContext {
		public ExprNode node;
		public VariableContext variable;
		public ReferenceContext reference;
		public EvaluateContext evaluate;
		public ArrayContext array;
		public Assoc_arrayContext assoc_array;
		public FunctionContext function;
		public ConstantContext constant;
		public StringContext string;
		public ExpressionContext expression;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public EvaluateContext evaluate() {
			return getRuleContext(EvaluateContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assoc_arrayContext assoc_array() {
			return getRuleContext(Assoc_arrayContext.class,0);
		}
		public TerminalNode LParent() { return getToken(QueryParser.LParent, 0); }
		public TerminalNode RParent() { return getToken(QueryParser.RParent, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_atom);
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); ((Expr_atomContext)_localctx).variable = variable();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).variable.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); ((Expr_atomContext)_localctx).reference = reference();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).reference.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257); ((Expr_atomContext)_localctx).evaluate = evaluate();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).evaluate.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260); ((Expr_atomContext)_localctx).array = array();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).array.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263); ((Expr_atomContext)_localctx).assoc_array = assoc_array();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).assoc_array.node; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266); ((Expr_atomContext)_localctx).function = function();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).function.node; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269); ((Expr_atomContext)_localctx).constant = constant();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).constant.node; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(272); ((Expr_atomContext)_localctx).string = string();
				 ((Expr_atomContext)_localctx).node =  new StringNode(((Expr_atomContext)_localctx).string.value); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(275); match(LParent);
				setState(276); ((Expr_atomContext)_localctx).expression = expression();
				setState(277); match(RParent);
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).expression.node; 
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

	public static class VariableContext extends ParserRuleContext {
		public PointerNode node;
		public Token id;
		public NameContext name;
		public TerminalNode RBracket() { return getToken(QueryParser.RBracket, 0); }
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode LBracket() { return getToken(QueryParser.LBracket, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			setState(290);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); ((VariableContext)_localctx).id = match(ID);
				 ((VariableContext)_localctx).node =  new PointerNode((((VariableContext)_localctx).id!=null?((VariableContext)_localctx).id.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); ((VariableContext)_localctx).id = match(ID);
				setState(285); match(LBracket);
				setState(286); ((VariableContext)_localctx).name = name();
				setState(287); match(RBracket);
				 ((VariableContext)_localctx).node =  new PointerNode((((VariableContext)_localctx).id!=null?((VariableContext)_localctx).id.getText():null), (((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)); 
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

	public static class ReferenceContext extends ParserRuleContext {
		public RefNode node;
		public NamespaceContext namespace;
		public Token id;
		public NamespaceContext nmsp;
		public NamespaceContext field;
		public TerminalNode RBracket() { return getToken(QueryParser.RBracket, 0); }
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode Dot() { return getToken(QueryParser.Dot, 0); }
		public TerminalNode LBracket() { return getToken(QueryParser.LBracket, 0); }
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reference);
		try {
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); ((ReferenceContext)_localctx).namespace = namespace();
				setState(293); match(Dot);
				setState(294); ((ReferenceContext)_localctx).id = match(ID);
				 ((ReferenceContext)_localctx).node =  new RefNode((((ReferenceContext)_localctx).namespace!=null?_input.getText(((ReferenceContext)_localctx).namespace.start,((ReferenceContext)_localctx).namespace.stop):null), (((ReferenceContext)_localctx).id!=null?((ReferenceContext)_localctx).id.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); ((ReferenceContext)_localctx).nmsp = namespace();
				setState(298); match(Dot);
				setState(299); ((ReferenceContext)_localctx).id = match(ID);
				setState(300); match(LBracket);
				setState(301); ((ReferenceContext)_localctx).field = namespace();
				setState(302); match(RBracket);
				 ((ReferenceContext)_localctx).node =  new RefNode((((ReferenceContext)_localctx).nmsp!=null?_input.getText(((ReferenceContext)_localctx).nmsp.start,((ReferenceContext)_localctx).nmsp.stop):null), (((ReferenceContext)_localctx).id!=null?((ReferenceContext)_localctx).id.getText():null), (((ReferenceContext)_localctx).field!=null?_input.getText(((ReferenceContext)_localctx).field.start,((ReferenceContext)_localctx).field.stop):null)); 
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

	public static class EvaluateContext extends ParserRuleContext {
		public EvalNode node;
		public NamespaceContext n;
		public Token id;
		public Token q;
		public NamespaceContext s;
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode Dot() { return getToken(QueryParser.Dot, 0); }
		public TerminalNode Quote() { return getToken(QueryParser.Quote, 0); }
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public EvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterEvaluate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitEvaluate(this);
		}
	}

	public final EvaluateContext evaluate() throws RecognitionException {
		EvaluateContext _localctx = new EvaluateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_evaluate);
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307); ((EvaluateContext)_localctx).n = namespace();
				setState(308); match(Dot);
				setState(309); ((EvaluateContext)_localctx).id = match(ID);
				setState(310); ((EvaluateContext)_localctx).q = match(Quote);
				 ((EvaluateContext)_localctx).node =  new EvalNode((((EvaluateContext)_localctx).n!=null?_input.getText(((EvaluateContext)_localctx).n.start,((EvaluateContext)_localctx).n.stop):null), (((EvaluateContext)_localctx).id!=null?((EvaluateContext)_localctx).id.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); ((EvaluateContext)_localctx).n = namespace();
				setState(314); match(Dot);
				setState(315); ((EvaluateContext)_localctx).id = match(ID);
				setState(316); match(Quote);
				setState(317); ((EvaluateContext)_localctx).s = namespace();
				 ((EvaluateContext)_localctx).node =  new EvalNode((((EvaluateContext)_localctx).n!=null?_input.getText(((EvaluateContext)_localctx).n.start,((EvaluateContext)_localctx).n.stop):null), (((EvaluateContext)_localctx).id!=null?((EvaluateContext)_localctx).id.getText():null), (((EvaluateContext)_localctx).s!=null?_input.getText(((EvaluateContext)_localctx).s.start,((EvaluateContext)_localctx).s.stop):null)); 
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

	public static class ArrayContext extends ParserRuleContext {
		public ExprNode node;
		public ExpressionContext expression;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LCurly() { return getToken(QueryParser.LCurly, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RCurly() { return getToken(QueryParser.RCurly, 0); }
		public TerminalNode Comma(int i) {
			return getToken(QueryParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QueryParser.Comma); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array);

		        ArrayNode array = new ArrayNode();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(LCurly);
			setState(323); ((ArrayContext)_localctx).expression = expression();
			 array.add(((ArrayContext)_localctx).expression.node); 
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(325); match(Comma);
				setState(326); ((ArrayContext)_localctx).expression = expression();
				 array.add(((ArrayContext)_localctx).expression.node); 
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334); match(RCurly);
			 ((ArrayContext)_localctx).node =  array; 
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

	public static class Assoc_arrayContext extends ParserRuleContext {
		public ExprNode node;
		public NamespaceContext namespace;
		public ExpressionContext expression;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(QueryParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(QueryParser.Colon, i);
		}
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public TerminalNode LCurly() { return getToken(QueryParser.LCurly, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode RCurly() { return getToken(QueryParser.RCurly, 0); }
		public TerminalNode Comma(int i) {
			return getToken(QueryParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QueryParser.Comma); }
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public Assoc_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterAssoc_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitAssoc_array(this);
		}
	}

	public final Assoc_arrayContext assoc_array() throws RecognitionException {
		Assoc_arrayContext _localctx = new Assoc_arrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assoc_array);

		        AssocArrayNode array = new AssocArrayNode();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(LCurly);
			setState(338); ((Assoc_arrayContext)_localctx).namespace = namespace();
			setState(339); match(Colon);
			setState(340); ((Assoc_arrayContext)_localctx).expression = expression();
			 array.put((((Assoc_arrayContext)_localctx).namespace!=null?_input.getText(((Assoc_arrayContext)_localctx).namespace.start,((Assoc_arrayContext)_localctx).namespace.stop):null), ((Assoc_arrayContext)_localctx).expression.node); 
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(342); match(Comma);
				setState(343); ((Assoc_arrayContext)_localctx).namespace = namespace();
				setState(344); match(Colon);
				setState(345); ((Assoc_arrayContext)_localctx).expression = expression();
				 array.put((((Assoc_arrayContext)_localctx).namespace!=null?_input.getText(((Assoc_arrayContext)_localctx).namespace.start,((Assoc_arrayContext)_localctx).namespace.stop):null), ((Assoc_arrayContext)_localctx).expression.node); 
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353); match(RCurly);
			 ((Assoc_arrayContext)_localctx).node =  array; 
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

	public static class FunctionContext extends ParserRuleContext {
		public FuncNode node;
		public Token id;
		public ExpressionContext expression;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LParent() { return getToken(QueryParser.LParent, 0); }
		public TerminalNode Comma(int i) {
			return getToken(QueryParser.Comma, i);
		}
		public TerminalNode RParent() { return getToken(QueryParser.RParent, 0); }
		public List<TerminalNode> Comma() { return getTokens(QueryParser.Comma); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function);

		        ArrayList<ExprNode> params = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); ((FunctionContext)_localctx).id = match(ID);
			setState(357); match(LParent);
			setState(369);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << ID) | (1L << Int) | (1L << Dbl) | (1L << Str) | (1L << LBracket) | (1L << LParent) | (1L << LCurly))) != 0)) {
				{
				setState(358); ((FunctionContext)_localctx).expression = expression();
				 params.add(((FunctionContext)_localctx).expression.node); 
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(360); match(Comma);
					setState(361); ((FunctionContext)_localctx).expression = expression();
					 params.add(((FunctionContext)_localctx).expression.node); 
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(371); match(RParent);
			 ((FunctionContext)_localctx).node =  new FuncNode((((FunctionContext)_localctx).id!=null?((FunctionContext)_localctx).id.getText():null), params); 
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

	public static class StringContext extends ParserRuleContext {
		public String value;
		public Token s;
		public TerminalNode Str() { return getToken(QueryParser.Str, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); ((StringContext)_localctx).s = match(Str);
			 ((StringContext)_localctx).value =  StringUtils.strip((((StringContext)_localctx).s!=null?((StringContext)_localctx).s.getText():null), "\""); 
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

	public static class ConstantContext extends ParserRuleContext {
		public ExprNode node;
		public Num_intContext num_int;
		public Num_doubleContext num_double;
		public Num_procentContext num_procent;
		public DistContext dist;
		public DistContext dist() {
			return getRuleContext(DistContext.class,0);
		}
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public Num_procentContext num_procent() {
			return getRuleContext(Num_procentContext.class,0);
		}
		public Num_doubleContext num_double() {
			return getRuleContext(Num_doubleContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constant);
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); ((ConstantContext)_localctx).num_int = num_int();
				 ((ConstantContext)_localctx).node =  new IntegerNode(((ConstantContext)_localctx).num_int.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380); ((ConstantContext)_localctx).num_double = num_double();
				 ((ConstantContext)_localctx).node =  new DoubleNode(((ConstantContext)_localctx).num_double.value); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383); ((ConstantContext)_localctx).num_procent = num_procent();
				 ((ConstantContext)_localctx).node =  new DoubleNode(((ConstantContext)_localctx).num_procent.value); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386); ((ConstantContext)_localctx).dist = dist();
				 ((ConstantContext)_localctx).node =  ((ConstantContext)_localctx).dist.node; 
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

	public static class Num_intContext extends ParserRuleContext {
		public Integer value;
		public Token i;
		public TerminalNode Int() { return getToken(QueryParser.Int, 0); }
		public Num_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNum_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNum_int(this);
		}
	}

	public final Num_intContext num_int() throws RecognitionException {
		Num_intContext _localctx = new Num_intContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_num_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); ((Num_intContext)_localctx).i = match(Int);
			 ((Num_intContext)_localctx).value =  Integer.parseInt((((Num_intContext)_localctx).i!=null?((Num_intContext)_localctx).i.getText():null)); 
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

	public static class Num_doubleContext extends ParserRuleContext {
		public Double value;
		public Token d;
		public TerminalNode Dbl() { return getToken(QueryParser.Dbl, 0); }
		public Num_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNum_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNum_double(this);
		}
	}

	public final Num_doubleContext num_double() throws RecognitionException {
		Num_doubleContext _localctx = new Num_doubleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_num_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); ((Num_doubleContext)_localctx).d = match(Dbl);
			 ((Num_doubleContext)_localctx).value =  Double.parseDouble((((Num_doubleContext)_localctx).d!=null?((Num_doubleContext)_localctx).d.getText():null)); 
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

	public static class Num_procentContext extends ParserRuleContext {
		public Double value;
		public Token v;
		public TerminalNode Dbl() { return getToken(QueryParser.Dbl, 0); }
		public TerminalNode Procent() { return getToken(QueryParser.Procent, 0); }
		public TerminalNode Int() { return getToken(QueryParser.Int, 0); }
		public Num_procentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_procent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNum_procent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNum_procent(this);
		}
	}

	public final Num_procentContext num_procent() throws RecognitionException {
		Num_procentContext _localctx = new Num_procentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_num_procent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((Num_procentContext)_localctx).v = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Dbl) ) {
				((Num_procentContext)_localctx).v = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(398); match(Procent);
			 ((Num_procentContext)_localctx).value =  Double.parseDouble((((Num_procentContext)_localctx).v!=null?((Num_procentContext)_localctx).v.getText():null)) / 100; 
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

	public static class DistContext extends ParserRuleContext {
		public ExprNode node;
		public ValContext lb;
		public ValContext ub;
		public ValContext a;
		public ValContext b;
		public ValContext c;
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public TerminalNode RBracket() { return getToken(QueryParser.RBracket, 0); }
		public TerminalNode UBracket() { return getToken(QueryParser.UBracket, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode LBracket() { return getToken(QueryParser.LBracket, 0); }
		public TerminalNode Comma(int i) {
			return getToken(QueryParser.Comma, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QueryParser.Comma); }
		public DistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterDist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitDist(this);
		}
	}

	public final DistContext dist() throws RecognitionException {
		DistContext _localctx = new DistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dist);
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); match(LBracket);
				setState(402); ((DistContext)_localctx).lb = val();
				setState(403); match(Comma);
				setState(404); ((DistContext)_localctx).ub = val();
				setState(405); match(RBracket);
				 ((DistContext)_localctx).node =  new Dist90CINode(Double.parseDouble((((DistContext)_localctx).lb!=null?_input.getText(((DistContext)_localctx).lb.start,((DistContext)_localctx).lb.stop):null)), Double.parseDouble((((DistContext)_localctx).ub!=null?_input.getText(((DistContext)_localctx).ub.start,((DistContext)_localctx).ub.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408); match(LBracket);
				setState(409); ((DistContext)_localctx).a = val();
				setState(410); match(Comma);
				setState(411); ((DistContext)_localctx).b = val();
				setState(412); match(Comma);
				setState(413); ((DistContext)_localctx).c = val();
				setState(414); match(RBracket);
				 ((DistContext)_localctx).node =  new DistTriangNode(Double.parseDouble((((DistContext)_localctx).a!=null?_input.getText(((DistContext)_localctx).a.start,((DistContext)_localctx).a.stop):null)), Double.parseDouble((((DistContext)_localctx).b!=null?_input.getText(((DistContext)_localctx).b.start,((DistContext)_localctx).b.stop):null)), Double.parseDouble((((DistContext)_localctx).c!=null?_input.getText(((DistContext)_localctx).c.start,((DistContext)_localctx).c.stop):null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417); match(LBracket);
				setState(418); ((DistContext)_localctx).a = val();
				setState(419); match(Comma);
				setState(420); ((DistContext)_localctx).b = val();
				setState(421); match(UBracket);
				 ((DistContext)_localctx).node =  new DistUnifNode(Double.parseDouble((((DistContext)_localctx).a!=null?_input.getText(((DistContext)_localctx).a.start,((DistContext)_localctx).a.stop):null)), Double.parseDouble((((DistContext)_localctx).b!=null?_input.getText(((DistContext)_localctx).b.start,((DistContext)_localctx).b.stop):null))); 
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode Dbl() { return getToken(QueryParser.Dbl, 0); }
		public TerminalNode Int() { return getToken(QueryParser.Int, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Dbl) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(QueryParser.Text, 0); }
		public TerminalNode Word() { return getToken(QueryParser.Word, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Text) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(QueryParser.Word, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(Word);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\2"+
		"\3\2\3\3\6\3W\n\3\r\3\16\3X\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3c\n\3\3"+
		"\4\6\4f\n\4\r\4\16\4g\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0080\n\6\r\6\16\6\u0081"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ac\n\20\f\20\16\20\u00af"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b7\n\21\f\21\16\21\u00ba"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00cd\n\23\f\23\16\23\u00d0"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d8\n\24\f\24\16\24\u00db"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00e3\n\25\f\25\16\25\u00e6"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00ee\n\26\f\26\16\26\u00f1"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u011b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0125\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0134\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0143\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u014c\n\34\f\34\16\34\u014f\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u015f\n\35\f\35\16\35\u0162\13"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u016f"+
		"\n\36\f\36\16\36\u0172\13\36\5\36\u0174\n\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0188\n \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u01ab\n$\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\3\3**"+
		"\3\2\n\13\3\2\7\b\u01b6\2O\3\2\2\2\4b\3\2\2\2\6e\3\2\2\2\bu\3\2\2\2\n"+
		"\177\3\2\2\2\f\u0083\3\2\2\2\16\u0088\3\2\2\2\20\u008a\3\2\2\2\22\u008e"+
		"\3\2\2\2\24\u0092\3\2\2\2\26\u0095\3\2\2\2\30\u0098\3\2\2\2\32\u009d\3"+
		"\2\2\2\34\u00a2\3\2\2\2\36\u00a5\3\2\2\2 \u00b0\3\2\2\2\"\u00bb\3\2\2"+
		"\2$\u00c6\3\2\2\2&\u00d1\3\2\2\2(\u00dc\3\2\2\2*\u00e7\3\2\2\2,\u00f2"+
		"\3\2\2\2.\u011a\3\2\2\2\60\u0124\3\2\2\2\62\u0133\3\2\2\2\64\u0142\3\2"+
		"\2\2\66\u0144\3\2\2\28\u0153\3\2\2\2:\u0166\3\2\2\2<\u0178\3\2\2\2>\u0187"+
		"\3\2\2\2@\u0189\3\2\2\2B\u018c\3\2\2\2D\u018f\3\2\2\2F\u01aa\3\2\2\2H"+
		"\u01ac\3\2\2\2J\u01ae\3\2\2\2L\u01b0\3\2\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\2\2\3T\3\3\2\2\2UW\5\6\4\2VU\3"+
		"\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yc\3\2\2\2Z[\7\3\2\2[\\\5\b\5\2\\"+
		"]\7)\2\2]c\3\2\2\2^_\7\4\2\2_`\5\n\6\2`a\t\2\2\2ac\3\2\2\2bV\3\2\2\2b"+
		"Z\3\2\2\2b^\3\2\2\2c\5\3\2\2\2df\7\6\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hj\3\2\2\2ik\7\5\2\2ji\3\2\2\2jk\3\2\2\2k\7\3\2\2\2lv\5\f\7"+
		"\2mv\5\16\b\2no\5\20\t\2op\b\5\1\2pv\3\2\2\2qr\5\22\n\2rs\b\5\1\2sv\3"+
		"\2\2\2tv\5\32\16\2ul\3\2\2\2um\3\2\2\2un\3\2\2\2uq\3\2\2\2ut\3\2\2\2v"+
		"\t\3\2\2\2w\u0080\5\16\b\2xy\5\20\t\2yz\b\6\1\2z\u0080\3\2\2\2{|\5\22"+
		"\n\2|}\b\6\1\2}\u0080\3\2\2\2~\u0080\5\32\16\2\177w\3\2\2\2\177x\3\2\2"+
		"\2\177{\3\2\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\5@!\2\u0084\u0085\7\23\2\2"+
		"\u0085\u0086\5@!\2\u0086\u0087\b\7\1\2\u0087\r\3\2\2\2\u0088\u0089\5\26"+
		"\f\2\u0089\17\3\2\2\2\u008a\u008b\7\25\2\2\u008b\u008c\5\26\f\2\u008c"+
		"\u008d\b\t\1\2\u008d\21\3\2\2\2\u008e\u008f\7\25\2\2\u008f\u0090\5\24"+
		"\13\2\u0090\u0091\b\n\1\2\u0091\23\3\2\2\2\u0092\u0093\5\34\17\2\u0093"+
		"\u0094\b\13\1\2\u0094\25\3\2\2\2\u0095\u0096\5\30\r\2\u0096\u0097\b\f"+
		"\1\2\u0097\27\3\2\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7\25\2\2\u009a"+
		"\u009b\5\34\17\2\u009b\u009c\b\r\1\2\u009c\31\3\2\2\2\u009d\u009e\5\62"+
		"\32\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\b\16\1\2"+
		"\u00a1\33\3\2\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a4\b\17\1\2\u00a4\35"+
		"\3\2\2\2\u00a5\u00a6\5 \21\2\u00a6\u00ad\b\20\1\2\u00a7\u00a8\7\32\2\2"+
		"\u00a8\u00a9\5 \21\2\u00a9\u00aa\b\20\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\37\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b8\b\21"+
		"\1\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\b\21\1\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc"+
		"\5$\23\2\u00bc\u00c3\b\22\1\2\u00bd\u00be\7\34\2\2\u00be\u00bf\5$\23\2"+
		"\u00bf\u00c0\b\22\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4#\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\5&\24\2\u00c7\u00ce\b\23\1\2\u00c8\u00c9\7"+
		"\35\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\b\23\1\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf%\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d9"+
		"\b\24\1\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\5(\25\2\u00d5\u00d6\b\24\1"+
		"\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\'\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\5*\26\2\u00dd\u00e4\b\25\1\2\u00de\u00df\7\37\2\2\u00df\u00e0\5"+
		"*\26\2\u00e0\u00e1\b\25\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5)\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5,\27\2\u00e8\u00ef\b\26\1\2\u00e9\u00ea"+
		"\7 \2\2\u00ea\u00eb\5,\27\2\u00eb\u00ec\b\26\1\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5.\30\2\u00f3\u00fa"+
		"\b\27\1\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\5.\30\2\u00f6\u00f7\b\27\1\2"+
		"\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\5\60\31\2\u00fe\u00ff\b\30\1\2\u00ff\u011b\3\2\2\2\u0100\u0101"+
		"\5\62\32\2\u0101\u0102\b\30\1\2\u0102\u011b\3\2\2\2\u0103\u0104\5\64\33"+
		"\2\u0104\u0105\b\30\1\2\u0105\u011b\3\2\2\2\u0106\u0107\5\66\34\2\u0107"+
		"\u0108\b\30\1\2\u0108\u011b\3\2\2\2\u0109\u010a\58\35\2\u010a\u010b\b"+
		"\30\1\2\u010b\u011b\3\2\2\2\u010c\u010d\5:\36\2\u010d\u010e\b\30\1\2\u010e"+
		"\u011b\3\2\2\2\u010f\u0110\5> \2\u0110\u0111\b\30\1\2\u0111\u011b\3\2"+
		"\2\2\u0112\u0113\5<\37\2\u0113\u0114\b\30\1\2\u0114\u011b\3\2\2\2\u0115"+
		"\u0116\7%\2\2\u0116\u0117\5\34\17\2\u0117\u0118\7&\2\2\u0118\u0119\b\30"+
		"\1\2\u0119\u011b\3\2\2\2\u011a\u00fd\3\2\2\2\u011a\u0100\3\2\2\2\u011a"+
		"\u0103\3\2\2\2\u011a\u0106\3\2\2\2\u011a\u0109\3\2\2\2\u011a\u010c\3\2"+
		"\2\2\u011a\u010f\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u0115\3\2\2\2\u011b"+
		"/\3\2\2\2\u011c\u011d\7\t\2\2\u011d\u0125\b\31\1\2\u011e\u011f\7\t\2\2"+
		"\u011f\u0120\7\"\2\2\u0120\u0121\5J&\2\u0121\u0122\7#\2\2\u0122\u0123"+
		"\b\31\1\2\u0123\u0125\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011e\3\2\2\2"+
		"\u0125\61\3\2\2\2\u0126\u0127\5L\'\2\u0127\u0128\7\17\2\2\u0128\u0129"+
		"\7\t\2\2\u0129\u012a\b\32\1\2\u012a\u0134\3\2\2\2\u012b\u012c\5L\'\2\u012c"+
		"\u012d\7\17\2\2\u012d\u012e\7\t\2\2\u012e\u012f\7\"\2\2\u012f\u0130\5"+
		"L\'\2\u0130\u0131\7#\2\2\u0131\u0132\b\32\1\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0126\3\2\2\2\u0133\u012b\3\2\2\2\u0134\63\3\2\2\2\u0135\u0136\5L\'\2"+
		"\u0136\u0137\7\17\2\2\u0137\u0138\7\t\2\2\u0138\u0139\7\22\2\2\u0139\u013a"+
		"\b\33\1\2\u013a\u0143\3\2\2\2\u013b\u013c\5L\'\2\u013c\u013d\7\17\2\2"+
		"\u013d\u013e\7\t\2\2\u013e\u013f\7\22\2\2\u013f\u0140\5L\'\2\u0140\u0141"+
		"\b\33\1\2\u0141\u0143\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u013b\3\2\2\2"+
		"\u0143\65\3\2\2\2\u0144\u0145\7\'\2\2\u0145\u0146\5\34\17\2\u0146\u014d"+
		"\b\34\1\2\u0147\u0148\7\21\2\2\u0148\u0149\5\34\17\2\u0149\u014a\b\34"+
		"\1\2\u014a\u014c\3\2\2\2\u014b\u0147\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0151\7(\2\2\u0151\u0152\b\34\1\2\u0152\67\3\2\2\2\u0153\u0154"+
		"\7\'\2\2\u0154\u0155\5L\'\2\u0155\u0156\7\20\2\2\u0156\u0157\5\34\17\2"+
		"\u0157\u0160\b\35\1\2\u0158\u0159\7\21\2\2\u0159\u015a\5L\'\2\u015a\u015b"+
		"\7\20\2\2\u015b\u015c\5\34\17\2\u015c\u015d\b\35\1\2\u015d\u015f\3\2\2"+
		"\2\u015e\u0158\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7(\2\2\u0164"+
		"\u0165\b\35\1\2\u01659\3\2\2\2\u0166\u0167\7\t\2\2\u0167\u0173\7%\2\2"+
		"\u0168\u0169\5\34\17\2\u0169\u0170\b\36\1\2\u016a\u016b\7\21\2\2\u016b"+
		"\u016c\5\34\17\2\u016c\u016d\b\36\1\2\u016d\u016f\3\2\2\2\u016e\u016a"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0168\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7&\2\2\u0176\u0177\b\36\1\2\u0177"+
		";\3\2\2\2\u0178\u0179\7\16\2\2\u0179\u017a\b\37\1\2\u017a=\3\2\2\2\u017b"+
		"\u017c\5@!\2\u017c\u017d\b \1\2\u017d\u0188\3\2\2\2\u017e\u017f\5B\"\2"+
		"\u017f\u0180\b \1\2\u0180\u0188\3\2\2\2\u0181\u0182\5D#\2\u0182\u0183"+
		"\b \1\2\u0183\u0188\3\2\2\2\u0184\u0185\5F$\2\u0185\u0186\b \1\2\u0186"+
		"\u0188\3\2\2\2\u0187\u017b\3\2\2\2\u0187\u017e\3\2\2\2\u0187\u0181\3\2"+
		"\2\2\u0187\u0184\3\2\2\2\u0188?\3\2\2\2\u0189\u018a\7\n\2\2\u018a\u018b"+
		"\b!\1\2\u018bA\3\2\2\2\u018c\u018d\7\13\2\2\u018d\u018e\b\"\1\2\u018e"+
		"C\3\2\2\2\u018f\u0190\t\3\2\2\u0190\u0191\7\f\2\2\u0191\u0192\b#\1\2\u0192"+
		"E\3\2\2\2\u0193\u0194\7\"\2\2\u0194\u0195\5H%\2\u0195\u0196\7\21\2\2\u0196"+
		"\u0197\5H%\2\u0197\u0198\7#\2\2\u0198\u0199\b$\1\2\u0199\u01ab\3\2\2\2"+
		"\u019a\u019b\7\"\2\2\u019b\u019c\5H%\2\u019c\u019d\7\21\2\2\u019d\u019e"+
		"\5H%\2\u019e\u019f\7\21\2\2\u019f\u01a0\5H%\2\u01a0\u01a1\7#\2\2\u01a1"+
		"\u01a2\b$\1\2\u01a2\u01ab\3\2\2\2\u01a3\u01a4\7\"\2\2\u01a4\u01a5\5H%"+
		"\2\u01a5\u01a6\7\21\2\2\u01a6\u01a7\5H%\2\u01a7\u01a8\7$\2\2\u01a8\u01a9"+
		"\b$\1\2\u01a9\u01ab\3\2\2\2\u01aa\u0193\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa"+
		"\u01a3\3\2\2\2\u01abG\3\2\2\2\u01ac\u01ad\t\3\2\2\u01adI\3\2\2\2\u01ae"+
		"\u01af\t\4\2\2\u01afK\3\2\2\2\u01b0\u01b1\7\7\2\2\u01b1M\3\2\2\2\34QX"+
		"bgju\177\u0081\u00ad\u00b8\u00c3\u00ce\u00d9\u00e4\u00ef\u00fa\u011a\u0124"+
		"\u0133\u0142\u014d\u0160\u0170\u0173\u0187\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}