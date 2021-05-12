parser grammar MiParserAS;

options {
	tokenVocab = MiScannerAS;
}

program                         :   (statement)* EOF                                            #Program_AST;

statement                       :   variableDeclaration PyCOMA                                  #VariableDecl_State_AST
                                |   classDeclaration PyCOMA                                     #ClassDecl_State_AST
                                |   assignment PyCOMA                                           #Assignment_State_AST
	                            |   arrayAssignment PyCOMA                                      #ArrayAssign_State_AST
                                |   printStatement PyCOMA                                       #PrintStat_State_AST
                                |   ifStatement                                                 #IfStat_State_AST
                                |   whileStatement                                              #WhileStat_State_AST
                                |   returnStatement PyCOMA                                      #ReturnStat_State_AST
                                |   functionDeclaration                                         #FunctionDecl_State_AST
                                |   block                                                       #Block_State_AST;

block                           :   CIZQ (statement)* CDER                                      #Block_AST;

functionDeclaration
                locals [ParserRuleContext decl=null]
                                :   type identifier PIZQ (formalParams)? PDER block             #FunctionDecl_AST;

formalParams    locals [int cantParams=0]
                                :   formalParam (COMA formalParam)*                             #FormalParams_AST;

formalParam                     :   type identifier                                             #FormalParam_AST;

whileStatement                  :   WHILE PIZQ expression PDER block                            #WhileStat_AST;

ifStatement                     :   IF PIZQ expression PDER block (ELSE block)?                 #IfStat_AST;

returnStatement                 :   RETURN expression                                           #ReturnStat_AST;

printStatement                  :   PRINT expression                                            #PrintStat_AST;

classDeclaration
                locals [ParserRuleContext decl=null]
                                :   CLASS identifier CIZQ (classVariableDeclaration)* CDER      #ClassDecl_AST;

classVariableDeclaration        :   simpleType identifier (EQUAL expression)? PyCOMA            #ClassVarDecl_AST;

variableDeclaration             :   type identifier (EQUAL expression)?                         #VariableDecl_AST;

type                            :   simpleType                                                  #SimpleType_T_AST
                                |   arrayType                                                   #ArrayType_T_AST
                                |   identifier                                                  #Ident_T_AST;

simpleType                      :   BOOLEAN
	                            |   CHAR
	                            |   INT
	                            |   STRING                                                      #SimpleType_AST;

arrayType                       :   simpleType PCIZQ PCDER                                      #ArrayType_AST;

assignment                      :   identifier (POINT identifier)? EQUAL expression             #Assignment_AST;

arrayAssignment                 :   identifier PCIZQ expression PCDER EQUAL expression          #ArrayAssign_AST;

expression                      :   simpleExpression (relationalOp simpleExpression)*           #Expression_AST;

simpleExpression                :   term (additiveOp term)*                                     #SimpleExpre_AST;

term                            :   factor (multiplicativeOp factor)*                           #Term_AST;

factor                          :   literal                                                     #Literal_Fact_AST
                                |   identifier (POINT identifier)?                              #Identifier_Fact_AST
                                |   functionCall                                                #FunctionCall_Fact_AST
                                |   arrayLookup                                                 #ArrayLookup_Fact_AST
                                |   arrayLength                                                 #ArrayLen_Fact_AST
                                |   subExpression                                               #SubExpress_Fact_AST
                                |   arrayAllocationExpression                                   #ArrayAllocExpress_Fact_AST
                                |   allocationExpression                                        #AllocExpress_Fact_AST
                                |   unary                                                       #Unary_Fact_AST;

unary                           :   (SUM | SUB | EXCLA ) (expression)*                          #Unary_AST;

allocationExpression            :   NEW identifier PIZQ PDER                                    #AllocExpress_AST;

arrayAllocationExpression       :   NEW simpleType PCIZQ expression PCDER                       #ArrayAllocExpress_AST;

subExpression                   :   PIZQ expression PDER                                        #SubExpress_AST;

functionCall
                locals [ParserRuleContext decl=null]
                                :   identifier PIZQ (actualParams)? PDER                        #FunctionCall_AST;

actualParams
                locals [int cantParams=0]
                                :   expression (COMA expression)*                               #ActParams_AST;

arrayLookup                     :   identifier PCIZQ expression PCDER                           #ArrayLookup_AST;

arrayLength                     :   identifier POINT LENGTH                                     #ArrayLen_AST;

relationalOp                    :   LESS
                                |   GREATER
                                |   EQEQ
                                |   EQEQD
                                |   LESSTT
                                |   GRETTT                                                      #BlockRelat_AST;

additiveOp                      :   SUM
                                |   SUB
                                |   OR                                                          #BlockAddi_AST;

multiplicativeOp                :   MUL
                                |   DIV
                                |   AND                                                         #BlockMult_AST;

identifier
                locals [ParserRuleContext decl=null]
                                :   ID                                                          #Identifier_AST;

literal                         :   intLiteral                                                  #IntLiteral_Lit_AST
                                |   realLiteral                                                 #RealLiteral_Lit_AST
                                |   charLiteral                                                 #CharLiteral_Lit_AST
                                |   boolLiteral                                                 #BoolLiteral_Lit_AST
                                |   stringLiteral                                               #StringLiteral_Lit_AST;

intLiteral                      :   NUM                                                         #IntLiteral_AST;

realLiteral                     :   (NUM)? POINT NUM                                            #RealLiteral_AST;

charLiteral                     :   CHARS                                                       #CharsLiteral_AST;

boolLiteral                     :   TRUE
                                |   FALSE                                                       #BoolLiteral_AST;

stringLiteral                   :   QMARK (printable)* QMARK                                    #StringLiteral_AST;

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
                                |   VIR                                                         #BlockPrintTable_AST;

