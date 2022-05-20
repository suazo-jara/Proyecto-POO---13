package com.mycompany.proyectopoo;
import java.io.*;
import java.util.*;

public class Sala {
    
    private HashMap<String, Paciente> pacientes = new HashMap ();
    private int codigoGravedad;    
    // Sobrecarga de constructores
    public Sala(){
        
    }
    public Sala(int gravedad){
        this.codigoGravedad = gravedad;
        pacientes = new HashMap();
    }
    public int getCodigoGravedad() {
        return codigoGravedad;
    }
    //Sobrecarga metodo setter par al codigoGravedad
    public void setCodigoGravedad(int codigoGravedad) {
        this.codigoGravedad = codigoGravedad;
    }
    public void setCodigoGravedad(short codigoGravedad){
        this.codigoGravedad = codigoGravedad;
    }
    public void agregarPaciente(Paciente paciente){
        String clave;
        clave = paciente.getRut();
        pacientes.put(clave, paciente);
        //System.out.println("------clave  " + pacientes.get(clave).getNombre());
    }
    
    public void mostrarPacientes(){
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            /*
            String key = recorrer.getKey();
            System.out.println("Clave: " + key + " Valor: " +  pacientes.get(key));
            System.out.println("-----------------------------");
            */
            System.out.println("Nombre: " + pivot.getNombre());
            System.out.println("Apellido: " + pivot.getApellido());
            System.out.println("RUT: " + pivot.getRut());
            System.out.println("Año de nacimiento: " + pivot.getAnioNacimiento()+"\n");
            System.out.println("Fecha de ingreso: " + pivot.getFecha());
            System.out.print("Gravedad: " + pivot.getGravedad());
            if(pivot.getGravedad() == 1){
                System.out.println("(Leve)");
            }
            if(pivot.getGravedad() == 2){
                System.out.println("(Mediana)");
            }
            if(pivot.getGravedad() == 3){
                System.out.println("(Grave)");
            }
            System.out.println("-----------------------------");
        } 
    }
    
    public void reportarPacientes(FileWriter escritor) throws IOException{
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            
            escritor.write("Nombre: " + pivot.getNombre()+"\n");
            escritor.write("Apellido: " + pivot.getApellido()+"\n");
            escritor.write("RUT: " + pivot.getRut()+"\n");
            escritor.write("Año de nacimiento: " + pivot.getAnioNacimiento()+"\n");
            escritor.write("Fecha de ingreso: " + pivot.getFecha()+"\n");
            escritor.write("Gravedad: " + pivot.getGravedad());
            if(pivot.getGravedad() == 1){
                escritor.write(" (Leve)"+"\n");
            }
            if(pivot.getGravedad() == 2){
                escritor.write(" (Mediana)"+"\n");
            }
            if(pivot.getGravedad() == 3){
                escritor.write(" (Grave)"+"\n");
            }
            escritor.write("-----------------------------"+"\n");
        } 
    }
    
    public Paciente eliminarPaciente(String clave){
    Paciente pp;
    pp = null;
        if(pacientes.containsKey(clave)){
           pp=pacientes.remove(clave); 
           return pp;
        }
        return pp;
    }
    public void menoresDeEdad(){
        
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si es menor de edad
            if(pivot.esMenor()){
                //Muestra datos de la persona
                System.out.println("Nombre: " + pivot.getNombre());
                System.out.println("Apellido: " + pivot.getApellido());
                System.out.println("RUT: " + pivot.getRut());
                System.out.println("Edad: " + pivot.calcularEdad());
                System.out.println("Año de nacimiento: " + pivot.getAnioNacimiento()+"\n");
                System.out.println("Fecha de ingreso: " + pivot.getFecha());
                System.out.print("Gravedad: " + pivot.getGravedad());
                if(pivot.getGravedad() == 1){
                    System.out.println("(Leve)");
                }
                if(pivot.getGravedad() == 2){
                    System.out.println("(Mediana)");
                }
                if(pivot.getGravedad() == 3){
                    System.out.println("(Grave)");
                }
                
                System.out.println("-----------------------------"); 
            }
            
        }     
        
    }
    public void mostrarSalas(){
        System.out.println("Cantidad de pacientes: " + pacientes.size());
        System.out.println("-----------------------------");
    }
    
    public void menorDeEdad(){
        int edad = 100000;
        Paciente copia = new Paciente();
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si la edad es mayor a la persona
            if (pivot.calcularEdad() < edad){
                //Actualiza edad y cambia a persona mas joven
                edad = pivot.calcularEdad();
                copia = pivot;
            }
        } 
        //Si no hay personas muestra el mensaje
        if(copia.getNombre() == null){
            System.out.println("No se encuentran pacientes registrados");
        }else{
            //Muestra datos de persona mas joven
            System.out.println("Nombre: " + copia.getNombre());
            System.out.println("Apellido: " + copia.getApellido());
            System.out.println("RUT: " + copia.getRut());
            System.out.println("Edad: " + copia.calcularEdad());
            System.out.println("Fecha de ingreso: " + copia.getFecha());
                System.out.print("Gravedad: " + copia.getGravedad());
                if(copia.getGravedad() == 1){
                    System.out.println("(Leve)");
                }
                if(copia.getGravedad() == 2){
                    System.out.println("(Mediana)");
                }
                if(copia.getGravedad() == 3){
                    System.out.println("(Grave)");
                }
        }
    }
    
    public void mayorDeEdad(){
        int edad = 0;
        Paciente copia = new Paciente();
        for(Map.Entry<String,Paciente> recorrer : pacientes.entrySet()){
            Paciente pivot = recorrer.getValue();
            //Verifica si edad es menor a la persona
            if (pivot.calcularEdad() > edad){
                edad = pivot.calcularEdad();
                copia = pivot;
            }
        } 
        //Si no hay personas muestra el mensaje
        if(copia.getNombre() == null){
            System.out.println("No se encuentran pacientes registrados");
        }else{
            System.out.println("Nombre: " + copia.getNombre());
            System.out.println("Apellido: " + copia.getApellido());
            System.out.println("RUT: " + copia.getRut());
            System.out.println("Edad: " + copia.calcularEdad());
            System.out.println("Fecha de ingreso: " + copia.getFecha());
                System.out.print("Gravedad: " + copia.getGravedad());
                if(copia.getGravedad() == 1){
                    System.out.println("(Leve)");
                }
                if(copia.getGravedad() == 2){
                    System.out.println("(Mediana)");
                }
                if(copia.getGravedad() == 3){
                    System.out.println("(Grave)");
                }
        }
    }
    
    public Paciente buscarPaciente(String rut, int gravedad){
        if(pacientes.containsKey(rut)){
           Paciente paciente = pacientes.get(rut);
           Paciente paciente2 = new Paciente(paciente.getNombre(),paciente.getApellido(),paciente.getRut(),paciente.getAnioNacimiento(),gravedad,paciente.getFecha());
           return paciente2;
        }
        return null;
    }
}