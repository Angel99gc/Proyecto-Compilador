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
		RULE_program = 0, RULE_statement = 1, RULE_funcionCall = 2, RULE_classCall = 3, 
		RULE_block = 4, RULE_formalParams = 5, RULE_formalParam = 6, RULE_classVariableDeclaration = 7, 
		RULE_type = 8, RULE_simpleType = 9, RULE_expression = 10, RULE_simpleExpression = 11, 
		RULE_term = 12, RULE_factor = 13, RULE_actualParams = 14, RULE_relationalOp = 15, 
		RULE_additiveOp = 16, RULE_multiplicativeOp = 17, RULE_identifier = 18, 
		RULE_literal = 19, RULE_realLiteral = 20, RULE_boolLiteral = 21, RULE_printable = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "funcionCall", "classCall", "block", "formalParams", 
			"formalParam", "classVariableDeclaration", "type", "simpleType", "expression", 
			"simpleExpression", "term", "factor", "actualParams", "relationalOp", 
			"additiveOp", "multiplicativeOp", "identifier", "literal", "realLiteral", 
			"boolLiteral", "printable"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		public ClassCallContext classCall() {
			return getRuleContext(ClassCallContext.class,0);
		}
		public ClassDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_State_ASTContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
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
		public FuncionCallContext funcionCall() {
			return getRuleContext(FuncionCallContext.class,0);
		}
		public FunctionStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssign_State_ASTContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VariableDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				type();
				setState(53);
				identifier();
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(54);
					match(EQUAL);
					setState(55);
					expression();
					}
				}

				setState(58);
				match(PyCOMA);
				}
				break;
			case 2:
				_localctx = new ClassDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				classCall();
				}
				break;
			case 3:
				_localctx = new Assignment_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				identifier();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(62);
					match(POINT);
					setState(63);
					match(ID);
					}
				}

				setState(66);
				match(EQUAL);
				setState(67);
				expression();
				setState(68);
				match(PyCOMA);
				}
				break;
			case 4:
				_localctx = new ArrayAssign_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				identifier();
				setState(71);
				match(PCIZQ);
				setState(72);
				expression();
				setState(73);
				match(PCDER);
				setState(74);
				match(EQUAL);
				setState(75);
				expression();
				setState(76);
				match(PyCOMA);
				}
				break;
			case 5:
				_localctx = new PrintStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(PRINT);
				setState(79);
				expression();
				setState(80);
				match(PyCOMA);
				}
				break;
			case 6:
				_localctx = new IfStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(IF);
				setState(83);
				match(PIZQ);
				setState(84);
				expression();
				setState(85);
				match(PDER);
				setState(86);
				block();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(87);
					match(ELSE);
					setState(88);
					block();
					}
				}

				}
				break;
			case 7:
				_localctx = new WhileStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(WHILE);
				setState(92);
				match(PIZQ);
				setState(93);
				expression();
				setState(94);
				match(PDER);
				setState(95);
				block();
				}
				break;
			case 8:
				_localctx = new ReturnStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				match(RETURN);
				setState(98);
				expression();
				setState(99);
				match(PyCOMA);
				}
				break;
			case 9:
				_localctx = new FunctionStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				funcionCall();
				}
				break;
			case 10:
				_localctx = new Block_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
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

	public static class FuncionCallContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public FuncionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionCall; }
	 
		public FuncionCallContext() { }
		public void copyFrom(FuncionCallContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class FunctionStat_ASTContext extends FuncionCallContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionStat_ASTContext(FuncionCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionStat_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionCallContext funcionCall() throws RecognitionException {
		FuncionCallContext _localctx = new FuncionCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcionCall);
		int _la;
		try {
			_localctx = new FunctionStat_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			identifier();
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

	public static class ClassCallContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public ClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCall; }
	 
		public ClassCallContext() { }
		public void copyFrom(ClassCallContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class ClassDecl_ASTContext extends ClassCallContext {
		public TerminalNode CLASS() { return getToken(MiParserAS.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CIZQ() { return getToken(MiParserAS.CIZQ, 0); }
		public TerminalNode CDER() { return getToken(MiParserAS.CDER, 0); }
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public List<ClassVariableDeclarationContext> classVariableDeclaration() {
			return getRuleContexts(ClassVariableDeclarationContext.class);
		}
		public ClassVariableDeclarationContext classVariableDeclaration(int i) {
			return getRuleContext(ClassVariableDeclarationContext.class,i);
		}
		public ClassDecl_ASTContext(ClassCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassDecl_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classCall);
		int _la;
		try {
			_localctx = new ClassDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CLASS);
			setState(115);
			identifier();
			setState(116);
			match(CIZQ);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(117);
				classVariableDeclaration();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(CDER);
			setState(124);
			match(PyCOMA);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			_localctx = new Block_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CIZQ);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
		public int cantParams = 0;
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	 
		public FormalParamsContext() { }
		public void copyFrom(FormalParamsContext ctx) {
			super.copyFrom(ctx);
			this.cantParams = ctx.cantParams;
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
		enterRule(_localctx, 10, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			formalParam();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(136);
				match(COMA);
				setState(137);
				formalParam();
				}
				}
				setState(142);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalParam_ASTContext(FormalParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFormalParam_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalParam);
		try {
			_localctx = new FormalParam_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type();
			setState(144);
			identifier();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
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
		enterRule(_localctx, 14, RULE_classVariableDeclaration);
		int _la;
		try {
			_localctx = new ClassVarDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			simpleType();
			setState(147);
			identifier();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(148);
				match(EQUAL);
				setState(149);
				expression();
				}
			}

			setState(152);
			match(PyCOMA);
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SimpleT_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayT_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				simpleType();
				setState(156);
				match(PCIZQ);
				setState(157);
				match(PCDER);
				}
				break;
			case 3:
				_localctx = new ID_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
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
		enterRule(_localctx, 18, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			int _alt;
			_localctx = new Expression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			simpleExpression();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					relationalOp();
					setState(166);
					simpleExpression();
					}
					} 
				}
				setState(172);
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
		enterRule(_localctx, 22, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpre_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			term();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					additiveOp();
					setState(175);
					term();
					}
					} 
				}
				setState(181);
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
		enterRule(_localctx, 24, RULE_term);
		try {
			int _alt;
			_localctx = new Term_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			factor();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					multiplicativeOp();
					setState(184);
					factor();
					}
					} 
				}
				setState(190);
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
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Literal_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				literal();
				}
				break;
			case 2:
				_localctx = new Identifier_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(ID);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(193);
					match(POINT);
					setState(194);
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
				setState(197);
				match(ID);
				setState(198);
				match(PIZQ);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINT) | (1L << PIZQ) | (1L << SUM) | (1L << SUB) | (1L << EXCLA) | (1L << QMARK) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHARS))) != 0)) {
					{
					setState(199);
					actualParams();
					}
				}

				setState(202);
				match(PDER);
				}
				break;
			case 4:
				_localctx = new ArrayLookup_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(ID);
				setState(204);
				match(PCIZQ);
				setState(205);
				expression();
				setState(206);
				match(PCDER);
				}
				break;
			case 5:
				_localctx = new ArrayLen_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(ID);
				setState(209);
				match(POINT);
				setState(210);
				match(LENGTH);
				}
				break;
			case 6:
				_localctx = new SubExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				match(PIZQ);
				setState(212);
				expression();
				setState(213);
				match(PDER);
				}
				break;
			case 7:
				_localctx = new ArrayAllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				match(NEW);
				setState(216);
				simpleType();
				setState(217);
				match(PCIZQ);
				setState(218);
				expression();
				setState(219);
				match(PCDER);
				}
				break;
			case 8:
				_localctx = new AllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(NEW);
				setState(222);
				match(ID);
				setState(223);
				match(PIZQ);
				setState(224);
				match(PDER);
				}
				break;
			case 9:
				_localctx = new Unary_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << EXCLA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						expression();
						}
						} 
					}
					setState(231);
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
		enterRule(_localctx, 28, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expression();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(235);
				match(COMA);
				setState(236);
				expression();
				}
				}
				setState(241);
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
		enterRule(_localctx, 30, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 32, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 34, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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

	public static class IdentifierContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class Id_Ident_ASTContext extends IdentifierContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public Id_Ident_ASTContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitId_Ident_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier);
		try {
			_localctx = new Id_Ident_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
	public static class CharLit_Lit_ASTContext extends LiteralContext {
		public TerminalNode CHARS() { return getToken(MiParserAS.CHARS, 0); }
		public CharLit_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitCharLit_Lit_AST(this);
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			int _alt;
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IntLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new CharLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(CHARS);
				}
				break;
			case 3:
				_localctx = new RealLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				realLiteral();
				}
				break;
			case 4:
				_localctx = new BoolLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				boolLiteral();
				}
				break;
			case 5:
				_localctx = new StringLit_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(QMARK);
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						printable();
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(261);
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
		enterRule(_localctx, 40, RULE_realLiteral);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new DecPunt_RealLit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(NUM);
				setState(265);
				match(POINT);
				setState(266);
				match(NUM);
				}
				break;
			case POINT:
				_localctx = new Dec_RealLit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(POINT);
				setState(268);
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
		enterRule(_localctx, 42, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 44, RULE_printable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\3\6\3\6\7\6\u0083\n\6"+
		"\f\6\16\6\u0086\13\6\3\6\3\6\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090"+
		"\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16"+
		"\f\u00ae\13\f\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\16\3"+
		"\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00c6\n\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13"+
		"\17\5\17\u00eb\n\17\3\20\3\20\3\20\7\20\u00f0\n\20\f\20\16\20\u00f3\13"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25\5\25\u0109\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0110\n\26\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\t\3\2\61\64\4\2\16\17\33"+
		"\33\3\2\22\27\4\2\16\17\30\30\4\2\20\21\31\31\3\2\678\5\2\4\23\32*9:\2"+
		"\u0127\2\63\3\2\2\2\4i\3\2\2\2\6k\3\2\2\2\bt\3\2\2\2\n\u0080\3\2\2\2\f"+
		"\u0089\3\2\2\2\16\u0091\3\2\2\2\20\u0094\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00a6\3\2\2\2\30\u00af\3\2\2\2\32\u00b8\3\2\2\2\34\u00ea\3"+
		"\2\2\2\36\u00ec\3\2\2\2 \u00f4\3\2\2\2\"\u00f6\3\2\2\2$\u00f8\3\2\2\2"+
		"&\u00fa\3\2\2\2(\u0108\3\2\2\2*\u010f\3\2\2\2,\u0111\3\2\2\2.\u0113\3"+
		"\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\5\22\n\2\67:\5&\24\289\7\r\2\2"+
		"9;\5\26\f\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\5\2\2=j\3\2\2\2>j\5\b\5"+
		"\2?B\5&\24\2@A\7\6\2\2AC\79\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\r\2"+
		"\2EF\5\26\f\2FG\7\5\2\2Gj\3\2\2\2HI\5&\24\2IJ\7\13\2\2JK\5\26\f\2KL\7"+
		"\f\2\2LM\7\r\2\2MN\5\26\f\2NO\7\5\2\2Oj\3\2\2\2PQ\7/\2\2QR\5\26\f\2RS"+
		"\7\5\2\2Sj\3\2\2\2TU\7,\2\2UV\7\t\2\2VW\5\26\f\2WX\7\n\2\2X[\5\n\6\2Y"+
		"Z\7-\2\2Z\\\5\n\6\2[Y\3\2\2\2[\\\3\2\2\2\\j\3\2\2\2]^\7+\2\2^_\7\t\2\2"+
		"_`\5\26\f\2`a\7\n\2\2ab\5\n\6\2bj\3\2\2\2cd\7.\2\2de\5\26\f\2ef\7\5\2"+
		"\2fj\3\2\2\2gj\5\6\4\2hj\5\n\6\2i\66\3\2\2\2i>\3\2\2\2i?\3\2\2\2iH\3\2"+
		"\2\2iP\3\2\2\2iT\3\2\2\2i]\3\2\2\2ic\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\5\3"+
		"\2\2\2kl\5\22\n\2lm\5&\24\2mo\7\t\2\2np\5\f\7\2on\3\2\2\2op\3\2\2\2pq"+
		"\3\2\2\2qr\7\n\2\2rs\5\n\6\2s\7\3\2\2\2tu\7\60\2\2uv\5&\24\2vz\7\7\2\2"+
		"wy\5\20\t\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2"+
		"\2}~\7\b\2\2~\177\7\5\2\2\177\t\3\2\2\2\u0080\u0084\7\7\2\2\u0081\u0083"+
		"\5\4\3\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\b"+
		"\2\2\u0088\13\3\2\2\2\u0089\u008e\5\16\b\2\u008a\u008b\7\4\2\2\u008b\u008d"+
		"\5\16\b\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\r\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5"+
		"\22\n\2\u0092\u0093\5&\24\2\u0093\17\3\2\2\2\u0094\u0095\5\24\13\2\u0095"+
		"\u0098\5&\24\2\u0096\u0097\7\r\2\2\u0097\u0099\5\26\f\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\5\2\2\u009b"+
		"\21\3\2\2\2\u009c\u00a3\5\24\13\2\u009d\u009e\5\24\13\2\u009e\u009f\7"+
		"\13\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\79\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\23\3\2\2"+
		"\2\u00a4\u00a5\t\2\2\2\u00a5\25\3\2\2\2\u00a6\u00ac\5\30\r\2\u00a7\u00a8"+
		"\5 \21\2\u00a8\u00a9\5\30\r\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\27"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b5\5\32\16\2\u00b0\u00b1\5\"\22"+
		"\2\u00b1\u00b2\5\32\16\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00be\5\34\17\2\u00b9\u00ba\5$\23\2\u00ba"+
		"\u00bb\5\34\17\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00eb\5(\25\2\u00c2\u00c5\79\2\2\u00c3\u00c4\7\6"+
		"\2\2\u00c4\u00c6\79\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00eb\3\2\2\2\u00c7\u00c8\79\2\2\u00c8\u00ca\7\t\2\2\u00c9\u00cb\5\36"+
		"\20\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00eb\7\n\2\2\u00cd\u00ce\79\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5\26"+
		"\f\2\u00d0\u00d1\7\f\2\2\u00d1\u00eb\3\2\2\2\u00d2\u00d3\79\2\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\u00eb\7\66\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5"+
		"\26\f\2\u00d7\u00d8\7\n\2\2\u00d8\u00eb\3\2\2\2\u00d9\u00da\7\65\2\2\u00da"+
		"\u00db\5\24\13\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5\26\f\2\u00dd\u00de"+
		"\7\f\2\2\u00de\u00eb\3\2\2\2\u00df\u00e0\7\65\2\2\u00e0\u00e1\79\2\2\u00e1"+
		"\u00e2\7\t\2\2\u00e2\u00eb\7\n\2\2\u00e3\u00e7\t\3\2\2\u00e4\u00e6\5\26"+
		"\f\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00c1\3\2"+
		"\2\2\u00ea\u00c2\3\2\2\2\u00ea\u00c7\3\2\2\2\u00ea\u00cd\3\2\2\2\u00ea"+
		"\u00d2\3\2\2\2\u00ea\u00d5\3\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00df\3\2"+
		"\2\2\u00ea\u00e3\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00f1\5\26\f\2\u00ed\u00ee"+
		"\7\4\2\2\u00ee\u00f0\5\26\f\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f5\t\4\2\2\u00f5!\3\2\2\2\u00f6\u00f7\t\5\2\2\u00f7"+
		"#\3\2\2\2\u00f8\u00f9\t\6\2\2\u00f9%\3\2\2\2\u00fa\u00fb\79\2\2\u00fb"+
		"\'\3\2\2\2\u00fc\u0109\7:\2\2\u00fd\u0109\7;\2\2\u00fe\u0109\5*\26\2\u00ff"+
		"\u0109\5,\27\2\u0100\u0104\7\34\2\2\u0101\u0103\5.\30\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\34\2\2\u0108\u00fc\3"+
		"\2\2\2\u0108\u00fd\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u00ff\3\2\2\2\u0108"+
		"\u0100\3\2\2\2\u0109)\3\2\2\2\u010a\u010b\7:\2\2\u010b\u010c\7\6\2\2\u010c"+
		"\u0110\7:\2\2\u010d\u010e\7\6\2\2\u010e\u0110\7:\2\2\u010f\u010a\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u0110+\3\2\2\2\u0111\u0112\t\7\2\2\u0112-\3\2\2"+
		"\2\u0113\u0114\t\b\2\2\u0114/\3\2\2\2\30\63:B[ioz\u0084\u008e\u0098\u00a2"+
		"\u00ac\u00b5\u00be\u00c5\u00ca\u00e7\u00ea\u00f1\u0104\u0108\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}