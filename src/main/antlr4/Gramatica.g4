// Gramatica
grammar Gramatica;

// REGLAS SINTÁCTICAS (Empiezan con minúscula)
programa  : instruccion+ EOF ;

instruccion : asignacion ';' ;

asignacion  : ID '=' NUMERO ;

// REGLAS LÉXICAS / TOKENS (Empiezan con MAYÚSCULA)
ID      : [a-zA-Z]+ ;
NUMERO  : [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ; // Ignora espacios y saltos de línea