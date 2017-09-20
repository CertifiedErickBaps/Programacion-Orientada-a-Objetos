/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen02;

/**
 *
 * @author ERICK
 */
public class Estudiante extends Persona {
   private String carrera;
   private int matricula;
   private double promedio;
   private double beca;
   private final double MAXIMO_BECA = 90.0;

    public Estudiante(String nombre, String apellido, Fecha nacimiento, String carrera, int matricula, double promedio, double beca) {
        super(nombre, apellido, nacimiento);
        this.carrera = carrera;
        this.matricula = matricula;
        this.promedio = promedio;
        this.beca = beca;
        if(beca > MAXIMO_BECA){
            beca = 0;
        }        
    }
    public Estudiante(String nombre, String apellido, Fecha nacimiento, String carrera, int matricula) {
        super(nombre, apellido, nacimiento);
        promedio = 0.0;
        beca = 0.0;
    }
    
    public void setCarrera(String newCarrera){
        carrera = newCarrera;
    }
    public void setBeca(double newBeca){
        beca = newBeca;
    }
    public void setPromedio(double newPromedio){
        promedio = newPromedio;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getMatricula() {
        return matricula;
    }
    public double getPromedio(){
        return promedio;
    }
    public double getBeca(){
        return beca;
    }
    public String toString(){
        return super.toString() + ", Carrera: " + carrera + ", Matricula: " + matricula + ", Beca: " + beca + ", Promedio: " + promedio;
    }
}
