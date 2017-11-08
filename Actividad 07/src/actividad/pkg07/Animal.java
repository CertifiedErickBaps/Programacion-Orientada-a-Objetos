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
public abstract class Animal {

   protected int patas;

    public Animal(int patas) {
        this.patas = patas;   
    }

    
   public String caminar(){
       if(patas == 0){
           return " no puede caminar ";
       }
       else{
           return " camina con " + patas + " patas ";
       }
   }
   
   public abstract String comer();

    @Override
    public String toString() {
        return caminar() + comer();
    }
   
   
    
}
