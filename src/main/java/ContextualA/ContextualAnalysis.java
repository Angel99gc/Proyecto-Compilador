/*package ContextualA;

import Generated.MiParserAS;
import Generated.MiParserASBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

public class ContextualAnalysis extends MiParserASBaseVisitor<Object> {

    private final SymbolsTable table;

    public ContextualAnalysis() {
        this.table = new SymbolsTable();
        this.table.insertar(new CommonToken(MiParserAS.ID, "print"), -1, null);
    }

    @Override
    public Object visitProgram_AST(MiParserAS.Program_ASTContext ctx) {
        for (MiParserAS.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        table.imprimir();
        return null;
    }

    @Override
    public Object visitVariableDecl_State_AST(MiParserAS.VariableDecl_State_ASTContext ctx) {
        Object attr = this.visit(ctx.type());
        if (attr != null) {
            table.insertar(ctx.ID().getSymbol(), (int) attr, ctx);
            if (ctx.expression() != null) {
                this.visit(ctx.expression());
            }
        }
        return null;
        //////FALTA POR SI YA TIENE ALGO ASIGNADO
    }

    @Override
    public Object visitClassDecl_State_AST(MiParserAS.ClassDecl_State_ASTContext ctx) {
        for (MiParserAS.ClassVariableDeclarationContext c : ctx.classVariableDeclaration()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitAssignment_State_AST(MiParserAS.Assignment_State_ASTContext ctx) {
        MiParserAS.Id_Ident_ASTContext idToken = (MiParserAS.Id_Ident_ASTContext) this.visit(ctx.identifier());
        SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
        if (id != null) {
            try {
                Object exprType = this.visit(ctx.expression());
                if (id.type != (int) exprType) {
                    System.out.println("Tipos incompatibles para la asignación");
                }
            } catch (RuntimeException e) {
                System.out.println("Error de asignación");
            }
            idToken.decl = id.declCtx;
        } else
            System.out.println("\"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
        return null;
    }

    @Override
    public Object visitArrayAssign_State_AST(MiParserAS.ArrayAssign_State_ASTContext ctx) {
        this.visit(ctx.expression(0));
        this.visit(ctx.expression(1));
        return null;
    }

    @Override
    public Object visitPrintStat_State_AST(MiParserAS.PrintStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitIfStat_State_AST(MiParserAS.IfStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block(0));
        if (ctx.block(1) != null) {
            this.visit(ctx.block(1));
        }
        return null;
    }

    @Override
    public Object visitWhileStat_State_AST(MiParserAS.WhileStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitReturnStat_State_AST(MiParserAS.ReturnStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitFunctionStat_State_AST(MiParserAS.FunctionStat_State_ASTContext ctx) {
        this.visit(ctx.type());
        if (ctx.formalParams() != null) {
            this.visit(ctx.formalParams());
        }
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlock_State_AST(MiParserAS.Block_State_ASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlock_AST(MiParserAS.Block_ASTContext ctx) {
        table.openScope();
        for (MiParserAS.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        table.imprimir();
        table.closeScope();
        return null;
    }

    @Override
    public Object visitFormalParams_AST(MiParserAS.FormalParams_ASTContext ctx) {
        this.visit(ctx.formalParam(0));
        for (MiParserAS.FormalParamContext c : ctx.formalParam()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitFormalParam_AST(MiParserAS.FormalParam_ASTContext ctx) {
        this.visit(ctx.type());
        return null;
    }

    @Override
    public Object visitClassVarDecl_AST(MiParserAS.ClassVarDecl_ASTContext ctx) {
        this.visit(ctx.simpleType());
        if (ctx.expression() != null) {
            this.visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitSimpleT_T_AST(MiParserAS.SimpleT_T_ASTContext ctx) {
        return this.visit(ctx.simpleType());
    }

    @Override
    public Object visitArrayT_T_AST(MiParserAS.ArrayT_T_ASTContext ctx) {
        this.visit(ctx.simpleType());
        return null;
    }

    @Override
    public Object visitID_T_AST(MiParserAS.ID_T_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitSimpleType(MiParserAS.SimpleTypeContext ctx) {
        //debería verificar el tipo de dato que sea correcto y
        //retornar el entero equivalente a ese tipo de dato
        switch (ctx.getText()) {
            case "boolean":
                return 0; //0 representa tipo boolean
            case "char":
                return 1; //1 representa tipo char
            case "int":
                return 2; //2 representa tipo int
            case "string":
                return 3; //3 representa tipo string
            default:
                System.out.println(ctx.getText() + " no es un tipo de dato válido!!!");
                return null;
        }
    }

    @Override
    public Object visitExpression_AST(MiParserAS.Expression_ASTContext ctx) {
        //Hay que verificar conforme el operador si la operacion es correcta o no
        int exprType = -1;
        int exprType2 = -1;
        exprType = (int) this.visit(ctx.simpleExpression(0));
        for (int i = 1; i < ctx.simpleExpression().size(); i++) {
            this.visit(ctx.relationalOp(i - 1));
            exprType2 = (int) this.visit(ctx.simpleExpression(i));
            if (exprType != exprType2){
                System.err.println("Error: Tipos incompatibles.");
            }
        }
        return exprType;
    }

    @Override
    public Object visitSimpleExpre_AST(MiParserAS.SimpleExpre_ASTContext ctx) {
        this.visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            this.visit(ctx.additiveOp(i - 1));
            this.visit(ctx.term(i));
        }
        return null;
    }

    @Override
    public Object visitTerm_AST(MiParserAS.Term_ASTContext ctx) {
        //for (int i = 1; i < ctx.factor().size(); i++) {
        //    this.visit(ctx.multiplicativeOp(i - 1));
        //    this.visit(ctx.factor(i));
        //}
        return this.visit(ctx.factor(0));
    }

    @Override
    public Object visitLiteral_Fact_AST(MiParserAS.Literal_Fact_ASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdentifier_Fact_AST(MiParserAS.Identifier_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionCall_Fact_AST(MiParserAS.FunctionCall_Fact_ASTContext ctx) {
        if (ctx.actualParams() != null) {
            this.visit(ctx.actualParams());
        }
        return null;
    }

    @Override
    public Object visitArrayLookup_Fact_AST(MiParserAS.ArrayLookup_Fact_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayLen_Fact_AST(MiParserAS.ArrayLen_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitSubExpress_Fact_AST(MiParserAS.SubExpress_Fact_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayAllocExpress_Fact_AST(MiParserAS.ArrayAllocExpress_Fact_ASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitAllocExpress_Fact_AST(MiParserAS.AllocExpress_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitUnary_Fact_AST(MiParserAS.Unary_Fact_ASTContext ctx) {
        for (MiParserAS.ExpressionContext c : ctx.expression()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitActParams_AST(MiParserAS.ActParams_ASTContext ctx) {
        this.visit(ctx.expression(0));
        for (int i = 1; i < ctx.expression().size(); i++) {
            this.visit(ctx.expression(i));
        }
        return null;
    }

    @Override
    public Object visitRelationalOp(MiParserAS.RelationalOpContext ctx) {
        return null;
    }

    @Override
    public Object visitAdditiveOp(MiParserAS.AdditiveOpContext ctx) {
        return null;
    }

    @Override
    public Object visitMultiplicativeOp(MiParserAS.MultiplicativeOpContext ctx) {
        return null;
    }

    @Override
    public Object visitIntLit_Lit_AST(MiParserAS.IntLit_Lit_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitRealLit_Lit_AST(MiParserAS.RealLit_Lit_ASTContext ctx) {
        this.visit(ctx.realLiteral());
        return null;
    }

    @Override
    public Object visitBoolLit_Lit_AST(MiParserAS.BoolLit_Lit_ASTContext ctx) {
        this.visit(ctx.boolLiteral());
        return null;
    }

    @Override
    public Object visitStringLit_Lit_AST(MiParserAS.StringLit_Lit_ASTContext ctx) {
        for (MiParserAS.PrintableContext c : ctx.printable()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitDecPunt_RealLit_AST(MiParserAS.DecPunt_RealLit_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitDec_RealLit_AST(MiParserAS.Dec_RealLit_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitBoolLiteral(MiParserAS.BoolLiteralContext ctx) {
        return 0;
    }

    @Override
    public Object visitPrintable(MiParserAS.PrintableContext ctx) {
        return null;
    }

    @Override
    public Object visitId_Ident_AST(MiParserAS.Id_Ident_ASTContext ctx) {
        return ctx;
    }
}*/


package ContextualA;

import Generated.MiParserAS;
import Generated.MiParserASBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

public class ContextualAnalysis extends MiParserASBaseVisitor<Object> {

    public final SymbolsTable table;

    public ContextualAnalysis() {
        this.table = new SymbolsTable();
        this.table.insertar(new CommonToken(MiParserAS.ID, "print"), -1, null);
    }

    @Override
    public Object visitProgram_AST(MiParserAS.Program_ASTContext ctx) {
        for (MiParserAS.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        table.imprimir();
        return null;
    }

    @Override
    public Object visitVariableDecl_State_AST(MiParserAS.VariableDecl_State_ASTContext ctx) {
        Object attr = this.visit(ctx.type());
        if (attr != null) {
            MiParserAS.Id_Ident_ASTContext idToken = (MiParserAS.Id_Ident_ASTContext) this.visit(ctx.identifier());
            table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
            if (ctx.expression() != null) {
                SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
                if (id != null) {
                    try {
                        Object exprType = this.visit(ctx.expression());
                        if (id.type != (int) exprType) {
                            System.out.println("Tipos incompatibles para la asignación");
                        }
                    } catch (RuntimeException e) {
                        System.out.println("Error de asignación");
                    }
                    idToken.decl = id.declCtx;
                } else
                    System.out.println("\"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
            }
        }
        return null;
    }

    @Override
    public Object visitClassDecl_State_AST(MiParserAS.ClassDecl_State_ASTContext ctx) {
        for (MiParserAS.ClassVariableDeclarationContext c : ctx.classVariableDeclaration())
            this.visit(c);
        return null;
    }

    @Override
    public Object visitAssignment_State_AST(MiParserAS.Assignment_State_ASTContext ctx) {
        MiParserAS.Id_Ident_ASTContext idToken = (MiParserAS.Id_Ident_ASTContext) this.visit(ctx.identifier());
        SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
        if (id != null) {
            try {
                Object exprType = this.visit(ctx.expression());
                if (id.type != (int) exprType) {
                    System.out.println("Tipos incompatibles para la asignación");
                }
            } catch (RuntimeException e) {
                System.out.println("Error de asignación");
            }
            idToken.decl = id.declCtx;
        } else
            System.out.println("\"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
        return null;
    }

    @Override
    public Object visitArrayAssign_State_AST(MiParserAS.ArrayAssign_State_ASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.expression(0));
        this.visit(ctx.expression(1));
        return null;
    }

    @Override
    public Object visitPrintStat_State_AST(MiParserAS.PrintStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitIfStat_State_AST(MiParserAS.IfStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block(0));
        if (ctx.block(1) != null) {
            this.visit(ctx.block(1));
        }
        return null;
    }

    @Override
    public Object visitWhileStat_State_AST(MiParserAS.WhileStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitReturnStat_State_AST(MiParserAS.ReturnStat_State_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitFunctionStat_State_AST(MiParserAS.FunctionStat_State_ASTContext ctx) {
        this.visit(ctx.type());
        if (ctx.formalParams() != null) {
            this.visit(ctx.formalParams());
        }
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlock_State_AST(MiParserAS.Block_State_ASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlock_AST(MiParserAS.Block_ASTContext ctx) {
        for (MiParserAS.StatementContext c : ctx.statement())
            this.visit(c);
        return null;
    }

    @Override
    public Object visitFormalParams_AST(MiParserAS.FormalParams_ASTContext ctx) {
        this.visit(ctx.formalParam(0));
        for (int i = 1; i < ctx.formalParam().size(); i++) {
            this.visit(ctx.formalParam(i));
        }
        return null;
    }

    @Override
    public Object visitFormalParam_AST(MiParserAS.FormalParam_ASTContext ctx) {
        this.visit(ctx.type());
        return null;
    }

    @Override
    public Object visitClassVarDecl_AST(MiParserAS.ClassVarDecl_ASTContext ctx) {
        this.visit(ctx.simpleType());
        if (ctx.expression() != null) {
            this.visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitSimpleT_T_AST(MiParserAS.SimpleT_T_ASTContext ctx) {
        return this.visit(ctx.simpleType());
    }

    @Override
    public Object visitArrayT_T_AST(MiParserAS.ArrayT_T_ASTContext ctx) {
        this.visit(ctx.simpleType());
        return null;
    }

    @Override
    public Object visitID_T_AST(MiParserAS.ID_T_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitSimpleType(MiParserAS.SimpleTypeContext ctx) {
        //debería verificar el tipo de dato que sea correcto y
        //retornar el entero equivalente a ese tipo de dato
        switch (ctx.getText()) {
            case "boolean":
                return 0; //0 representa tipo boolean
            case "char":
                return 1; //1 representa tipo char
            case "int":
                return 2; //2 representa tipo int
            case "string":
                return 3; //3 representa tipo string
            default:
                System.out.println(ctx.getText() + " no es un tipo de dato válido!!!");
                return null;
        }
    }

    @Override
    public Object visitExpression_AST(MiParserAS.Expression_ASTContext ctx) {
        int val = (int) this.visit(ctx.simpleExpression(0));
        for (int i = 1; i < ctx.simpleExpression().size(); i++) {
            this.visit(ctx.relationalOp(i - 1));
            this.visit(ctx.simpleExpression(i));
        }
        return val;
    }

    @Override
    public Object visitSimpleExpre_AST(MiParserAS.SimpleExpre_ASTContext ctx) {
        int val = (int) this.visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            this.visit(ctx.additiveOp(i - 1));
            this.visit(ctx.term(i));
        }
        return val;
    }

    @Override
    public Object visitTerm_AST(MiParserAS.Term_ASTContext ctx) {
        int val = (int) this.visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            this.visit(ctx.multiplicativeOp(i - 1));
            this.visit(ctx.factor(i));
        }
        return val;
    }

    @Override
    public Object visitLiteral_Fact_AST(MiParserAS.Literal_Fact_ASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdentifier_Fact_AST(MiParserAS.Identifier_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitFunctionCall_Fact_AST(MiParserAS.FunctionCall_Fact_ASTContext ctx) {
        if (ctx.actualParams() != null) {
            this.visit(ctx.actualParams());
        }
        return null;
    }

    @Override
    public Object visitArrayLookup_Fact_AST(MiParserAS.ArrayLookup_Fact_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayLen_Fact_AST(MiParserAS.ArrayLen_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitSubExpress_Fact_AST(MiParserAS.SubExpress_Fact_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayAllocExpress_Fact_AST(MiParserAS.ArrayAllocExpress_Fact_ASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitAllocExpress_Fact_AST(MiParserAS.AllocExpress_Fact_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitUnary_Fact_AST(MiParserAS.Unary_Fact_ASTContext ctx) {
        for (MiParserAS.ExpressionContext c : ctx.expression())
            this.visit(c);
        return null;
    }

    @Override
    public Object visitActParams_AST(MiParserAS.ActParams_ASTContext ctx) {
        this.visit(ctx.expression(0));
        for (int i = 1; i < ctx.expression().size(); i++) {
            this.visit(ctx.expression(i));
        }
        return null;
    }

    @Override
    public Object visitRelationalOp(MiParserAS.RelationalOpContext ctx) {
        return null;
    }

    @Override
    public Object visitAdditiveOp(MiParserAS.AdditiveOpContext ctx) {
        return null;
    }

    @Override
    public Object visitMultiplicativeOp(MiParserAS.MultiplicativeOpContext ctx) {
        return null;
    }

    @Override
    public Object visitId_Ident_AST(MiParserAS.Id_Ident_ASTContext ctx) {
        return ctx;
    }

    @Override
    public Object visitIntLit_Lit_AST(MiParserAS.IntLit_Lit_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitCharLit_Lit_AST(MiParserAS.CharLit_Lit_ASTContext ctx) {
        return 1;
    }

    @Override
    public Object visitRealLit_Lit_AST(MiParserAS.RealLit_Lit_ASTContext ctx) {
        this.visit(ctx.realLiteral());
        return null;
    }

    @Override
    public Object visitBoolLit_Lit_AST(MiParserAS.BoolLit_Lit_ASTContext ctx) {
        return this.visit(ctx.boolLiteral());
    }

    @Override
    public Object visitStringLit_Lit_AST(MiParserAS.StringLit_Lit_ASTContext ctx) {
        for (MiParserAS.PrintableContext c : ctx.printable()) {
            this.visit(c);
        }
        return 3;
    }

    @Override
    public Object visitDecPunt_RealLit_AST(MiParserAS.DecPunt_RealLit_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitDec_RealLit_AST(MiParserAS.Dec_RealLit_ASTContext ctx) {
        return null;
    }

    @Override
    public Object visitBoolLiteral(MiParserAS.BoolLiteralContext ctx) {
        return 0;
    }

    @Override
    public Object visitPrintable(MiParserAS.PrintableContext ctx) {
        return null;
    }
}
