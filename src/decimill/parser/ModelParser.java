// Generated from ModelParser.g4 by ANTLR 4.4

    package decimill.parser;
    import decimill.*;
    import decimill.expression.*;
    import decimill.model.*;
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
public class ModelParser extends Parser {
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
		RULE_nodeDeclaration = 5, RULE_varDeclaration = 6, RULE_refinement = 7, 
		RULE_name = 8, RULE_namespace = 9, RULE_assignment = 10, RULE_expression = 11, 
		RULE_expr_add = 12, RULE_expr_sub = 13, RULE_expr_mult = 14, RULE_expr_div = 15, 
		RULE_expr_pow = 16, RULE_expr_lt = 17, RULE_expr_gt = 18, RULE_expr_eq = 19, 
		RULE_expr_atom = 20, RULE_variable = 21, RULE_reference = 22, RULE_function = 23, 
		RULE_constant = 24, RULE_array = 25, RULE_assoc_array = 26, RULE_num_int = 27, 
		RULE_num_double = 28, RULE_num_procent = 29, RULE_dist = 30, RULE_val = 31;
	public static final String[] ruleNames = {
		"parse", "element", "str", "inlineCode", "blockCode", "nodeDeclaration", 
		"varDeclaration", "refinement", "name", "namespace", "assignment", "expression", 
		"expr_add", "expr_sub", "expr_mult", "expr_div", "expr_pow", "expr_lt", 
		"expr_gt", "expr_eq", "expr_atom", "variable", "reference", "function", 
		"constant", "array", "assoc_array", "num_int", "num_double", "num_procent", 
		"dist", "val"
	};

	@Override
	public String getGrammarFileName() { return "ModelParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Model model;
	    Rewriter rewriter;
	    boolean inline;

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Model m;
		public Rewriter r;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParseContext(ParserRuleContext parent, int invokingState, Model m, Rewriter r) {
			super(parent, invokingState);
			this.m = m;
			this.r = r;
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse(Model m,Rewriter r) throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState(), m, r);
		enterRule(_localctx, 0, RULE_parse);

		        model = m;
		        rewriter = r;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); element();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << InlineStart) | (1L << BlockStart) | (1L << Character))) != 0) );
			setState(69); match(EOF);
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
		public TerminalNode InlineStart() { return getToken(ModelParser.InlineStart, 0); }
		public TerminalNode InlineEnd() { return getToken(ModelParser.InlineEnd, 0); }
		public List<StrContext> str() {
			return getRuleContexts(StrContext.class);
		}
		public TerminalNode EOF() { return getToken(ModelParser.EOF, 0); }
		public TerminalNode BlockStart() { return getToken(ModelParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ModelParser.BlockEnd, 0); }
		public StrContext str(int i) {
			return getRuleContext(StrContext.class,i);
		}
		public InlineCodeContext inlineCode() {
			return getRuleContext(InlineCodeContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			int _alt;
			setState(84);
			switch (_input.LA(1)) {
			case Character:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(71); str();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case InlineStart:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(InlineStart);
				setState(77); inlineCode();
				setState(78); match(InlineEnd);
				}
				break;
			case BlockStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); match(BlockStart);
				setState(81); blockCode();
				setState(82);
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
		public TerminalNode Character(int i) {
			return getToken(ModelParser.Character, i);
		}
		public TerminalNode EOL() { return getToken(ModelParser.EOL, 0); }
		public List<TerminalNode> Character() { return getTokens(ModelParser.Character); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitStr(this);
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
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86); match(Character);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(92);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(91); match(EOL);
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
		public NodeDeclarationContext nodeDeclaration;
		public RefinementContext refinement;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public NodeDeclarationContext nodeDeclaration() {
			return getRuleContext(NodeDeclarationContext.class,0);
		}
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public InlineCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterInlineCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitInlineCode(this);
		}
	}

	public final InlineCodeContext inlineCode() throws RecognitionException {
		InlineCodeContext _localctx = new InlineCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inlineCode);
		try {
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); ((InlineCodeContext)_localctx).nodeDeclaration = nodeDeclaration();
				 rewriter.rewriteModelNode(((InlineCodeContext)_localctx).nodeDeclaration, model, ((InlineCodeContext)_localctx).nodeDeclaration.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); ((InlineCodeContext)_localctx).refinement = refinement();
				 rewriter.rewriteModelNode(((InlineCodeContext)_localctx).refinement, model, ((InlineCodeContext)_localctx).refinement.node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101); assignment();
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
		public NodeDeclarationContext nodeDeclaration(int i) {
			return getRuleContext(NodeDeclarationContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<NodeDeclarationContext> nodeDeclaration() {
			return getRuleContexts(NodeDeclarationContext.class);
		}
		public RefinementContext refinement(int i) {
			return getRuleContext(RefinementContext.class,i);
		}
		public List<RefinementContext> refinement() {
			return getRuleContexts(RefinementContext.class);
		}
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitBlockCode(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(107);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(104); nodeDeclaration();
					}
					break;
				case 2:
					{
					setState(105); refinement();
					}
					break;
				case 3:
					{
					setState(106); assignment();
					}
					break;
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << Text) | (1L << ID))) != 0) );
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

	public static class NodeDeclarationContext extends ParserRuleContext {
		public Node node;
		public NameContext name;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NodeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterNodeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitNodeDeclaration(this);
		}
	}

	public final NodeDeclarationContext nodeDeclaration() throws RecognitionException {
		NodeDeclarationContext _localctx = new NodeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nodeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((NodeDeclarationContext)_localctx).name = name();
			 ((NodeDeclarationContext)_localctx).node =  model.addNodeByNameIfNotExists((((NodeDeclarationContext)_localctx).name!=null?_input.getText(((NodeDeclarationContext)_localctx).name.start,((NodeDeclarationContext)_localctx).name.stop):null)); 
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); variable();
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

	public static class RefinementContext extends ParserRuleContext {
		public Node node;
		public NameContext name;
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode Refinement() { return getToken(ModelParser.Refinement, 0); }
		public TerminalNode Comma(int i) {
			return getToken(ModelParser.Comma, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public List<TerminalNode> Comma() { return getTokens(ModelParser.Comma); }
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitRefinement(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_refinement);

		        Node parent;
		        Node child;
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); ((RefinementContext)_localctx).name = name();
			 parent = model.addNodeByNameIfNotExists((((RefinementContext)_localctx).name!=null?_input.getText(((RefinementContext)_localctx).name.start,((RefinementContext)_localctx).name.stop):null)); 
			setState(118); match(Refinement);
			setState(119); ((RefinementContext)_localctx).name = name();
			 child = model.addNodeByNameIfNotExists((((RefinementContext)_localctx).name!=null?_input.getText(((RefinementContext)_localctx).name.start,((RefinementContext)_localctx).name.stop):null)); parent.addChild(child); 
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(121); match(Comma);
				setState(122); ((RefinementContext)_localctx).name = name();
				 child = model.addNodeByNameIfNotExists((((RefinementContext)_localctx).name!=null?_input.getText(((RefinementContext)_localctx).name.start,((RefinementContext)_localctx).name.stop):null)); parent.addChild(child); 
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((RefinementContext)_localctx).node =  parent; 
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
		public TerminalNode Word() { return getToken(ModelParser.Word, 0); }
		public TerminalNode Text() { return getToken(ModelParser.Text, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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
		public TerminalNode Word() { return getToken(ModelParser.Word, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(Word);
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
		public VariableContext variable;
		public ExpressionContext expression;
		public TerminalNode Equals() { return getToken(ModelParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); ((AssignmentContext)_localctx).variable = variable();
			setState(137); match(Equals);
			setState(138); ((AssignmentContext)_localctx).expression = expression();
			 model.assign(((AssignmentContext)_localctx).variable.node.toReference(), ((AssignmentContext)_localctx).expression.node); 
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
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((ExpressionContext)_localctx).expr_add = expr_add();
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
		public List<TerminalNode> Plus() { return getTokens(ModelParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(ModelParser.Plus, i);
		}
		public List<Expr_subContext> expr_sub() {
			return getRuleContexts(Expr_subContext.class);
		}
		public Expr_subContext expr_sub(int i) {
			return getRuleContext(Expr_subContext.class,i);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); ((Expr_addContext)_localctx).expr_sub = expr_sub();
			 ((Expr_addContext)_localctx).node =  ((Expr_addContext)_localctx).expr_sub.node; 
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus) {
				{
				{
				setState(146); match(Plus);
				setState(147); ((Expr_addContext)_localctx).expr_sub = expr_sub();
				 ((Expr_addContext)_localctx).node =  new PlusNode(_localctx.node, ((Expr_addContext)_localctx).expr_sub.node); 
				}
				}
				setState(154);
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
		public List<Expr_multContext> expr_mult() {
			return getRuleContexts(Expr_multContext.class);
		}
		public List<TerminalNode> Minus() { return getTokens(ModelParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ModelParser.Minus, i);
		}
		public Expr_multContext expr_mult(int i) {
			return getRuleContext(Expr_multContext.class,i);
		}
		public Expr_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_sub(this);
		}
	}

	public final Expr_subContext expr_sub() throws RecognitionException {
		Expr_subContext _localctx = new Expr_subContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); ((Expr_subContext)_localctx).expr_mult = expr_mult();
			 ((Expr_subContext)_localctx).node =  ((Expr_subContext)_localctx).expr_mult.node; 
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Minus) {
				{
				{
				setState(157); match(Minus);
				setState(158); ((Expr_subContext)_localctx).expr_mult = expr_mult();
				 ((Expr_subContext)_localctx).node =  new MinusNode(_localctx.node, ((Expr_subContext)_localctx).expr_mult.node); 
				}
				}
				setState(165);
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
		public List<TerminalNode> Times() { return getTokens(ModelParser.Times); }
		public TerminalNode Times(int i) {
			return getToken(ModelParser.Times, i);
		}
		public List<Expr_divContext> expr_div() {
			return getRuleContexts(Expr_divContext.class);
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
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); ((Expr_multContext)_localctx).expr_div = expr_div();
			 ((Expr_multContext)_localctx).node =  ((Expr_multContext)_localctx).expr_div.node; 
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Times) {
				{
				{
				setState(168); match(Times);
				setState(169); ((Expr_multContext)_localctx).expr_div = expr_div();
				 ((Expr_multContext)_localctx).node =  new TimesNode(_localctx.node, ((Expr_multContext)_localctx).expr_div.node); 
				}
				}
				setState(176);
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
		public Expr_powContext expr_pow(int i) {
			return getRuleContext(Expr_powContext.class,i);
		}
		public List<TerminalNode> Div() { return getTokens(ModelParser.Div); }
		public List<Expr_powContext> expr_pow() {
			return getRuleContexts(Expr_powContext.class);
		}
		public TerminalNode Div(int i) {
			return getToken(ModelParser.Div, i);
		}
		public Expr_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_div(this);
		}
	}

	public final Expr_divContext expr_div() throws RecognitionException {
		Expr_divContext _localctx = new Expr_divContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((Expr_divContext)_localctx).expr_pow = expr_pow();
			 ((Expr_divContext)_localctx).node =  ((Expr_divContext)_localctx).expr_pow.node; 
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Div) {
				{
				{
				setState(179); match(Div);
				setState(180); ((Expr_divContext)_localctx).expr_pow = expr_pow();
				 ((Expr_divContext)_localctx).node =  new DivNode(_localctx.node, ((Expr_divContext)_localctx).expr_pow.node); 
				}
				}
				setState(187);
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
		public TerminalNode Power(int i) {
			return getToken(ModelParser.Power, i);
		}
		public List<TerminalNode> Power() { return getTokens(ModelParser.Power); }
		public List<Expr_ltContext> expr_lt() {
			return getRuleContexts(Expr_ltContext.class);
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
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_pow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_pow(this);
		}
	}

	public final Expr_powContext expr_pow() throws RecognitionException {
		Expr_powContext _localctx = new Expr_powContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); ((Expr_powContext)_localctx).expr_lt = expr_lt();
			 ((Expr_powContext)_localctx).node =  ((Expr_powContext)_localctx).expr_lt.node; 
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Power) {
				{
				{
				setState(190); match(Power);
				setState(191); ((Expr_powContext)_localctx).expr_lt = expr_lt();
				 ((Expr_powContext)_localctx).node =  new PowNode(_localctx.node, ((Expr_powContext)_localctx).expr_lt.node); 
				}
				}
				setState(198);
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
		public List<Expr_gtContext> expr_gt() {
			return getRuleContexts(Expr_gtContext.class);
		}
		public List<TerminalNode> LowerThan() { return getTokens(ModelParser.LowerThan); }
		public TerminalNode LowerThan(int i) {
			return getToken(ModelParser.LowerThan, i);
		}
		public Expr_gtContext expr_gt(int i) {
			return getRuleContext(Expr_gtContext.class,i);
		}
		public Expr_ltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_lt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_lt(this);
		}
	}

	public final Expr_ltContext expr_lt() throws RecognitionException {
		Expr_ltContext _localctx = new Expr_ltContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_lt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); ((Expr_ltContext)_localctx).expr_gt = expr_gt();
			 ((Expr_ltContext)_localctx).node =  ((Expr_ltContext)_localctx).expr_gt.node; 
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LowerThan) {
				{
				{
				setState(201); match(LowerThan);
				setState(202); ((Expr_ltContext)_localctx).expr_gt = expr_gt();
				 ((Expr_ltContext)_localctx).node =  new LTNode(_localctx.node, ((Expr_ltContext)_localctx).expr_gt.node); 
				}
				}
				setState(209);
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
		public Expr_eqContext expr_eq(int i) {
			return getRuleContext(Expr_eqContext.class,i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(ModelParser.GreaterThan); }
		public List<Expr_eqContext> expr_eq() {
			return getRuleContexts(Expr_eqContext.class);
		}
		public TerminalNode GreaterThan(int i) {
			return getToken(ModelParser.GreaterThan, i);
		}
		public Expr_gtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_gt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_gt(this);
		}
	}

	public final Expr_gtContext expr_gt() throws RecognitionException {
		Expr_gtContext _localctx = new Expr_gtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_gt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ((Expr_gtContext)_localctx).expr_eq = expr_eq();
			 ((Expr_gtContext)_localctx).node =  ((Expr_gtContext)_localctx).expr_eq.node; 
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GreaterThan) {
				{
				{
				setState(212); match(GreaterThan);
				setState(213); ((Expr_gtContext)_localctx).expr_eq = expr_eq();
				 ((Expr_gtContext)_localctx).node =  new GTNode(_localctx.node, ((Expr_gtContext)_localctx).expr_eq.node); 
				}
				}
				setState(220);
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
		public List<Expr_atomContext> expr_atom() {
			return getRuleContexts(Expr_atomContext.class);
		}
		public TerminalNode IsEqual(int i) {
			return getToken(ModelParser.IsEqual, i);
		}
		public List<TerminalNode> IsEqual() { return getTokens(ModelParser.IsEqual); }
		public Expr_atomContext expr_atom(int i) {
			return getRuleContext(Expr_atomContext.class,i);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); ((Expr_eqContext)_localctx).expr_atom = expr_atom();
			 ((Expr_eqContext)_localctx).node =  ((Expr_eqContext)_localctx).expr_atom.node; 
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IsEqual) {
				{
				{
				setState(223); match(IsEqual);
				setState(224); ((Expr_eqContext)_localctx).expr_atom = expr_atom();
				 ((Expr_eqContext)_localctx).node =  new EQNode(_localctx.node, ((Expr_eqContext)_localctx).expr_atom.node); 
				}
				}
				setState(231);
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
		public FunctionContext function;
		public ConstantContext constant;
		public ArrayContext array;
		public Assoc_arrayContext assoc_array;
		public ExpressionContext expression;
		public TerminalNode RParent() { return getToken(ModelParser.RParent, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Assoc_arrayContext assoc_array() {
			return getRuleContext(Assoc_arrayContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode LParent() { return getToken(ModelParser.LParent, 0); }
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_atom);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); ((Expr_atomContext)_localctx).variable = variable();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).variable.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); ((Expr_atomContext)_localctx).reference = reference();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).reference.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); ((Expr_atomContext)_localctx).function = function();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).function.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241); ((Expr_atomContext)_localctx).constant = constant();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).constant.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244); ((Expr_atomContext)_localctx).array = array();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).array.node; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247); ((Expr_atomContext)_localctx).assoc_array = assoc_array();
				 ((Expr_atomContext)_localctx).node =  ((Expr_atomContext)_localctx).assoc_array.node; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250); match(LParent);
				setState(251); ((Expr_atomContext)_localctx).expression = expression();
				setState(252); match(RParent);
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
		public RefNode node;
		public Token id;
		public NamespaceContext namespace;
		public TerminalNode ID() { return getToken(ModelParser.ID, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public TerminalNode RBracket() { return getToken(ModelParser.RBracket, 0); }
		public TerminalNode LBracket() { return getToken(ModelParser.LBracket, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); ((VariableContext)_localctx).id = match(ID);
				 ((VariableContext)_localctx).node =  new RefNode(model.getNamespace(), (((VariableContext)_localctx).id!=null?((VariableContext)_localctx).id.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); ((VariableContext)_localctx).id = match(ID);
				setState(260); match(LBracket);
				setState(261); ((VariableContext)_localctx).namespace = namespace();
				setState(262); match(RBracket);
				 ((VariableContext)_localctx).node =  new RefNode(model.getNamespace(), (((VariableContext)_localctx).id!=null?((VariableContext)_localctx).id.getText():null), (((VariableContext)_localctx).namespace!=null?_input.getText(((VariableContext)_localctx).namespace.start,((VariableContext)_localctx).namespace.stop):null)); 
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
		public TerminalNode ID() { return getToken(ModelParser.ID, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ModelParser.Dot, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); ((ReferenceContext)_localctx).namespace = namespace();
			setState(268); match(Dot);
			setState(269); ((ReferenceContext)_localctx).id = match(ID);
			 ((ReferenceContext)_localctx).node =  new RefNode((((ReferenceContext)_localctx).namespace!=null?_input.getText(((ReferenceContext)_localctx).namespace.start,((ReferenceContext)_localctx).namespace.stop):null), (((ReferenceContext)_localctx).id!=null?((ReferenceContext)_localctx).id.getText():null)); 
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
		public TerminalNode RParent() { return getToken(ModelParser.RParent, 0); }
		public TerminalNode ID() { return getToken(ModelParser.ID, 0); }
		public TerminalNode Comma(int i) {
			return getToken(ModelParser.Comma, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> Comma() { return getTokens(ModelParser.Comma); }
		public TerminalNode LParent() { return getToken(ModelParser.LParent, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);

		        ArrayList<ExprNode> params = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); ((FunctionContext)_localctx).id = match(ID);
			setState(273); match(LParent);
			setState(285);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Word) | (1L << ID) | (1L << Int) | (1L << Dbl) | (1L << LBracket) | (1L << LParent) | (1L << LCurly))) != 0)) {
				{
				setState(274); ((FunctionContext)_localctx).expression = expression();
				 params.add(((FunctionContext)_localctx).expression.node); 
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(276); match(Comma);
					setState(277); ((FunctionContext)_localctx).expression = expression();
					 params.add(((FunctionContext)_localctx).expression.node); 
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287); match(RParent);
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

	public static class ConstantContext extends ParserRuleContext {
		public ExprNode node;
		public Num_intContext num_int;
		public Num_doubleContext num_double;
		public Num_procentContext num_procent;
		public DistContext dist;
		public Num_doubleContext num_double() {
			return getRuleContext(Num_doubleContext.class,0);
		}
		public DistContext dist() {
			return getRuleContext(DistContext.class,0);
		}
		public Num_intContext num_int() {
			return getRuleContext(Num_intContext.class,0);
		}
		public Num_procentContext num_procent() {
			return getRuleContext(Num_procentContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); ((ConstantContext)_localctx).num_int = num_int();
				 ((ConstantContext)_localctx).node =  new IntegerNode(((ConstantContext)_localctx).num_int.value); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); ((ConstantContext)_localctx).num_double = num_double();
				 ((ConstantContext)_localctx).node =  new DoubleNode(((ConstantContext)_localctx).num_double.value); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296); ((ConstantContext)_localctx).num_procent = num_procent();
				 ((ConstantContext)_localctx).node =  new DoubleNode(((ConstantContext)_localctx).num_procent.value); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299); ((ConstantContext)_localctx).dist = dist();
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

	public static class ArrayContext extends ParserRuleContext {
		public ExprNode node;
		public ExpressionContext expression;
		public TerminalNode Comma(int i) {
			return getToken(ModelParser.Comma, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> Comma() { return getTokens(ModelParser.Comma); }
		public TerminalNode LCurly() { return getToken(ModelParser.LCurly, 0); }
		public TerminalNode RCurly() { return getToken(ModelParser.RCurly, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_array);

		        ArrayNode array = new ArrayNode();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(LCurly);
			setState(305); ((ArrayContext)_localctx).expression = expression();
			 array.add(((ArrayContext)_localctx).expression.node); 
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(307); match(Comma);
				setState(308); ((ArrayContext)_localctx).expression = expression();
				 array.add(((ArrayContext)_localctx).expression.node); 
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316); match(RCurly);
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
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public TerminalNode Comma(int i) {
			return getToken(ModelParser.Comma, i);
		}
		public List<TerminalNode> Colon() { return getTokens(ModelParser.Colon); }
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon(int i) {
			return getToken(ModelParser.Colon, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> Comma() { return getTokens(ModelParser.Comma); }
		public TerminalNode LCurly() { return getToken(ModelParser.LCurly, 0); }
		public TerminalNode RCurly() { return getToken(ModelParser.RCurly, 0); }
		public Assoc_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterAssoc_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitAssoc_array(this);
		}
	}

	public final Assoc_arrayContext assoc_array() throws RecognitionException {
		Assoc_arrayContext _localctx = new Assoc_arrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assoc_array);

		        AssocArrayNode array = new AssocArrayNode();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(LCurly);
			setState(320); ((Assoc_arrayContext)_localctx).namespace = namespace();
			setState(321); match(Colon);
			setState(322); ((Assoc_arrayContext)_localctx).expression = expression();
			 array.put((((Assoc_arrayContext)_localctx).namespace!=null?_input.getText(((Assoc_arrayContext)_localctx).namespace.start,((Assoc_arrayContext)_localctx).namespace.stop):null), ((Assoc_arrayContext)_localctx).expression.node); 
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(324); match(Comma);
				setState(325); ((Assoc_arrayContext)_localctx).namespace = namespace();
				setState(326); match(Colon);
				setState(327); ((Assoc_arrayContext)_localctx).expression = expression();
				 array.put((((Assoc_arrayContext)_localctx).namespace!=null?_input.getText(((Assoc_arrayContext)_localctx).namespace.start,((Assoc_arrayContext)_localctx).namespace.stop):null), ((Assoc_arrayContext)_localctx).expression.node); 
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(RCurly);
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

	public static class Num_intContext extends ParserRuleContext {
		public Integer value;
		public Token i;
		public TerminalNode Int() { return getToken(ModelParser.Int, 0); }
		public Num_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterNum_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitNum_int(this);
		}
	}

	public final Num_intContext num_int() throws RecognitionException {
		Num_intContext _localctx = new Num_intContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_num_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); ((Num_intContext)_localctx).i = match(Int);
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
		public TerminalNode Dbl() { return getToken(ModelParser.Dbl, 0); }
		public Num_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterNum_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitNum_double(this);
		}
	}

	public final Num_doubleContext num_double() throws RecognitionException {
		Num_doubleContext _localctx = new Num_doubleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_num_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); ((Num_doubleContext)_localctx).d = match(Dbl);
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
		public TerminalNode Procent() { return getToken(ModelParser.Procent, 0); }
		public TerminalNode Dbl() { return getToken(ModelParser.Dbl, 0); }
		public TerminalNode Int() { return getToken(ModelParser.Int, 0); }
		public Num_procentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_procent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterNum_procent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitNum_procent(this);
		}
	}

	public final Num_procentContext num_procent() throws RecognitionException {
		Num_procentContext _localctx = new Num_procentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_num_procent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((Num_procentContext)_localctx).v = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Dbl) ) {
				((Num_procentContext)_localctx).v = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(345); match(Procent);
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
		public TerminalNode Comma(int i) {
			return getToken(ModelParser.Comma, i);
		}
		public TerminalNode UBracket() { return getToken(ModelParser.UBracket, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode RBracket() { return getToken(ModelParser.RBracket, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public TerminalNode LBracket() { return getToken(ModelParser.LBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(ModelParser.Comma); }
		public DistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterDist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitDist(this);
		}
	}

	public final DistContext dist() throws RecognitionException {
		DistContext _localctx = new DistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dist);
		try {
			setState(371);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); match(LBracket);
				setState(349); ((DistContext)_localctx).lb = val();
				setState(350); match(Comma);
				setState(351); ((DistContext)_localctx).ub = val();
				setState(352); match(RBracket);
				 ((DistContext)_localctx).node =  new Dist90CINode(Double.parseDouble((((DistContext)_localctx).lb!=null?_input.getText(((DistContext)_localctx).lb.start,((DistContext)_localctx).lb.stop):null)), Double.parseDouble((((DistContext)_localctx).ub!=null?_input.getText(((DistContext)_localctx).ub.start,((DistContext)_localctx).ub.stop):null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355); match(LBracket);
				setState(356); ((DistContext)_localctx).a = val();
				setState(357); match(Comma);
				setState(358); ((DistContext)_localctx).b = val();
				setState(359); match(Comma);
				setState(360); ((DistContext)_localctx).c = val();
				setState(361); match(RBracket);
				 ((DistContext)_localctx).node =  new DistTriangNode(Double.parseDouble((((DistContext)_localctx).a!=null?_input.getText(((DistContext)_localctx).a.start,((DistContext)_localctx).a.stop):null)), Double.parseDouble((((DistContext)_localctx).b!=null?_input.getText(((DistContext)_localctx).b.start,((DistContext)_localctx).b.stop):null)), Double.parseDouble((((DistContext)_localctx).c!=null?_input.getText(((DistContext)_localctx).c.start,((DistContext)_localctx).c.stop):null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); match(LBracket);
				setState(365); ((DistContext)_localctx).a = val();
				setState(366); match(Comma);
				setState(367); ((DistContext)_localctx).b = val();
				setState(368); match(UBracket);
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
		public TerminalNode Dbl() { return getToken(ModelParser.Dbl, 0); }
		public TerminalNode Int() { return getToken(ModelParser.Int, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2D\n\2\r\2\16\2E\3\2\3\2\3\3\6\3K\n\3\r\3\16\3L\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\6\4Z\n\4\r\4\16\4[\3\4\5\4_\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\6\6n\n\6\r\6\16\6o\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00af\n\20\f\20\16\20\u00b2"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c5\n\22\f\22\16\22\u00c8"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d0\n\23\f\23\16\23\u00d3"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00e6\n\25\f\25\16\25\u00e9"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0102\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010c\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011b\n\31\f\31\16"+
		"\31\u011e\13\31\5\31\u0120\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0131\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u013a\n\33\f\33\16\33\u013d\13\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u014d\n\34"+
		"\f\34\16\34\u0150\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u0176\n \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\3**\3\2\7\b\3\2\n\13\u017e"+
		"\2C\3\2\2\2\4V\3\2\2\2\6Y\3\2\2\2\bh\3\2\2\2\nm\3\2\2\2\fq\3\2\2\2\16"+
		"t\3\2\2\2\20v\3\2\2\2\22\u0086\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2\2"+
		"\2\30\u008f\3\2\2\2\32\u0092\3\2\2\2\34\u009d\3\2\2\2\36\u00a8\3\2\2\2"+
		" \u00b3\3\2\2\2\"\u00be\3\2\2\2$\u00c9\3\2\2\2&\u00d4\3\2\2\2(\u00df\3"+
		"\2\2\2*\u0101\3\2\2\2,\u010b\3\2\2\2.\u010d\3\2\2\2\60\u0112\3\2\2\2\62"+
		"\u0130\3\2\2\2\64\u0132\3\2\2\2\66\u0141\3\2\2\28\u0154\3\2\2\2:\u0157"+
		"\3\2\2\2<\u015a\3\2\2\2>\u0175\3\2\2\2@\u0177\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\2\2\3H\3\3\2\2\2IK\5"+
		"\6\4\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MW\3\2\2\2NO\7\3\2\2OP\5"+
		"\b\5\2PQ\7)\2\2QW\3\2\2\2RS\7\4\2\2ST\5\n\6\2TU\t\2\2\2UW\3\2\2\2VJ\3"+
		"\2\2\2VN\3\2\2\2VR\3\2\2\2W\5\3\2\2\2XZ\7\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\7\5\2\2^]\3\2\2\2^_\3\2\2\2_\7\3\2\2"+
		"\2`a\5\f\7\2ab\b\5\1\2bi\3\2\2\2ci\5\16\b\2de\5\20\t\2ef\b\5\1\2fi\3\2"+
		"\2\2gi\5\26\f\2h`\3\2\2\2hc\3\2\2\2hd\3\2\2\2hg\3\2\2\2i\t\3\2\2\2jn\5"+
		"\f\7\2kn\5\20\t\2ln\5\26\f\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2p\13\3\2\2\2qr\5\22\n\2rs\b\7\1\2s\r\3\2\2\2tu\5,\27"+
		"\2u\17\3\2\2\2vw\5\22\n\2wx\b\t\1\2xy\7\24\2\2yz\5\22\n\2z\u0081\b\t\1"+
		"\2{|\7\21\2\2|}\5\22\n\2}~\b\t\1\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\b\t\1\2\u0085\21\3\2\2\2\u0086\u0087\t\3\2"+
		"\2\u0087\23\3\2\2\2\u0088\u0089\7\7\2\2\u0089\25\3\2\2\2\u008a\u008b\5"+
		",\27\2\u008b\u008c\7\25\2\2\u008c\u008d\5\30\r\2\u008d\u008e\b\f\1\2\u008e"+
		"\27\3\2\2\2\u008f\u0090\5\32\16\2\u0090\u0091\b\r\1\2\u0091\31\3\2\2\2"+
		"\u0092\u0093\5\34\17\2\u0093\u009a\b\16\1\2\u0094\u0095\7\32\2\2\u0095"+
		"\u0096\5\34\17\2\u0096\u0097\b\16\1\2\u0097\u0099\3\2\2\2\u0098\u0094"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\33\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\36\20\2\u009e\u00a5\b\17"+
		"\1\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\b\17\1\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\5 \21\2\u00a9\u00b0\b\20\1\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5 \21\2"+
		"\u00ac\u00ad\b\20\1\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\37\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00bb\b\21\1\2\u00b5\u00b6\7"+
		"\35\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\b\21\1\2\u00b8\u00ba\3\2\2\2"+
		"\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc!\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5$\23\2\u00bf"+
		"\u00c6\b\22\1\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\b"+
		"\22\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00ca\5&\24\2\u00ca\u00d1\b\23\1\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd"+
		"\5&\24\2\u00cd\u00ce\b\23\1\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2%\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5(\25\2\u00d5\u00dc\b\24\1\2\u00d6"+
		"\u00d7\7 \2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\b\24\1\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5*\26\2"+
		"\u00e0\u00e7\b\25\1\2\u00e1\u00e2\7!\2\2\u00e2\u00e3\5*\26\2\u00e3\u00e4"+
		"\b\25\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8)\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00ea\u00eb\5,\27\2\u00eb\u00ec\b\26\1\2\u00ec\u0102\3\2\2\2\u00ed"+
		"\u00ee\5.\30\2\u00ee\u00ef\b\26\1\2\u00ef\u0102\3\2\2\2\u00f0\u00f1\5"+
		"\60\31\2\u00f1\u00f2\b\26\1\2\u00f2\u0102\3\2\2\2\u00f3\u00f4\5\62\32"+
		"\2\u00f4\u00f5\b\26\1\2\u00f5\u0102\3\2\2\2\u00f6\u00f7\5\64\33\2\u00f7"+
		"\u00f8\b\26\1\2\u00f8\u0102\3\2\2\2\u00f9\u00fa\5\66\34\2\u00fa\u00fb"+
		"\b\26\1\2\u00fb\u0102\3\2\2\2\u00fc\u00fd\7%\2\2\u00fd\u00fe\5\30\r\2"+
		"\u00fe\u00ff\7&\2\2\u00ff\u0100\b\26\1\2\u0100\u0102\3\2\2\2\u0101\u00ea"+
		"\3\2\2\2\u0101\u00ed\3\2\2\2\u0101\u00f0\3\2\2\2\u0101\u00f3\3\2\2\2\u0101"+
		"\u00f6\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fc\3\2\2\2\u0102+\3\2\2\2"+
		"\u0103\u0104\7\t\2\2\u0104\u010c\b\27\1\2\u0105\u0106\7\t\2\2\u0106\u0107"+
		"\7\"\2\2\u0107\u0108\5\24\13\2\u0108\u0109\7#\2\2\u0109\u010a\b\27\1\2"+
		"\u010a\u010c\3\2\2\2\u010b\u0103\3\2\2\2\u010b\u0105\3\2\2\2\u010c-\3"+
		"\2\2\2\u010d\u010e\5\24\13\2\u010e\u010f\7\17\2\2\u010f\u0110\7\t\2\2"+
		"\u0110\u0111\b\30\1\2\u0111/\3\2\2\2\u0112\u0113\7\t\2\2\u0113\u011f\7"+
		"%\2\2\u0114\u0115\5\30\r\2\u0115\u011c\b\31\1\2\u0116\u0117\7\21\2\2\u0117"+
		"\u0118\5\30\r\2\u0118\u0119\b\31\1\2\u0119\u011b\3\2\2\2\u011a\u0116\3"+
		"\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0114\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7&\2\2\u0122\u0123\b\31\1\2\u0123"+
		"\61\3\2\2\2\u0124\u0125\58\35\2\u0125\u0126\b\32\1\2\u0126\u0131\3\2\2"+
		"\2\u0127\u0128\5:\36\2\u0128\u0129\b\32\1\2\u0129\u0131\3\2\2\2\u012a"+
		"\u012b\5<\37\2\u012b\u012c\b\32\1\2\u012c\u0131\3\2\2\2\u012d\u012e\5"+
		"> \2\u012e\u012f\b\32\1\2\u012f\u0131\3\2\2\2\u0130\u0124\3\2\2\2\u0130"+
		"\u0127\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012d\3\2\2\2\u0131\63\3\2\2"+
		"\2\u0132\u0133\7\'\2\2\u0133\u0134\5\30\r\2\u0134\u013b\b\33\1\2\u0135"+
		"\u0136\7\21\2\2\u0136\u0137\5\30\r\2\u0137\u0138\b\33\1\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7("+
		"\2\2\u013f\u0140\b\33\1\2\u0140\65\3\2\2\2\u0141\u0142\7\'\2\2\u0142\u0143"+
		"\5\24\13\2\u0143\u0144\7\20\2\2\u0144\u0145\5\30\r\2\u0145\u014e\b\34"+
		"\1\2\u0146\u0147\7\21\2\2\u0147\u0148\5\24\13\2\u0148\u0149\7\20\2\2\u0149"+
		"\u014a\5\30\r\2\u014a\u014b\b\34\1\2\u014b\u014d\3\2\2\2\u014c\u0146\3"+
		"\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7(\2\2\u0152\u0153\b\34"+
		"\1\2\u0153\67\3\2\2\2\u0154\u0155\7\n\2\2\u0155\u0156\b\35\1\2\u01569"+
		"\3\2\2\2\u0157\u0158\7\13\2\2\u0158\u0159\b\36\1\2\u0159;\3\2\2\2\u015a"+
		"\u015b\t\4\2\2\u015b\u015c\7\f\2\2\u015c\u015d\b\37\1\2\u015d=\3\2\2\2"+
		"\u015e\u015f\7\"\2\2\u015f\u0160\5@!\2\u0160\u0161\7\21\2\2\u0161\u0162"+
		"\5@!\2\u0162\u0163\7#\2\2\u0163\u0164\b \1\2\u0164\u0176\3\2\2\2\u0165"+
		"\u0166\7\"\2\2\u0166\u0167\5@!\2\u0167\u0168\7\21\2\2\u0168\u0169\5@!"+
		"\2\u0169\u016a\7\21\2\2\u016a\u016b\5@!\2\u016b\u016c\7#\2\2\u016c\u016d"+
		"\b \1\2\u016d\u0176\3\2\2\2\u016e\u016f\7\"\2\2\u016f\u0170\5@!\2\u0170"+
		"\u0171\7\21\2\2\u0171\u0172\5@!\2\u0172\u0173\7$\2\2\u0173\u0174\b \1"+
		"\2\u0174\u0176\3\2\2\2\u0175\u015e\3\2\2\2\u0175\u0165\3\2\2\2\u0175\u016e"+
		"\3\2\2\2\u0176?\3\2\2\2\u0177\u0178\t\4\2\2\u0178A\3\2\2\2\33ELV[^hmo"+
		"\u0081\u009a\u00a5\u00b0\u00bb\u00c6\u00d1\u00dc\u00e7\u0101\u010b\u011c"+
		"\u011f\u0130\u013b\u014e\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}