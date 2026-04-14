package data;

import java.util.Calendar;
import java.util.Objects;

public class MonthExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        Calendar calendar = Calendar.getInstance();
        String month = Objects.toString(calendar.get(Calendar.MONTH) + 1);
        context.resultado += month;
    }
}
