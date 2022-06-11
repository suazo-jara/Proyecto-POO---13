import java.io.*;
import java.util.*;
/**
 *
 * @author kevin
 */
public class Hospital {
    private ArrayList<Sala> salas = new ArrayList();
    private Reporte reporte;
    private Paciente paciente = new Paciente(null,null,null,0,0,null);
    
    //Crea salas
    public void crearSalas(ArrayList salas){
       
        for (int i = 0; i < 3; i++){
            Sala sala = new Sala(i+1);
            salas.add(sala);
        }
    }
    
    //Retorna lista de salas
    public ArrayList<Sala> getSalas(){
        return salas;
    }
}

