package ast;

import java.util.Map;

public class Multiplication implements ASTNode{

    private ASTNode operand1;
    private ASTNode operand2;

    public Multiplication(ASTNode operand2, ASTNode operand1) {
        this.operand2 = operand2;
        this.operand1 = operand1;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return (int) operand1.execute(symbolTable) * (int)operand2.execute(symbolTable);
    }
}
