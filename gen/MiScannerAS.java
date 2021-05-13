// Generated from D:/Desktop/COMPILADORES/Proyecto-Compilador\MiScannerAS.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiScannerAS extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMA=2, PyCOMA=3, POINT=4, CIZQ=5, CDER=6, PIZQ=7, PDER=8, PCIZQ=9, 
		PCDER=10, EQUAL=11, SUM=12, SUB=13, MUL=14, DIV=15, LESS=16, GREATER=17, 
		EQEQ=18, EQEQD=19, LESSTT=20, GRETTT=21, OR=22, AND=23, SPACE=24, EXCLA=25, 
		QMARK=26, PAD=27, DSING=28, PORCEN=29, ET=30, QMARKS=31, UNDSCR=32, DOSPUN=33, 
		QUES=34, ATSING=35, BACKSL=36, CACCENT=37, SQMARKS=38, VBAR=39, VIR=40, 
		WHILE=41, IF=42, ELSE=43, RETURN=44, PRINT=45, CLASS=46, BOOLEAN=47, CHAR=48, 
		INT=49, STRING=50, NEW=51, LENGTH=52, TRUE=53, FALSE=54, VOID=55, ID=56, 
		NUM=57, CHARS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMA", "PyCOMA", "POINT", "CIZQ", "CDER", "PIZQ", "PDER", "PCIZQ", 
			"PCDER", "EQUAL", "SUM", "SUB", "MUL", "DIV", "LESS", "GREATER", "EQEQ", 
			"EQEQD", "LESSTT", "GRETTT", "OR", "AND", "SPACE", "EXCLA", "QMARK", 
			"PAD", "DSING", "PORCEN", "ET", "QMARKS", "UNDSCR", "DOSPUN", "QUES", 
			"ATSING", "BACKSL", "CACCENT", "SQMARKS", "VBAR", "VIR", "WHILE", "IF", 
			"ELSE", "RETURN", "PRINT", "CLASS", "BOOLEAN", "CHAR", "INT", "STRING", 
			"NEW", "LENGTH", "TRUE", "FALSE", "VOID", "ID", "NUM", "CHARS", "CharContenido", 
			"CharInicial", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", "'.'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'=='", "'!='", "'<='", 
			"'>='", "'||'", "'&&'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", 
			"'''", "'_'", "':'", "'?'", "'@'", "'\\'", "'^'", "'`'", "'|'", "'~'", 
			"'while'", "'if'", "'else'", "'return'", "'print'", "'class'", "'boolean'", 
			"'char'", "'int'", "'string'", "'new'", "'length'", "'true'", "'false'", 
			"'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMA", "PyCOMA", "POINT", "CIZQ", "CDER", "PIZQ", "PDER", 
			"PCIZQ", "PCDER", "EQUAL", "SUM", "SUB", "MUL", "DIV", "LESS", "GREATER", 
			"EQEQ", "EQEQD", "LESSTT", "GRETTT", "OR", "AND", "SPACE", "EXCLA", "QMARK", 
			"PAD", "DSING", "PORCEN", "ET", "QMARKS", "UNDSCR", "DOSPUN", "QUES", 
			"ATSING", "BACKSL", "CACCENT", "SQMARKS", "VBAR", "VIR", "WHILE", "IF", 
			"ELSE", "RETURN", "PRINT", "CLASS", "BOOLEAN", "CHAR", "INT", "STRING", 
			"NEW", "LENGTH", "TRUE", "FALSE", "VOID", "ID", "NUM", "CHARS"
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


	public MiScannerAS(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiScannerAS.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0153\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\6\2\u0081\n\2\r\2\16\2\u0082\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\3"+
		"9\59\u0131\n9\39\39\39\79\u0136\n9\f9\169\u0139\139\3:\3:\7:\u013d\n:"+
		"\f:\16:\u0140\13:\3;\3;\3;\3;\3<\3<\3<\3<\5<\u014a\n<\3=\3=\5=\u014e\n"+
		"=\3>\3>\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w\2y\2{\2}\2\3\2\6\5\2\13\f\17\17\"\"\5\2\u00b9"+
		"\u00b9\u0302\u0371\u2041\u2042\r\2\u00c2\u00d8\u00da\u00f8\u00fa\u0301"+
		"\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801"+
		"\uf902\ufdd1\ufdf2\uffff\4\2C\\c|\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\3\u0080\3\2\2\2\5\u0086\3\2\2\2\7\u0088\3\2\2\2\t"+
		"\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0092"+
		"\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a\3"+
		"\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2"+
		"\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00af"+
		"\3\2\2\2-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2"+
		"\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00c6\3\2\2\2A\u00c8\3\2\2\2C\u00ca\3\2\2\2E\u00cc\3\2\2\2G"+
		"\u00ce\3\2\2\2I\u00d0\3\2\2\2K\u00d2\3\2\2\2M\u00d4\3\2\2\2O\u00d6\3\2"+
		"\2\2Q\u00d8\3\2\2\2S\u00da\3\2\2\2U\u00e0\3\2\2\2W\u00e3\3\2\2\2Y\u00e8"+
		"\3\2\2\2[\u00ef\3\2\2\2]\u00f5\3\2\2\2_\u00fb\3\2\2\2a\u0103\3\2\2\2c"+
		"\u0108\3\2\2\2e\u010c\3\2\2\2g\u0113\3\2\2\2i\u0117\3\2\2\2k\u011e\3\2"+
		"\2\2m\u0123\3\2\2\2o\u0129\3\2\2\2q\u0130\3\2\2\2s\u013a\3\2\2\2u\u0141"+
		"\3\2\2\2w\u0149\3\2\2\2y\u014d\3\2\2\2{\u014f\3\2\2\2}\u0151\3\2\2\2\177"+
		"\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\2\2\2\u0085\4"+
		"\3\2\2\2\u0086\u0087\7.\2\2\u0087\6\3\2\2\2\u0088\u0089\7=\2\2\u0089\b"+
		"\3\2\2\2\u008a\u008b\7\60\2\2\u008b\n\3\2\2\2\u008c\u008d\7}\2\2\u008d"+
		"\f\3\2\2\2\u008e\u008f\7\177\2\2\u008f\16\3\2\2\2\u0090\u0091\7*\2\2\u0091"+
		"\20\3\2\2\2\u0092\u0093\7+\2\2\u0093\22\3\2\2\2\u0094\u0095\7]\2\2\u0095"+
		"\24\3\2\2\2\u0096\u0097\7_\2\2\u0097\26\3\2\2\2\u0098\u0099\7?\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7-\2\2\u009b\32\3\2\2\2\u009c\u009d\7/\2\2\u009d"+
		"\34\3\2\2\2\u009e\u009f\7,\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a8\7?\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7#\2\2\u00aa\u00ab\7?\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae*\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\u00b1\7?\2\2\u00b1,\3"+
		"\2\2\2\u00b2\u00b3\7~\2\2\u00b3\u00b4\7~\2\2\u00b4.\3\2\2\2\u00b5\u00b6"+
		"\7(\2\2\u00b6\u00b7\7(\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7\"\2\2\u00b9"+
		"\62\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7%\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1"+
		":\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7(\2\2\u00c5"+
		">\3\2\2\2\u00c6\u00c7\7)\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7a\2\2\u00c9B"+
		"\3\2\2\2\u00ca\u00cb\7<\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7A\2\2\u00cdF\3"+
		"\2\2\2\u00ce\u00cf\7B\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7^\2\2\u00d1J\3\2"+
		"\2\2\u00d2\u00d3\7`\2\2\u00d3L\3\2\2\2\u00d4\u00d5\7b\2\2\u00d5N\3\2\2"+
		"\2\u00d6\u00d7\7~\2\2\u00d7P\3\2\2\2\u00d8\u00d9\7\u0080\2\2\u00d9R\3"+
		"\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc\7j\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7g\2\2\u00dfT\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7h\2\2\u00e2V\3\2\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7X\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7t\2\2"+
		"\u00ed\u00ee\7p\2\2\u00eeZ\3\2\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7t\2"+
		"\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\\\3"+
		"\2\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7u\2\2\u00fa^\3\2\2\2\u00fb\u00fc\7d\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7g\2\2"+
		"\u0100\u0101\7c\2\2\u0101\u0102\7p\2\2\u0102`\3\2\2\2\u0103\u0104\7e\2"+
		"\2\u0104\u0105\7j\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2\2\u0107b\3\2"+
		"\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7v\2\2\u010bd\3"+
		"\2\2\2\u010c\u010d\7u\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7i\2\2\u0112f\3\2\2\2\u0113"+
		"\u0114\7p\2\2\u0114\u0115\7g\2\2\u0115\u0116\7y\2\2\u0116h\3\2\2\2\u0117"+
		"\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a\u011b\7i\2\2"+
		"\u011b\u011c\7v\2\2\u011c\u011d\7j\2\2\u011dj\3\2\2\2\u011e\u011f\7v\2"+
		"\2\u011f\u0120\7t\2\2\u0120\u0121\7w\2\2\u0121\u0122\7g\2\2\u0122l\3\2"+
		"\2\2\u0123\u0124\7h\2\2\u0124\u0125\7c\2\2\u0125\u0126\7n\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7g\2\2\u0128n\3\2\2\2\u0129\u012a\7x\2\2\u012a\u012b"+
		"\7q\2\2\u012b\u012c\7k\2\2\u012c\u012d\7f\2\2\u012dp\3\2\2\2\u012e\u0131"+
		"\5A!\2\u012f\u0131\5{>\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0137\3\2\2\2\u0132\u0136\5A!\2\u0133\u0136\5{>\2\u0134\u0136\5}?\2\u0135"+
		"\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138r\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013e\5}?\2\u013b\u013d\5}?\2\u013c\u013b\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013ft\3\2\2\2"+
		"\u0140\u013e\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0143\5w<\2\u0143\u0144"+
		"\7)\2\2\u0144v\3\2\2\2\u0145\u014a\5y=\2\u0146\u014a\5}?\2\u0147\u014a"+
		"\5A!\2\u0148\u014a\t\3\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014ax\3\2\2\2\u014b\u014e\5{>\2\u014c"+
		"\u014e\t\4\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014ez\3\2\2\2"+
		"\u014f\u0150\t\5\2\2\u0150|\3\2\2\2\u0151\u0152\4\62;\2\u0152~\3\2\2\2"+
		"\n\2\u0082\u0130\u0135\u0137\u013e\u0149\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}