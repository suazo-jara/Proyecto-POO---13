
public abstract class Persona {
    private int edad;
    
    public abstract boolean esMenor();
    
    public boolean esAdultoMayor(){
        return edad>60;
    }
    
    public void mostrarEdad(){
        System.out.println(edad);
    }
    
}
