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
public class Customer {
    private int ID;
    private String name;
    private int discount;
    
    public Customer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
        
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(int newDiscount){
        discount = newDiscount;
    }
    public String toString(){
        return "name(ID): " + ID + ", name = " + name;
    }
    
    
}
