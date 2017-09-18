/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import ejercicio01.Author;

/**
 *
 * @author ERICK
 */
public class TestAuthor {
    public static void main(String[] args){
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck","tanahteck@gmail.com",'m');
        authors[1] = new Author("Paul Ian","paulian@gmail.com",'m');
        
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
    
}
