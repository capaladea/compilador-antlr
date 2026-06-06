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

sentence: var_decl | var_assign | println | conditional;

var_decl: VAR ID SEMICOLON
        {symbolTable.put($ID.text, 0);};

var_assign: ID ASSIGN expression SEMICOLON
        {symbolTable.put($ID.text, $expression.value);};

println: PRINTLN expression SEMICOLON
        {System.out.println($expression.value);};

conditional: IF PAR_OPEN expression PAR_CLOSE
            BRACKET_OPEN sentence* BRACKET_CLOSE
            ELSE
            BRACKET_OPEN sentence* BRACKET_CLOSE;

expression returns [Object value]:
        f1=factor { $value = (int)$f1.value; }
                (PLUS f2=factor { $value = (int)$value + (int)$f2.value; } )*;

factor returns [Object value]:
        t1=term { $value = (int)$t1.value; }
                ( MULT t2=term { $value = (int)$value * (int)$t2.value; } )*;

term returns[Object value]:
        NUMBER {$value = Integer.parseInt($NUMBER.text);}
        | ID {$value = symbolTable.get($ID.text);}
        | BOOLEAN {$value = Boolean.parseBoolean(BOOLEAN.text); }
        | PAR_OPEN expression { $value = $expression.value; } PAR_CLOSE;

// TOKENS PARA LAS PALABRAS RESERVADAS
PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

IF: 'if';
ELSE: 'else';

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

BOOLEAN: 'true' | 'false';

ID      : [a-zA-Z][a-zA-Z0-9_]*; // El primer bloque obliga a que empiece con letra, * porque después de esa letra puede no venir nada más

NUMBER  : [0-9]+; // necesita la menos un numero

WS      : [ \t\r\n]+ -> skip ; // Ignora espacios y saltos de línea
