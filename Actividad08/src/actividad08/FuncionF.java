/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;
import java.util.*;
/**
 *
 * @author A01379896 Erick
 * @author A01374009 Hector
 * 
 */
public class FuncionF {
    public static void main(String[] Args){
        
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Dame un numero: ");
            try{
                double x = s.nextDouble();
                System.out.println("El resultado es: " + f(x));
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Finalizando ejecucion");
                break;
            }
        }
    }
    public static double f(double x){
        if(x<1){
            throw new ArithmeticException("El numero " + x + " es menor que 1.0 y es invalido!");
        }
        return Math.sqrt(Math.pow(x, 3)-1);
    }
    
}


