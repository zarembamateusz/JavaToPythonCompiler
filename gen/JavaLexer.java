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
		BOOLEAN=1, BREAK=2, CASE=3, CHAR=4, CLASS=5, CONTINUE=6, DOUBLE=7, ELSE=8, 
		EXTENDS=9, FINAL=10, FLOAT=11, FOR=12, IF=13, IMPLEMENTS=14, IMPORT=15, 
		INT=16, INTERFACE=17, LONG=18, NEW=19, PACKAGE=20, PRIVATE=21, PUBLIC=22, 
		RETURN=23, STATIC=24, SWITCH=25, THIS=26, VOID=27, WHILE=28, DECIMAL_LITERAL=29, 
		FLOAT_LITERAL=30, BOOL_LITERAL=31, CHAR_LITERAL=32, STRING_LITERAL=33, 
		NULL_LITERAL=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, 
		RBRACK=40, SEMI=41, COMMA=42, DOT=43, ASSIGN=44, GT=45, LT=46, BANG=47, 
		EQUAL=48, LE=49, GE=50, NOTEQUAL=51, AND=52, OR=53, ADD=54, SUB=55, MUL=56, 
		DIV=57, MOD=58, ADD_ASSIGN=59, SUB_ASSIGN=60, INC=61, DEC=62, WS=63, COMMENT=64, 
		LINE_COMMENT=65, IDENTIFIER=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONTINUE", "DOUBLE", "ELSE", 
			"EXTENDS", "FINAL", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INT", 
			"INTERFACE", "LONG", "NEW", "PACKAGE", "PRIVATE", "PUBLIC", "RETURN", 
			"STATIC", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
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
			null, "'boolean'", "'break'", "'case'", "'char'", "'class'", "'continue'", 
			"'double'", "'else'", "'extends'", "'final'", "'float'", "'for'", "'if'", 
			"'implements'", "'import'", "'int'", "'interface'", "'long'", "'new'", 
			"'package'", "'private'", "'public'", "'return'", "'static'", "'switch'", 
			"'this'", "'void'", "'while'", null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "BREAK", "CASE", "CHAR", "CLASS", "CONTINUE", "DOUBLE", 
			"ELSE", "EXTENDS", "FINAL", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", 
			"INT", "INTERFACE", "LONG", "NEW", "PACKAGE", "PRIVATE", "PUBLIC", "RETURN", 
			"STATIC", "SWITCH", "THIS", "VOID", "WHILE", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
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


	public JavaLexer(CodePointCharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0146"+
		"\n\36\3\36\6\36\u0149\n\36\r\36\16\36\u014a\3\36\5\36\u014e\n\36\5\36"+
		"\u0150\n\36\3\36\5\36\u0153\n\36\3\37\3\37\3\37\5\37\u0158\n\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u0163\n \3!\3!\3!\5!\u0168\n!\3!\3!\3\"\3\"\3"+
		"\"\7\"\u016f\n\"\f\"\16\"\u0172\13\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3="+
		"\3=\3=\3>\3>\3>\3?\3?\3?\3@\6@\u01be\n@\r@\16@\u01bf\3@\3@\3A\3A\3A\3"+
		"A\7A\u01c8\nA\fA\16A\u01cb\13A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u01d6\nB"+
		"\fB\16B\u01d9\13B\3B\3B\3C\3C\7C\u01df\nC\fC\16C\u01e2\13C\3D\3D\3D\3"+
		"D\5D\u01e8\nD\3D\5D\u01eb\nD\3D\5D\u01ee\nD\3E\3E\7E\u01f2\nE\fE\16E\u01f5"+
		"\13E\3E\5E\u01f8\nE\3F\3F\5F\u01fc\nF\3G\3G\3\u01c9\2H\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087\2\u0089\2\u008b\2\u008d\2\3\2\16\3\2\63;"+
		"\4\2NNnn\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\5\2\13\f\16\17\"\"\4\2\f"+
		"\f\17\17\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\3\2\62;\4\2\62;aa\6\2&"+
		"&C\\aac|\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u008f\3\2\2\2\5\u0097\3\2\2\2\7\u009d"+
		"\3\2\2\2\t\u00a2\3\2\2\2\13\u00a7\3\2\2\2\r\u00ad\3\2\2\2\17\u00b6\3\2"+
		"\2\2\21\u00bd\3\2\2\2\23\u00c2\3\2\2\2\25\u00ca\3\2\2\2\27\u00d0\3\2\2"+
		"\2\31\u00d6\3\2\2\2\33\u00da\3\2\2\2\35\u00dd\3\2\2\2\37\u00e8\3\2\2\2"+
		"!\u00ef\3\2\2\2#\u00f3\3\2\2\2%\u00fd\3\2\2\2\'\u0102\3\2\2\2)\u0106\3"+
		"\2\2\2+\u010e\3\2\2\2-\u0116\3\2\2\2/\u011d\3\2\2\2\61\u0124\3\2\2\2\63"+
		"\u012b\3\2\2\2\65\u0132\3\2\2\2\67\u0137\3\2\2\29\u013c\3\2\2\2;\u014f"+
		"\3\2\2\2=\u0154\3\2\2\2?\u0162\3\2\2\2A\u0164\3\2\2\2C\u016b\3\2\2\2E"+
		"\u0175\3\2\2\2G\u017a\3\2\2\2I\u017c\3\2\2\2K\u017e\3\2\2\2M\u0180\3\2"+
		"\2\2O\u0182\3\2\2\2Q\u0184\3\2\2\2S\u0186\3\2\2\2U\u0188\3\2\2\2W\u018a"+
		"\3\2\2\2Y\u018c\3\2\2\2[\u018e\3\2\2\2]\u0190\3\2\2\2_\u0192\3\2\2\2a"+
		"\u0194\3\2\2\2c\u0197\3\2\2\2e\u019a\3\2\2\2g\u019d\3\2\2\2i\u01a0\3\2"+
		"\2\2k\u01a3\3\2\2\2m\u01a6\3\2\2\2o\u01a8\3\2\2\2q\u01aa\3\2\2\2s\u01ac"+
		"\3\2\2\2u\u01ae\3\2\2\2w\u01b0\3\2\2\2y\u01b3\3\2\2\2{\u01b6\3\2\2\2}"+
		"\u01b9\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01c3\3\2\2\2\u0083\u01d1\3\2\2"+
		"\2\u0085\u01dc\3\2\2\2\u0087\u01ed\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01fb"+
		"\3\2\2\2\u008d\u01fd\3\2\2\2\u008f\u0090\7d\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7p\2\2\u0096\4\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7t"+
		"\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7m\2\2\u009c\6"+
		"\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\b\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\u00a6\7t\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7u\2\2"+
		"\u00ac\f\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p"+
		"\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7w\2\2\u00b4\u00b5\7g\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7d\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c4\7z\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7f\2\2\u00c8\u00c9\7u\2\2\u00c9\24\3\2\2\2\u00ca\u00cb\7"+
		"h\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5\30\3\2\2\2\u00d6\u00d7"+
		"\7h\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9\32\3\2\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7h\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7o\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7o\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7u\2\2\u00e7\36\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7"+
		"o\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee"+
		"\7v\2\2\u00ee \3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7h\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7g\2\2\u00fc$\3\2\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7i\2\2"+
		"\u0101&\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7g\2\2\u0104\u0105\7y\2"+
		"\2\u0105(\3\2\2\2\u0106\u0107\7r\2\2\u0107\u0108\7c\2\2\u0108\u0109\7"+
		"e\2\2\u0109\u010a\7m\2\2\u010a\u010b\7c\2\2\u010b\u010c\7i\2\2\u010c\u010d"+
		"\7g\2\2\u010d*\3\2\2\2\u010e\u010f\7r\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7k\2\2\u0111\u0112\7x\2\2\u0112\u0113\7c\2\2\u0113\u0114\7v\2\2\u0114"+
		"\u0115\7g\2\2\u0115,\3\2\2\2\u0116\u0117\7r\2\2\u0117\u0118\7w\2\2\u0118"+
		"\u0119\7d\2\2\u0119\u011a\7n\2\2\u011a\u011b\7k\2\2\u011b\u011c\7e\2\2"+
		"\u011c.\3\2\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\u0120\7v\2"+
		"\2\u0120\u0121\7w\2\2\u0121\u0122\7t\2\2\u0122\u0123\7p\2\2\u0123\60\3"+
		"\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7v\2\2\u0126\u0127\7c\2\2\u0127"+
		"\u0128\7v\2\2\u0128\u0129\7k\2\2\u0129\u012a\7e\2\2\u012a\62\3\2\2\2\u012b"+
		"\u012c\7u\2\2\u012c\u012d\7y\2\2\u012d\u012e\7k\2\2\u012e\u012f\7v\2\2"+
		"\u012f\u0130\7e\2\2\u0130\u0131\7j\2\2\u0131\64\3\2\2\2\u0132\u0133\7"+
		"v\2\2\u0133\u0134\7j\2\2\u0134\u0135\7k\2\2\u0135\u0136\7u\2\2\u0136\66"+
		"\3\2\2\2\u0137\u0138\7x\2\2\u0138\u0139\7q\2\2\u0139\u013a\7k\2\2\u013a"+
		"\u013b\7f\2\2\u013b8\3\2\2\2\u013c\u013d\7y\2\2\u013d\u013e\7j\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141:\3\2\2\2\u0142"+
		"\u0150\7\62\2\2\u0143\u014d\t\2\2\2\u0144\u0146\5\u0089E\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u014e\3\2\2\2\u0147\u0149\7a\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014e\5\u0089E\2\u014d\u0145\3\2\2\2\u014d"+
		"\u0148\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0142\3\2\2\2\u014f\u0143\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u0153\t\3\2\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153<\3\2\2\2\u0154\u0155\5\u0089E\2\u0155\u0157\7\60"+
		"\2\2\u0156\u0158\5\u0089E\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		">\3\2\2\2\u0159\u015a\7v\2\2\u015a\u015b\7t\2\2\u015b\u015c\7w\2\2\u015c"+
		"\u0163\7g\2\2\u015d\u015e\7h\2\2\u015e\u015f\7c\2\2\u015f\u0160\7n\2\2"+
		"\u0160\u0161\7u\2\2\u0161\u0163\7g\2\2\u0162\u0159\3\2\2\2\u0162\u015d"+
		"\3\2\2\2\u0163@\3\2\2\2\u0164\u0167\7)\2\2\u0165\u0168\n\4\2\2\u0166\u0168"+
		"\5\u0087D\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2"+
		"\2\u0169\u016a\7)\2\2\u016aB\3\2\2\2\u016b\u0170\7$\2\2\u016c\u016f\n"+
		"\5\2\2\u016d\u016f\5\u0087D\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2"+
		"\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7$\2\2\u0174D\3\2\2\2\u0175\u0176"+
		"\7p\2\2\u0176\u0177\7w\2\2\u0177\u0178\7n\2\2\u0178\u0179\7n\2\2\u0179"+
		"F\3\2\2\2\u017a\u017b\7*\2\2\u017bH\3\2\2\2\u017c\u017d\7+\2\2\u017dJ"+
		"\3\2\2\2\u017e\u017f\7}\2\2\u017fL\3\2\2\2\u0180\u0181\7\177\2\2\u0181"+
		"N\3\2\2\2\u0182\u0183\7]\2\2\u0183P\3\2\2\2\u0184\u0185\7_\2\2\u0185R"+
		"\3\2\2\2\u0186\u0187\7=\2\2\u0187T\3\2\2\2\u0188\u0189\7.\2\2\u0189V\3"+
		"\2\2\2\u018a\u018b\7\60\2\2\u018bX\3\2\2\2\u018c\u018d\7?\2\2\u018dZ\3"+
		"\2\2\2\u018e\u018f\7@\2\2\u018f\\\3\2\2\2\u0190\u0191\7>\2\2\u0191^\3"+
		"\2\2\2\u0192\u0193\7#\2\2\u0193`\3\2\2\2\u0194\u0195\7?\2\2\u0195\u0196"+
		"\7?\2\2\u0196b\3\2\2\2\u0197\u0198\7>\2\2\u0198\u0199\7?\2\2\u0199d\3"+
		"\2\2\2\u019a\u019b\7@\2\2\u019b\u019c\7?\2\2\u019cf\3\2\2\2\u019d\u019e"+
		"\7#\2\2\u019e\u019f\7?\2\2\u019fh\3\2\2\2\u01a0\u01a1\7(\2\2\u01a1\u01a2"+
		"\7(\2\2\u01a2j\3\2\2\2\u01a3\u01a4\7~\2\2\u01a4\u01a5\7~\2\2\u01a5l\3"+
		"\2\2\2\u01a6\u01a7\7-\2\2\u01a7n\3\2\2\2\u01a8\u01a9\7/\2\2\u01a9p\3\2"+
		"\2\2\u01aa\u01ab\7,\2\2\u01abr\3\2\2\2\u01ac\u01ad\7\61\2\2\u01adt\3\2"+
		"\2\2\u01ae\u01af\7\'\2\2\u01afv\3\2\2\2\u01b0\u01b1\7-\2\2\u01b1\u01b2"+
		"\7?\2\2\u01b2x\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4\u01b5\7?\2\2\u01b5z\3"+
		"\2\2\2\u01b6\u01b7\7-\2\2\u01b7\u01b8\7-\2\2\u01b8|\3\2\2\2\u01b9\u01ba"+
		"\7/\2\2\u01ba\u01bb\7/\2\2\u01bb~\3\2\2\2\u01bc\u01be\t\6\2\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\b@\2\2\u01c2\u0080\3\2\2\2\u01c3\u01c4\7\61"+
		"\2\2\u01c4\u01c5\7,\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c8\13\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7,\2\2\u01cd"+
		"\u01ce\7\61\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bA\2\2\u01d0\u0082\3\2"+
		"\2\2\u01d1\u01d2\7\61\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d7\3\2\2\2\u01d4"+
		"\u01d6\n\7\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01db\bB\2\2\u01db\u0084\3\2\2\2\u01dc\u01e0\5\u008dG\2\u01dd\u01df\5"+
		"\u008bF\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u0086\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4"+
		"\7^\2\2\u01e4\u01ee\t\b\2\2\u01e5\u01ea\7^\2\2\u01e6\u01e8\t\t\2\2\u01e7"+
		"\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\t\n"+
		"\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ee\t\n\2\2\u01ed\u01e3\3\2\2\2\u01ed\u01e5\3\2\2\2\u01ee\u0088\3\2"+
		"\2\2\u01ef\u01f7\t\13\2\2\u01f0\u01f2\t\f\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\t\13\2\2\u01f7\u01f3\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u008a\3\2\2\2\u01f9\u01fc\5\u008dG\2\u01fa\u01fc"+
		"\t\13\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u008c\3\2\2\2"+
		"\u01fd\u01fe\t\r\2\2\u01fe\u008e\3\2\2\2\27\2\u0145\u014a\u014d\u014f"+
		"\u0152\u0157\u0162\u0167\u016e\u0170\u01bf\u01c9\u01d7\u01e0\u01e7\u01ea"+
		"\u01ed\u01f3\u01f7\u01fb\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}