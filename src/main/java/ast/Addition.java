package ast;

import java.util.Map;

public class Addition implements ASTNode{

    private final ASTNode operand1;
    private final ASTNode operand2;


    public Addition(ASTNode operand1, ASTNode operand2) {
        this.operand2 = operand2;
        this.operand1 = operand1;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object value01 = operand1.execute(symbolTable);
        Object value02 = operand2.execute(symbolTable);

        // Si cualquiera es String, los concatena y retorna
        if (value01 instanceof String || value02 instanceof String) {
            return String.valueOf(value01) + String.valueOf(value02);
        }

        // Si alguno es float, el resultado de la suma debe ser float
        if (value01 instanceof Float || value02 instanceof Float) {
            return ((Number) value01).floatValue() + ((Number) value02).floatValue();
        }

        // Si ninguno es float ni String, asumimos que son enteros
        return ((Number) value01).intValue() + ((Number) value02).intValue();
    }
}
