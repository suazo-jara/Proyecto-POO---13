import java.io.IOException;

public class ErrorGenericoException extends IOException{
    public ErrorGenericoException(){
        super("Ocurrió un error. El reporte no fue generado");
    }
}
