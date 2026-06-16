package ast;

import java.util.Map;

public class And implements ASTNode{

    private final ASTNode operand1;
    private final ASTNode operand2;

    public And(ASTNode operand1, ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Evaluar el lado izquierdo primero
        Object valorIzquierdo = this.operand1.execute(symbolTable);

        // Validar que el lado izquierdo sea realmente un booleano
        if (!(valorIzquierdo instanceof Boolean)) {
            throw new RuntimeException("Error de tipo: El operador 'AND' requiere un booleano a la izquierda.");
        }

        Boolean boolIzquierdo = (Boolean) valorIzquierdo;

        // Si el izquierdo es falso, no evaluamos el derecho y retornamos false inmediatamente.
        if (!boolIzquierdo) {
            return false;
        }

        // Si el izquierdo fue verdadero, recién ahora evaluamos el lado derecho
        Object valorDerecho = this.operand2.execute(symbolTable);

        // Validar que el lado derecho también sea un booleano
        if (!(valorDerecho instanceof Boolean)) {
            throw new RuntimeException("Error de tipo: El operador 'AND' requiere un booleano a la derecha.");
        }

        Boolean boolDerecho = (Boolean) valorDerecho;

        // Si llegamos acá, el izquierdo era true, así que el resultado depende enteramente del derecho
        return boolDerecho;
    }
}
