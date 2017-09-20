/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author Erick Bautista Perez A01379896   
 * @author Hector David Hernandez Rodrigez A01374009
 */
public class TestCustomer {
    public static void main(String[] args){
        Customer customer1 = new Customer(123, "Erick", 10);
        System.out.println(customer1);
        customer1.setDiscount(20);
        System.out.println("ID is: " + customer1.getID());
        System.out.println("Name is: " + customer1.getName());
        System.out.println("Discount is: " + customer1.getDiscount());
        System.out.println(customer1.toString());
    }
}
