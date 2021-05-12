package ContextualA;

import Generated.MiParserAS;
import Generated.MiParserASBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

public class ContextualAnalysis extends MiParserASBaseVisitor<Object> {

    public final SymbolsTable table;
    private SymbolsTable.Ident idCurrent;

    public ContextualAnalysis() {
        this.table = new SymbolsTable();
        this.table.insertar(new CommonToken(MiParserAS.ID, "print"), -1, null);
    }

    @Override
    public Object visitProgram_AST(MiParserAS.Program_ASTContext ctx) {
        table.openScope();
        for (MiParserAS.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        table.imprimir();
        table.closeScope();
        return null;
    }

    @Override
    public Object visitVariableDecl_State_AST(MiParserAS.VariableDecl_State_ASTContext ctx) {
        this.visit(ctx.variableDeclaration());
        return null;
    }

    @Override
    public Object visitClassDecl_State_AST(MiParserAS.ClassDecl_State_ASTContext ctx) {
        this.visit(ctx.classDeclaration());
        return null;
    }

    @Override
    public Object visitAssignment_State_AST(MiParserAS.Assignment_State_ASTContext ctx) {
        this.visit(ctx.assignment());
        return null;
    }

    @Override
    public Object visitArrayAssign_State_AST(MiParserAS.ArrayAssign_State_ASTContext ctx) {
        this.visit(ctx.arrayAssignment());
        return null;
    }

    @Override
    public Object visitPrintStat_State_AST(MiParserAS.PrintStat_State_ASTContext ctx) {
        this.visit(ctx.printStatement());
        return null;
    }

    @Override
    public Object visitIfStat_State_AST(MiParserAS.IfStat_State_ASTContext ctx) {
        this.visit(ctx.ifStatement());
        return null;
    }

    @Override
    public Object visitWhileStat_State_AST(MiParserAS.WhileStat_State_ASTContext ctx) {
        this.visit(ctx.whileStatement());
        return null;
    }

    @Override
    public Object visitReturnStat_State_AST(MiParserAS.ReturnStat_State_ASTContext ctx) {
        return this.visit(ctx.returnStatement());
    }

    @Override
    public Object visitFunctionDecl_State_AST(MiParserAS.FunctionDecl_State_ASTContext ctx) {
        this.visit(ctx.functionDeclaration());
        return null;
    }

    @Override
    public Object visitBlock_State_AST(MiParserAS.Block_State_ASTContext ctx) {
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitBlock_AST(MiParserAS.Block_ASTContext ctx) {
        for (MiParserAS.StatementContext c : ctx.statement()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitFunctionDecl_AST(MiParserAS.FunctionDecl_ASTContext ctx) {
        Object attr = this.visit(ctx.type());
        if (attr != null) {
            MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
            SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
            if (id == null) {
                table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
                id = table.buscar(idToken.ID().getText());
                if (ctx.formalParams() != null) {
                    this.visit(ctx.formalParams());
                }
                table.openScope();
                this.visit(ctx.block());
                id.declCtx = ctx;
                table.imprimir();
                table.closeScope();
            } else {
                System.err.println("El método " + idToken.ID().getText() + " ya ha sido declarado!!!");
            }
        }
        return null;
    }

    @Override
    public Object visitFormalParams_AST(MiParserAS.FormalParams_ASTContext ctx) {
        ctx.cantParams = ctx.formalParam().size();
        for (MiParserAS.FormalParamContext c : ctx.formalParam()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitFormalParam_AST(MiParserAS.FormalParam_ASTContext ctx) {
        Object attr = this.visit(ctx.type());
        if (attr != null) {
            MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
            table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
            return attr;
        }
        return null;
    }

    @Override
    public Object visitWhileStat_AST(MiParserAS.WhileStat_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block());
        return null;
    }

    @Override
    public Object visitIfStat_AST(MiParserAS.IfStat_ASTContext ctx) {
        this.visit(ctx.expression());
        this.visit(ctx.block(0));
        if (ctx.block(1) != null) {
            this.visit(ctx.block(1));
        }
        return null;
    }

    @Override
    public Object visitReturnStat_AST(MiParserAS.ReturnStat_ASTContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Object visitPrintStat_AST(MiParserAS.PrintStat_ASTContext ctx) {
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitClassDecl_AST(MiParserAS.ClassDecl_ASTContext ctx) {
        MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
        table.insertar(idToken.ID().getSymbol(), 5, ctx);
        table.openScope();
        for (MiParserAS.ClassVariableDeclarationContext c : ctx.classVariableDeclaration()) {
            this.visit(c);
        }
        table.imprimir();
        table.closeScope();
        return null;
    }

    @Override
    public Object visitClassVarDecl_AST(MiParserAS.ClassVarDecl_ASTContext ctx) {
        Object attr = this.visit(ctx.simpleType());
        if (attr != null) {
            MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
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
    public Object visitVariableDecl_AST(MiParserAS.VariableDecl_ASTContext ctx) {
        Object attr = this.visit(ctx.type());
        if (attr != null) {
            MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
            SymbolsTable.Ident id = table.buscar(idToken.ID().getText(), (int) attr);
            if (id == null) {
                if (ctx.expression() != null) {
                    try {
                        Object exprType = this.visit(ctx.expression());
                        if ((int) attr != (int) exprType) {
                            System.out.println("Tipos incompatibles para la asignación");
                        } else {
                            table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
                            id = table.buscar(idToken.ID().getText());
                            if (id != null) {
                                idToken.decl = id.declCtx;
                            } else {
                                System.out.println("\"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
                            }
                        }
                    } catch (RuntimeException e) {
                        System.out.println("Error de asignación");
                    }
                } else {
                    table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
                }
            } else {
                System.out.println("La variable " + idToken.ID().getText() + " ya existe!!!");
            }
        } else {
            System.out.println("No existe ese tipo");
        }
        return null;
    }

    @Override
    public Object visitSimpleType_T_AST(MiParserAS.SimpleType_T_ASTContext ctx) {
        return this.visit(ctx.simpleType());
    }

    @Override
    public Object visitArrayType_T_AST(MiParserAS.ArrayType_T_ASTContext ctx) {
        return this.visit(ctx.arrayType());
    }

    @Override
    public Object visitIdent_T_AST(MiParserAS.Ident_T_ASTContext ctx) {
        this.visit(ctx.identifier());
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
    public Object visitArrayType_AST(MiParserAS.ArrayType_ASTContext ctx) {
        return this.visit(ctx.simpleType());
    }

    @Override
    public Object visitAssignment_AST(MiParserAS.Assignment_ASTContext ctx) {
        MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier(0));
        Object exprType = this.visit(ctx.expression());
        SymbolsTable.Ident id = table.buscar(idToken.ID().getText(), (int) exprType);
        if (id != null) {
            //FALTA EL OTRO ID
            try {
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
    public Object visitArrayAssign_AST(MiParserAS.ArrayAssign_ASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.expression(0));
        this.visit(ctx.expression(1));
        return null;
    }

    @Override
    public Object visitExpression_AST(MiParserAS.Expression_ASTContext ctx) {
        //Hay que verificar conforme el operador si la operacion es correcta o no
        int exprType = -1;
        int exprType2 = -1;
        exprType = (int) this.visit(ctx.simpleExpression(0));
        for (int i = 1; i < ctx.simpleExpression().size(); i++) {
            exprType2 = (int) this.visit(ctx.simpleExpression(i));
            if (exprType != exprType2) {
                System.out.println("Error tipos incompatibles");
            } else {
                switch (exprType) {
                    case 0:
                        return 0; //0 representa tipo boolean
                    case 1:
                        return 1; //1 representa tipo char
                    case 2:
                        switch ((int) this.visit(ctx.relationalOp(i - 1))) {
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                                continue;
                            default:
                                System.err.println("Condicional no valida con enteros.");
                        }
                        return 2; //2 representa tipo int
                    case 3:
                        return 3; //3 representa tipo string
                    default:
                        System.out.println(ctx.getText() + " no es un tipo de dato válido!!!");
                        return null;
                }
            }
        }
        return exprType;
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
        /*MiParser.IdentASTContext idContext = (MiParser.IdentASTContext) this.visit(ctx.ident());
        SymbolsTable.Ident id = tabla.buscar(idContext.getText());
        if (id == null) {
            System.out.println("\"" + idContext.getText() + "\" no ha sido declarado!!!");
            throw new RuntimeException();
        }
        idContext.decl = id.declCtx;
        return id.type;*/

        this.visit(ctx.identifier(0));
        if (ctx.identifier(1) != null) {
            this.visit(ctx.identifier(1));
        }
        return null;
    }

    @Override
    public Object visitFunctionCall_Fact_AST(MiParserAS.FunctionCall_Fact_ASTContext ctx) {
        return this.visit(ctx.functionCall());
    }

    @Override
    public Object visitArrayLookup_Fact_AST(MiParserAS.ArrayLookup_Fact_ASTContext ctx) {
        this.visit(ctx.arrayLookup());
        return null;
    }

    @Override
    public Object visitArrayLen_Fact_AST(MiParserAS.ArrayLen_Fact_ASTContext ctx) {
        this.visit(ctx.arrayLength());
        return null;
    }

    @Override
    public Object visitSubExpress_Fact_AST(MiParserAS.SubExpress_Fact_ASTContext ctx) {
        this.visit(ctx.subExpression());
        return null;
    }

    @Override
    public Object visitArrayAllocExpress_Fact_AST(MiParserAS.ArrayAllocExpress_Fact_ASTContext ctx) {
        this.visit(ctx.arrayAllocationExpression());
        return null;
    }

    @Override
    public Object visitAllocExpress_Fact_AST(MiParserAS.AllocExpress_Fact_ASTContext ctx) {
        this.visit(ctx.allocationExpression());
        return null;
    }

    @Override
    public Object visitUnary_Fact_AST(MiParserAS.Unary_Fact_ASTContext ctx) {
        return this.visit(ctx.unary());
    }

    @Override
    public Object visitUnary_AST(MiParserAS.Unary_ASTContext ctx) {
        for (MiParserAS.ExpressionContext c : ctx.expression()) {
            this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitAllocExpress_AST(MiParserAS.AllocExpress_ASTContext ctx) {
        this.visit(ctx.identifier());
        return null;
    }

    @Override
    public Object visitArrayAllocExpress_AST(MiParserAS.ArrayAllocExpress_ASTContext ctx) {
        this.visit(ctx.simpleType());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitSubExpress_AST(MiParserAS.SubExpress_ASTContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCall_AST(MiParserAS.FunctionCall_ASTContext ctx) {
        this.idCurrent = table.buscar(ctx.identifier().getText());
        if (this.idCurrent == null) {
            System.out.println("\"" + ctx.identifier().getText() + "\" no es un método declarado!!!");
            //throw new RuntimeException();
            return null;
        } else {

            this.visit((ctx).actualParams());
            //verificar que la cantidad de parametro y el tipo de los mismos concuerdan

            ctx.decl = this.idCurrent.declCtx;
            return this.idCurrent.type;
        }
    }

    @Override
    public Object visitActParams_AST(MiParserAS.ActParams_ASTContext ctx) {
        MiParserAS.FunctionDecl_ASTContext a = ((MiParserAS.FunctionDecl_ASTContext) this.idCurrent.declCtx);
        MiParserAS.FormalParams_ASTContext b = (MiParserAS.FormalParams_ASTContext) a.formalParams();
        ctx.cantParams = ctx.expression().size();
        if (ctx.cantParams != b.cantParams) {
            System.out.println("Error, cantidad de parametros diferentes a la declaracion");
            return null;
        } else {
            for (int i = 0; i < ctx.expression().size(); i++) {
                int val1 = (int) visit(ctx.expression(i));
                MiParserAS.FormalParam_ASTContext c = (MiParserAS.FormalParam_ASTContext) b.formalParam(i);
                Object x = c.identifier().getText();
                SymbolsTable.Ident val2 = table.buscar(c.identifier().getText());
                if (val1 != val2.type) {
                    System.out.println("No coiciden!!!!");
                }
            }
        }
        return 0;
    }

    @Override
    public Object visitArrayLookup_AST(MiParserAS.ArrayLookup_ASTContext ctx) {
        this.visit(ctx.identifier());
        this.visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitArrayLen_AST(MiParserAS.ArrayLen_ASTContext ctx) {
        this.visit(ctx.identifier());
        return null;
    }

    @Override
    public Object visitRelationalOp(MiParserAS.RelationalOpContext ctx) {
        return ctx.getStart().getType();
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
    public Object visitIdentifier_AST(MiParserAS.Identifier_ASTContext ctx) {
        return ctx;
    }

    @Override
    public Object visitIntLiteral_Lit_AST(MiParserAS.IntLiteral_Lit_ASTContext ctx) {
        return this.visit(ctx.intLiteral());
    }

    @Override
    public Object visitRealLiteral_Lit_AST(MiParserAS.RealLiteral_Lit_ASTContext ctx) {
        return this.visit(ctx.realLiteral());
    }

    @Override
    public Object visitCharLiteral_Lit_AST(MiParserAS.CharLiteral_Lit_ASTContext ctx) {
        return this.visit(ctx.charLiteral());
    }

    @Override
    public Object visitBoolLiteral_Lit_AST(MiParserAS.BoolLiteral_Lit_ASTContext ctx) {
        return this.visit(ctx.boolLiteral());
    }

    @Override
    public Object visitStringLiteral_Lit_AST(MiParserAS.StringLiteral_Lit_ASTContext ctx) {
        return this.visit(ctx.stringLiteral());
    }

    @Override
    public Object visitIntLiteral_AST(MiParserAS.IntLiteral_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitRealLiteral_AST(MiParserAS.RealLiteral_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitCharsLiteral_AST(MiParserAS.CharsLiteral_ASTContext ctx) {
        return 1;
    }

    @Override
    public Object visitBoolLiteral(MiParserAS.BoolLiteralContext ctx) {
        return 0;
    }

    @Override
    public Object visitStringLiteral_AST(MiParserAS.StringLiteral_ASTContext ctx) {
        for (MiParserAS.PrintableContext c : ctx.printable()) {
            this.visit(c);
        }
        return 3;
    }

    @Override
    public Object visitPrintable(MiParserAS.PrintableContext ctx) {
        return null;
    }
}
