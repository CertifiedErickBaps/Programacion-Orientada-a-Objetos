/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author ERICK
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
        double after = a * amount;
        return after;
    }
//    public String toString(){
//       return "Invoice[ID = " + ID + getID() +"]";
//    }
}
