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
    
    public String mostrarPacientes(){
        String texto = "";
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            texto+= pivot.mostrarPaciente()+ "\n-------------------------------\n";
        } 
        return texto;
    }
    
    public void reportarPacientes(FileWriter escritor) throws IOException{
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            
            escritor.write("Nombre: " + pivot.getNombre()+"\n");
            escritor.write("Apellido: " + pivot.getApellido()+"\n");
            escritor.write("RUT: " + pivot.getRut()+"\n");
            escritor.write("Año de nacimiento: " + pivot.getAnioNacimiento()+"\n");
            escritor.write("Fecha de ingreso: " + pivot.getFecha()+"\n");
            escritor.write("Gravedad: " + pivot.getGravedad());
            if(pivot.getGravedad() == 1){
                escritor.write(" (Leve)"+"\n");
            }
            if(pivot.getGravedad() == 2){
                escritor.write(" (Mediana)"+"\n");
            }
            if(pivot.getGravedad() == 3){
                escritor.write(" (Grave)"+"\n");
            }
            escritor.write("-----------------------------"+"\n");
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
    public void menoresDeEdad(){
        String cadena;
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si es menor de edad
            if(pivot.esMenor()){
                //Muestra datos de la persona
                
                cadena = pivot.mostrarPaciente();
                
                System.out.println(cadena + "\n-----------------------------"); 
            }
        }     
    }
    public void mostrarSalas(){
        System.out.println("Cantidad de pacientes: " + pacientes.size());
        System.out.println("-----------------------------");
    }
    
    public void menorDeEdad(){
        int edad = 100000;
        Paciente copia = new Paciente();
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si la edad es mayor a la persona
            if (pivot.calcularEdad() < edad){
                //Actualiza edad y cambia a persona mas joven
                edad = pivot.calcularEdad();
                copia = pivot;
            }
        } 
        //Si no hay personas muestra el mensaje
        if(copia.getNombre() == null){
            System.out.println("No se encuentran pacientes registrados");
        }else{
            String cadena;
            //Muestra datos de persona mas joven
            cadena = copia.mostrarPaciente();
            System.out.println(cadena);
        }
    }
    
    public void mayorDeEdad(){
        int edad = 0;
        Paciente copia = new Paciente();
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si edad es menor a la persona
            if (pivot.calcularEdad() > edad){
                edad = pivot.calcularEdad();
                copia = pivot;
            }
        } 
        //Si no hay personas muestra el mensaje
        if(copia.getNombre() == null){
            System.out.println("No se encuentran pacientes registrados");
        }else{
            String cadena;
            //Muestra datos de persona mas mayor
            cadena = copia.mostrarPaciente();
            System.out.println(cadena);
        }
    }
    
    public Paciente buscarPaciente(String rut, int gravedad){
        if(pacientes.containsKey(rut)){
           Paciente paciente = pacientes.get(rut);
           Paciente paciente2 = new Paciente(paciente.getNombre(),paciente.getApellido(),paciente.getRut(),paciente.getAnioNacimiento(),gravedad,paciente.getFecha());
           return paciente2;
        }
        return null;
    }
}