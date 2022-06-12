

public class Medico extends Persona implements Edad {
    private String nombre;
    private String apellido;
    private String rut;
    private String especialidad;
    private int anioNacimiento;
    private String fecha;

    public Medico(String nombre, String apellido, String rut, String especialidad, int anioNacimiento, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.especialidad = especialidad;
        this.anioNacimiento = anioNacimiento;
        this.fecha = fecha;
    }

    @Override
    public boolean esMenor(){
        return calcularEdad()<18;
    }
    
    @Override
    public boolean esAdultoMayor(){
        return calcularEdad()>=60;
    }
    
    @Override
    public int calcularEdad(){
        int edad = ANIO_ACTUAL - anioNacimiento;
        return edad;
    }
    
    @Override
    public void mostrarEdad(){
        System.out.println(calcularEdad());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
