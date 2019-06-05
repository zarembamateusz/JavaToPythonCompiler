// Generated from C:/Users/Mateusz/Desktop/Workspace/Java/ANTLR_tokenizer\JavaLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, CHAR=2, CLASS=3, DOUBLE=4, ELSE=5, FINAL=6, FLOAT=7, FOR=8, 
		IF=9, IMPORT=10, INT=11, LONG=12, NEW=13, PRIVATE=14, PUBLIC=15, RETURN=16, 
		STATIC=17, THIS=18, VOID=19, WHILE=20, DECIMAL_LITERAL=21, FLOAT_LITERAL=22, 
		BOOL_LITERAL=23, CHAR_LITERAL=24, STRING_LITERAL=25, NULL_LITERAL=26, 
		LPAREN=27, RPAREN=28, LBRACE=29, RBRACE=30, LBRACK=31, RBRACK=32, SEMI=33, 
		COMMA=34, DOT=35, ASSIGN=36, GT=37, LT=38, BANG=39, EQUAL=40, LE=41, GE=42, 
		NOTEQUAL=43, AND=44, OR=45, ADD=46, SUB=47, MUL=48, DIV=49, MOD=50, ADD_ASSIGN=51, 
		SUB_ASSIGN=52, INC=53, DEC=54, WS=55, COMMENT=56, LINE_COMMENT=57, IDENTIFIER=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "CHAR", "CLASS", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", 
			"IF", "IMPORT", "INT", "LONG", "NEW", "PRIVATE", "PUBLIC", "RETURN", 
			"STATIC", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"INC", "DEC", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER", "EscapeSequence", 
			"Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'boolean'", "'char'", "'class'", "'double'", "'else'", "'final'", 
			"'float'", "'for'", "'if'", "'import'", "'int'", "'long'", "'new'", "'private'", 
			"'public'", "'return'", "'static'", "'this'", "'void'", "'while'", null, 
			null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", 
			"'>='", "'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "CHAR", "CLASS", "DOUBLE", "ELSE", "FINAL", "FLOAT", 
			"FOR", "IF", "IMPORT", "INT", "LONG", "NEW", "PRIVATE", "PUBLIC", "RETURN", 
			"STATIC", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"INC", "DEC", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01af\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00f6\n\26"+
		"\3\26\6\26\u00f9\n\26\r\26\16\26\u00fa\3\26\5\26\u00fe\n\26\5\26\u0100"+
		"\n\26\3\26\5\26\u0103\n\26\3\27\3\27\3\27\5\27\u0108\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0113\n\30\3\31\3\31\3\31\5\31"+
		"\u0118\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u011f\n\32\f\32\16\32\u0122"+
		"\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\38\68\u016e\n8\r8\168\u016f\38\38\39\39\39\39\79\u0178"+
		"\n9\f9\169\u017b\139\39\39\39\39\39\3:\3:\3:\3:\7:\u0186\n:\f:\16:\u0189"+
		"\13:\3:\3:\3;\3;\7;\u018f\n;\f;\16;\u0192\13;\3<\3<\3<\3<\5<\u0198\n<"+
		"\3<\5<\u019b\n<\3<\5<\u019e\n<\3=\3=\7=\u01a2\n=\f=\16=\u01a5\13=\3=\5"+
		"=\u01a8\n=\3>\3>\5>\u01ac\n>\3?\3?\3\u0179\2@\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2}\2\3\2\16"+
		"\3\2\63;\4\2NNnn\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\3\2\62;\4\2\62"+
		";aa\6\2&&C\\aac|\2\u01be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3"+
		"\177\3\2\2\2\5\u0087\3\2\2\2\7\u008c\3\2\2\2\t\u0092\3\2\2\2\13\u0099"+
		"\3\2\2\2\r\u009e\3\2\2\2\17\u00a4\3\2\2\2\21\u00aa\3\2\2\2\23\u00ae\3"+
		"\2\2\2\25\u00b1\3\2\2\2\27\u00b8\3\2\2\2\31\u00bc\3\2\2\2\33\u00c1\3\2"+
		"\2\2\35\u00c5\3\2\2\2\37\u00cd\3\2\2\2!\u00d4\3\2\2\2#\u00db\3\2\2\2%"+
		"\u00e2\3\2\2\2\'\u00e7\3\2\2\2)\u00ec\3\2\2\2+\u00ff\3\2\2\2-\u0104\3"+
		"\2\2\2/\u0112\3\2\2\2\61\u0114\3\2\2\2\63\u011b\3\2\2\2\65\u0125\3\2\2"+
		"\2\67\u012a\3\2\2\29\u012c\3\2\2\2;\u012e\3\2\2\2=\u0130\3\2\2\2?\u0132"+
		"\3\2\2\2A\u0134\3\2\2\2C\u0136\3\2\2\2E\u0138\3\2\2\2G\u013a\3\2\2\2I"+
		"\u013c\3\2\2\2K\u013e\3\2\2\2M\u0140\3\2\2\2O\u0142\3\2\2\2Q\u0144\3\2"+
		"\2\2S\u0147\3\2\2\2U\u014a\3\2\2\2W\u014d\3\2\2\2Y\u0150\3\2\2\2[\u0153"+
		"\3\2\2\2]\u0156\3\2\2\2_\u0158\3\2\2\2a\u015a\3\2\2\2c\u015c\3\2\2\2e"+
		"\u015e\3\2\2\2g\u0160\3\2\2\2i\u0163\3\2\2\2k\u0166\3\2\2\2m\u0169\3\2"+
		"\2\2o\u016d\3\2\2\2q\u0173\3\2\2\2s\u0181\3\2\2\2u\u018c\3\2\2\2w\u019d"+
		"\3\2\2\2y\u019f\3\2\2\2{\u01ab\3\2\2\2}\u01ad\3\2\2\2\177\u0080\7d\2\2"+
		"\u0080\u0081\7q\2\2\u0081\u0082\7q\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086\4\3\2\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u0089\7j\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b"+
		"\6\3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091\b\3\2\2\2\u0092\u0093\7f\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095\u0096\7d\2\2\u0096\u0097\7n\2\2"+
		"\u0097\u0098\7g\2\2\u0098\n\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n"+
		"\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\f\3\2\2\2\u009e\u009f"+
		"\7h\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\20\3\2\2\2\u00aa"+
		"\u00ab\7h\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2\u00ad\22\3\2\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7o\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\u00b7\7v\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7"+
		"p\2\2\u00ba\u00bb\7v\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\32\3\2\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7y\2\2\u00c4\34\3\2\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7x\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\36\3\2\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9"+
		"\7t\2\2\u00d9\u00da\7p\2\2\u00da\"\3\2\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7j\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7u\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7x\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7f\2\2\u00eb(\3\2\2\2\u00ec"+
		"\u00ed\7y\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7n\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1*\3\2\2\2\u00f2\u0100\7\62\2\2\u00f3\u00fd\t"+
		"\2\2\2\u00f4\u00f6\5y=\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00fe\3\2\2\2\u00f7\u00f9\7a\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\5y=\2\u00fd\u00f5\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fe\u0100\3\2\2"+
		"\2\u00ff\u00f2\3\2\2\2\u00ff\u00f3\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103"+
		"\t\3\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103,\3\2\2\2\u0104"+
		"\u0105\5y=\2\u0105\u0107\7\60\2\2\u0106\u0108\5y=\2\u0107\u0106\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108.\3\2\2\2\u0109\u010a\7v\2\2\u010a\u010b\7"+
		"t\2\2\u010b\u010c\7w\2\2\u010c\u0113\7g\2\2\u010d\u010e\7h\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111\u0113\7g\2\2\u0112"+
		"\u0109\3\2\2\2\u0112\u010d\3\2\2\2\u0113\60\3\2\2\2\u0114\u0117\7)\2\2"+
		"\u0115\u0118\n\4\2\2\u0116\u0118\5w<\2\u0117\u0115\3\2\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7)\2\2\u011a\62\3\2\2\2\u011b"+
		"\u0120\7$\2\2\u011c\u011f\n\5\2\2\u011d\u011f\5w<\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124"+
		"\64\3\2\2\2\u0125\u0126\7p\2\2\u0126\u0127\7w\2\2\u0127\u0128\7n\2\2\u0128"+
		"\u0129\7n\2\2\u0129\66\3\2\2\2\u012a\u012b\7*\2\2\u012b8\3\2\2\2\u012c"+
		"\u012d\7+\2\2\u012d:\3\2\2\2\u012e\u012f\7}\2\2\u012f<\3\2\2\2\u0130\u0131"+
		"\7\177\2\2\u0131>\3\2\2\2\u0132\u0133\7]\2\2\u0133@\3\2\2\2\u0134\u0135"+
		"\7_\2\2\u0135B\3\2\2\2\u0136\u0137\7=\2\2\u0137D\3\2\2\2\u0138\u0139\7"+
		".\2\2\u0139F\3\2\2\2\u013a\u013b\7\60\2\2\u013bH\3\2\2\2\u013c\u013d\7"+
		"?\2\2\u013dJ\3\2\2\2\u013e\u013f\7@\2\2\u013fL\3\2\2\2\u0140\u0141\7>"+
		"\2\2\u0141N\3\2\2\2\u0142\u0143\7#\2\2\u0143P\3\2\2\2\u0144\u0145\7?\2"+
		"\2\u0145\u0146\7?\2\2\u0146R\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7"+
		"?\2\2\u0149T\3\2\2\2\u014a\u014b\7@\2\2\u014b\u014c\7?\2\2\u014cV\3\2"+
		"\2\2\u014d\u014e\7#\2\2\u014e\u014f\7?\2\2\u014fX\3\2\2\2\u0150\u0151"+
		"\7(\2\2\u0151\u0152\7(\2\2\u0152Z\3\2\2\2\u0153\u0154\7~\2\2\u0154\u0155"+
		"\7~\2\2\u0155\\\3\2\2\2\u0156\u0157\7-\2\2\u0157^\3\2\2\2\u0158\u0159"+
		"\7/\2\2\u0159`\3\2\2\2\u015a\u015b\7,\2\2\u015bb\3\2\2\2\u015c\u015d\7"+
		"\61\2\2\u015dd\3\2\2\2\u015e\u015f\7\'\2\2\u015ff\3\2\2\2\u0160\u0161"+
		"\7-\2\2\u0161\u0162\7?\2\2\u0162h\3\2\2\2\u0163\u0164\7/\2\2\u0164\u0165"+
		"\7?\2\2\u0165j\3\2\2\2\u0166\u0167\7-\2\2\u0167\u0168\7-\2\2\u0168l\3"+
		"\2\2\2\u0169\u016a\7/\2\2\u016a\u016b\7/\2\2\u016bn\3\2\2\2\u016c\u016e"+
		"\t\6\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b8\2\2\u0172p\3\2\2\2\u0173"+
		"\u0174\7\61\2\2\u0174\u0175\7,\2\2\u0175\u0179\3\2\2\2\u0176\u0178\13"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017a\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7,"+
		"\2\2\u017d\u017e\7\61\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b9\2\2\u0180"+
		"r\3\2\2\2\u0181\u0182\7\61\2\2\u0182\u0183\7\61\2\2\u0183\u0187\3\2\2"+
		"\2\u0184\u0186\n\7\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\b:\2\2\u018bt\3\2\2\2\u018c\u0190\5}?\2\u018d\u018f\5{>\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191v\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7^\2\2\u0194\u019e"+
		"\t\b\2\2\u0195\u019a\7^\2\2\u0196\u0198\t\t\2\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\t\n\2\2\u019a\u0197\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\t\n\2\2\u019d"+
		"\u0193\3\2\2\2\u019d\u0195\3\2\2\2\u019ex\3\2\2\2\u019f\u01a7\t\13\2\2"+
		"\u01a0\u01a2\t\f\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a8\t\13\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8z\3\2\2\2"+
		"\u01a9\u01ac\5}?\2\u01aa\u01ac\t\13\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa"+
		"\3\2\2\2\u01ac|\3\2\2\2\u01ad\u01ae\t\r\2\2\u01ae~\3\2\2\2\27\2\u00f5"+
		"\u00fa\u00fd\u00ff\u0102\u0107\u0112\u0117\u011e\u0120\u016f\u0179\u0187"+
		"\u0190\u0197\u019a\u019d\u01a3\u01a7\u01ab\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}