import java.io.*;
import java.util.*;

public class Sala {
    
    private Map<String, Paciente> pacientesLeves = new HashMap ();
    private Map<String, Paciente> pacientesMediana = new HashMap ();
    private Map<String, Paciente> pacientesGrave = new HashMap ();
    private int codigoGravedad; //del 1 al 3, representando las letras de la A a la C
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
    
    public void agregarASala1(){
        pacientesLeves.put(clave, paciente);
    }
    public void agregarASala2(){
        pacientesMediana.put(clave, paciente);
    }
    public void agregarASala3(){
        pacientesGrave.put(clave, paciente);
    }
    public void mostrarPaciente()
    {        //Mapa de pacientes leves
        for(Map.Entry<String,Paciente> recorrer : pacientesLeves.entrySet()){
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
        //Mapa de pacientes mediana
        for(Map.Entry<String,Paciente> recorrer : pacientesMediana.entrySet()){
            String key = recorrer.getKey();
            Paciente pacientes = recorrer.getValue();
            
            System.out.println("clave " + key);
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
        //Mapa de pacientes graves
        for(Map.Entry<String,Paciente> recorrer : pacientesGrave.entrySet()){
            String key = recorrer.getKey();
            Paciente pacientes = recorrer.getValue();
            
            System.out.println("clave " + key);
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
    }
    
    public void recolectarDatos(String clave){
        this.clave = clave;
    }
    
    public void recolectarDatos(Paciente paciente){
        this.paciente=paciente;
    }
    
}