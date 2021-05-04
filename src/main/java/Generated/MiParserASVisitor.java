// Generated from C:/Users/josfe/Desktop/Proyecto-Compilador\MiParserAS.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code FunctionStat_State_AST}
	 * labeled alternative in {@link MiParserAS#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStat_State_AST(MiParserAS.FunctionStat_State_ASTContext ctx);
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
	 * Visit a parse tree produced by the {@code ClassVarDecl_AST}
	 * labeled alternative in {@link MiParserAS#classVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDecl_AST(MiParserAS.ClassVarDecl_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleT_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleT_T_AST(MiParserAS.SimpleT_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayT_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayT_T_AST(MiParserAS.ArrayT_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_T_AST}
	 * labeled alternative in {@link MiParserAS#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_T_AST(MiParserAS.ID_T_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(MiParserAS.SimpleTypeContext ctx);
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
	 * Visit a parse tree produced by the {@code ActParams_AST}
	 * labeled alternative in {@link MiParserAS#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActParams_AST(MiParserAS.ActParams_ASTContext ctx);
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
	 * Visit a parse tree produced by the {@code IntLit_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit_Lit_AST(MiParserAS.IntLit_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealLit_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLit_Lit_AST(MiParserAS.RealLit_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit_Lit_AST(MiParserAS.BoolLit_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLit_Lit_AST}
	 * labeled alternative in {@link MiParserAS#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit_Lit_AST(MiParserAS.StringLit_Lit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecPunt_RealLit_AST}
	 * labeled alternative in {@link MiParserAS#realLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecPunt_RealLit_AST(MiParserAS.DecPunt_RealLit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dec_RealLit_AST}
	 * labeled alternative in {@link MiParserAS#realLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_RealLit_AST(MiParserAS.Dec_RealLit_ASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MiParserAS.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiParserAS#printable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintable(MiParserAS.PrintableContext ctx);
}