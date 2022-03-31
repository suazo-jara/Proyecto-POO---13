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
        
        int opcion;
        Paciente paciente=new Paciente();
        Sala sala = new Sala();
        
        ArrayList<Sala> habitaciones = new ArrayList();        
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
                lecturaDatosPaciente(lectura,paciente);
                sala.recolectarDatos(paciente);
                sala.recolectarDatos(paciente.getRut());
                if(paciente.getGravedad()==1){
                    sala.agregarASala1();
                    habitaciones.add(sala);
                }
                if(paciente.getGravedad()==2){
                    sala.agregarASala2();
                    habitaciones.add(sala);
                }
                if(paciente.getGravedad()==3){
                    sala.agregarASala3();
                    habitaciones.add(sala);
                }
            }
            
            //Opcion mostrar a los pacientes
            if(opcion == 4){
                sala.mostrarPaciente();
            }
        }while(verificar(opcion) == 1);
        
       
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
    
    public static void lecturaDatosPaciente(BufferedReader lectura,Paciente paciente) throws IOException{
        int verificar = 0,gravedad;
        String nombre, apellido, rut, fecha;
        
        System.out.println("Ingrese Nombre del paciente:");
        nombre = lectura.readLine();
        
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
        System.out.println("Ingrese la fecha de ingreso (formato DD-MM-AA):");
        fecha = lectura.readLine();
        
        paciente.ingresarPaciente(nombre, apellido, rut);
        paciente.ingresarPaciente(gravedad, fecha);
        
    }
}