package data;

import java.util.Date;

public class Context {
    public String formato;
    public String resultado = "";
    public Date data;

    public Context(Date data, String formato) {
        this.data = data;
        this.formato = formato;
        this.resultado = "";
    }

}
