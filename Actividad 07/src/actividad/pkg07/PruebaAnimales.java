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
public class PruebaAnimales {
    public static void main(String[] args){
        
        
        System.out.println("Animales:");
        Animal miGato = new Gato("Silvestre");
        Animal miPez = new Pez("Nemo");
        Animal miAraña = new Araña();
        System.out.println(miGato);
        System.out.println(miPez);
        System.out.println(miAraña);
        
        System.out.println("\n");
        System.out.println("Se cambian los nombres a Felix y Merlin:");
        Gato gato = (Gato)miGato;
        Pez pez = (Pez)miPez;
        gato.cambiarNombre("Felix");
        pez.cambiarNombre("Merlin");
        System.out.println(gato);
        System.out.println(pez);
        
       
        System.out.println("\n");
        System.out.println("Mascotas:");
        Gato migato2 = new Gato("Rony");
        Pez mipez2 = new Pez("Flo");
        System.out.println(migato2.regresarNombre() + migato2.jugar());
        System.out.println(mipez2.regresarNombre() + mipez2.jugar());
        
        System.out.println("\n");
        System.out.println("Polimorfismo con referencias a clases padre:");
        Animal migato3 = new Gato();
        System.out.println(migato3);
         
    
    }
    
}
