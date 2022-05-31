package com.mycompany.proyectopoo;

import java.io.*;
import java.util.Map;

public class Paciente extends Persona implements Edad{
    private String nombre;
    private String apellido;
    private String rut;
    private int anioNacimiento;
    private int gravedad;
    private String fecha;

    public Paciente(){
        
    }
    
    public Paciente(String nombre, String apellido, String rut, int anioNacimiento, int gravedad, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.anioNacimiento = anioNacimiento;
        this.gravedad = gravedad;
        this.fecha = fecha;
    }
    
    public void mostrarPaciente(){
        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("RUT: " + getRut());
        System.out.println("Edad: " + calcularEdad());
        System.out.println("Fecha de ingreso: " + getFecha());
        System.out.print("Gravedad: " + getGravedad());
            
        if(getGravedad() == 1){
            System.out.println("(Leve)");
        }
        if(getGravedad() == 2){
            System.out.println("(Mediana)");
        }
        if(getGravedad() == 3){
            System.out.println("(Grave)");
        }
            
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
    
    public int getGravedad() {
        return gravedad;
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    
    
    //Sobrecarga metodo setter gravedad
    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
    public void setGravedad(short gravedad) {
        this.gravedad = gravedad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    //Sobrecarga para el metodo de leerDatos
    //Ingresa el nombre, apellido y RUT del paciente
    public void leerDatos(String nombre, String apellido, String rut, int anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.anioNacimiento = anioNacimiento;
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