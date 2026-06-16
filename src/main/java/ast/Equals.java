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
        // Resolvemos el valor del lado izquierdo (puede ser una variable, un número, etc.)
        Object valorIzquierdo = this.operand1.execute(symbolTable);

        // Resolvemos el valor del lado derecho
        Object valorDerecho = this.operand2.execute(symbolTable);

        // Manejo de nulos para evitar un NullPointerException
        if (valorIzquierdo == null && valorDerecho == null) {
            return true; // null == null es verdadero
        }
        if (valorIzquierdo == null || valorDerecho == null) {
            return false; // uno es nulo y el otro no, son distintos
        }

        // Comparamos los valores reales y retornamos el booleano
        return valorIzquierdo.equals(valorDerecho);
    }
}
