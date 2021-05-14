package ContextualA;

import Generated.MiParserAS;
import Generated.MiParserASBaseVisitor;
import org.antlr.v4.runtime.CommonToken;

import java.util.ArrayList;

public class ContextualAnalysis extends MiParserASBaseVisitor<Object> {

    public final SymbolsTable table;
    private SymbolsTable.Ident idCurrent;
    public ArrayList<String> errorMsgs = new ArrayList<String>();

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
        return this.visit(ctx.arrayAssignment());
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
        return this.visit(ctx.whileStatement());
    }

    @Override
    public Object visitReturnStat_State_AST(MiParserAS.ReturnStat_State_ASTContext ctx) {
        return this.visit(ctx.returnStatement());
    }

    @Override
    public Object visitFunctionDecl_State_AST(MiParserAS.FunctionDecl_State_ASTContext ctx) {
        return this.visit(ctx.functionDeclaration());
    }

    @Override
    public Object visitBlock_State_AST(MiParserAS.Block_State_ASTContext ctx) {
        table.openScope();
        this.visit(ctx.block());
        table.imprimir();
        table.closeScope();
        return null;
    }

    @Override
    public Object visitBlock_AST(MiParserAS.Block_ASTContext ctx) {
        int result = -1;
        for (MiParserAS.StatementContext c : ctx.statement()) {
            Object resp = this.visit(c);
            if (resp != null) {
                result = (int) resp;
            }
        }
        return result;
    }

    @Override
    public Object visitFunctionDecl_AST(MiParserAS.FunctionDecl_ASTContext ctx) {
        if (ctx.VOID() != null) {
            MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
            SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
            if (id == null) {
                table.insertar(idToken.ID().getSymbol(), 4, ctx);
                id = table.buscar(idToken.ID().getText());
                if (ctx.formalParams() != null) {
                    this.visit(ctx.formalParams());
                }
                table.openScope();
                int valor = (int) this.visit(ctx.block());
                if (valor >= 10) {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La función no debe retornar '" + this.tipoDato(id.type) + ".");
                }
                id.declCtx = ctx;
                table.imprimir();
                table.closeScope();
            } else {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". El método '" + idToken.ID().getText() + "' ya ha sido declarado!!!");
            }
        } else {
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
                    int valor = (int) this.visit(ctx.block());
                    if (valor >= 10) {
                        if ((valor - 10) != (int) attr) {
                            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". El tipo de retorno '" + this.tipoDato((int) attr) + "' no coincide con el del método!!!!");
                        }
                    } else {
                        this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La función debe retornar " + this.tipoDato(id.type) + ".");
                    }

                    id.declCtx = ctx;
                    table.imprimir();
                    table.closeScope();
                } else {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". El método '" + idToken.ID().getText() + "' ya ha sido declarado!!!");
                }
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
        return ((int) this.visit(ctx.expression())) + 10;
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
                            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles para la asignación entre " + this.tipoDato(id.type) + " - " + this.tipoDato((int) exprType));
                        }
                    } catch (RuntimeException e) {
                        this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Error al asignar");
                    }
                    idToken.decl = id.declCtx;
                } else {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". '" + idToken.ID().getText() + "' no ha sido declarado!!!");
                }
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
                            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles para la asignación. " + this.tipoDato((int) attr) + " a " + this.tipoDato((int) exprType));
                        } else {
                            table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
                            id = table.buscar(idToken.ID().getText());
                            if (id != null) {
                                idToken.decl = id.declCtx;
                            } else {
                                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". \"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
                            }
                        }
                    } catch (RuntimeException e) {
                        this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Error al asignar");
                    }
                } else {
                    table.insertar(idToken.ID().getSymbol(), (int) attr, ctx);
                }
            } else {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La variable '" + idToken.ID().getText() + "' ya existe!!!");
            }
        } else {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". El tipo '" + ctx.type().getText() + "' no existe");
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
        MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
        SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
        if (id != null) {
            return id.type;
        } else {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". '" + idToken.ID().getText() + "' no ha sido declarado!!!");
            return -1;
        }
    }

    @Override
    public Object visitSimpleType(MiParserAS.SimpleTypeContext ctx) {
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
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". " + ctx.getText() + " no es un tipo de dato válido!!!");
                return -1;
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
            try {
                if (id.type != (int) exprType) {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles de " + this.tipoDato(id.type) + " - " + tipoDato((int) exprType) + ".");
                }
            } catch (RuntimeException e) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + " al asignar");
            }
            idToken.decl = id.declCtx;
        } else {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". '" + idToken.ID().getText() + "' no ha sido declarado!!!");
        }
        return null;
    }

    @Override
    public Object visitArrayAssign_AST(MiParserAS.ArrayAssign_ASTContext ctx) {
        MiParserAS.Identifier_ASTContext idToken = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier());
        SymbolsTable.Ident id = table.buscar(idToken.ID().getText());
        if (id != null) {
            int exprType = (int) this.visit(ctx.expression(0));
            if (exprType != 2) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ", para acceder al arreglo, solo se puede con tipos 'int', no " + this.tipoDato(exprType));
            }
            int exprType2 = (int) this.visit(ctx.expression(1));
            if (exprType != exprType2) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2));
            }
        } else {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + " \"" + idToken.ID().getText() + "\" no ha sido declarado!!!");
        }
        return -1;
    }

    @Override
    public Object visitExpression_AST(MiParserAS.Expression_ASTContext ctx) {
        int exprType = -1;
        int exprType2 = -1;
        exprType = (int) this.visit(ctx.simpleExpression(0));
        for (int i = 1; i < ctx.simpleExpression().size(); i++) {
            exprType2 = (int) this.visit(ctx.simpleExpression(i));
            if (exprType != exprType2) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2));
            } else {
                switch (exprType) {
                    case 0:
                    case 1:
                    case 3:
                        switch ((int) this.visit(ctx.relationalOp(i - 1))) {
                            case MiParserAS.EQEQ: // ==
                            case MiParserAS.EQEQD: // !=
                                exprType = 0;
                                continue;
                            default:
                                this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.relationalOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                                exprType = -1;
                        }
                    case 2:
                        switch ((int) this.visit(ctx.relationalOp(i - 1))) {
                            case MiParserAS.LESS: // <
                            case MiParserAS.GREATER: // >
                            case MiParserAS.EQEQ: // ==
                            case MiParserAS.EQEQD: // !=
                            case MiParserAS.LESSTT: // <=
                            case MiParserAS.GRETTT: // >=
                                exprType = 0;
                                continue;
                            default:
                                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La condicional " + ctx.relationalOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                                exprType = -1;
                        }
                    default:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". " + ctx.getText() + " no es un tipo de dato válido!!!");
                        exprType = -1;
                }
            }
        }
        return exprType;
    }

    @Override
    public Object visitSimpleExpre_AST(MiParserAS.SimpleExpre_ASTContext ctx) {
        int exprType = -1;
        int exprType2 = -1;
        exprType = (int) this.visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            exprType2 = (int) this.visit(ctx.term(i));
            if (exprType != exprType2) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2));
            } else {
                switch (exprType) {
                    case 0:
                        if ((int) this.visit(ctx.additiveOp(i - 1)) == MiParserAS.OR) { // or  **Si pero es redundante
                            continue;
                        } else {
                            this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.additiveOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                            exprType = -1;
                        }
                    case 1:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.additiveOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                        exprType = -1;
                    case 2:
                        switch ((int) this.visit(ctx.additiveOp(i - 1))) {
                            case MiParserAS.SUM: // + ***
                            case MiParserAS.SUB: // - ***
                                exprType = 2;
                                continue;
                            default:
                                this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.additiveOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                                exprType = -1;
                        }
                    case 3:
                        if ((int) this.visit(ctx.additiveOp(i - 1)) == MiParserAS.SUM) { // +
                            exprType = 3;
                            continue;
                        } else {
                            this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.additiveOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                            exprType = -1;
                        }
                    default:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". " + ctx.getText() + " no es un tipo de dato válido!!!");
                        exprType = -1;
                }
            }
        }
        return exprType;
    }

    @Override
    public Object visitTerm_AST(MiParserAS.Term_ASTContext ctx) {
        int exprType = -1;
        int exprType2 = -1;
        exprType = (int) this.visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            exprType2 = (int) this.visit(ctx.factor(i));
            if (exprType != exprType2) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Tipos incompatibles " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2));
            } else {
                switch (exprType) {
                    case 0:
                        if ((int) this.visit(ctx.multiplicativeOp(i - 1)) == MiParserAS.AND) { // &&  ****Si pero es redundante
                            continue;
                        } else {
                            this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.multiplicativeOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                            exprType = -1;
                        }
                    case 1:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.multiplicativeOp(i - 1).getText() + " no valida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                        exprType = -1;
                    case 2:
                        switch ((int) this.visit(ctx.multiplicativeOp(i - 1))) {
                            case MiParserAS.MUL: // *
                            case MiParserAS.DIV: // / DIVISION
                                exprType = 2;
                                continue;
                            default:
                                this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.multiplicativeOp(i - 1).getText() + " no válida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                                exprType = -1;
                        }
                    case 3:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". La condicional " + ctx.multiplicativeOp(i - 1).getText() + " no válida con " + this.tipoDato(exprType) + " - " + this.tipoDato(exprType2) + ".");
                        exprType = -1;
                    default:
                        this.errorMsgs.add("Error: line" + ctx.start.getLine() + ". " + ctx.getText() + " no es un tipo de dato válido!!!");
                        exprType = -1;
                }
            }
        }
        return exprType;
    }

    @Override
    public Object visitLiteral_Fact_AST(MiParserAS.Literal_Fact_ASTContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdentifier_Fact_AST(MiParserAS.Identifier_Fact_ASTContext ctx) {
        MiParserAS.Identifier_ASTContext idContext = (MiParserAS.Identifier_ASTContext) this.visit(ctx.identifier(0));
        SymbolsTable.Ident id = table.buscar(idContext.getText());
        if (id == null) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + " '" + idContext.getText() + "' no ha sido declarado!!!");
        } else {
            idContext.decl = id.declCtx;
            if (ctx.identifier(1) != null) {
                this.visit(ctx.identifier(1));
            }
            return id.type;
        }
        return -1;
    }

    @Override
    public Object visitFunctionCall_Fact_AST(MiParserAS.FunctionCall_Fact_ASTContext ctx) {
        return this.visit(ctx.functionCall());
    }

    @Override
    public Object visitArrayLookup_Fact_AST(MiParserAS.ArrayLookup_Fact_ASTContext ctx) {
        return this.visit(ctx.arrayLookup());
    }

    @Override
    public Object visitArrayLen_Fact_AST(MiParserAS.ArrayLen_Fact_ASTContext ctx) {
        this.visit(ctx.arrayLength());
        return null;
    }

    @Override
    public Object visitSubExpress_Fact_AST(MiParserAS.SubExpress_Fact_ASTContext ctx) {
        return this.visit(ctx.subExpression());
    }

    @Override
    public Object visitArrayAllocExpress_Fact_AST(MiParserAS.ArrayAllocExpress_Fact_ASTContext ctx) {
        return this.visit(ctx.arrayAllocationExpression());
    }

    @Override
    public Object visitAllocExpress_Fact_AST(MiParserAS.AllocExpress_Fact_ASTContext ctx) {
        return this.visit(ctx.allocationExpression());
    }

    @Override
    public Object visitUnary_Fact_AST(MiParserAS.Unary_Fact_ASTContext ctx) {
        return this.visit(ctx.unary());
    }

    @Override
    public Object visitUnary_AST(MiParserAS.Unary_ASTContext ctx) {
        int exprType = -1;
        for (MiParserAS.ExpressionContext c : ctx.expression()) {
            exprType = (int) this.visit(c);
            if (ctx.SUM() != null) {
                if (exprType != 2) {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La expresión '" + ctx.SUM().getText() + "' no válida con " + this.tipoDato(exprType) + ".");
                }
            } else if (ctx.SUB() != null) {
                if (exprType != 2) {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La expresión '" + ctx.SUB().getText() + "' no válida con " + this.tipoDato(exprType) + ".");
                }
            } else if (ctx.EXCLA() != null) {
                if (exprType != 0) {
                    this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La expresión '" + ctx.EXCLA().getText() + "' no válida con " + this.tipoDato(exprType) + ".");
                }
            }
        }
        return exprType;
    }

    @Override
    public Object visitAllocExpress_AST(MiParserAS.AllocExpress_ASTContext ctx) {
        SymbolsTable.Ident id = table.buscar(ctx.identifier().getText());
        if (id == null) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". La clase '" + ctx.identifier().getText() + "' no ha sido creada.");
            return -1;
        }
        idCurrent = id;
        return id.type;
    }

    @Override
    public Object visitArrayAllocExpress_AST(MiParserAS.ArrayAllocExpress_ASTContext ctx) {
        int exprType = (int) this.visit(ctx.simpleType());
        int exprType2 = (int) this.visit(ctx.expression());
        if (exprType2 != 2) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". Para indicar el tamaño del arreglo, solo se permite con 'int' no " + this.tipoDato(exprType2) + ".");
        }
        return exprType;
    }

    @Override
    public Object visitSubExpress_AST(MiParserAS.SubExpress_ASTContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCall_AST(MiParserAS.FunctionCall_ASTContext ctx) {
        this.idCurrent = table.buscar(ctx.identifier().getText());
        if (this.idCurrent == null) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". '" + ctx.identifier().getText() + "' no es un método declarado!!!");
            return null;
        } else {
            this.visit((ctx).actualParams());
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
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ".  cantidad de parámetros diferentes a la declaración");
        }
        for (int i = 0; i < b.cantParams; i++) {
            int val1 = (int) visit(ctx.expression(i));
            MiParserAS.FormalParam_ASTContext c = (MiParserAS.FormalParam_ASTContext) b.formalParam(i);
            SymbolsTable.Ident val2 = table.buscar(c.identifier().getText());
            if (val1 != val2.type) {
                this.errorMsgs.add("Error: line " + ctx.start.getLine() + ". El parámetro " + i + " del método en la línea " + ctx.start.getLine() + ", no coicide con la declaración!!!!");
            }
        }
        return 0;
    }

    @Override
    public Object visitArrayLookup_AST(MiParserAS.ArrayLookup_ASTContext ctx) {
        SymbolsTable.Ident id = table.buscar(ctx.identifier().getText());
        if (id == null) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ", la variable '" + ctx.identifier().getText() + "' no ha sido creada.");
            return -1;
        }
        int exprType2 = (int) this.visit(ctx.expression());
        if (exprType2 != 2) {
            this.errorMsgs.add("Error: line " + ctx.start.getLine() + ", para indicar el tamaño del arreglo, solo se permite con 'int' no " + this.tipoDato(exprType2) + ".");
            return -1;
        }
        return id.type;
    }

    @Override
    public Object visitArrayLen_AST(MiParserAS.ArrayLen_ASTContext ctx) {
        return 2;
    }

    @Override
    public Object visitRelationalOp(MiParserAS.RelationalOpContext ctx) {
        return ctx.getStart().getType();
    }

    @Override
    public Object visitAdditiveOp(MiParserAS.AdditiveOpContext ctx) {
        return ctx.getStart().getType();
    }

    @Override
    public Object visitMultiplicativeOp(MiParserAS.MultiplicativeOpContext ctx) {
        return ctx.getStart().getType();
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

    private String tipoDato(int type) {
        switch (type) {
            case 0:
                return "'boolean'";
            case 1:
                return "'char'";
            case 2:
                return "'int'";
            case 3:
                return "'string'";
        }
        return "'tipo inválido'";
    }
}
