import data.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<AbstractExpression> expressoes = new ArrayList<>();

        String formato = "DD-MM-YYYY";
        Context context = new Context(new Date(), formato);

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

        //Remover ultimo separador
        expressoes.removeLast();

        for (AbstractExpression expression : expressoes) {
            expression.interpret(context);
        }

        System.out.println(context.resultado);

    }
}