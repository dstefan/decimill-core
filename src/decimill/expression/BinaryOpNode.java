package decimill.expression;

/**
 * @author David Stefan
 */
public abstract class BinaryOpNode extends OpNode {

    private ExprNode a;
    private ExprNode b;

    public BinaryOpNode(ExprNode a, ExprNode b) {
        this.a = a;
        this.b = b;
    }

    public ExprNode getA() {
        return a;
    }

    public void setA(ExprNode expr) {
        a = expr;
    }

    public void setB(ExprNode expr) {
        b = expr;
    }

    public ExprNode getB() {
        return b;
    }

    @Override
    public String toString() {

        String op;

        // Assign op string
        switch (this.getClass().getSimpleName()) {
            case "PlusNode":
                op = "+";
                break;
            case "MinusNode":
                op = "-";
                break;
            case "TimesNode":
                op = "*";
                break;
            case "DivNode":
                op = "/";
                break;
            case "PowNode":
                op = "^";
                break;
            default:
                op = "?";
        }

        return a + " " + op + " " + b;
    }
}
