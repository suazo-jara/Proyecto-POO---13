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
                
                case 2:{
                    System.out.println("Inserte rut del paciente a dar de alta");
                    String clave = lectura.readLine();
                    Paciente pp;
                    pp = null;
                    for (int i = 0; i < salas.size() && pp == null; i++){

                        pp=salas.get(i).eliminarPaciente(clave);
                        System.out.println("");
                        
                    }
                    if(pp!=null){
                        System.out.println("Paciente dado de alta correctamente");
                    }else{
                        System.out.println("rut de paciente ingresado no existe en la base de datos");
                    }
                }
                break;
                /*case 3: estadoDeGravedad();
                break;
                */
                case 4: 
                    for (int i = 0; i < salas.size(); i++){
                        System.out.println("S A L A  " + (i + 1));
                        salas.get(i).mostrarPacientes();
                        System.out.println("");
                        
                    }
                break; 
                
                case 5:
                    for (int i = 0; i < salas.size(); i++){
                        System.out.println("S A L A  " + (i + 1));
                        salas.get(i).mostrarSalas();
                    }
                break;
                
                
                case 6:
                    System.out.println("Ingrese el rut del paciente:");
                    String rut = lectura.readLine();
                    System.out.println("Ingrese la nueva gravedad del paciente:");
                    int gravedad = Integer.parseInt(lectura.readLine());
                    int verificar = 0;
                    paciente = new Paciente();
                    //Recorre lista de salas y ve dentro si se encuentra en el mapa
                    for(int i = 0; i<salas.size();i++){
                        if(salas.get(i).buscarPaciente(rut,gravedad) != null){
                            paciente = salas.get(i).buscarPaciente(rut,gravedad);
                            verificar = 1;
                            //Eliminar paciente con gravedad antigua
                            salas.get(i).eliminarPaciente(rut);
                        }
                    }
                    if(verificar == 0){
                        System.out.println("--NO EXISTE EL RUT INGRESADO--");
                    }else{
                        //Agregar paciente con gravedad nueva
                        salas.get(paciente.getGravedad()-1).agregarPaciente(paciente);
                        System.out.println("--Paciente modificado correctamente--");
                    }
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
        System.out.println("2) Dar de alta a paciente                   [WIP]");
        System.out.println("3) Ver estado de gravedad de paciente       [WIP]");
        System.out.println("4) Mostrar todos los pacientes");
        System.out.println("5) Mostrar todas las salas");
        System.out.println("6) Modificar estado de gravedad paciente");
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
        
        System.out.println("Ingrese nombre del paciente:");
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