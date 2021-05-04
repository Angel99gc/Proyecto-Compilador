lexer grammar MiScannerAS;

//omitir
WS  :   [ \t\n\r]+ -> skip ;

//símbolos
COMA    :   ',';
PyCOMA  :   ';';
POINT   :   '.';
CIZQ    :   '{';
CDER    :   '}';
PIZQ    :   '(';
PDER    :   ')';
PCIZQ   :   '[';
PCDER   :   ']';
EQUAL   :   '=';
SUM     :   '+';
SUB     :   '-';
MUL     :   '*';
DIV     :   '/';
LESS    :   '<';
GREATER :   '>';
EQEQ    :   '==';
EQEQD   :   '!=';
LESSTT  :   '<=';
GRETTT  :   '>=';
OR      :   '||';
AND     :   '&&';
SPACE   :   ' ';
EXCLA   :   '!';
QMARK   :   '"';
PAD     :   '#';
DSING   :   '$';
PORCEN  :   '%';
ET      :   '&';
QMARKS  :   '\'';
UNDSCR  :   '_';
DOSPUN  :   ':';
QUES    :   '?';
ATSING  :   '@';
BACKSL  :   '\\';
CACCENT :   '^';
SQMARKS :   '`';
VBAR    :   '|';
VIR     :   '~';

//palabras reservadas
WHILE   :   'while';
IF      :   'if' ;
ELSE    :   'else';
RETURN  :   'return';
PRINT   :   'print';
CLASS   :   'class';
BOOLEAN :   'boolean';
CHAR    :   'char';
INT     :   'int';
STRING  :   'string';
NEW     :   'new';
LENGTH  :   'length';
TRUE    :   'true';
FALSE   :   'false';

ID : (UNDSCR | LETTER) (UNDSCR | LETTER | DIGIT)* ;
NUM : DIGIT DIGIT* ;
CHARS : '\''CharContenido'\'';

fragment
CharContenido
   : CharInicial
   | DIGIT
   | UNDSCR
   | '\u00B7'
   | '\u0300'..'\u036F'
   | '\u203F'..'\u2040'
   ;

fragment
CharInicial
   : LETTER
   | '\u00C0'..'\u00D6'
   | '\u00D8'..'\u00F6'
   | '\u00F8'..'\u02FF'
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   ;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;