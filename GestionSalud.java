/*
 * @author Kevin Meza Toro
 * @author José Olguín Bustamante
 * @author Cristian Suazo Jara
 */
import java.io.*;
import java.util.*;

public class GestionSalud {
    
    public static void main(String[] args) throws IOException{
        //Instanciar variables
        BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<Sala> salas;
        
        /*
        int opcion, capacidad = 15;
        Paciente paciente=new Paciente();
        Paciente sala[] = new Paciente[capacidad];
        
        for(int i = 0; i<15;i++){
            sala[i] = new Paciente();
        }
        
        //Ciclo para mostrar menu con sus opciones
        do{
            opcion = 9;
            do{
                //Muestra menu hasta que ingrese una opcion valida
                menu();
                opcion = Integer.parseInt(lectura.readLine());
            }while(verificar(opcion) == 0);
            
            if(opcion == 1){
                //Se guardan los datos del paciente
                paciente.ingresarPaciente(lectura);
                //Agrega los pacientes a la sala
                //agregarASala(paciente,sala,capacidad);
                //Disminuye en uno la capacidad 
                capacidad--;

            }
            
            //Opcion mostrar a los pacientes
            if(opcion == 4){
                //Si hay capacidad 15, significa que todavía no se ingresa ningun paciente
                if(capacidad == 15){
                    System.out.println("Todavía no se ingresa ningun paciente");
                }
                paciente.mostrarPacientes(sala,capacidad);
            }
        }while(verificar(opcion) == 1);
        
     */   
    }
    
    public static void menu(){
        //Muestra menu
        System.out.println("Bienvenido al sistema de gestion de camillas");     
        System.out.println("Elija una opción:");
        System.out.println("1) Agregar paciente");
        System.out.println("2) Liberar paciente");
        System.out.println("3) Ver estado de gravedad de paciente");
        System.out.println("4) Mostrar pacientes");
        System.out.println("0) Salir");
    }
    
    public static int verificar(int opcion){
        //Termina el programa
        if(opcion == 0){
            System.exit(0);
        }
        //Opciones validas
        if(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4){
            return 1;
        }else{
            System.out.println("Elija una opcion valida");
            return 0;
        }
    }
    /*
    public static void agregarASala(Paciente paciente,Paciente sala[],int capacidad){ 
        //Recorre el arreglo hasta que encuentre una posicion vacia
        for(int i = 0; i<15;i++){
            if(sala[i].getGravedad() == 0 ){
                sala[i].setNombre(paciente.getNombre());
                sala[i].setApellido(paciente.getApellido());
                sala[i].setGravedad(paciente.getGravedad());
                sala[i].setRut(paciente.getRut());
                sala[i].setFecha(paciente.getFecha());
                System.out.println("----PACIENTE AGREGADO----");
                break;
            }
        }
        //No quedan mas camas para agregar a pacientes
        if(capacidad == 0){
            System.out.println("No quedan mas camas");
        }
    } */
}
