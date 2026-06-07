package ast;

public class Constant implements ASTNode{

    private Object value;

    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object execute() {
        return value;
    }
}
