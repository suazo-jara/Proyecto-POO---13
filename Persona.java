
import java.io.BufferedReader;
import java.io.IOException;


public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private int gravedad;
    private String fecha;

    public Persona(){
    }
    
    public Persona(String nombre, String apellido, String rut, int gravedad, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.gravedad = gravedad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void ingresarPaciente(BufferedReader lectura) throws IOException{
        System.out.println("Ingrese Nombre del paciente:");
        nombre = lectura.readLine();
        System.out.println("Ingrese apellido del paciente:");
        apellido = lectura.readLine();
        System.out.println("Ingrese rut del paciente:");
        rut = lectura.readLine();
        System.out.println("Seleecione la gravedad del paciente");
        System.out.println("1)Leve    2)Mediana    3)Grave");
        gravedad = Integer.parseInt(lectura.readLine());
        System.out.println("Ingrese la fecha de ingreso(formato 12/34/56:");
        fecha = lectura.readLine();
        
        
        System.out.println(nombre + apellido + fecha + gravedad + rut);
    }
    
    
}
