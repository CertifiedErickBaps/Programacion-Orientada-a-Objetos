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
public class Araña extends Animal{

    public Araña() {
        super(8);
    }
    
    @Override
    public String comer(){
        return "y come insectos";
    }

    @Override
    public String toString() {
       return "Una araña" + caminar() + comer();
    }
    
}
