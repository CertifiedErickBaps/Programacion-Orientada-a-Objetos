/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;
import javax.swing.*;  

/**
 *
 * @author ERICK
 */

public class Dibuja {
    
    public static void main(String[] args){
        showGUI();
    }
    
    private static void showGUI() {
        
        //Crear la ventana
        
        Scanner sc = new Scanner(System.in);
        int w, h;
        String titulo;
        
        System.out.println("Dame los valores para dibujar una ventana: ");
        System.out.println("El valor de width es: ");
        w = sc.nextInt();
        System.out.println("El valor de height es: ");
        h = sc.nextInt();
        System.out.println("Titulo de la ventana: ");
        titulo = sc.next();
        
        JFrame frame = new JFrame(titulo);
        
        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        
        frame.setVisible(true);
        
    }
}