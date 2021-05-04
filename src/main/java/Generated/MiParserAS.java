// Generated from C:/Users/josfe/Desktop/Proyecto-Compilador\MiParserAS.g4 by ANTLR 4.9.1
package Generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiParserAS extends Parser {
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
		INT=49, STRING=50, NEW=51, LENGTH=52, TRUE=53, FALSE=54, ID=55, NUM=56, 
		CHARS=57;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_formalParams = 3, 
		RULE_formalParam = 4, RULE_classVariableDeclaration = 5, RULE_type = 6, 
		RULE_simpleType = 7, RULE_expression = 8, RULE_simpleExpression = 9, RULE_term = 10, 
		RULE_factor = 11, RULE_actualParams = 12, RULE_relationalOp = 13, RULE_additiveOp = 14, 
		RULE_multiplicativeOp = 15, RULE_literal = 16, RULE_realLiteral = 17, 
		RULE_boolLiteral = 18, RULE_printable = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "formalParams", "formalParam", "classVariableDeclaration", 
			"type", "simpleType", "expression", "simpleExpression", "term", "factor", 
			"actualParams", "relationalOp", "additiveOp", "multiplicativeOp", "literal", 
			"realLiteral", "boolLiteral", "printable"
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
			"'char'", "'int'", "'string'", "'new'", "'length'", "'true'", "'false'"
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
			"NEW", "LENGTH", "TRUE", "FALSE", "ID", "NUM", "CHARS"
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
	public String getGrammarFileName() { return "MiParserAS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiParserAS(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Program_ASTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Program_ASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitProgram_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new Program_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStat_State_ASTContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(MiParserAS.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public PrintStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitPrintStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDecl_State_ASTContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitVariableDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDecl_State_ASTContext extends StatementContext {
		public TerminalNode CLASS() { return getToken(MiParserAS.CLASS, 0); }
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode CIZQ() { return getToken(MiParserAS.CIZQ, 0); }
		public TerminalNode CDER() { return getToken(MiParserAS.CDER, 0); }
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public List<ClassVariableDeclarationContext> classVariableDeclaration() {
			return getRuleContexts(ClassVariableDeclarationContext.class);
		}
		public ClassVariableDeclarationContext classVariableDeclaration(int i) {
			return getRuleContext(ClassVariableDeclarationContext.class,i);
		}
		public ClassDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_State_ASTContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(MiParserAS.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParserAS.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public Assignment_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAssignment_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStat_State_ASTContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MiParserAS.WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitWhileStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStat_State_ASTContext extends StatementContext {
		public TerminalNode IF() { return getToken(MiParserAS.IF, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiParserAS.ELSE, 0); }
		public IfStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIfStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStat_State_ASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MiParserAS.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public ReturnStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitReturnStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_State_ASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitBlock_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionStat_State_ASTContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssign_State_ASTContext extends StatementContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public ArrayAssign_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayAssign_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VariableDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				type();
				setState(47);
				match(ID);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(48);
					match(EQUAL);
					setState(49);
					expression();
					}
				}

				setState(52);
				match(PyCOMA);
				}
				break;
			case 2:
				_localctx = new ClassDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(CLASS);
				setState(55);
				match(ID);
				setState(56);
				match(CIZQ);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					{
					setState(57);
					classVariableDeclaration();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(CDER);
				setState(64);
				match(PyCOMA);
				}
				break;
			case 3:
				_localctx = new Assignment_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(ID);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(66);
					match(POINT);
					setState(67);
					match(ID);
					}
				}

				setState(70);
				match(EQUAL);
				setState(71);
				expression();
				setState(72);
				match(PyCOMA);
				}
				break;
			case 4:
				_localctx = new ArrayAssign_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(ID);
				setState(75);
				match(PCIZQ);
				setState(76);
				expression();
				setState(77);
				match(PCDER);
				setState(78);
				match(EQUAL);
				setState(79);
				expression();
				setState(80);
				match(PyCOMA);
				}
				break;
			case 5:
				_localctx = new PrintStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(PRINT);
				setState(83);
				expression();
				setState(84);
				match(PyCOMA);
				}
				break;
			case 6:
				_localctx = new IfStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(IF);
				setState(87);
				match(PIZQ);
				setState(88);
				expression();
				setState(89);
				match(PDER);
				setState(90);
				block();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(91);
					match(ELSE);
					setState(92);
					block();
					}
				}

				}
				break;
			case 7:
				_localctx = new WhileStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				match(WHILE);
				setState(96);
				match(PIZQ);
				setState(97);
				expression();
				setState(98);
				match(PDER);
				setState(99);
				block();
				}
				break;
			case 8:
				_localctx = new ReturnStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				match(RETURN);
				setState(102);
				expression();
				setState(103);
				match(PyCOMA);
				}
				break;
			case 9:
				_localctx = new FunctionStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				type();
				setState(106);
				match(ID);
				setState(107);
				match(PIZQ);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					setState(108);
					formalParams();
					}
				}

				setState(111);
				match(PDER);
				setState(112);
				block();
				}
				break;
			case 10:
				_localctx = new Block_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Block_ASTContext extends BlockContext {
		public TerminalNode CIZQ() { return getToken(MiParserAS.CIZQ, 0); }
		public TerminalNode CDER() { return getToken(MiParserAS.CDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_ASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitBlock_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new Block_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(CIZQ);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(CDER);
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

	public static class FormalParamsContext extends ParserRuleContext {
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	 
		public FormalParamsContext() { }
		public void copyFrom(FormalParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParams_ASTContext extends FormalParamsContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiParserAS.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiParserAS.COMA, i);
		}
		public FormalParams_ASTContext(FormalParamsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFormalParams_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			formalParam();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(127);
				match(COMA);
				setState(128);
				formalParam();
				}
				}
				setState(133);
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

	public static class FormalParamContext extends ParserRuleContext {
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	 
		public FormalParamContext() { }
		public void copyFrom(FormalParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParam_ASTContext extends FormalParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public FormalParam_ASTContext(FormalParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFormalParam_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParam);
		try {
			_localctx = new FormalParam_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			type();
			setState(135);
			match(ID);
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

	public static class ClassVariableDeclarationContext extends ParserRuleContext {
		public ClassVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDeclaration; }
	 
		public ClassVariableDeclarationContext() { }
		public void copyFrom(ClassVariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassVarDecl_ASTContext extends ClassVariableDeclarationContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVarDecl_ASTContext(ClassVariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassVarDecl_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableDeclarationContext classVariableDeclaration() throws RecognitionException {
		ClassVariableDeclarationContext _localctx = new ClassVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classVariableDeclaration);
		int _la;
		try {
			_localctx = new ClassVarDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			simpleType();
			setState(138);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(139);
				match(EQUAL);
				setState(140);
				expression();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayT_T_ASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayT_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayT_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ID_T_ASTContext extends TypeContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public ID_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitID_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleT_T_ASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleT_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSimpleT_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SimpleT_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayT_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				simpleType();
				setState(145);
				match(PCIZQ);
				setState(146);
				match(PCDER);
				}
				break;
			case 3:
				_localctx = new ID_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ID);
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(MiParserAS.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(MiParserAS.CHAR, 0); }
		public TerminalNode INT() { return getToken(MiParserAS.INT, 0); }
		public TerminalNode STRING() { return getToken(MiParserAS.STRING, 0); }
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_ASTContext extends ExpressionContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public Expression_ASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			int _alt;
			_localctx = new Expression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			simpleExpression();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					relationalOp();
					setState(155);
					simpleExpression();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpre_ASTContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
		}
		public AdditiveOpContext additiveOp(int i) {
			return getRuleContext(AdditiveOpContext.class,i);
		}
		public SimpleExpre_ASTContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSimpleExpre_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpre_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			term();
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					additiveOp();
					setState(164);
					term();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_ASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
		}
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public Term_ASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitTerm_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			int _alt;
			_localctx = new Term_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			factor();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					multiplicativeOp();
					setState(173);
					factor();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Literal_Fact_ASTContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitLiteral_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpress_Fact_ASTContext extends FactorContext {
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public SubExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSubExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCall_Fact_ASTContext extends FactorContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCall_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionCall_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLen_Fact_ASTContext extends FactorContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public TerminalNode LENGTH() { return getToken(MiParserAS.LENGTH, 0); }
		public ArrayLen_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLen_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAllocExpress_Fact_ASTContext extends FactorContext {
		public TerminalNode NEW() { return getToken(MiParserAS.NEW, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayAllocExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayAllocExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocExpress_Fact_ASTContext extends FactorContext {
		public TerminalNode NEW() { return getToken(MiParserAS.NEW, 0); }
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public AllocExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAllocExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_Fact_ASTContext extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(MiParserAS.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiParserAS.ID, i);
		}
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public Identifier_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIdentifier_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLookup_Fact_ASTContext extends FactorContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayLookup_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLookup_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_Fact_ASTContext extends FactorContext {
		public TerminalNode SUM() { return getToken(MiParserAS.SUM, 0); }
		public TerminalNode SUB() { return getToken(MiParserAS.SUB, 0); }
		public TerminalNode EXCLA() { return getToken(MiParserAS.EXCLA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Unary_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitUnary_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Literal_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				literal();
				}
				break;
			case 2:
				_localctx = new Identifier_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(182);
					match(POINT);
					setState(183);
					match(ID);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new FunctionCall_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(ID);
				setState(187);
				match(PIZQ);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINT) | (1L << PIZQ) | (1L << SUM) | (1L << SUB) | (1L << EXCLA) | (1L << QMARK) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					setState(188);
					actualParams();
					}
				}

				setState(191);
				match(PDER);
				}
				break;
			case 4:
				_localctx = new ArrayLookup_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(ID);
				setState(193);
				match(PCIZQ);
				setState(194);
				expression();
				setState(195);
				match(PCDER);
				}
				break;
			case 5:
				_localctx = new ArrayLen_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(ID);
				setState(198);
				match(POINT);
				setState(199);
				match(LENGTH);
				}
				break;
			case 6:
				_localctx = new SubExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(PIZQ);
				setState(201);
				expression();
				setState(202);
				match(PDER);
				}
				break;
			case 7:
				_localctx = new ArrayAllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(NEW);
				setState(205);
				simpleType();
				setState(206);
				match(PCIZQ);
				setState(207);
				expression();
				setState(208);
				match(PCDER);
				}
				break;
			case 8:
				_localctx = new AllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				match(NEW);
				setState(211);
				match(ID);
				setState(212);
				match(PIZQ);
				setState(213);
				match(PDER);
				}
				break;
			case 9:
				_localctx = new Unary_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << EXCLA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						expression();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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

	public static class ActualParamsContext extends ParserRuleContext {
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	 
		public ActualParamsContext() { }
		public void copyFrom(ActualParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActParams_ASTContext extends ActualParamsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiParserAS.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiParserAS.COMA, i);
		}
		public ActParams_ASTContext(ActualParamsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitActParams_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(224);
				match(COMA);
				setState(225);
				expression();
				}
				}
				setState(230);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(MiParserAS.LESS, 0); }
		public TerminalNode GREATER() { return getToken(MiParserAS.GREATER, 0); }
		public TerminalNode EQEQ() { return getToken(MiParserAS.EQEQ, 0); }
		public TerminalNode EQEQD() { return getToken(MiParserAS.EQEQD, 0); }
		public TerminalNode LESSTT() { return getToken(MiParserAS.LESSTT, 0); }
		public TerminalNode GRETTT() { return getToken(MiParserAS.GRETTT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQEQ) | (1L << EQEQD) | (1L << LESSTT) | (1L << GRETTT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AdditiveOpContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MiParserAS.SUM, 0); }
		public TerminalNode SUB() { return getToken(MiParserAS.SUB, 0); }
		public TerminalNode OR() { return getToken(MiParserAS.OR, 0); }
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MiParserAS.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiParserAS.DIV, 0); }
		public TerminalNode AND() { return getToken(MiParserAS.AND, 0); }
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolLit_Lit_ASTContext extends LiteralContext {
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public BoolLit_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitBoolLit_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLit_Lit_ASTContext extends LiteralContext {
		public TerminalNode NUM() { return getToken(MiParserAS.NUM, 0); }
		public IntLit_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIntLit_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLit_Lit_ASTContext extends LiteralContext {
		public List<TerminalNode> QMARK() { return getTokens(MiParserAS.QMARK); }
		public TerminalNode QMARK(int i) {
			return getToken(MiParserAS.QMARK, i);
		}
		public List<PrintableContext> printable() {
			return getRuleContexts(PrintableContext.class);
		}
		public PrintableContext printable(int i) {
			return getRuleContext(PrintableContext.class,i);
		}
		public StringLit_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitStringLit_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealLit_Lit_ASTContext extends LiteralContext {
		public RealLiteralContext realLiteral() {
			return getRuleContext(RealLiteralContext.class,0);
		}
		public RealLit_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitRealLit_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IntLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new RealLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				realLiteral();
				}
				break;
			case 3:
				_localctx = new BoolLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				boolLiteral();
				}
				break;
			case 4:
				_localctx = new StringLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(QMARK);
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						printable();
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(247);
				match(QMARK);
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

	public static class RealLiteralContext extends ParserRuleContext {
		public RealLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realLiteral; }
	 
		public RealLiteralContext() { }
		public void copyFrom(RealLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dec_RealLit_ASTContext extends RealLiteralContext {
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public TerminalNode NUM() { return getToken(MiParserAS.NUM, 0); }
		public Dec_RealLit_ASTContext(RealLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitDec_RealLit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecPunt_RealLit_ASTContext extends RealLiteralContext {
		public List<TerminalNode> NUM() { return getTokens(MiParserAS.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiParserAS.NUM, i);
		}
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public DecPunt_RealLit_ASTContext(RealLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitDecPunt_RealLit_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealLiteralContext realLiteral() throws RecognitionException {
		RealLiteralContext _localctx = new RealLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_realLiteral);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new DecPunt_RealLit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(NUM);
				setState(251);
				match(POINT);
				setState(252);
				match(NUM);
				}
				break;
			case POINT:
				_localctx = new Dec_RealLit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(POINT);
				setState(254);
				match(NUM);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiParserAS.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiParserAS.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrintableContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MiParserAS.NUM, 0); }
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public TerminalNode SPACE() { return getToken(MiParserAS.SPACE, 0); }
		public TerminalNode EXCLA() { return getToken(MiParserAS.EXCLA, 0); }
		public TerminalNode QMARK() { return getToken(MiParserAS.QMARK, 0); }
		public TerminalNode PAD() { return getToken(MiParserAS.PAD, 0); }
		public TerminalNode DSING() { return getToken(MiParserAS.DSING, 0); }
		public TerminalNode PORCEN() { return getToken(MiParserAS.PORCEN, 0); }
		public TerminalNode ET() { return getToken(MiParserAS.ET, 0); }
		public TerminalNode QMARKS() { return getToken(MiParserAS.QMARKS, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public TerminalNode MUL() { return getToken(MiParserAS.MUL, 0); }
		public TerminalNode SUM() { return getToken(MiParserAS.SUM, 0); }
		public TerminalNode COMA() { return getToken(MiParserAS.COMA, 0); }
		public TerminalNode SUB() { return getToken(MiParserAS.SUB, 0); }
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public TerminalNode DIV() { return getToken(MiParserAS.DIV, 0); }
		public TerminalNode DOSPUN() { return getToken(MiParserAS.DOSPUN, 0); }
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public TerminalNode LESS() { return getToken(MiParserAS.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(MiParserAS.GREATER, 0); }
		public TerminalNode QUES() { return getToken(MiParserAS.QUES, 0); }
		public TerminalNode ATSING() { return getToken(MiParserAS.ATSING, 0); }
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public TerminalNode BACKSL() { return getToken(MiParserAS.BACKSL, 0); }
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public TerminalNode CACCENT() { return getToken(MiParserAS.CACCENT, 0); }
		public TerminalNode UNDSCR() { return getToken(MiParserAS.UNDSCR, 0); }
		public TerminalNode SQMARKS() { return getToken(MiParserAS.SQMARKS, 0); }
		public TerminalNode CIZQ() { return getToken(MiParserAS.CIZQ, 0); }
		public TerminalNode VBAR() { return getToken(MiParserAS.VBAR, 0); }
		public TerminalNode CDER() { return getToken(MiParserAS.CDER, 0); }
		public TerminalNode VIR() { return getToken(MiParserAS.VIR, 0); }
		public PrintableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitPrintable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMA) | (1L << PyCOMA) | (1L << POINT) | (1L << CIZQ) | (1L << CDER) | (1L << PIZQ) | (1L << PDER) | (1L << PCIZQ) | (1L << PCDER) | (1L << EQUAL) | (1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << LESS) | (1L << GREATER) | (1L << SPACE) | (1L << EXCLA) | (1L << QMARK) | (1L << PAD) | (1L << DSING) | (1L << PORCEN) | (1L << ET) | (1L << QMARKS) | (1L << UNDSCR) | (1L << DOSPUN) | (1L << QUES) | (1L << ATSING) | (1L << BACKSL) | (1L << CACCENT) | (1L << SQMARKS) | (1L << VBAR) | (1L << VIR) | (1L << ID) | (1L << NUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\3\3\3\3\3\3\3\5"+
		"\3v\n\3\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u0084"+
		"\n\5\f\5\16\5\u0087\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a0\n"+
		"\n\f\n\16\n\u00a3\13\n\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13"+
		"\u00ac\13\13\3\f\3\f\3\f\3\f\7\f\u00b2\n\f\f\f\16\f\u00b5\13\f\3\r\3\r"+
		"\3\r\3\r\5\r\u00bb\n\r\3\r\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\5\r\u00e0\n\r\3\16\3\16\3\16"+
		"\7\16\u00e5\n\16\f\16\16\16\u00e8\13\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00f5\n\22\f\22\16\22\u00f8\13\22\3\22"+
		"\5\22\u00fb\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0102\n\23\3\24\3\24\3"+
		"\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\t"+
		"\3\2\61\64\4\2\16\17\33\33\3\2\22\27\4\2\16\17\30\30\4\2\20\21\31\31\3"+
		"\2\678\5\2\4\23\32*9:\2\u011b\2-\3\2\2\2\4u\3\2\2\2\6w\3\2\2\2\b\u0080"+
		"\3\2\2\2\n\u0088\3\2\2\2\f\u008b\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2"+
		"\2\2\22\u009b\3\2\2\2\24\u00a4\3\2\2\2\26\u00ad\3\2\2\2\30\u00df\3\2\2"+
		"\2\32\u00e1\3\2\2\2\34\u00e9\3\2\2\2\36\u00eb\3\2\2\2 \u00ed\3\2\2\2\""+
		"\u00fa\3\2\2\2$\u0101\3\2\2\2&\u0103\3\2\2\2(\u0105\3\2\2\2*,\5\4\3\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\61\5"+
		"\16\b\2\61\64\79\2\2\62\63\7\r\2\2\63\65\5\22\n\2\64\62\3\2\2\2\64\65"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\7\5\2\2\67v\3\2\2\289\7\60\2\29:\79\2\2:"+
		">\7\7\2\2;=\5\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@>\3\2\2\2AB\7\b\2\2Bv\7\5\2\2CF\79\2\2DE\7\6\2\2EG\79\2\2FD\3\2\2\2F"+
		"G\3\2\2\2GH\3\2\2\2HI\7\r\2\2IJ\5\22\n\2JK\7\5\2\2Kv\3\2\2\2LM\79\2\2"+
		"MN\7\13\2\2NO\5\22\n\2OP\7\f\2\2PQ\7\r\2\2QR\5\22\n\2RS\7\5\2\2Sv\3\2"+
		"\2\2TU\7/\2\2UV\5\22\n\2VW\7\5\2\2Wv\3\2\2\2XY\7,\2\2YZ\7\t\2\2Z[\5\22"+
		"\n\2[\\\7\n\2\2\\_\5\6\4\2]^\7-\2\2^`\5\6\4\2_]\3\2\2\2_`\3\2\2\2`v\3"+
		"\2\2\2ab\7+\2\2bc\7\t\2\2cd\5\22\n\2de\7\n\2\2ef\5\6\4\2fv\3\2\2\2gh\7"+
		".\2\2hi\5\22\n\2ij\7\5\2\2jv\3\2\2\2kl\5\16\b\2lm\79\2\2mo\7\t\2\2np\5"+
		"\b\5\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\n\2\2rs\5\6\4\2sv\3\2\2\2tv\5"+
		"\6\4\2u\60\3\2\2\2u8\3\2\2\2uC\3\2\2\2uL\3\2\2\2uT\3\2\2\2uX\3\2\2\2u"+
		"a\3\2\2\2ug\3\2\2\2uk\3\2\2\2ut\3\2\2\2v\5\3\2\2\2w{\7\7\2\2xz\5\4\3\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\b"+
		"\2\2\177\7\3\2\2\2\u0080\u0085\5\n\6\2\u0081\u0082\7\4\2\2\u0082\u0084"+
		"\5\n\6\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\t\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\16\b"+
		"\2\u0089\u008a\79\2\2\u008a\13\3\2\2\2\u008b\u008c\5\20\t\2\u008c\u008f"+
		"\79\2\2\u008d\u008e\7\r\2\2\u008e\u0090\5\22\n\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\r\3\2\2\2\u0091\u0098\5\20\t\2\u0092\u0093\5\20\t"+
		"\2\u0093\u0094\7\13\2\2\u0094\u0095\7\f\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0098\79\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\17\3\2\2\2\u0099\u009a\t\2\2\2\u009a\21\3\2\2\2\u009b\u00a1"+
		"\5\24\13\2\u009c\u009d\5\34\17\2\u009d\u009e\5\24\13\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00aa\5\26\f"+
		"\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\5\26\f\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\25\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b3\5\30\r\2\u00ae\u00af"+
		"\5 \21\2\u00af\u00b0\5\30\r\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00e0\5\"\22\2\u00b7\u00ba\79\2\2\u00b8"+
		"\u00b9\7\6\2\2\u00b9\u00bb\79\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00e0\3\2\2\2\u00bc\u00bd\79\2\2\u00bd\u00bf\7\t\2\2\u00be"+
		"\u00c0\5\32\16\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c1\u00e0\7\n\2\2\u00c2\u00c3\79\2\2\u00c3\u00c4\7\13\2\2\u00c4"+
		"\u00c5\5\22\n\2\u00c5\u00c6\7\f\2\2\u00c6\u00e0\3\2\2\2\u00c7\u00c8\7"+
		"9\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00e0\7\66\2\2\u00ca\u00cb\7\t\2\2\u00cb"+
		"\u00cc\5\22\n\2\u00cc\u00cd\7\n\2\2\u00cd\u00e0\3\2\2\2\u00ce\u00cf\7"+
		"\65\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5\22\n\2"+
		"\u00d2\u00d3\7\f\2\2\u00d3\u00e0\3\2\2\2\u00d4\u00d5\7\65\2\2\u00d5\u00d6"+
		"\79\2\2\u00d6\u00d7\7\t\2\2\u00d7\u00e0\7\n\2\2\u00d8\u00dc\t\3\2\2\u00d9"+
		"\u00db\5\22\n\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00b6\3\2\2\2\u00df\u00b7\3\2\2\2\u00df\u00bc\3\2\2\2\u00df\u00c2\3\2"+
		"\2\2\u00df\u00c7\3\2\2\2\u00df\u00ca\3\2\2\2\u00df\u00ce\3\2\2\2\u00df"+
		"\u00d4\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e6\5\22\n"+
		"\2\u00e2\u00e3\7\4\2\2\u00e3\u00e5\5\22\n\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\33\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea\35\3\2\2\2\u00eb\u00ec"+
		"\t\5\2\2\u00ec\37\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee!\3\2\2\2\u00ef\u00fb"+
		"\7:\2\2\u00f0\u00fb\5$\23\2\u00f1\u00fb\5&\24\2\u00f2\u00f6\7\34\2\2\u00f3"+
		"\u00f5\5(\25\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\7\34\2\2\u00fa\u00ef\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f1\3"+
		"\2\2\2\u00fa\u00f2\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7:\2\2\u00fd\u00fe"+
		"\7\6\2\2\u00fe\u0102\7:\2\2\u00ff\u0100\7\6\2\2\u0100\u0102\7:\2\2\u0101"+
		"\u00fc\3\2\2\2\u0101\u00ff\3\2\2\2\u0102%\3\2\2\2\u0103\u0104\t\7\2\2"+
		"\u0104\'\3\2\2\2\u0105\u0106\t\b\2\2\u0106)\3\2\2\2\30-\64>F_ou{\u0085"+
		"\u008f\u0097\u00a1\u00aa\u00b3\u00ba\u00bf\u00dc\u00df\u00e6\u00f6\u00fa"+
		"\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}