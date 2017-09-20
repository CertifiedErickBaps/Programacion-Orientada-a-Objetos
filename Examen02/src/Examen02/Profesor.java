/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen02;

import java.util.Arrays;

/**
 *
 * @author ERICK
 */
public class Profesor extends Persona {
    private String carrera;
    private String grado;
    private int nomina;
    private double sueldo;
    private String[] materias;
    private final double MAX_SUELDO = 50000.00;
    private final double MIN_SUELDO = 25000.00;

    public Profesor(String nombre, String apellido, Fecha nacimiento, String carrera, String grado, int nomina, double sueldo, String[] materias) {
        super(nombre, apellido, nacimiento);
        this.carrera = carrera;
        this.grado = grado;
        this.nomina = nomina;
        this.sueldo = sueldo;
        if( sueldo > MAX_SUELDO){
            sueldo = MIN_SUELDO;
            
        } else if (sueldo < MIN_SUELDO){
            sueldo = MIN_SUELDO;
        }
        
    }
    public void setGrado(String newGrado){
        grado = newGrado;
    }
    public void setSueldo(double newSueldo){
        sueldo = newSueldo;
    }
    public void setMaterias(String[] newMaterias){
        materias = newMaterias;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getNomina(){
        return nomina;
    }
    public String getGrado(){
        return grado; 
    }
    public double getSueldo(){
        return sueldo;
    }
    public String[] getMaterias(){
        return materias;
    }
    
    public String toString(){
        return super.toString() + "Carrera: " + carrera + ", Nomina: " + nomina + ", Grado: " + grado + ", Sueldo: " + sueldo + ", Materias: " + Arrays.toString(materias);
    }
    
}
