package ast;

import java.util.Map;

public class Not implements ASTNode{

    private final ASTNode operand;

    public Not(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        Object aux_operand = this.operand.execute(symbolTable);

        // Comprueba el tipo
        if (aux_operand instanceof Boolean) {
            // Retorna la inversión
            return !(Boolean) aux_operand;
        }
        else { // falta manejo de excepcion
        }
        return null;
    }
}
