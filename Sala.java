import java.io.*;
import java.util.*;

public class Sala {
    
    private Map<String, Paciente> pacientes = new HashMap ();
    private int codigoGravedad;    
    
    public Sala(){
        
    }

    public int getCodigoGravedad() {
        return codigoGravedad;
    }

    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    
    public Map agregarASala(Paciente paciente){
        String clave;
        clave = paciente.getRut();
        pacientes.put(clave, paciente);
        //System.out.println("------clave  " + pacientes.get(clave).getNombre());
        return pacientes;
    }
    
    public void mostrar(){
        System.out.println("Cantidad de datos almacenados: " + pacientes.size());
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            String key = recorrer.getKey();
            Paciente pivot = recorrer.getValue();
            
            System.out.println("Clave: " + key + " Valor: " +  pacientes.get(key));
            System.out.println("-----------------------------");
            /*
            System.out.println("Nombre: " + pivot.getNombre());
            System.out.println("Apellido: " + pivot.getApellido());
            System.out.println("Rut: " + pivot.getRut());
            System.out.println("Fecha de ingreso: " + pivot.getFecha());
            System.out.print("Gravedad: " + pivot.getGravedad());
            if(pivot.getGravedad() == 1){
                System.out.println("(Leve)");
            }
            if(pivot.getGravedad() == 2){
                System.out.println("(Mediana)");
            }
            if(pivot.getGravedad() == 3){
                System.out.println("(Grave)");
            }
            System.out.println("-----------------------------");
            }
            System.out.println("-----------------------------");
            */
    }
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
}