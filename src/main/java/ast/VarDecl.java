package ast;

public class VarDecl implements ASTNode{

    private String name;

    public VarDecl(String name) {
        this.name = name;
    }

    @Override
    public Object execute() {
        return null;
    }
}
