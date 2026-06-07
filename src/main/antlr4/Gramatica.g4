// Gramatica
grammar Gramatica;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

    import ast.*;
}
@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

// GRAMATICA LIBRE DE CONTEXTO
program
        @init{
            List<ASTNode> body = new ArrayList<ASTNode>();
        }
        : PROGRAM ID BRACKET_OPEN
        (sentence { body.add($sentence.node); })*
        BRACKET_CLOSE
        {
            for(ASTNode n : body){
                n.execute();
           }
        };

sentence returns [ASTNode node]: println { $node = $println.node; } | conditional { $node = $conditional.node; };

println returns [ASTNode node]: PRINTLN expression SEMICOLON
        {$node = new Println($expression.node); };

conditional returns [ASTNode node]
            @init{
                List<ASTNode> body = new ArrayList<ASTNode>();
                List<ASTNode> elseBody = new ArrayList<ASTNode>();
            }
            : IF PAR_OPEN expression PAR_CLOSE
            BRACKET_OPEN (s1=sentence { body.add($s1.node); } )* BRACKET_CLOSE
            ELSE
            BRACKET_OPEN (s2=sentence {elseBody.add($s2.node); } )* BRACKET_CLOSE
            {
                $node = new If($expression.node, body, elseBody);
            };

expression returns [ASTNode node]:
        f1=factor { $node = $f1.node; }
                (PLUS f2=factor { $node = new Addition($node, $f2.node); } )*;

factor returns [ASTNode node]:
        t1=term { $node = $t1.node;}
                ( MULT t2=term { $node = new Multiplication($node, $t2.node); } )*;

term returns [ASTNode node]:
        NUMBER { $node = new Constant(Integer.parseInt($NUMBER.text)); }
        | BOOLEAN { $node = new Constant(Boolean.parseBoolean($BOOLEAN.text)); }
        | PAR_OPEN expression { $node = $expression.node; } PAR_CLOSE;

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
