/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Arrays;

/**
 *
 * @author Erick Bautista Perez A01379896   
 * @author Hector David Hernandez Rodrigez A01374009
 */
public class TestInvoice {
    public static void main(String[] args){
        Customer customer1 = new Customer(123, "Erick", 10);
        System.out.println(customer1);
        
        Invoice invoice1 = new Invoice(122, customer1, 122.00);
        System.out.println(invoice1);
        
        System.out.println("ID: " + invoice1.getID());
        System.out.println("Customer: " + invoice1.getCustomer());
        System.out.println("Amount: " + invoice1.getAmount());
        invoice1.setAmount(90);
        System.out.println("Amount modified: " + invoice1.getAmount());
        System.out.println("Customer name: " + invoice1.getCustomerName());
        System.out.println("Amount after discount: " + invoice1.getAmountAfterDiscount());
        
    }
}
