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
public class PromedioException {
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Cuantos datos son: ");
            try{
                int n = sc.nextInt();
                promedio(n);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            
        }
    } 
    public static void promedio(int n) throws Exception{
        if(n < 0){
            throw new ArithmeticException("El dato debe ser positivo");
        }
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        for (int i = 1; i <= n;i++){
            System.out.println("Dame el numero: ");
            double num = sc.nextInt();
            sum += num;
        }
        double prom = sum/ n;
        System.out.println("El promedio es: " + prom);
        
    }
}
