package ast;

import java.util.Map;

public class Negative implements ASTNode{

    private final ASTNode operand;

    public Negative(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Evaluamos el nodo hijo para obtener el número
        Object valor = operand.execute(symbolTable);

        // Si es un entero, lo pasamos a negativo
        if (valor instanceof Integer) {
            return -(Integer) valor;
        }

        // 3. Si es un float, lo pasamos a negativo
        if (valor instanceof Float) {
            return -(Float) valor;
        }

        // 4. Si intentan meter un String o un Booleano adentro del menos...
        //throw new RuntimeException("Error semántico: No se puede aplicar el operador '-' a un tipo no numérico.");
        return null;
    }
}
