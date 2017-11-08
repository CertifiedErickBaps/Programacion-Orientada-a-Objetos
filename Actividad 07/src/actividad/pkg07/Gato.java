/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg07;

/**
 *
 * @author ERICK
 */
public class Gato extends Animal implements Mascota{
    
    private String nombre;
    
    public Gato(String nombre) {
        super(4);
        this.nombre = nombre;
    }
    
    public Gato() {
        super(4);
        nombre = "Minino";
    }
    
    @Override
    public String regresarNombre(){
        return nombre;
    }

    @Override
    public void cambiarNombre(String n) {
        nombre = n;
    }
    
    @Override
    public String jugar(){
        return " juega con una bola de estambre";
    }
    
    @Override
    public String comer(){
        return "come pescado y croquetas y ";
    }

    @Override
    public String toString() {
        return "Un gato llamado " + nombre + caminar() + comer() + jugar();
    }
    
    
}
