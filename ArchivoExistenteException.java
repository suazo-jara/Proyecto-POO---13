import java.io.*;

public class ArchivoExistenteException extends IOException{
    public ArchivoExistenteException(){
        super("El archivo ya existe. El reporte no fue generado.");
    }
}