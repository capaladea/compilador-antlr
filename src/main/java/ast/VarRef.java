package ast;

public class VarRef implements ASTNode{

    private String name;

    public VarRef(String name) {
        this.name = name;
    }

    @Override
    public Object execute() {
        return null;
    }
}
