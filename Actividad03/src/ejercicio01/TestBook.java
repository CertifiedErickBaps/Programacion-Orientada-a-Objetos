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
public class TestBook {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); //Instancia
        System.out.println(ahTeck);
        
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.print(dummyBook);

        dummyBook.setPrice(19.95);
        dummyBook.setQty(28);
        System.out.println("");
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthorName());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
    }
    
}
