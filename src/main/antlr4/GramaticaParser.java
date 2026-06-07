// Generated from ./src/main/antlr4/Gramatica.g4 by ANTLR 4.13.1

    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, PLUS=6, MINUS=7, MULT=8, DIV=9, 
		AND=10, OR=11, NOT=12, GT=13, LT=14, GEQ=15, LEQ=16, EQ=17, NEQ=18, ASSIGN=19, 
		BRACKET_OPEN=20, BRACKET_CLOSE=21, PAR_OPEN=22, PAR_CLOSE=23, SEMICOLON=24, 
		BOOLEAN=25, ID=26, NUMBER=27, WS=28;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_println = 2, RULE_conditional = 3, 
		RULE_expression = 4, RULE_factor = 5, RULE_term = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "println", "conditional", "expression", "factor", 
			"term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
			"BOOLEAN", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> symbolTable = new HashMap<String, Object>();

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(GramaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(GramaticaParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(GramaticaParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);

		            List<ASTNode> body = new ArrayList<ASTNode>();
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(PROGRAM);
			setState(15);
			match(ID);
			setState(16);
			match(BRACKET_OPEN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTLN || _la==IF) {
				{
				{
				setState(17);
				((ProgramContext)_localctx).sentence = sentence();
				 body.add(((ProgramContext)_localctx).sentence.node); 
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(BRACKET_CLOSE);

			            for(ASTNode n : body){
			                n.execute();
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
	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((SentenceContext)_localctx).println = println();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((SentenceContext)_localctx).conditional = conditional();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node; 
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
	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(GramaticaParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(PRINTLN);
			setState(37);
			((PrintlnContext)_localctx).expression = expression();
			setState(38);
			match(SEMICOLON);
			_localctx.node = new Println(((PrintlnContext)_localctx).expression.node)
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
	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GramaticaParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GramaticaParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(GramaticaParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(GramaticaParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(GramaticaParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(GramaticaParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);

		                List<ASTNode> body = new ArrayList<ASTNode>();
		                List<ASTNode> elseBody = new ArrayList<ASTNode>();
		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IF);
			setState(42);
			match(PAR_OPEN);
			setState(43);
			((ConditionalContext)_localctx).expression = expression();
			setState(44);
			match(PAR_CLOSE);
			setState(45);
			match(BRACKET_OPEN);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTLN || _la==IF) {
				{
				{
				setState(46);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node); 
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(BRACKET_CLOSE);
			setState(55);
			match(ELSE);
			setState(56);
			match(BRACKET_OPEN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTLN || _la==IF) {
				{
				{
				setState(57);
				((ConditionalContext)_localctx).s2 = sentence();
				elseBody.add(((ConditionalContext)_localctx).s2.node); 
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(BRACKET_CLOSE);

			                ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, elseBody);
			            
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
	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext f1;
		public FactorContext f2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GramaticaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GramaticaParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((ExpressionContext)_localctx).f1 = factor();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).f1.node; 
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(70);
				match(PLUS);
				setState(71);
				((ExpressionContext)_localctx).f2 = factor();
				 ((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).f2.node); 
				}
				}
				setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(GramaticaParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(GramaticaParser.MULT, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((FactorContext)_localctx).t1 = term();
			 ((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(81);
				match(MULT);
				setState(82);
				((FactorContext)_localctx).t2 = term();
				 ((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node); 
				}
				}
				setState(89);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(GramaticaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GramaticaParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GramaticaParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GramaticaParser.PAR_CLOSE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null))); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(PAR_OPEN);
				setState(95);
				((TermContext)_localctx).expression = expression();
				 ((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node; 
				setState(97);
				match(PAR_CLOSE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0015\b\u0000\n"+
		"\u0000\f\u0000\u0018\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001#\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003=\b\u0003\n\u0003\f\u0003@\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005V\b\u0005\n\u0005\f\u0005Y\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006d\b\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0000f\u0000\u000e\u0001\u0000\u0000\u0000\u0002"+
		"\"\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006)\u0001"+
		"\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f"+
		"\u0010\u0005\u001a\u0000\u0000\u0010\u0016\u0005\u0014\u0000\u0000\u0011"+
		"\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0006\u0000\uffff\uffff\u0000"+
		"\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0011\u0001\u0000\u0000\u0000"+
		"\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0015\u0000\u0000"+
		"\u001a\u001b\u0006\u0000\uffff\uffff\u0000\u001b\u0001\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0006\u0001\uffff"+
		"\uffff\u0000\u001e#\u0001\u0000\u0000\u0000\u001f \u0003\u0006\u0003\u0000"+
		" !\u0006\u0001\uffff\uffff\u0000!#\u0001\u0000\u0000\u0000\"\u001c\u0001"+
		"\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0003\b\u0004\u0000&\'\u0005"+
		"\u0018\u0000\u0000\'(\u0006\u0002\uffff\uffff\u0000(\u0005\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0004\u0000\u0000*+\u0005\u0016\u0000\u0000+,\u0003"+
		"\b\u0004\u0000,-\u0005\u0017\u0000\u0000-3\u0005\u0014\u0000\u0000./\u0003"+
		"\u0002\u0001\u0000/0\u0006\u0003\uffff\uffff\u000002\u0001\u0000\u0000"+
		"\u00001.\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000067\u0005\u0015\u0000\u000078\u0005\u0005\u0000\u0000"+
		"8>\u0005\u0014\u0000\u00009:\u0003\u0002\u0001\u0000:;\u0006\u0003\uffff"+
		"\uffff\u0000;=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0015\u0000"+
		"\u0000BC\u0006\u0003\uffff\uffff\u0000C\u0007\u0001\u0000\u0000\u0000"+
		"DE\u0003\n\u0005\u0000EL\u0006\u0004\uffff\uffff\u0000FG\u0005\u0006\u0000"+
		"\u0000GH\u0003\n\u0005\u0000HI\u0006\u0004\uffff\uffff\u0000IK\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0003\f\u0006\u0000PW\u0006\u0005\uffff\uffff"+
		"\u0000QR\u0005\b\u0000\u0000RS\u0003\f\u0006\u0000ST\u0006\u0005\uffff"+
		"\uffff\u0000TV\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\u000b\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u001b"+
		"\u0000\u0000[d\u0006\u0006\uffff\uffff\u0000\\]\u0005\u0019\u0000\u0000"+
		"]d\u0006\u0006\uffff\uffff\u0000^_\u0005\u0016\u0000\u0000_`\u0003\b\u0004"+
		"\u0000`a\u0006\u0006\uffff\uffff\u0000ab\u0005\u0017\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c\\\u0001\u0000\u0000\u0000"+
		"c^\u0001\u0000\u0000\u0000d\r\u0001\u0000\u0000\u0000\u0007\u0016\"3>"+
		"LWc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}