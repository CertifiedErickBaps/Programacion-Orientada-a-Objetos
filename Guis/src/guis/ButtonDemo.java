/*
 * Ejemplo de uso de Botones de Swing
 * El contenedor JPanel se crea dentro del programa y
 * posteriormente se le agregan los elementos
 * El layout de default de JPanel es FlowLayout
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


// Todo objeto tipo ButtonDemo implementa ActionListener 
// por lo que DEBE sobreescribir el metodo actionPerformed
// ButtonDemo NO hereda de JFrame por lo que hay que crear un 
// JFrame en algun momento.
public class ButtonDemo implements ActionListener {
     JButton b1, b2, b3;
     ImageIcon leftButtonIcon, middleButtonIcon, rightButtonIcon;


     public ButtonDemo(Container contenedor) {

        leftButtonIcon = new ImageIcon("imgs/right.png");
        middleButtonIcon = new ImageIcon("imgs/scrooge.png");
        rightButtonIcon = new ImageIcon("imgs/left.png");

        b1 = new JButton("Disable middle button", leftButtonIcon);
        b1.setHorizontalTextPosition(SwingConstants.LEFT); 
        b1.setActionCommand("disable");

        b2 = new JButton("Middle button", middleButtonIcon);
        
        b3 = new JButton("Enable middle button", rightButtonIcon);
        b3.setEnabled(false);
        b3.setActionCommand("enable");

        contenedor.add(b1);
	contenedor.add(b2);
	contenedor.add(b3);
        
        addListeners();
     }
     
      private void addListeners(){
         //Indicar que estos botones escuchan eventos
         b1.addActionListener(this);
         b3.addActionListener(this);
      }

    @Override
     public void actionPerformed(ActionEvent e) {
   
    	 // Identifico cada componente en forma individual e indico que
    	 // hacer segun sea el componente que detecto el evento, es decir, que
    	 // boton fue oprimido
/*    	 if (e.getSource()== b1) {
             b2.setEnabled(false);
             b1.setEnabled(false);
             b3.setEnabled(true);
    	 }
      	 if (e.getSource()== b3) {
             b2.setEnabled(true);
             b1.setEnabled(true);
             b3.setEnabled(false);
    	 }
  */  		 
    	 
    	 // Identifico el comando asociado a uno o varios componentes y si alguno de estos
    	 // componentes lanza un evento, se identifica el respectivo comando y se indica
    	 // que es lo que hay que realizar.
        String comando = e.getActionCommand();
    	
        if (comando.equals("disable")) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } 
        else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
     }


     private static void creaYMuestraGUI() {
   
    	// Creamos un componente ventana (JFrame) internamente en la clase principal
    	// ya que esta no hereda el comportamiento de una ventana
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Crea e inicializa el contenedor
        //DEBE ser un contenedor tipo JPanel porque, de lo contrario, 
        //no podemos agregar varios elementos si no indicamos en que lugar
        //se agregan: Norte, Sur, Este, Oeste.
        //Usando JPanel aprovechamos su salida de default: FlowLayout para agregar
        //los componentes como vaya llegando
        JPanel contenedor = new JPanel();
        frame.setContentPane(contenedor);
        
        ButtonDemo demo;
        demo = new ButtonDemo(contenedor);
        
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
     
         creaYMuestraGUI();
    }
}