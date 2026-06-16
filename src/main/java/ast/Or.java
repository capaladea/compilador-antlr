package ast;

import java.util.Map;

public class Or implements ASTNode{

    private final ASTNode operand1;
    private final ASTNode operand2;

    public Or(ASTNode operand1, ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Evaluar el lado izquierdo primero
        Object valorIzquierdo = this.operand1.execute(symbolTable);

        // Validar que el lado izquierdo sea un booleano
        if (!(valorIzquierdo instanceof Boolean)) {
            throw new RuntimeException("Error de tipo: El operador 'OR' requiere un booleano a la izquierda.");
        }

        Boolean boolIzquierdo = (Boolean) valorIzquierdo;

        // Si el izquierdo es verdadero, el OR ya es verdadero.
        // Retornamos true inmediatamente y NO evaluamos el derecho.
        if (boolIzquierdo) {
            return true;
        }

        // Si el izquierdo fue falso, recién ahora evaluamos el lado derecho
        Object valorDerecho = this.operand2.execute(symbolTable);

        // Validar que el lado derecho también sea un booleano
        if (!(valorDerecho instanceof Boolean)) {
            throw new RuntimeException("Error de tipo: El operador 'OR' requiere un booleano a la derecha.");
        }

        Boolean boolDerecho = (Boolean) valorDerecho;

        // Si el izquierdo fue false, el resultado final depende totalmente del derecho
        return boolDerecho;
    }
}
