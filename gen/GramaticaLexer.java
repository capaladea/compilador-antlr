// Generated from /home/cristian/Proyectos Git/compilador-antlr/src/main/antlr4/Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, PLUS=4, MINUS=5, MULT=6, DIV=7, AND=8, OR=9, 
		NOT=10, GT=11, LT=12, GEQ=13, LEQ=14, EQ=15, NEQ=16, ASSIGN=17, BRACKET_OPEN=18, 
		BRACKET_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ID=23, NUMBER=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "VAR", "PRINTLN", "PLUS", "MINUS", "MULT", "DIV", "AND", "OR", 
			"NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'+'", "'-'", "'*'", "'/'", 
			"'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'='", "'{'", "'}'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "PLUS", "MINUS", "MULT", "DIV", "AND", 
			"OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ID", "NUMBER", 
			"WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\u0004\u0000\u0019\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016v\b\u0016\n\u0016"+
		"\f\u0016y\t\u0016\u0001\u0017\u0004\u0017|\b\u0017\u000b\u0017\f\u0017"+
		"}\u0001\u0018\u0004\u0018\u0081\b\u0018\u000b\u0018\f\u0018\u0082\u0001"+
		"\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0004\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0088"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000"+
		"\u0007G\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001"+
		"\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000"+
		"\u0000\u0011R\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000\u0000\u0015"+
		"W\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019[\u0001"+
		"\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001da\u0001\u0000\u0000"+
		"\u0000\u001fd\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000\u0000#i\u0001"+
		"\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'m\u0001\u0000\u0000\u0000"+
		")o\u0001\u0000\u0000\u0000+q\u0001\u0000\u0000\u0000-s\u0001\u0000\u0000"+
		"\u0000/{\u0001\u0000\u0000\u00001\u0080\u0001\u0000\u0000\u000034\u0005"+
		"p\u0000\u000045\u0005r\u0000\u000056\u0005o\u0000\u000067\u0005g\u0000"+
		"\u000078\u0005r\u0000\u000089\u0005a\u0000\u00009:\u0005m\u0000\u0000"+
		":\u0002\u0001\u0000\u0000\u0000;<\u0005v\u0000\u0000<=\u0005a\u0000\u0000"+
		"=>\u0005r\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005p\u0000\u0000"+
		"@A\u0005r\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005"+
		"t\u0000\u0000DE\u0005l\u0000\u0000EF\u0005n\u0000\u0000F\u0006\u0001\u0000"+
		"\u0000\u0000GH\u0005+\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005-"+
		"\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000L\f\u0001"+
		"\u0000\u0000\u0000MN\u0005/\u0000\u0000N\u000e\u0001\u0000\u0000\u0000"+
		"OP\u0005&\u0000\u0000PQ\u0005&\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000"+
		"RS\u0005|\u0000\u0000ST\u0005|\u0000\u0000T\u0012\u0001\u0000\u0000\u0000"+
		"UV\u0005!\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0005>\u0000\u0000"+
		"X\u0016\u0001\u0000\u0000\u0000YZ\u0005<\u0000\u0000Z\u0018\u0001\u0000"+
		"\u0000\u0000[\\\u0005>\u0000\u0000\\]\u0005=\u0000\u0000]\u001a\u0001"+
		"\u0000\u0000\u0000^_\u0005<\u0000\u0000_`\u0005=\u0000\u0000`\u001c\u0001"+
		"\u0000\u0000\u0000ab\u0005=\u0000\u0000bc\u0005=\u0000\u0000c\u001e\u0001"+
		"\u0000\u0000\u0000de\u0005!\u0000\u0000ef\u0005=\u0000\u0000f \u0001\u0000"+
		"\u0000\u0000gh\u0005=\u0000\u0000h\"\u0001\u0000\u0000\u0000ij\u0005{"+
		"\u0000\u0000j$\u0001\u0000\u0000\u0000kl\u0005}\u0000\u0000l&\u0001\u0000"+
		"\u0000\u0000mn\u0005(\u0000\u0000n(\u0001\u0000\u0000\u0000op\u0005)\u0000"+
		"\u0000p*\u0001\u0000\u0000\u0000qr\u0005;\u0000\u0000r,\u0001\u0000\u0000"+
		"\u0000sw\u0007\u0000\u0000\u0000tv\u0007\u0001\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x.\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z|\u0007\u0002\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~0\u0001\u0000"+
		"\u0000\u0000\u007f\u0081\u0007\u0003\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0006\u0018\u0000\u0000\u00852\u0001\u0000\u0000"+
		"\u0000\u0004\u0000w}\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}