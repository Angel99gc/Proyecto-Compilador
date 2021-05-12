// Generated from D:/Desktop/COMPILADORES/Proyecto-Compilador\MiParserAS.g4 by ANTLR 4.9.1
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
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_functionDeclaration = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_printStatement = 9, 
		RULE_classDeclaration = 10, RULE_classVariableDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_type = 13, RULE_simpleType = 14, RULE_arrayType = 15, RULE_assignment = 16, 
		RULE_arrayAssignment = 17, RULE_expression = 18, RULE_simpleExpression = 19, 
		RULE_term = 20, RULE_factor = 21, RULE_unary = 22, RULE_allocationExpression = 23, 
		RULE_arrayAllocationExpression = 24, RULE_subExpression = 25, RULE_functionCall = 26, 
		RULE_actualParams = 27, RULE_arrayLookup = 28, RULE_arrayLength = 29, 
		RULE_relationalOp = 30, RULE_additiveOp = 31, RULE_multiplicativeOp = 32, 
		RULE_identifier = 33, RULE_literal = 34, RULE_intLiteral = 35, RULE_realLiteral = 36, 
		RULE_charLiteral = 37, RULE_boolLiteral = 38, RULE_stringLiteral = 39, 
		RULE_printable = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "functionDeclaration", "formalParams", 
			"formalParam", "whileStatement", "ifStatement", "returnStatement", "printStatement", 
			"classDeclaration", "classVariableDeclaration", "variableDeclaration", 
			"type", "simpleType", "arrayType", "assignment", "arrayAssignment", "expression", 
			"simpleExpression", "term", "factor", "unary", "allocationExpression", 
			"arrayAllocationExpression", "subExpression", "functionCall", "actualParams", 
			"arrayLookup", "arrayLength", "relationalOp", "additiveOp", "multiplicativeOp", 
			"identifier", "literal", "intLiteral", "realLiteral", "charLiteral", 
			"boolLiteral", "stringLiteral", "printable"
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
		public TerminalNode EOF() { return getToken(MiParserAS.EOF, 0); }
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(EOF);
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
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public VariableDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitVariableDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDecl_State_ASTContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public ClassDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_State_ASTContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode PyCOMA() { return getToken(MiParserAS.PyCOMA, 0); }
		public Assignment_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAssignment_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStat_State_ASTContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitWhileStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDecl_State_ASTContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDecl_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionDecl_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStat_State_ASTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStat_State_ASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIfStat_State_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStat_State_ASTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
	public static class ArrayAssign_State_ASTContext extends StatementContext {
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
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
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				variableDeclaration();
				setState(91);
				match(PyCOMA);
				}
				break;
			case 2:
				_localctx = new ClassDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				classDeclaration();
				setState(94);
				match(PyCOMA);
				}
				break;
			case 3:
				_localctx = new Assignment_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				assignment();
				setState(97);
				match(PyCOMA);
				}
				break;
			case 4:
				_localctx = new ArrayAssign_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				arrayAssignment();
				setState(100);
				match(PyCOMA);
				}
				break;
			case 5:
				_localctx = new PrintStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				printStatement();
				setState(103);
				match(PyCOMA);
				}
				break;
			case 6:
				_localctx = new IfStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				ifStatement();
				}
				break;
			case 7:
				_localctx = new WhileStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				whileStatement();
				}
				break;
			case 8:
				_localctx = new ReturnStat_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				returnStatement();
				setState(108);
				match(PyCOMA);
				}
				break;
			case 9:
				_localctx = new FunctionDecl_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				functionDeclaration();
				}
				break;
			case 10:
				_localctx = new Block_State_ASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
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
			setState(114);
			match(CIZQ);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIZQ) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class FunctionDecl_ASTContext extends FunctionDeclarationContext {
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
		public FunctionDecl_ASTContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionDecl_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			_localctx = new FunctionDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			type();
			setState(124);
			identifier();
			setState(125);
			match(PIZQ);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(126);
				formalParams();
				}
			}

			setState(129);
			match(PDER);
			setState(130);
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
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			formalParam();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(133);
				match(COMA);
				setState(134);
				formalParam();
				}
				}
				setState(139);
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
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			_localctx = new FormalParam_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			type();
			setState(141);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStat_ASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(MiParserAS.WHILE, 0); }
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStat_ASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitWhileStat_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStat_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(WHILE);
			setState(144);
			match(PIZQ);
			setState(145);
			expression();
			setState(146);
			match(PDER);
			setState(147);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStat_ASTContext extends IfStatementContext {
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
		public IfStat_ASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIfStat_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStat_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			match(PIZQ);
			setState(151);
			expression();
			setState(152);
			match(PDER);
			setState(153);
			block();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(154);
				match(ELSE);
				setState(155);
				block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStat_ASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(MiParserAS.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStat_ASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitReturnStat_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			_localctx = new ReturnStat_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RETURN);
			setState(159);
			expression();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStat_ASTContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(MiParserAS.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStat_ASTContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitPrintStat_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			_localctx = new PrintStat_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(PRINT);
			setState(162);
			expression();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class ClassDecl_ASTContext extends ClassDeclarationContext {
		public TerminalNode CLASS() { return getToken(MiParserAS.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CIZQ() { return getToken(MiParserAS.CIZQ, 0); }
		public TerminalNode CDER() { return getToken(MiParserAS.CDER, 0); }
		public List<ClassVariableDeclarationContext> classVariableDeclaration() {
			return getRuleContexts(ClassVariableDeclarationContext.class);
		}
		public ClassVariableDeclarationContext classVariableDeclaration(int i) {
			return getRuleContext(ClassVariableDeclarationContext.class,i);
		}
		public ClassDecl_ASTContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitClassDecl_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CLASS);
			setState(165);
			identifier();
			setState(166);
			match(CIZQ);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(167);
				classVariableDeclaration();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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
		enterRule(_localctx, 22, RULE_classVariableDeclaration);
		int _la;
		try {
			_localctx = new ClassVarDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			simpleType();
			setState(176);
			identifier();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(177);
				match(EQUAL);
				setState(178);
				expression();
				}
			}

			setState(181);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDecl_ASTContext extends VariableDeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDecl_ASTContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitVariableDecl_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDecl_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type();
			setState(184);
			identifier();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(185);
				match(EQUAL);
				setState(186);
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
	public static class ArrayType_T_ASTContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayType_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayType_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ident_T_ASTContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Ident_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIdent_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleType_T_ASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleType_T_ASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSimpleType_T_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SimpleType_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayType_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				arrayType();
				}
				break;
			case 3:
				_localctx = new Ident_T_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				identifier();
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
		enterRule(_localctx, 28, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayType_ASTContext extends ArrayTypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayType_ASTContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayType_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			_localctx = new ArrayType_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			simpleType();
			setState(197);
			match(PCIZQ);
			setState(198);
			match(PCDER);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assignment_ASTContext extends AssignmentContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MiParserAS.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public Assignment_ASTContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAssignment_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		int _la;
		try {
			_localctx = new Assignment_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			identifier();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(201);
				match(POINT);
				setState(202);
				identifier();
				}
			}

			setState(205);
			match(EQUAL);
			setState(206);
			expression();
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	 
		public ArrayAssignmentContext() { }
		public void copyFrom(ArrayAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssign_ASTContext extends ArrayAssignmentContext {
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
		public ArrayAssign_ASTContext(ArrayAssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayAssign_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayAssignment);
		try {
			_localctx = new ArrayAssign_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			identifier();
			setState(209);
			match(PCIZQ);
			setState(210);
			expression();
			setState(211);
			match(PCDER);
			setState(212);
			match(EQUAL);
			setState(213);
			expression();
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			int _alt;
			_localctx = new Expression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			simpleExpression();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					relationalOp();
					setState(217);
					simpleExpression();
					}
					} 
				}
				setState(223);
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
		enterRule(_localctx, 38, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpre_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			term();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					additiveOp();
					setState(226);
					term();
					}
					} 
				}
				setState(232);
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
		enterRule(_localctx, 40, RULE_term);
		try {
			int _alt;
			_localctx = new Term_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			factor();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					multiplicativeOp();
					setState(235);
					factor();
					}
					} 
				}
				setState(241);
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
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public SubExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSubExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCall_Fact_ASTContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCall_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionCall_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLen_Fact_ASTContext extends FactorContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public ArrayLen_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLen_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAllocExpress_Fact_ASTContext extends FactorContext {
		public ArrayAllocationExpressionContext arrayAllocationExpression() {
			return getRuleContext(ArrayAllocationExpressionContext.class,0);
		}
		public ArrayAllocExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayAllocExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocExpress_Fact_ASTContext extends FactorContext {
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public AllocExpress_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAllocExpress_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Identifier_Fact_ASTContext extends FactorContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		public ArrayLookupContext arrayLookup() {
			return getRuleContext(ArrayLookupContext.class,0);
		}
		public ArrayLookup_Fact_ASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLookup_Fact_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_Fact_ASTContext extends FactorContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Literal_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				literal();
				}
				break;
			case 2:
				_localctx = new Identifier_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				identifier();
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(244);
					match(POINT);
					setState(245);
					identifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new FunctionCall_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				functionCall();
				}
				break;
			case 4:
				_localctx = new ArrayLookup_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				arrayLookup();
				}
				break;
			case 5:
				_localctx = new ArrayLen_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				arrayLength();
				}
				break;
			case 6:
				_localctx = new SubExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				subExpression();
				}
				break;
			case 7:
				_localctx = new ArrayAllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				arrayAllocationExpression();
				}
				break;
			case 8:
				_localctx = new AllocExpress_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				allocationExpression();
				}
				break;
			case 9:
				_localctx = new Unary_Fact_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unary_ASTContext extends UnaryContext {
		public TerminalNode SUM() { return getToken(MiParserAS.SUM, 0); }
		public TerminalNode SUB() { return getToken(MiParserAS.SUB, 0); }
		public TerminalNode EXCLA() { return getToken(MiParserAS.EXCLA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Unary_ASTContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitUnary_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary);
		int _la;
		try {
			int _alt;
			_localctx = new Unary_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << EXCLA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					expression();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
	 
		public AllocationExpressionContext() { }
		public void copyFrom(AllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllocExpress_ASTContext extends AllocationExpressionContext {
		public TerminalNode NEW() { return getToken(MiParserAS.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public AllocExpress_ASTContext(AllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitAllocExpress_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_allocationExpression);
		try {
			_localctx = new AllocExpress_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(NEW);
			setState(265);
			identifier();
			setState(266);
			match(PIZQ);
			setState(267);
			match(PDER);
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

	public static class ArrayAllocationExpressionContext extends ParserRuleContext {
		public ArrayAllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAllocationExpression; }
	 
		public ArrayAllocationExpressionContext() { }
		public void copyFrom(ArrayAllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAllocExpress_ASTContext extends ArrayAllocationExpressionContext {
		public TerminalNode NEW() { return getToken(MiParserAS.NEW, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayAllocExpress_ASTContext(ArrayAllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayAllocExpress_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAllocationExpressionContext arrayAllocationExpression() throws RecognitionException {
		ArrayAllocationExpressionContext _localctx = new ArrayAllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayAllocationExpression);
		try {
			_localctx = new ArrayAllocExpress_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(NEW);
			setState(270);
			simpleType();
			setState(271);
			match(PCIZQ);
			setState(272);
			expression();
			setState(273);
			match(PCDER);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
	 
		public SubExpressionContext() { }
		public void copyFrom(SubExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubExpress_ASTContext extends SubExpressionContext {
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public SubExpress_ASTContext(SubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitSubExpress_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subExpression);
		try {
			_localctx = new SubExpress_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PIZQ);
			setState(276);
			expression();
			setState(277);
			match(PDER);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public ParserRuleContext decl = null;
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
			this.decl = ctx.decl;
		}
	}
	public static class FunctionCall_ASTContext extends FunctionCallContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(MiParserAS.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(MiParserAS.PDER, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FunctionCall_ASTContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitFunctionCall_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCall_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			identifier();
			setState(280);
			match(PIZQ);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POINT) | (1L << PIZQ) | (1L << SUM) | (1L << SUB) | (1L << EXCLA) | (1L << QMARK) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUM) | (1L << CHARS))) != 0)) {
				{
				setState(281);
				actualParams();
				}
			}

			setState(284);
			match(PDER);
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
		public int cantParams = 0;
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	 
		public ActualParamsContext() { }
		public void copyFrom(ActualParamsContext ctx) {
			super.copyFrom(ctx);
			this.cantParams = ctx.cantParams;
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
		enterRule(_localctx, 54, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActParams_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			expression();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(287);
				match(COMA);
				setState(288);
				expression();
				}
				}
				setState(293);
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

	public static class ArrayLookupContext extends ParserRuleContext {
		public ArrayLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookup; }
	 
		public ArrayLookupContext() { }
		public void copyFrom(ArrayLookupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLookup_ASTContext extends ArrayLookupContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PCIZQ() { return getToken(MiParserAS.PCIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PCDER() { return getToken(MiParserAS.PCDER, 0); }
		public ArrayLookup_ASTContext(ArrayLookupContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLookup_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookupContext arrayLookup() throws RecognitionException {
		ArrayLookupContext _localctx = new ArrayLookupContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLookup);
		try {
			_localctx = new ArrayLookup_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			identifier();
			setState(295);
			match(PCIZQ);
			setState(296);
			expression();
			setState(297);
			match(PCDER);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	 
		public ArrayLengthContext() { }
		public void copyFrom(ArrayLengthContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLen_ASTContext extends ArrayLengthContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public TerminalNode LENGTH() { return getToken(MiParserAS.LENGTH, 0); }
		public ArrayLen_ASTContext(ArrayLengthContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitArrayLen_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLength);
		try {
			_localctx = new ArrayLen_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			identifier();
			setState(300);
			match(POINT);
			setState(301);
			match(LENGTH);
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
		enterRule(_localctx, 60, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 62, RULE_additiveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 64, RULE_multiplicativeOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
	public static class Identifier_ASTContext extends IdentifierContext {
		public TerminalNode ID() { return getToken(MiParserAS.ID, 0); }
		public Identifier_ASTContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIdentifier_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifier);
		try {
			_localctx = new Identifier_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
	public static class IntLiteral_Lit_ASTContext extends LiteralContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public IntLiteral_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIntLiteral_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteral_Lit_ASTContext extends LiteralContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteral_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitStringLiteral_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteral_Lit_ASTContext extends LiteralContext {
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public CharLiteral_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitCharLiteral_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealLiteral_Lit_ASTContext extends LiteralContext {
		public RealLiteralContext realLiteral() {
			return getRuleContext(RealLiteralContext.class,0);
		}
		public RealLiteral_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitRealLiteral_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLiteral_Lit_ASTContext extends LiteralContext {
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public BoolLiteral_Lit_ASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitBoolLiteral_Lit_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IntLiteral_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				intLiteral();
				}
				break;
			case 2:
				_localctx = new RealLiteral_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				realLiteral();
				}
				break;
			case 3:
				_localctx = new CharLiteral_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				charLiteral();
				}
				break;
			case 4:
				_localctx = new BoolLiteral_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				boolLiteral();
				}
				break;
			case 5:
				_localctx = new StringLiteral_Lit_ASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				stringLiteral();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
	 
		public IntLiteralContext() { }
		public void copyFrom(IntLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLiteral_ASTContext extends IntLiteralContext {
		public TerminalNode NUM() { return getToken(MiParserAS.NUM, 0); }
		public IntLiteral_ASTContext(IntLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitIntLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_intLiteral);
		try {
			_localctx = new IntLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(NUM);
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
	public static class RealLiteral_ASTContext extends RealLiteralContext {
		public TerminalNode POINT() { return getToken(MiParserAS.POINT, 0); }
		public List<TerminalNode> NUM() { return getTokens(MiParserAS.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(MiParserAS.NUM, i);
		}
		public RealLiteral_ASTContext(RealLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitRealLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealLiteralContext realLiteral() throws RecognitionException {
		RealLiteralContext _localctx = new RealLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_realLiteral);
		int _la;
		try {
			_localctx = new RealLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(320);
				match(NUM);
				}
			}

			setState(323);
			match(POINT);
			setState(324);
			match(NUM);
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

	public static class CharLiteralContext extends ParserRuleContext {
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	 
		public CharLiteralContext() { }
		public void copyFrom(CharLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharsLiteral_ASTContext extends CharLiteralContext {
		public TerminalNode CHARS() { return getToken(MiParserAS.CHARS, 0); }
		public CharsLiteral_ASTContext(CharLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitCharsLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_charLiteral);
		try {
			_localctx = new CharsLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(CHARS);
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
		enterRule(_localctx, 76, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	 
		public StringLiteralContext() { }
		public void copyFrom(StringLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteral_ASTContext extends StringLiteralContext {
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
		public StringLiteral_ASTContext(StringLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiParserASVisitor ) return ((MiParserASVisitor<? extends T>)visitor).visitStringLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stringLiteral);
		try {
			int _alt;
			_localctx = new StringLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(QMARK);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					printable();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(337);
			match(QMARK);
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
		enterRule(_localctx, 80, RULE_printable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\7\4w\n"+
		"\4\f\4\16\4z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00be\n"+
		"\16\3\17\3\17\3\17\5\17\u00c3\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u00ce\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24\3\25"+
		"\3\25\3\25\3\25\7\25\u00e7\n\25\f\25\16\25\u00ea\13\25\3\26\3\26\3\26"+
		"\3\26\7\26\u00f0\n\26\f\26\16\26\u00f3\13\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00f9\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0102\n\27\3\30\3"+
		"\30\7\30\u0106\n\30\f\30\16\30\u0109\13\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u011d"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u0124\n\35\f\35\16\35\u0127\13\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3$\3$\5$\u013f\n$\3%\3%\3&\5&\u0144\n&\3&\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\7)\u014f\n)\f)\16)\u0152\13)\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\t\3\2"+
		"\61\64\4\2\16\17\33\33\3\2\22\27\4\2\16\17\30\30\4\2\20\21\31\31\3\2\67"+
		"8\5\2\4\23\32*9:\2\u0157\2W\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\b}\3\2\2\2\n"+
		"\u0086\3\2\2\2\f\u008e\3\2\2\2\16\u0091\3\2\2\2\20\u0097\3\2\2\2\22\u00a0"+
		"\3\2\2\2\24\u00a3\3\2\2\2\26\u00a6\3\2\2\2\30\u00b1\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00c2\3\2\2\2\36\u00c4\3\2\2\2 \u00c6\3\2\2\2\"\u00ca\3\2\2"+
		"\2$\u00d2\3\2\2\2&\u00d9\3\2\2\2(\u00e2\3\2\2\2*\u00eb\3\2\2\2,\u0101"+
		"\3\2\2\2.\u0103\3\2\2\2\60\u010a\3\2\2\2\62\u010f\3\2\2\2\64\u0115\3\2"+
		"\2\2\66\u0119\3\2\2\28\u0120\3\2\2\2:\u0128\3\2\2\2<\u012d\3\2\2\2>\u0131"+
		"\3\2\2\2@\u0133\3\2\2\2B\u0135\3\2\2\2D\u0137\3\2\2\2F\u013e\3\2\2\2H"+
		"\u0140\3\2\2\2J\u0143\3\2\2\2L\u0148\3\2\2\2N\u014a\3\2\2\2P\u014c\3\2"+
		"\2\2R\u0155\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7\2\2\3[\3\3\2\2\2\\]\5\32\16\2]^\7\5\2\2^s\3\2"+
		"\2\2_`\5\26\f\2`a\7\5\2\2as\3\2\2\2bc\5\"\22\2cd\7\5\2\2ds\3\2\2\2ef\5"+
		"$\23\2fg\7\5\2\2gs\3\2\2\2hi\5\24\13\2ij\7\5\2\2js\3\2\2\2ks\5\20\t\2"+
		"ls\5\16\b\2mn\5\22\n\2no\7\5\2\2os\3\2\2\2ps\5\b\5\2qs\5\6\4\2r\\\3\2"+
		"\2\2r_\3\2\2\2rb\3\2\2\2re\3\2\2\2rh\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2"+
		"\2\2rp\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tx\7\7\2\2uw\5\4\3\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\b\2\2|\7\3\2\2\2}~"+
		"\5\34\17\2~\177\5D#\2\177\u0081\7\t\2\2\u0080\u0082\5\n\6\2\u0081\u0080"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n\2\2\u0084"+
		"\u0085\5\6\4\2\u0085\t\3\2\2\2\u0086\u008b\5\f\7\2\u0087\u0088\7\4\2\2"+
		"\u0088\u008a\5\f\7\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\5\34\17\2\u008f\u0090\5D#\2\u0090\r\3\2\2\2\u0091\u0092\7+\2\2"+
		"\u0092\u0093\7\t\2\2\u0093\u0094\5&\24\2\u0094\u0095\7\n\2\2\u0095\u0096"+
		"\5\6\4\2\u0096\17\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\7\t\2\2\u0099"+
		"\u009a\5&\24\2\u009a\u009b\7\n\2\2\u009b\u009e\5\6\4\2\u009c\u009d\7-"+
		"\2\2\u009d\u009f\5\6\4\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\21\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\5&\24\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a4\7/\2\2\u00a4\u00a5\5&\24\2\u00a5\25\3\2\2\2\u00a6\u00a7\7\60\2"+
		"\2\u00a7\u00a8\5D#\2\u00a8\u00ac\7\7\2\2\u00a9\u00ab\5\30\r\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0\27\3\2\2"+
		"\2\u00b1\u00b2\5\36\20\2\u00b2\u00b5\5D#\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6"+
		"\5&\24\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\5\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bd\5D#"+
		"\2\u00bb\u00bc\7\r\2\2\u00bc\u00be\5&\24\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c3\5\36\20\2\u00c0\u00c3\5 \21\2\u00c1"+
		"\u00c3\5D#\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2"+
		"\2\u00c3\35\3\2\2\2\u00c4\u00c5\t\2\2\2\u00c5\37\3\2\2\2\u00c6\u00c7\5"+
		"\36\20\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\7\f\2\2\u00c9!\3\2\2\2\u00ca"+
		"\u00cd\5D#\2\u00cb\u00cc\7\6\2\2\u00cc\u00ce\5D#\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\r\2\2\u00d0\u00d1"+
		"\5&\24\2\u00d1#\3\2\2\2\u00d2\u00d3\5D#\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5"+
		"\5&\24\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\5&\24\2\u00d8"+
		"%\3\2\2\2\u00d9\u00df\5(\25\2\u00da\u00db\5> \2\u00db\u00dc\5(\25\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e8"+
		"\5*\26\2\u00e3\u00e4\5@!\2\u00e4\u00e5\5*\26\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9)\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f1\5,\27\2\u00ec\u00ed"+
		"\5B\"\2\u00ed\u00ee\5,\27\2\u00ee\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2+\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f4\u0102\5F$\2\u00f5\u00f8\5D#\2\u00f6\u00f7\7"+
		"\6\2\2\u00f7\u00f9\5D#\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u0102\3\2\2\2\u00fa\u0102\5\66\34\2\u00fb\u0102\5:\36\2\u00fc\u0102\5"+
		"<\37\2\u00fd\u0102\5\64\33\2\u00fe\u0102\5\62\32\2\u00ff\u0102\5\60\31"+
		"\2\u0100\u0102\5.\30\2\u0101\u00f4\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00fa"+
		"\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101"+
		"\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102-\3\2\2\2"+
		"\u0103\u0107\t\3\2\2\u0104\u0106\5&\24\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108/\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\7\65\2\2\u010b\u010c\5D#\2\u010c\u010d\7\t"+
		"\2\2\u010d\u010e\7\n\2\2\u010e\61\3\2\2\2\u010f\u0110\7\65\2\2\u0110\u0111"+
		"\5\36\20\2\u0111\u0112\7\13\2\2\u0112\u0113\5&\24\2\u0113\u0114\7\f\2"+
		"\2\u0114\63\3\2\2\2\u0115\u0116\7\t\2\2\u0116\u0117\5&\24\2\u0117\u0118"+
		"\7\n\2\2\u0118\65\3\2\2\2\u0119\u011a\5D#\2\u011a\u011c\7\t\2\2\u011b"+
		"\u011d\58\35\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\7\n\2\2\u011f\67\3\2\2\2\u0120\u0125\5&\24\2\u0121\u0122"+
		"\7\4\2\2\u0122\u0124\5&\24\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u01269\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\5D#\2\u0129\u012a\7\13\2\2\u012a\u012b\5&\24\2\u012b\u012c"+
		"\7\f\2\2\u012c;\3\2\2\2\u012d\u012e\5D#\2\u012e\u012f\7\6\2\2\u012f\u0130"+
		"\7\66\2\2\u0130=\3\2\2\2\u0131\u0132\t\4\2\2\u0132?\3\2\2\2\u0133\u0134"+
		"\t\5\2\2\u0134A\3\2\2\2\u0135\u0136\t\6\2\2\u0136C\3\2\2\2\u0137\u0138"+
		"\79\2\2\u0138E\3\2\2\2\u0139\u013f\5H%\2\u013a\u013f\5J&\2\u013b\u013f"+
		"\5L\'\2\u013c\u013f\5N(\2\u013d\u013f\5P)\2\u013e\u0139\3\2\2\2\u013e"+
		"\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013fG\3\2\2\2\u0140\u0141\7:\2\2\u0141I\3\2\2\2\u0142\u0144\7:\2"+
		"\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\7\6\2\2\u0146\u0147\7:\2\2\u0147K\3\2\2\2\u0148\u0149\7;\2\2\u0149M\3"+
		"\2\2\2\u014a\u014b\t\7\2\2\u014bO\3\2\2\2\u014c\u0150\7\34\2\2\u014d\u014f"+
		"\5R*\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\34"+
		"\2\2\u0154Q\3\2\2\2\u0155\u0156\t\b\2\2\u0156S\3\2\2\2\30Wrx\u0081\u008b"+
		"\u009e\u00ac\u00b5\u00bd\u00c2\u00cd\u00df\u00e8\u00f1\u00f8\u0101\u0107"+
		"\u011c\u0125\u013e\u0143\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}