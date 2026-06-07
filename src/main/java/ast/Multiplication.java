package ast;

public class Multiplication implements ASTNode{

    private ASTNode operand1;
    private ASTNode operand2;

    public Multiplication(ASTNode operand2, ASTNode operand1) {
        this.operand2 = operand2;
        this.operand1 = operand1;
    }

    @Override
    public Object execute() {
        return (int) operand1.execute() * (int)operand2.execute();
    }
}
