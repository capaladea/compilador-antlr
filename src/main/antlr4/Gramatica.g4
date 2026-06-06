// Gramatica
grammar Gramatica;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}
@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

// GRAMATICA LIBRE DE CONTEXTO
program: PROGRAM ID BRACKET_OPEN
        sentence*
        BRACKET_CLOSE;

sentence: var_decl | var_assign | println;

var_decl: VAR ID SEMICOLON
        {symbolTable.put($ID.text, 0);};
var_assign: ID ASSIGN expression SEMICOLON
        {symbolTable.put($ID.text, $expression.value);};
println: PRINTLN expression SEMICOLON
        {System.out.println($expression.value);};
expression returns [Object value]:
        NUMBER {$value = Integer.parseInt($NUMBER.text);}
        |
        ID {$value = symbolTable.get($ID.text);};

// TOKENS PARA LAS PALABRAS RESERVADAS
PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

// TOKENS PARA IDENTIFICADORES
ID      : [a-zA-Z][a-zA-Z0-9_]*; // El primer bloque obliga a que empiece con letra, * porque después de esa letra puede no venir nada más

NUMBER  : [0-9]+; // necesita la menos un numero

WS      : [ \t\r\n]+ -> skip ; // Ignora espacios y saltos de línea
