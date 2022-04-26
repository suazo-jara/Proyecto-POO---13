import java.io.*;
import java.util.*;

public class Sala {
    
    private HashMap<String, Paciente> pacientes = new HashMap ();
    private int codigoGravedad;    
    // Sobrecarga de constructores
    public Sala(){
        
    }
    public Sala(int gravedad){
        this.codigoGravedad = gravedad;
        pacientes = new HashMap();
    }
    public int getCodigoGravedad() {
        return codigoGravedad;
    }
    //Sobrecarga metodo setter par al codigoGravedad
    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    public void setCodigoGravedad(short codigoGravedad){
        this.codigoGravedad = codigoGravedad;
    }
    public void agregarPaciente(Paciente paciente){
        String clave;
        clave = paciente.getRut();
        pacientes.put(clave, paciente);
        //System.out.println("------clave  " + pacientes.get(clave).getNombre());
    }
    
    public void mostrarPacientes(){
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            /*
            String key = recorrer.getKey();
            System.out.println("Clave: " + key + " Valor: " +  pacientes.get(key));
            System.out.println("-----------------------------");
            */
            System.out.println("Nombre: " + pivot.getNombre());
            System.out.println("Apellido: " + pivot.getApellido());
            System.out.println("RUT: " + pivot.getRut());
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
    }
    public Paciente eliminarPaciente(String clave){
    Paciente pp;
    pp = null;
        if(pacientes.containsKey(clave)){
           pp=pacientes.remove(clave); 
           return pp;
        }
        return pp;
    }
    public void mostrarSalas(){
        System.out.println("Cantidad de pacientes: " + pacientes.size());
        System.out.println("-----------------------------");
    }
}