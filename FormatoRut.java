

import java.util.regex.Pattern;


public interface FormatoRut {
    public static final Pattern PATRON_RUT = Pattern.compile("[0-9]{8}-[k-kK-K0-9]{1}");
    public static final String RUT = "Ingrese el rut del paciente, sin puntos y con guion";
    

    public boolean verificar(String rut);
}
