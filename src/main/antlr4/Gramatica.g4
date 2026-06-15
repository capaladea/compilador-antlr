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
                n.execute(symbolTable);
           }
        };

sentence returns [ASTNode node]:
            println { $node = $println.node; }
            | conditional { $node = $conditional.node; }  // if-else
            | var_decl { $node = $var_decl.node; } // declaracion de variables
            | var_assign { $node = $var_assign.node; }; // asignacion de variables

println returns [ASTNode node]: PRINTLN expression SEMICOLON
        {$node = new Println($expression.node); };

// Reglas para estructuras de control

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

//*********************************
// do while


//*********************************

// Reglas para declaracion y asignacion de variables

var_decl returns [ASTNode node]:
    VAR ID SEMICOLON { $node = new VarDecl($ID.text); };

var_assign returns [ASTNode node]:
    ID ASSIGN expression SEMICOLON { $node = new VarAssign($ID.text, $expression.node); };

// Reglas sobre operadores

// NIVEL LÓGICO OR (El tope de la gramática)
expression returns [ASTNode node]:
    a1=andExpr { $node = $a1.node; } ;
    // (
     // OR a2=andExpr { $node = new Or($node, $a2.node); }
    // )*;

// NIVEL LÓGICO AND
andExpr returns [ASTNode node]:
    c1=comparisonExpr { $node = $c1.node; } ;
    // (
     // AND c2=comparisonExpr { $node = new And($node, $c2.node); }
    // )*;

// NIVEL RELACIONAL / COMPARADORES (==, >, <, >=, <=)
comparisonExpr returns [ASTNode node]:
    e1=arithmeticExpr { $node = $e1.node; } ;
    // (
        // EQ  e2=arithmeticExpr { $node = new Equals($node, $e2.node); }
        // | GT  e2=arithmeticExpr { $node = new GreaterThan($node, $e2.node); }
        // | LT  e2=arithmeticExpr { $node = new LessThan($node, $e2.node); }
        // | GEQ e2=arithmeticExpr { $node = new GreaterOrEqual($node, $e2.node); }
        // | LEQ e2=arithmeticExpr { $node = new LessOrEqual($node, $e2.node); }
        // | NEQ e2=arithmeticExpr { $node = new NotEquals($node, $e2.node); }
    // )*;

// NIVEL ARITMÉTICO: SUMA Y RESTA
arithmeticExpr returns [ASTNode node]:
    f1=multiplicativeExpr { $node = $f1.node; }
    (
        PLUS  f2=multiplicativeExpr { $node = new Addition($node, $f2.node); }
        // | MINUS f2=multiplicativeExpr { $node = new Subtraction($node, $f2.node); }
    )*;

// NIVEL ARITMÉTICO: MULTIPLICACIÓN Y DIVISIÓN
multiplicativeExpr returns [ASTNode node]:
    u1=unaryExpr { $node = $u1.node; }
    (
        MULT b2=unaryExpr { $node = new Multiplication($node, $b2.node); }
        // | DIV  b2=unaryExpr { $node = new Division($node, $b2.node); }
    )*;

// NUEVA REGLA UNARIA: Para el NOT (!)
unaryExpr returns [ASTNode node]:
    // NOT u=unaryExpr { $node = new Not($u.node); }
    // | MINUS u=unaryExpr { $node = new Negative($u.node); } // <-- El número negativo (Unario)
    | t=term { $node = $t.node; } ;

term returns [ASTNode node]:
        INT { $node = new Constant(Integer.parseInt($INT.text)); }
        | FLOAT { $node = new Constant(Float.parseFloat($FLOAT.text)); }
        | BOOLEAN { $node = new Constant(Boolean.parseBoolean($BOOLEAN.text)); }
        | STRING { // Le quitamos las comillas iniciales y finales al texto antes de guardarlo
                    String texto = $STRING.text;
                    texto = texto.substring(1, texto.length() - 1);
                    $node = new Constant(texto); }
        | ID { $node = new VarRef($ID.text); }
        | PAR_OPEN expression { $node = $expression.node; } PAR_CLOSE;

// Fin reglas

// TOKENS PARA LAS PALABRAS RESERVADAS
PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

IF: 'if';
ELSE: 'else';

// **********************************
// Do-While solicitado por la catedra
// **********************************
DO: 'do';
WHILE: 'while';
// **********************************

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

// Tipo Entero
INT  : [0-9]+; // necesita la menos un numero

// Tipo float, acepta 3.14, .5 y 42.
FLOAT   : [0-9]+ '.' [0-9]*
        | '.' [0-9]+;

// Tipo String
STRING : '"' (~["\\\r\n'] | '\\' .)* '"' ;

WS      : [ \t\r\n]+ -> skip ; // Ignora espacios y saltos de línea