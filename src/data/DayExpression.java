package data;

import java.util.Calendar;
import java.util.Objects;

public class DayExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        String formato = context.formato;

        Calendar calendar = Calendar.getInstance();

        String day = Objects.toString(calendar.get(Calendar.DAY_OF_MONTH));
        context.formato = formato.replace("DD", day);
    }
}
