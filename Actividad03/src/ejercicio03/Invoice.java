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
public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;
    
    public Invoice(int ID, Customer customer, double amount){
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    
    public int getID(){
        return ID;
    }
    public String getCustomer(){
        return customer.toString();
    }
    public void setCustomer(Customer newCustomer){
        customer = newCustomer;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double newAmount){
        amount = newAmount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        int a = customer.getDiscount();
        double after = (a/100) * amount;
        return after;
    }
    public String toString(){
       return "Invoice[ID Voice: " + ID + ", {" + getCustomer() + "}" + ", discount: " + customer.getDiscount() + "]";
    }
}
