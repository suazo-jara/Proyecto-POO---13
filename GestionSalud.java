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
        ArrayList<Sala> salas = new ArrayList();
        for (int i = 0; i < 3; i++){
            Sala sala = new Sala();
            salas.add(sala);
        }
        Paciente paciente = new Paciente();
        
        //Ciclo para mostrar menu con sus opciones
        do{
            //Muestra menu hasta que ingrese una opcion valida
            menu();
            switch(Integer.parseInt(lectura.readLine())){
                case 1: {
                    //Se leen los datos del paciente
                    leerPaciente(lectura, paciente);
                    //Se agregan pacientes a sala según gravedad
                    salas.get(paciente.getGravedad() - 1).agregarPaciente(paciente);
                    //Prepara variable para el próximo paciente a ingresar
                    paciente = new Paciente();
                }
                break;
                /*
                case 2: darDeAlta();
                break;
                case 3: estadoDeGravedad();
                break;
                */
                case 4: 
                    for (int i = 0; i < 3; i++){
                        salas.get(i).mostrarPacientes();
                    }
                break; 
                
                case 5: 
                break;
                
                
                case 6:
                break;
                
                case 0: salir();
                break;
                default: System.out.println("Opción inválida. Intente nuevamente.");
                break;
            }
        }while(1 > 0);
        }
    
    public static void menu(){
        //Muestra menu
        System.out.println();     
        System.out.println("Elija una opción:");
        System.out.println("1) Leer paciente");
        System.out.println("2) Dar de alta a paciente");
        System.out.println("3) Ver estado de gravedad de paciente");
        System.out.println("4) Mostrar todos los pacientes");
        System.out.println("5) Mostrar todas las salas");
        System.out.println("0) Salir");
    }
    
    public static void salir(){
        //Termina el programa
        System.out.println("Nos vimos.");
        System.exit(0);
            
    }
    
    public static void leerPaciente(BufferedReader lectura, Paciente paciente) throws IOException{
        int gravedad;
        String nombre, apellido, rut, fecha;
        
        System.out.println("Ingrese Nombre del paciente:");
        nombre = lectura.readLine();
        
        System.out.println("Ingrese apellido del paciente:");
        apellido = lectura.readLine();
        
        System.out.println("Ingrese RUT del paciente:");
        rut = lectura.readLine();
        
        System.out.println("Ingrese la gravedad del paciente:");
        System.out.println("1)Leve    2)Mediana    3)Grave");
        gravedad = Integer.parseInt(lectura.readLine());
        
        System.out.println("Ingrese la fecha de ingreso (formato DD-MM-AA):");
        fecha = lectura.readLine();
        
        paciente.leerDatos(nombre, apellido, rut);
        paciente.leerDatos(gravedad, fecha);
    }
}