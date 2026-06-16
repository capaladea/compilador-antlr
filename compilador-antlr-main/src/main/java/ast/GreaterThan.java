package ast;

import java.util.Map;

public class GreaterThan implements ASTNode{

    private final ASTNode leftNode;
    private final ASTNode rightNode;

    public GreaterThan(ASTNode leftNode, ASTNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object left = leftNode.execute(symbolTable);
        Object right = rightNode.execute(symbolTable);

        if (left instanceof Number && right instanceof Number) {
            // Convertir ambos a double para poder compararlos sin importar si son int, float, etc.
            double leftVal = ((Number) left).doubleValue();
            double rightVal = ((Number) right).doubleValue();

            // Retorna el booleano de la comparacion
            return leftVal > rightVal;
        }
        throw new RuntimeException("Error de tipos: No se pueden comparar " + left + " y " + right);
    }
}
