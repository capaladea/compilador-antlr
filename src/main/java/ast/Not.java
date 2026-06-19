package ast;

import java.util.Map;

public class Not implements ASTNode {

    private final ASTNode operand;

    public Not(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Obtiene el operando
        Object aux_operand = this.operand.execute(symbolTable);

        // Comprueba si el tipo es booleano
        if (aux_operand instanceof Boolean) {
            return !(Boolean) aux_operand;
        } else {
            // Lanzamos una RuntimeException si el tipo no es compatible
            throw new RuntimeException("Error de tipo: El operador recibido no es de tipo booleano");
        }
    }
}
