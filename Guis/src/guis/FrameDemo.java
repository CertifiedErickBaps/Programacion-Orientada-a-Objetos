/*
 * Ejemplo de uso de Ventanas (JFrame) de Swing
 * La salida de default del JFrame es BorderLayout
 * Se agregan elementos en un contenedor
 */

import java.awt.*;
import javax.swing.*;

// Esta clase FrameDemo crea internamente los objetos GUI que requiere: JFrame, JLabel, JButton
// Por lo tanto, para agregar componentes GUI a una ventana se debe indicar a qu� objeto tipo
// JFrame se agregar�n. Es decir: frame.getContentPane().add()  
// o tambi�n podemos crear un Container al que le asociamos la ventana con:
// Container contenedor = frame.getContentPane(); y a ESE contenedor agregamos los componentes
// as�: contenedor.add()

public class FrameDemo {
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	private static JFrame frame;
	private static JLabel etiqueta;
	private static JButton boton;

    private static void createAndShowGUI() {
    	
	// Creamos la ventana
        frame = new JFrame("FrameDemo");
        Container contenedor = frame.getContentPane();
        
        // Creamos un componente tipo Label (etiqueta)
        etiqueta = new JLabel("HOLA");
        // Creamos un componente tipo Button (boton)
        boton = new JButton("Click!");
        
        // Agregamos la etiqueta al contenedor. Si no indico en donde se 
        // agrega en el centro
        contenedor.add(etiqueta);
        
        // El boton se agrega en el este y ocupa TODO el espacio restante 
        contenedor.add(boton, BorderLayout.EAST);
        
        // Determino el tamaño de la ventana
        frame.setSize(WIDTH, HEIGHT);
        
        // Que operacion se realiza al seleccionar la X en la ventana
 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	
 	// pack() cambia el tamaño de la ventana para que se ajuste
 	// segun los componentes incluidos	
 	//frame.pack();
 		
 	// Hace visible la venana
      	frame.setVisible(true);
    }

   public static void main(String[] args) {
   
   	createAndShowGUI();
   }
}