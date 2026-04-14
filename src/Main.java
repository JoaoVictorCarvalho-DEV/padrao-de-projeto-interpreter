import data.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractExpression> expressoes = new ArrayList<>();

        Context context = new Context(new Date());
        context.formato = "DD-MM-YYYY";

        String[] partes = context.formato.split("-");

        for (String parte : partes) {
            if (parte.equals("DD")) {
                expressoes.add(new DayExpression());
            } else if (parte.equals("MM")) {
                expressoes.add(new MonthExpression());
            } else if (parte.equals("YYYY")) {
                expressoes.add(new YearExpression());
            }

            expressoes.add(new SeparatorExpression());
        }

        // remove o último separador extra
        expressoes.remove(expressoes.size() - 1);

        for (AbstractExpression expression : expressoes) {
            expression.interpret(context);
        }

        System.out.println(context.formato);

    }
}