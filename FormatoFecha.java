

import java.util.regex.Pattern;

public interface FormatoFecha {
        public static final Pattern PATRON_FECHA=Pattern.compile("[0-9]{2}-[0-9]{2}-[0-9]{4}");
    
    public boolean esFecha(String fecha);
}
