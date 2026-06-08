package ast;

public class VarAssign implements ASTNode{

    private String name;
    private ASTNode expression;

    public VarAssign(String name, ASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public Object execute() {
        return null;
    }
}
