/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author A01374009
 */
public class Screen {
    //despliega nuestro mensaje sin necesidad de un return
    public void displayMessage(String message){
        System.out.print(message);
    }
    public void displayMessageLine(String message){
        System.out.print(message);
    }
    // nos imprime nuestro monto en signo de dolares
    public void displayDollarMonto(double monto){
        System.out.printf("$%,.2f", monto);
    }
}
