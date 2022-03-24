import java.io.*;

public class Sala {
    private Paciente[] camilla;
    private int codigoGravedad; //del 1 al 3, representando las letras de la A a la C
    
    public Sala(){
        
    }
    
    public Sala(Paciente[] camilla, int codigoGravedad) {
        this.camilla = camilla;
        this.codigoGravedad = codigoGravedad;
    }

    public Paciente[] getCamilla() {
        return camilla;
    }

    public void setCamilla(Paciente[] camilla) {
        this.camilla = camilla;
    }

    public int getCodigoGravedad() {
        return codigoGravedad;
    }

    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    
    
}
