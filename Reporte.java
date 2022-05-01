
import java.util.*;
import java.io.*;

/**
 *
 * @author Cristian Suazo Jara
 */

public class Reporte {
    private File archivo;
    private FileWriter escritor;
    
    public void escribirReporte(ArrayList<Sala> salas, BufferedReader lector) throws IOException{
        System.out.println("Ingrese el nombre del archivo reporte: ");
        archivo = new File(lector.readLine()+".txt");
        
        try{
            if (archivo.createNewFile()) {
                escritor = new FileWriter(archivo.getName());
                for (int i = 0; i < salas.size(); i++){
                        escritor.write("S A L A  " + (i + 1) +"\n");
                        salas.get(i).reportarPacientes(escritor);
                        escritor.write("\n");
                }
                escritor.close();
                System.out.println("Reporte exitosamente generado en el archivo "+ archivo.getName());
            }else{
            System.out.println("El archivo ya existe.");
            System.out.println("El reporte no fue generado.");
            }
            
        }catch(IOException e){
            System.out.println("Ocurrió un error.");
            System.out.println("El reporte no fue generado.");
            e.printStackTrace(System.out);
        }
    }
}
