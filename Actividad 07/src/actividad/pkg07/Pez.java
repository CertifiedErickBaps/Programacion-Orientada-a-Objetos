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
public class Pez extends Animal implements Mascota{
    private String nombre;

    public Pez(String nombre) {
        super(0);
        if (patas == 0){
            
        }
        this.nombre = nombre;
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
    public String comer(){
        return "come camarones y planctons y ";
    }
    
    @Override
    public String jugar(){
        return " juega con burbujas";
    }
    
    @Override
    public String toString() {
        return "Un pez llamado " + nombre + caminar() + comer()+ jugar();
    }
    
}
