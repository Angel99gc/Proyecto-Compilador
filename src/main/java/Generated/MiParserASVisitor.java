// Generated from D:/Desktop/COMPILADORES/Proyecto-Compilador\MiParserAS.g4 by ANTLR 4.9.1
package Generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiParserAS}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiParserASVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program_AST}
	 * labeled alternative in {@link MiParserAS#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_AST(MiParserAS.Program_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecl_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl_State_AST(MiParserAS.VariableDecl_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDecl_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl_State_AST(MiParserAS.ClassDecl_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_State_AST(MiParserAS.Assignment_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssign_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign_State_AST(MiParserAS.ArrayAssign_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStat_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat_State_AST(MiParserAS.PrintStat_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat_State_AST(MiParserAS.IfStat_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat_State_AST(MiParserAS.WhileStat_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStat_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat_State_AST(MiParserAS.ReturnStat_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl_State_AST(MiParserAS.FunctionDecl_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_State_AST(MiParserAS.Block_State_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block_AST}
	 * labeled alternative in {@link MiParserAS#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_AST(MiParserAS.Block_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl_AST}
	 * labeled alternative in {@link MiParserAS#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl_AST(MiParserAS.FunctionDecl_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormalParams_AST}
	 * labeled alternative in {@link MiParserAS#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams_AST(MiParserAS.FormalParams_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormalParam_AST}
	 * labeled alternative in {@link MiParserAS#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam_AST(MiParserAS.FormalParam_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat_AST}
	 * labeled alternative in {@link MiParserAS#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat_AST(MiParserAS.WhileStat_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat_AST}
	 * labeled alternative in {@link MiParserAS#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat_AST(MiParserAS.IfStat_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStat_AST}
	 * labeled alternative in {@link MiParserAS#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat_AST(MiParserAS.ReturnStat_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStat_AST}
	 * labeled alternative in {@link MiParserAS#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat_AST(MiParserAS.PrintStat_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDecl_AST}
	 * labeled alternative in {@link MiParserAS#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl_AST(MiParserAS.ClassDecl_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassVarDecl_AST}
	 * labeled alternative in {@link MiParserAS#classVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDecl_AST(MiParserAS.ClassVarDecl_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecl_AST}
	 * labeled alternative in {@link MiParserAS#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl_AST(MiParserAS.VariableDecl_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleType_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType_T_AST(MiParserAS.SimpleType_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType_T_AST(MiParserAS.ArrayType_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ident_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_T_AST(MiParserAS.Ident_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(MiParserAS.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType_AST}
	 * labeled alternative in {@link MiParserAS#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType_AST(MiParserAS.ArrayType_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment_AST}
	 * labeled alternative in {@link MiParserAS#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_AST(MiParserAS.Assignment_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAssign_AST}
	 * labeled alternative in {@link MiParserAS#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssign_AST(MiParserAS.ArrayAssign_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AST}
	 * labeled alternative in {@link MiParserAS#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AST(MiParserAS.Expression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpre_AST}
	 * labeled alternative in {@link MiParserAS#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpre_AST(MiParserAS.SimpleExpre_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Term_AST}
	 * labeled alternative in {@link MiParserAS#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_AST(MiParserAS.Term_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_Fact_AST(MiParserAS.Literal_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_Fact_AST(MiParserAS.Identifier_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_Fact_AST(MiParserAS.FunctionCall_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLookup_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookup_Fact_AST(MiParserAS.ArrayLookup_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLen_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLen_Fact_AST(MiParserAS.ArrayLen_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpress_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpress_Fact_AST(MiParserAS.SubExpress_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAllocExpress_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocExpress_Fact_AST(MiParserAS.ArrayAllocExpress_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllocExpress_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocExpress_Fact_AST(MiParserAS.AllocExpress_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary_Fact_AST}
	 * labeled alternative in {@link MiParserAS#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_Fact_AST(MiParserAS.Unary_Fact_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary_AST}
	 * labeled alternative in {@link MiParserAS#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_AST(MiParserAS.Unary_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllocExpress_AST}
	 * labeled alternative in {@link MiParserAS#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocExpress_AST(MiParserAS.AllocExpress_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAllocExpress_AST}
	 * labeled alternative in {@link MiParserAS#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocExpress_AST(MiParserAS.ArrayAllocExpress_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubExpress_AST}
	 * labeled alternative in {@link MiParserAS#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpress_AST(MiParserAS.SubExpress_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall_AST}
	 * labeled alternative in {@link MiParserAS#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_AST(MiParserAS.FunctionCall_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActParams_AST}
	 * labeled alternative in {@link MiParserAS#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActParams_AST(MiParserAS.ActParams_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLookup_AST}
	 * labeled alternative in {@link MiParserAS#arrayLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookup_AST(MiParserAS.ArrayLookup_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLen_AST}
	 * labeled alternative in {@link MiParserAS#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLen_AST(MiParserAS.ArrayLen_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(MiParserAS.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(MiParserAS.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(MiParserAS.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier_AST}
	 * labeled alternative in {@link MiParserAS#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_AST(MiParserAS.Identifier_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral_Lit_AST(MiParserAS.IntLiteral_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealLiteral_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteral_Lit_AST(MiParserAS.RealLiteral_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral_Lit_AST(MiParserAS.CharLiteral_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral_Lit_AST(MiParserAS.BoolLiteral_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral_Lit_AST(MiParserAS.StringLiteral_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral_AST}
	 * labeled alternative in {@link MiParserAS#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral_AST(MiParserAS.IntLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealLiteral_AST}
	 * labeled alternative in {@link MiParserAS#realLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteral_AST(MiParserAS.RealLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharsLiteral_AST}
	 * labeled alternative in {@link MiParserAS#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsLiteral_AST(MiParserAS.CharsLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MiParserAS.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral_AST}
	 * labeled alternative in {@link MiParserAS#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral_AST(MiParserAS.StringLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#printable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable(MiParserAS.PrintableContext ctx);
}