package ast;

import java.util.Map;

public class Equals implements ASTNode{

    private final ASTNode operand1;
    private final ASTNode operand2;

    public Equals(ASTNode operand1, ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        // Resolvemos el valor del lado izquierdo y derecho
        Object valorIzquierdo = this.operand1.execute(symbolTable);
        Object valorDerecho = this.operand2.execute(symbolTable);

        // Manejo de valores nulos
        if (valorIzquierdo == null && valorDerecho == null) {
            return true; // null == null es verdadero
        }
        if (valorIzquierdo == null || valorDerecho == null) {
            return false; // uno es nulo y el otro no, son distintos
        }

        // Validar que no se comparen tipos diferentes (por ejemplo String == Integer)
        if (!valorIzquierdo.getClass().equals(valorDerecho.getClass())) {
            throw new RuntimeException("Error de tipos: No se pueden comparar valores distinto tipo");
        }

        // Comparamos los valores reales y retornamos el booleano
        return valorIzquierdo.equals(valorDerecho);
    }
}
