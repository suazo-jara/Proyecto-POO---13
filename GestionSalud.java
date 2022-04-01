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
        Map<String, Paciente> pacientes = new HashMap();
        crearPisos();
        Sala sala = new Sala();
        Paciente paciente = new Paciente();

        int numeroPiso = 1,cont = 0;
        //Ciclo para mostrar menu con sus opciones
        do{
            //Muestra menu hasta que ingrese una opcion valida
            menu();
            switch(Integer.parseInt(lectura.readLine())){
                case 1: {
                    lecturaPaciente(lectura, pacientes, paciente,sala,piso,numeroPiso);
                    if(cont == 5){
                        numeroPiso +=1;
                        cont=-1;
                    }
                    cont+=1;
                }
                break;
                /*
                case 2: darDeAlta();
                break;
                case 3: estadoDeGravedad();
                break;
                case 4: mostrarPacientes();
                break;
                */
                case 0: salir();
                break;
                default: System.out.println("Opción inválida. Intente nuevamente.");
                break;
            }
        }while(1 > 0);
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
    
    public static void salir(){
        //Termina el programa
        System.out.println("Nos vimos.");
        System.exit(0);
            
    }
    
    public static void lecturaPaciente(BufferedReader lectura,Map pacientes, Paciente paciente, Sala sala, Piso piso, int numeroPiso) throws IOException{
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
        
        //Se agrega pacientes a sala
        sala.recolectarDatos(paciente);
        sala.recolectarDatos(paciente.getRut());
        pacientes = sala.agregarASala();
        sala.mostrar();
        
        //Se agrega las salas a piso
        //piso.agregarSalas(pacientes);
        
    }
        // Funcion que crea los pisos del hospital y los inserta en el mapa
    public static void crearPisos(){
        Map<Integer, Piso> pisos = new HashMap();
        for(int i=1; i<=3 ; i++){
           Piso piso = new Piso();
           pisos.put(i, piso);
       }
    }
}