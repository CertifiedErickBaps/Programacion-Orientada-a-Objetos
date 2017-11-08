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
public class Perro extends Animal{
    private String nombre;
    private String raza;

    public Perro(String nombre, String raza) {
        super("Perro");
        this.nombre = nombre;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + nombre + ", el " + raza;
    }
    
    public String sonido(){
        return "woof woof";
    }
    
}
