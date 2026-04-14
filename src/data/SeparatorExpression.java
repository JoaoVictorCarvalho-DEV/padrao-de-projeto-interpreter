package data;

public class SeparatorExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        String formato = context.formato;
        context.formato = formato.replace(" ", "-");
    }
}
