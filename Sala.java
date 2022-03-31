import java.io.*;
import java.util.*;

public class Sala {
    
    private Map<String, Paciente> pacientes = new HashMap ();
    private int codigoGravedad;
    private String clave;
    private Paciente paciente;
    
    public Sala(){
        
    }

    public int getCodigoGravedad() {
        return codigoGravedad;
    }

    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    
    public void agregarASala(){
        pacientes.put(clave, paciente);
    }
    /*
    public void mostrarPaciente()
    {        //Mapa de pacientes leves
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            String key = recorrer.getKey();
            Paciente pacientes = recorrer.getValue();
            
            System.out.println("clave: " + key);
            System.out.println("-----------------------------");
            System.out.println("Nombre: " + pacientes.getNombre());
            System.out.println("Apellido: " + pacientes.getApellido());
            System.out.println("Rut: " + pacientes.getRut());
            System.out.println("Fecha de ingreso: " + pacientes.getFecha());
            System.out.print("Gravedad: " + pacientes.getGravedad());
            if(pacientes.getGravedad() == 1){
                System.out.println("(Leve)");
            }
            if(pacientes.getGravedad() == 2){
                System.out.println("(Mediana)");
            }
            if(pacientes.getGravedad() == 3){
                System.out.println("(Grave)");
            }
            System.out.println("-----------------------------");
            }
            System.out.println("-----------------------------");
    }
*/
    
    public void recolectarDatos(String clave){
        this.clave = clave;
    }
    
    public void recolectarDatos(Paciente paciente){
        this.paciente=paciente;
    }
    
}