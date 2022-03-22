import java.io.*;


public class GestionSalud {
    
    public static void main(String[] args) throws IOException{
        BufferedReader lectura = new BufferedReader (new InputStreamReader(System.in));
        int opcion;
        
        //Muestra meni hasta que se elija una opcion valida
        do{
            menu();
            opcion = Integer.parseInt(lectura.readLine());
        }while(verificar(opcion) == 0);
        
        Persona paciente=new Persona();
        Persona sala[] = new Persona[15];
        
        for(int i = 0; i<15;i++){
            sala[i] = new Persona();
        }
        
        if(opcion == 1){
            //ingresar(paciente,lectura);
           paciente.ingresarPaciente(lectura);
           agregarASala(paciente,sala);
           
           //System.out.println(sala[1].getNombre());
        }
        
    }
    
    public static void menu(){
        //Muestra menu
        System.out.println("Bienvenido al sistema de gestion de camillas");     
        System.out.println("Elija una opción:");
        System.out.println("1)Agregar paciente");
        System.out.println("2)Liberar paciente");
        System.out.println("3)Ver estado de gravedad de paciente");
        System.out.println("0)Salir");
    }
    
    public static int verificar(int opcion){
        //Termina el programa
        if(opcion == 0){
            System.exit(0);
        }
        if(opcion == 1 || opcion == 2 || opcion == 3){
            return 1;
        }else{
            System.out.println("Elija una opcion valida");
            return 0;
        }
    }
    
    public static void agregarASala(Persona paciente,Persona sala[]){
        if(paciente.getGravedad() == 1){
            for(int i = 0; i<5;i++){
                if(sala[i].getGravedad() != 1){
                    sala[i].setNombre(paciente.getNombre());
                    sala[i].setApellido(paciente.getApellido());
                    sala[i].setGravedad(paciente.getGravedad());
                    sala[i].setRut(paciente.getRut());
                    sala[i].setFecha(paciente.getFecha());
                    
                }else{
                    System.out.println("Ocupado");
                }
            }
        }
        if(paciente.getGravedad() == 2){
            for(int i= 5; i<10;i++){
                if(sala[i].getGravedad() != 2){
                    sala[i].setNombre(paciente.getNombre());
                    sala[i].setApellido(paciente.getApellido());
                    sala[i].setGravedad(paciente.getGravedad());
                    sala[i].setRut(paciente.getRut());
                    sala[i].setFecha(paciente.getFecha());
                    
                }else{
                    System.out.println("Ocupado");
                }
            }
        }
        if(paciente.getGravedad() == 3){
            for(int i = 10; i<15;i++){
                if(sala[i].getGravedad() != 3){
                    sala[i].setNombre(paciente.getNombre());
                    sala[i].setApellido(paciente.getApellido());
                    sala[i].setGravedad(paciente.getGravedad());
                    sala[i].setRut(paciente.getRut());
                    sala[i].setFecha(paciente.getFecha());
                    
                }else{
                    System.out.println("Ocupado");
                }
            }
        }
    }
    
}
