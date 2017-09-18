/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author ERICK
 */
public class TestInvoice {
    public static void main(String[] args){
        Customer customer1 = new Customer(123, "Erick", 10);
        System.out.println(customer1);
        
        Invoice invoice1 = new Invoice(122, customer1, 122.00);
        System.out.println(invoice1);
        
        
    }
}
