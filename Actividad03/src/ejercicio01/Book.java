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
    private Author[] names;
    private Author[] mails;
    private Author[] authors;
    private Author[] genders;
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
     
    public Author[] getAuthor(){
        return authors;
    }
     
    public double getPrice(){
        return price;
    }
     
    public void setPrice(double price){
        this.price = price;
    }
     
    public int getQty(){
        return qty;
    }
     
    public void setQty(int qty){
        this.qty = qty;
    }
     
    public String toString(){
        String st = "Book[name=" + name + ", Authors [";
        for(int i=0;i<authors.length;i++){
            st += authors[i].toString();
        }
        st += "}, price = " + price + ", qty=" + qty + "]";
        return st;
    }
     
    public Author[] getAuthorName(){
        return names;
    }
    public Author[] getAuthorEmail(){
        return mails;
    }
    public Author[] getAuthorGender(){
        return genders;
    }
}