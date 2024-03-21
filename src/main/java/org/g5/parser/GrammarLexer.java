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
		MULTI_LINE_COMMENT=1, SINGLE_COMMENT=2, FLOAT=3, INT=4, NEWLINE=5, DELIMITER=6, 
		OPEN_BRACK=7, CLOSE_BRACK=8, COMMA=9, ASSIGN=10, OPEN_PAREN=11, CLOSED_PAREN=12, 
		SIGMOID=13, RELU=14, TANH=15, ARROW=16, OPEN_SQUARE=17, CLOSED_SQUARE=18, 
		BREAK=19, RETURN=20, TRUE=21, FALSE=22, IF=23, ELSE=24, LOOP=25, AND=26, 
		OR=27, NEQ=28, EQ=29, GEQ=30, LEQ=31, GE=32, LE=33, MINUS=34, PLUS=35, 
		TIMES=36, DIV=37, ID=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTI_LINE_COMMENT", "SINGLE_COMMENT", "FLOAT", "INT", "NEWLINE", "DELIMITER", 
			"OPEN_BRACK", "CLOSE_BRACK", "COMMA", "ASSIGN", "OPEN_PAREN", "CLOSED_PAREN", 
			"SIGMOID", "RELU", "TANH", "ARROW", "OPEN_SQUARE", "CLOSED_SQUARE", "BREAK", 
			"RETURN", "TRUE", "FALSE", "IF", "ELSE", "LOOP", "AND", "OR", "NEQ", 
			"EQ", "GEQ", "LEQ", "GE", "LE", "MINUS", "PLUS", "TIMES", "DIV", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "';'", "'{'", "'}'", "','", "'='", 
			"'('", "')'", "'Sigmoid'", "'ReLU'", "'Tanh'", "'->'", "'['", "']'", 
			"'break'", "'return'", "'true'", "'false'", "'if'", "'else'", "'loop'", 
			"'and'", "'or'", "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'-'", 
			"'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_LINE_COMMENT", "SINGLE_COMMENT", "FLOAT", "INT", "NEWLINE", 
			"DELIMITER", "OPEN_BRACK", "CLOSE_BRACK", "COMMA", "ASSIGN", "OPEN_PAREN", 
			"CLOSED_PAREN", "SIGMOID", "RELU", "TANH", "ARROW", "OPEN_SQUARE", "CLOSED_SQUARE", 
			"BREAK", "RETURN", "TRUE", "FALSE", "IF", "ELSE", "LOOP", "AND", "OR", 
			"NEQ", "EQ", "GEQ", "LEQ", "GE", "LE", "MINUS", "PLUS", "TIMES", "DIV", 
			"ID"
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
		"\u0004\u0000&\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000"+
		"U\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001`\b\u0001"+
		"\n\u0001\f\u0001c\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002"+
		"h\b\u0002\n\u0002\f\u0002k\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"o\b\u0002\u000b\u0002\f\u0002p\u0001\u0003\u0004\u0003t\b\u0003\u000b"+
		"\u0003\f\u0003u\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0005%\u00e9\b%\n%\f%\u00ec\t%\u0001S\u0000&\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&\u0001"+
		"\u0000\u0006\u0002\u0000\n\n\r\r\u0001\u000009\u0001\u0000..\u0003\u0000"+
		"\t\n\r\r  \u0003\u0000AZ__az\u0005\u0000\'\'09AZ__az\u00f2\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0001M\u0001\u0000\u0000\u0000\u0003[\u0001\u0000\u0000\u0000\u0005"+
		"i\u0001\u0000\u0000\u0000\u0007s\u0001\u0000\u0000\u0000\tw\u0001\u0000"+
		"\u0000\u0000\u000b{\u0001\u0000\u0000\u0000\r}\u0001\u0000\u0000\u0000"+
		"\u000f\u007f\u0001\u0000\u0000\u0000\u0011\u0081\u0001\u0000\u0000\u0000"+
		"\u0013\u0083\u0001\u0000\u0000\u0000\u0015\u0085\u0001\u0000\u0000\u0000"+
		"\u0017\u0087\u0001\u0000\u0000\u0000\u0019\u0089\u0001\u0000\u0000\u0000"+
		"\u001b\u0091\u0001\u0000\u0000\u0000\u001d\u0096\u0001\u0000\u0000\u0000"+
		"\u001f\u009b\u0001\u0000\u0000\u0000!\u009e\u0001\u0000\u0000\u0000#\u00a0"+
		"\u0001\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000\u0000\'\u00a8\u0001"+
		"\u0000\u0000\u0000)\u00af\u0001\u0000\u0000\u0000+\u00b4\u0001\u0000\u0000"+
		"\u0000-\u00ba\u0001\u0000\u0000\u0000/\u00bd\u0001\u0000\u0000\u00001"+
		"\u00c2\u0001\u0000\u0000\u00003\u00c7\u0001\u0000\u0000\u00005\u00cb\u0001"+
		"\u0000\u0000\u00007\u00ce\u0001\u0000\u0000\u00009\u00d1\u0001\u0000\u0000"+
		"\u0000;\u00d4\u0001\u0000\u0000\u0000=\u00d7\u0001\u0000\u0000\u0000?"+
		"\u00da\u0001\u0000\u0000\u0000A\u00dc\u0001\u0000\u0000\u0000C\u00de\u0001"+
		"\u0000\u0000\u0000E\u00e0\u0001\u0000\u0000\u0000G\u00e2\u0001\u0000\u0000"+
		"\u0000I\u00e4\u0001\u0000\u0000\u0000K\u00e6\u0001\u0000\u0000\u0000M"+
		"N\u0005/\u0000\u0000NO\u0005*\u0000\u0000OS\u0001\u0000\u0000\u0000PR"+
		"\t\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000WX\u0005/\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0006\u0000\u0000\u0000Z\u0002\u0001\u0000"+
		"\u0000\u0000[\\\u0005/\u0000\u0000\\]\u0005/\u0000\u0000]a\u0001\u0000"+
		"\u0000\u0000^`\b\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0006\u0001\u0000\u0000"+
		"e\u0004\u0001\u0000\u0000\u0000fh\u0007\u0001\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"ln\u0007\u0002\u0000\u0000mo\u0007\u0001\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u0006\u0001\u0000\u0000\u0000rt\u0007\u0001\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\b\u0001\u0000\u0000\u0000wx\u0007\u0003"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\u0004\u0000\u0000z\n\u0001"+
		"\u0000\u0000\u0000{|\u0005;\u0000\u0000|\f\u0001\u0000\u0000\u0000}~\u0005"+
		"{\u0000\u0000~\u000e\u0001\u0000\u0000\u0000\u007f\u0080\u0005}\u0000"+
		"\u0000\u0080\u0010\u0001\u0000\u0000\u0000\u0081\u0082\u0005,\u0000\u0000"+
		"\u0082\u0012\u0001\u0000\u0000\u0000\u0083\u0084\u0005=\u0000\u0000\u0084"+
		"\u0014\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\u0016"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005)\u0000\u0000\u0088\u0018\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005S\u0000\u0000\u008a\u008b\u0005i\u0000"+
		"\u0000\u008b\u008c\u0005g\u0000\u0000\u008c\u008d\u0005m\u0000\u0000\u008d"+
		"\u008e\u0005o\u0000\u0000\u008e\u008f\u0005i\u0000\u0000\u008f\u0090\u0005"+
		"d\u0000\u0000\u0090\u001a\u0001\u0000\u0000\u0000\u0091\u0092\u0005R\u0000"+
		"\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u0094\u0005L\u0000\u0000\u0094"+
		"\u0095\u0005U\u0000\u0000\u0095\u001c\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005T\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098\u0099\u0005n"+
		"\u0000\u0000\u0099\u009a\u0005h\u0000\u0000\u009a\u001e\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005-\u0000\u0000\u009c\u009d\u0005>\u0000\u0000\u009d"+
		" \u0001\u0000\u0000\u0000\u009e\u009f\u0005[\u0000\u0000\u009f\"\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005]\u0000\u0000\u00a1$\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005b\u0000\u0000\u00a3\u00a4\u0005r\u0000\u0000\u00a4"+
		"\u00a5\u0005e\u0000\u0000\u00a5\u00a6\u0005a\u0000\u0000\u00a6\u00a7\u0005"+
		"k\u0000\u0000\u00a7&\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005r\u0000"+
		"\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa\u00ab\u0005t\u0000\u0000\u00ab"+
		"\u00ac\u0005u\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00ae\u0005"+
		"n\u0000\u0000\u00ae(\u0001\u0000\u0000\u0000\u00af\u00b0\u0005t\u0000"+
		"\u0000\u00b0\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005u\u0000\u0000\u00b2"+
		"\u00b3\u0005e\u0000\u0000\u00b3*\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"f\u0000\u0000\u00b5\u00b6\u0005a\u0000\u0000\u00b6\u00b7\u0005l\u0000"+
		"\u0000\u00b7\u00b8\u0005s\u0000\u0000\u00b8\u00b9\u0005e\u0000\u0000\u00b9"+
		",\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005i\u0000\u0000\u00bb\u00bc\u0005"+
		"f\u0000\u0000\u00bc.\u0001\u0000\u0000\u0000\u00bd\u00be\u0005e\u0000"+
		"\u0000\u00be\u00bf\u0005l\u0000\u0000\u00bf\u00c0\u0005s\u0000\u0000\u00c0"+
		"\u00c1\u0005e\u0000\u0000\u00c10\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"l\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4\u00c5\u0005o\u0000"+
		"\u0000\u00c5\u00c6\u0005p\u0000\u0000\u00c62\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005a\u0000\u0000\u00c8\u00c9\u0005n\u0000\u0000\u00c9\u00ca\u0005"+
		"d\u0000\u0000\u00ca4\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005o\u0000"+
		"\u0000\u00cc\u00cd\u0005r\u0000\u0000\u00cd6\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005!\u0000\u0000\u00cf\u00d0\u0005=\u0000\u0000\u00d08\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005=\u0000\u0000\u00d2\u00d3\u0005=\u0000"+
		"\u0000\u00d3:\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005>\u0000\u0000\u00d5"+
		"\u00d6\u0005=\u0000\u0000\u00d6<\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"<\u0000\u0000\u00d8\u00d9\u0005=\u0000\u0000\u00d9>\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005>\u0000\u0000\u00db@\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005<\u0000\u0000\u00ddB\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"-\u0000\u0000\u00dfD\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005+\u0000"+
		"\u0000\u00e1F\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005*\u0000\u0000\u00e3"+
		"H\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005/\u0000\u0000\u00e5J\u0001"+
		"\u0000\u0000\u0000\u00e6\u00ea\u0007\u0004\u0000\u0000\u00e7\u00e9\u0007"+
		"\u0005\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ebL\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u0007\u0000Saipu\u00ea\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}