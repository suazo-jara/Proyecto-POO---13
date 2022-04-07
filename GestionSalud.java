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
        ArrayList<Map> salas = new ArrayList();
        //HashMap<String, Paciente> pacientes = new HashMap();
        Sala sala = new Sala();
        Paciente paciente = new Paciente();
        Map<String, Paciente> paciente1 = new HashMap();
        Map<String, Paciente> paciente2 = new HashMap();
        Map<String, Paciente> paciente3 = new HashMap();
        //Ciclo para mostrar menu con sus opciones
        do{
            //Muestra menu hasta que ingrese una opcion valida
            menu();
            switch(Integer.parseInt(lectura.readLine())){
                case 1: {
                    
                    lecturaPaciente(lectura, paciente, sala);
                    //Se agrega pacientes a sala
                    switch(paciente.getGravedad()){
                        case 1: 
                            paciente1 = sala.agregarPaciente(paciente);
                            salas.add(paciente.getGravedad(), paciente1);
                        case 2: 
                            paciente2 = sala.agregarPaciente(paciente);
                            salas.add(paciente.getGravedad(), paciente2);
                        case 3: 
                            paciente3 = sala.agregarPaciente(paciente);
                            salas.add(paciente.getGravedad(), paciente3);
                    }
                    
                    //Prepara variables para la próxima iteración
                    paciente = new Paciente();
                }
                break;
                /*
                case 2: darDeAlta();
                break;
                case 3: estadoDeGravedad();
                break;
                */
                case 4: sala.mostrarPacientes();
                break;
                
                case 5: 
                    salas.add(paciente1);
                    salas.add(paciente2);
                    salas.add(paciente3);
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
        System.out.println("2) Liberar paciente");
        System.out.println("3) Ver estado de gravedad de paciente");
        System.out.println("4) Mostrar pacientes");
        System.out.println("0) Salir");
    }
    
    public static void salir(){
        //Termina el programa
        System.out.println("Nos vimos.");
        System.exit(0);
            
    }
    
    public static void lecturaPaciente(BufferedReader lectura, Paciente paciente, Sala sala) throws IOException{
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