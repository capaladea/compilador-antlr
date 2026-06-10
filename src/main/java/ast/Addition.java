package ast;

import java.util.Map;

public class Addition implements ASTNode{

    private ASTNode operand1;
    private ASTNode operand2;


    public Addition(ASTNode operand1, ASTNode operand2) {
        this.operand2 = operand2;
        this.operand1 = operand1;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Obtenemos los valores reales, int o float indistintamente
        Object value01 = operand1.execute(symbolTable);
        Object value02 = operand2.execute(symbolTable);

        // si alguno es float, el resultado de la suma debe ser float
        if (value01 instanceof Float || value02 instanceof Float) {
            return ((Number) value01).floatValue() + ((Number) value02).floatValue();
        }

        // Si ninguno es float, asumimos que son enteros y devolvemos un Integer
        return ((Number) value01).intValue() + ((Number) value02).intValue();
    }
}
