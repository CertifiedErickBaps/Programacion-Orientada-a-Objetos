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
public class Book {
    private String name;
    //private Author[] names;
    //private Author[] mails;
    //private Author[] authors;
    //private Author[] genders;
    private double price;
    private int qty = 0;
    Author autor;
     
    public Book(String name, Author autor, double price){
        this.name = name;
        this.autor = autor;
        this.price = price;
    }
     
    public Book(String name, Author autor, double price, int qty){
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.qty = qty;
    }
     
    public String getName(){
        return name;
    }
     
    public String getAuthor(){
        return autor.toString();
    }
     
    public double getPrice(){
        return price;
    }
     
    public void setPrice(double newPrice){
        price = newPrice;
    }
     
    public int getQty(){
        return qty;
    }
     
    public void setQty(int newQty){
        qty = newQty;
    }
    
    public String getAuthorName(){
        return autor.getName();
    }
    
    public String getAuthorEmail(){
        return autor.getEmail();
    }
    
    public char getAuthorGender(){
        return autor.getGender();
    }
    
    public String toString(){
       return "Book[nombre = " + name + getAuthor() +"], price = " + price + ", qty = " + qty + "]";
    }
}