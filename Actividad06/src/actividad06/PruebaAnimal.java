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
public class PruebaAnimal {
     
    public static void main (String[] args){
             
        Perro miPerro = new Perro ("Murphy", "Poodle");
        Gato miGato = new Gato ("Debbie","Siamese");
         
        System.out.println(miPerro);
        System.out.println(miGato);
         
        System.out.println(PruebaAnimal.anuncia(miPerro));
        System.out.println(PruebaAnimal.anuncia(miGato));
         
        PruebaAnimal.cambiaNombre(miPerro, "Lassie");
        PruebaAnimal.cambiaNombre(miGato, "Garfield");
         
        System.out.println(miPerro);
        System.out.println(miGato);
         
        System.out.println("\n\n");
    }
     
    public static String anuncia (Animal a){
        return a.toString() + " dice " + a.sonido();
    }
     
    public static void cambiaNombre(Animal a, String nombre){
        if(a instanceof Perro){
            Perro p = (Perro)a;
            p.setNombre(nombre);
        }
        else if(a instanceof Gato){
            Gato g = (Gato)a;
            g.setNombre(nombre);
        }
    }
}