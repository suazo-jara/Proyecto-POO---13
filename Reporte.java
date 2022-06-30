import java.util.*;
import java.io.*;

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
            throw new ArchivoExistenteException();
            }
            
        }catch(ErrorGenericoException e){
        }
    }
}
