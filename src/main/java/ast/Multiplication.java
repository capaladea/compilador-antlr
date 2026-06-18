package ast;

import java.util.Map;

public class Multiplication implements ASTNode{

    private final ASTNode operand1;
    private final ASTNode operand2;

    public Multiplication(ASTNode operand1, ASTNode operand2) {
        this.operand2 = operand2;
        this.operand1 = operand1;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Validar que los operandos no sean nulos en sí mismos (defensa previa)
        if (operand1 == null || operand2 == null) {
            throw new RuntimeException("Error de ejecución: Los operandos no pueden ser nulos.");
        }

        Object value01 = operand1.execute(symbolTable);
        Object value02 = operand2.execute(symbolTable);

        // Controlar valores nulos resultantes de la ejecución
        if (value01 == null || value02 == null) {
            throw new RuntimeException("Error de ejecución: Intento de operar con un valor nulo (Variable no definida).");
        }

        // Validar que AMBOS operandos sean numéricos antes de continuar
        if (!(value01 instanceof Number) || !(value02 instanceof Number)) {
            throw new RuntimeException("Error de tipos: No se puede aplicar el operador '*' a los tipos dados");
        }

        // Si alguno es float, el resultado de la multiplicacion debe ser float
        if (value01 instanceof Float || value02 instanceof Float) {
            return ((Number) value01).floatValue() * ((Number) value02).floatValue();
        }

        // Si ninguno es float, asumimos que son enteros
        return ((Number) value01).intValue() * ((Number) value02).intValue();
    }
}
