/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import ejercicio01.Author;

/**
 *
 * @author Erick Bautista Perez A01379896   
 * @author Hector David Hernandez Rodrigez A01374009
 */
public class Book {
    private String name;
    private Author[] authors; //Regresa arreglos dados en Author[]
    private double price;
    private int qty = 0;
     
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
     
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
     
    public String getName(){
        return name;
    }
     
    public Author[] getAuthors(){
        return authors;
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
     
    public String toString(){
        String st = "Book[name="+name+", Authors={";
        for(int a=0;a<authors.length;a++){
            st += authors[a].toString();
        }
        st += "}, price="+price+", qty="+qty+"]";
        return st;
    }
     
    public String getAuthorNames(){
        String nameAuthors = null;
        for(int i= 0; i<authors.length; i++){
          nameAuthors += authors[i];  
        }
        return nameAuthors;
    }
}
