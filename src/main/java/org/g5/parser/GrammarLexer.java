// Generated from C:/Users/Mads Byriel/projects/Parser/Grammar.g4 by ANTLR 4.13.1
package org.g5.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		SIGMOID=10, TANH=11, RELU=12, INT=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"SIGMOID", "TANH", "RELU", "INT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'linear'", "'('", "','", "')'", "'recurrent'", "'sequential'", 
			"'->'", "'Sigmoid'", "'Tanh'", "'ReLU'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "SIGMOID", 
			"TANH", "RELU", "INT", "ID", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u000fo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0003\f\\\b\f\u0001\f\u0004\f_\b\f\u000b\f\f\f`\u0001\r\u0001\r\u0004"+
		"\re\b\r\u000b\r\f\rf\u0001\u000e\u0004\u000ej\b\u000e\u000b\u000e\f\u000e"+
		"k\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0005"+
		"\u0002\u0000++--\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003"+
		"\u0000\t\n\r\r  r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		"*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b.\u0001\u0000"+
		"\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f:\u0001\u0000\u0000\u0000"+
		"\u0011E\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015P"+
		"\u0001\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019[\u0001\u0000"+
		"\u0000\u0000\u001bb\u0001\u0000\u0000\u0000\u001di\u0001\u0000\u0000\u0000"+
		"\u001f \u0005=\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005;\u0000"+
		"\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005l\u0000\u0000$%\u0005i\u0000"+
		"\u0000%&\u0005n\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005a\u0000\u0000"+
		"()\u0005r\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005(\u0000\u0000"+
		"+\b\u0001\u0000\u0000\u0000,-\u0005,\u0000\u0000-\n\u0001\u0000\u0000"+
		"\u0000./\u0005)\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005r\u0000"+
		"\u000012\u0005e\u0000\u000023\u0005c\u0000\u000034\u0005u\u0000\u0000"+
		"45\u0005r\u0000\u000056\u0005r\u0000\u000067\u0005e\u0000\u000078\u0005"+
		"n\u0000\u000089\u0005t\u0000\u00009\u000e\u0001\u0000\u0000\u0000:;\u0005"+
		"s\u0000\u0000;<\u0005e\u0000\u0000<=\u0005q\u0000\u0000=>\u0005u\u0000"+
		"\u0000>?\u0005e\u0000\u0000?@\u0005n\u0000\u0000@A\u0005t\u0000\u0000"+
		"AB\u0005i\u0000\u0000BC\u0005a\u0000\u0000CD\u0005l\u0000\u0000D\u0010"+
		"\u0001\u0000\u0000\u0000EF\u0005-\u0000\u0000FG\u0005>\u0000\u0000G\u0012"+
		"\u0001\u0000\u0000\u0000HI\u0005S\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005"+
		"g\u0000\u0000KL\u0005m\u0000\u0000LM\u0005o\u0000\u0000MN\u0005i\u0000"+
		"\u0000NO\u0005d\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005T\u0000"+
		"\u0000QR\u0005a\u0000\u0000RS\u0005n\u0000\u0000ST\u0005h\u0000\u0000"+
		"T\u0016\u0001\u0000\u0000\u0000UV\u0005R\u0000\u0000VW\u0005e\u0000\u0000"+
		"WX\u0005L\u0000\u0000XY\u0005U\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000"+
		"Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\^\u0001\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u001a\u0001\u0000\u0000\u0000bd\u0007\u0002\u0000"+
		"\u0000ce\u0007\u0003\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u001c"+
		"\u0001\u0000\u0000\u0000hj\u0007\u0004\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u000e\u0000\u0000n\u001e"+
		"\u0001\u0000\u0000\u0000\u0005\u0000[`fk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}