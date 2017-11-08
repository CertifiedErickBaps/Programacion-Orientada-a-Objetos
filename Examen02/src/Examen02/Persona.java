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
public class Persona {
    protected String nombre;
    protected String apellido;
    protected Fecha nacimiento;
    
    public Persona(String nombre, String apellido, Fecha nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Fecha getNacimiento(){
        return nacimiento;
    }
    
    public String toString(){
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Nacimiento: " + nacimiento.toString();
    }
    
}
