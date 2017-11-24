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
import java.util.Scanner;
public class Teclado {
    private Scanner input;
    // contructor que inicializa nuestro scanner
    public Teclado(){
        input = new Scanner(System.in);
    }
    public int getInput(){
        return input.nextInt();//se asume que el usuario introduzca numeros
    }
}
