import java.io.*;
import java.util.Map;

public class Paciente {
    private String nombre;
    private String apellido;
    private String rut;
    private int gravedad;
    private String fecha;

    public Paciente(){
    }
    
    public Paciente(String nombre, String apellido, String rut, int gravedad, String fecha) {
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
    //Sobrecarga para el metodo de leerDatos
    //Ingresa el nombre, apellido y RUT del paciente
    public void leerDatos(String nombre, String apellido, String rut){
        this.nombre=nombre;
        this.apellido=apellido;
        this.rut=rut;
    }
    //Ingresa la gravedad y la fecha de ingreso del paciente
    public void leerDatos(int gravedad, String fecha){
        this.gravedad=gravedad;
        this.fecha=fecha;
    }

    Iterable<Map.Entry<String, Paciente>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}