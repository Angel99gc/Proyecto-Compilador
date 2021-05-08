parser grammar MiParserAS;

options {
	tokenVocab = MiScannerAS;
}

program                         :   (statement)*                                                    #Program_AST;
statement                       :   type identifier (EQUAL expression)? PyCOMA                              #VariableDecl_State_AST
                                |   CLASS ID CIZQ (classVariableDeclaration)* CDER PyCOMA           #ClassDecl_State_AST
                                |   identifier (POINT ID)? EQUAL expression PyCOMA                  #Assignment_State_AST
	                            |   identifier PCIZQ expression PCDER EQUAL expression PyCOMA       #ArrayAssign_State_AST
                                |   PRINT expression PyCOMA                                         #PrintStat_State_AST
                                |   IF PIZQ expression PDER block (ELSE block)?                     #IfStat_State_AST
                                |   WHILE PIZQ expression PDER block                                #WhileStat_State_AST
                                |   RETURN expression PyCOMA                                        #ReturnStat_State_AST
                                |   type ID PIZQ (formalParams)? PDER block                         #FunctionStat_State_AST
                                |   block                                                           #Block_State_AST;
block                           :   CIZQ (statement)* CDER                                          #Block_AST;
formalParams                    :   formalParam (COMA formalParam)*                                 #FormalParams_AST;
formalParam                     :   type ID                                                         #FormalParam_AST;
classVariableDeclaration        :   simpleType ID (EQUAL expression)? PyCOMA                        #ClassVarDecl_AST;
type                            :   simpleType                                                      #SimpleT_T_AST
                                |   simpleType PCIZQ PCDER                                          #ArrayT_T_AST
                                |   ID                                                              #ID_T_AST;
simpleType                      :   BOOLEAN
	                            |   CHAR
	                            |   INT
	                            |   STRING                                                          #Block_SimpleType_AST;
expression                      :   simpleExpression (relationalOp simpleExpression)*               #Expression_AST;
simpleExpression                :   term (additiveOp term)*                                         #SimpleExpre_AST;
term                            :   factor (multiplicativeOp factor)*                               #Term_AST;
factor                          :   literal                                                         #Literal_Fact_AST
                                |   ID (POINT ID)?                                                  #Identifier_Fact_AST
                                |   ID PIZQ (actualParams)? PDER                                    #FunctionCall_Fact_AST
                                |   ID PCIZQ expression PCDER                                       #ArrayLookup_Fact_AST
                                |   ID POINT LENGTH                                                 #ArrayLen_Fact_AST
                                |   PIZQ expression PDER                                            #SubExpress_Fact_AST
                                |   NEW simpleType PCIZQ expression PCDER                           #ArrayAllocExpress_Fact_AST
                                |   NEW ID  PIZQ PDER                                               #AllocExpress_Fact_AST
                                |   (SUM | SUB | EXCLA ) (expression)*                              #Unary_Fact_AST;
actualParams                    :   expression (COMA expression)*                                   #ActParams_AST;
relationalOp                    :   LESS
                                |   GREATER
                                |   EQEQ
                                |   EQEQD
                                |   LESSTT
                                |   GRETTT                                                          #BlockRelat_AST;
additiveOp                      :   SUM
                                |   SUB
                                |   OR                                                              #BlockAddi_AST;
multiplicativeOp                :   MUL
                                |   DIV
                                |   AND                                                             #BlockMult_AST;
identifier
        locals [ParserRuleContext decl=null]
                                : ID                                                                #Id_Ident_AST;
literal                         :   NUM                                                             #IntLit_Lit_AST
                                |   CHARS                                                           #CharLit_Lit_AST
                                |   realLiteral                                                     #RealLit_Lit_AST
                                |   boolLiteral                                                     #BoolLit_Lit_AST
                                |   QMARK (printable)* QMARK                                        #StringLit_Lit_AST;
realLiteral                     :   NUM POINT NUM                                                   #DecPunt_RealLit_AST
                                |   POINT NUM                                                       #Dec_RealLit_AST;
boolLiteral                     :   TRUE
                                |   FALSE                                                           #BlockBoolLit_AST;
printable                       :   NUM
                                |   ID
                                |   SPACE
                                |   EXCLA
                                |   QMARK
                                |   PAD
                                |   DSING
                                |   PORCEN
                                |   ET
                                |   QMARKS
                                |   PIZQ
                                |   PDER
                                |   MUL
                                |   SUM
                                |   COMA
                                |   SUB
                                |   POINT
                                |   DIV
                                |   DOSPUN
                                |   PyCOMA
                                |   LESS
                                |   EQUAL
                                |   GREATER
                                |   QUES
                                |   ATSING
                                |   PCIZQ
                                |   BACKSL
                                |   PCDER
                                |   CACCENT
                                |   UNDSCR
                                |   SQMARKS
                                |   CIZQ
                                |   VBAR
                                |   CDER
                                |   VIR                                                             #BlockPrintTable_AST;
