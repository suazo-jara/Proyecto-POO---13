import java.io.*;
import java.util.*;

public class Sala {
    private Hashtable<String, Paciente> pacientesPorRut;
    private int codigoGravedad; //del 1 al 3, representando las letras de la A a la C
    private String clave;
    private Paciente paciente;
    
    public Sala(){
        
    }
    
    public Sala(Paciente[] camilla, int codigoGravedad) {
        this.camilla = camilla;
        this.codigoGravedad = codigoGravedad;
    }

    public Paciente[] getCamilla() {
        return camilla;
    }

    public void setCamilla(Paciente[] camilla) {
        this.camilla = camilla;
    }

    public int getCodigoGravedad() {
        return codigoGravedad;
    }

    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    
    
    
    public void recolectarDatos(String clave){
    }
    
    public void recolectarDatos(Paciente paciente){
    }
    
    /*
    public void ingresarPaciente(BufferedReader lectura) throws IOException{
        int verificar = 0;
        System.out.println("Ingrese Nombre del paciente:");
        paciente.nombre = lectura.readLine();
        System.out.println("Ingrese apellido del paciente:");
        apellido = lectura.readLine();
        System.out.println("Ingrese rut del paciente:");
        rut = lectura.readLine();
        do{
            System.out.println("Seleecione la gravedad del paciente");
            System.out.println("1)Leve    2)Mediana    3)Grave");
            gravedad = Integer.parseInt(lectura.readLine());
            if(gravedad == 1 || gravedad == 2 || gravedad == 3){
                verificar +=1;
            }else{
                System.out.println("Ingrese un valor valido");
            }
        }while(verificar == 0);
        System.out.println("Ingrese la fecha de ingreso (formato DD-MM-AA:");
        fecha = lectura.readLine();
    }
    */
    
    
    //Muestra los pacientes
    public void mostrarPacientes(Paciente sala[],int capacidad){
        for(int i = 0;(capacidad + i) < 15;i++){
            System.out.println("-----------------------------");
            System.out.println("Nombre: " + sala[i].getNombre());
            System.out.println("Apellido: " + sala[i].getApellido());
            System.out.println("Rut: " + sala[i].getRut());
            System.out.println("Fecha de ingreso: " + sala[i].getFecha());
            System.out.print("Gravedad: " + sala[i].getGravedad());
            if(gravedad == 1){
                System.out.println("(Leve)");
            }
            if(gravedad == 2){
                System.out.println("((Mediana))");
            }
            if(gravedad == 3){
                System.out.println("((Grave)");
            }
            System.out.println("-----------------------------");
        }
    }
    
}
