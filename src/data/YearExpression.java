package data;

import java.util.Calendar;
import java.util.Objects;

public class YearExpression implements AbstractExpression{
    @Override
    public void interpret(Context context) {
        String formato = context.formato;

        Calendar calendar = Calendar.getInstance();

        String year = Objects.toString(calendar.get(Calendar.YEAR));
        context.formato = formato.replace("YYYY", year);
    }
}
