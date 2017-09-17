/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author ERICK
 */
public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); //Instancia
        System.out.println(ahTeck);
        
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());   
        
    } 
}
