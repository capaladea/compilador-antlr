package ast;

import java.util.Map;

public class Negative implements ASTNode{

    private final ASTNode operand;

    public Negative(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Obtenemos el valor (se espera un número)
        Object valor = operand.execute(symbolTable);

        // Si el valor no es de tipo numerico levanta una excepcion
        if (!(valor instanceof Number)) {
            throw new RuntimeException("Error semántico: No se puede aplicar el operador '-' a un tipo no numérico.");
        }

        // Si es un entero, lo pasamos a entero negativo
        if (valor instanceof Integer) {
            return -(Integer) valor;
        }

        // Si es un float, lo pasamos a float negativo
        if (valor instanceof Float) {
            return -(Float) valor;
        }

        return null;
    }
}
