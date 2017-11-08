/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

/**
 *
 * @author A01379896, A01374009
 */
public class Gato extends Animal{
    private String nombre;
    private String raza;

    public Gato(String nombre, String raza) {
        super("Gato");
        this.nombre = nombre;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " " + nombre + ", el " + raza;
    }

    public String sonido(){ 
        return "meow meow";
    }
    
    
    
    
    
}
