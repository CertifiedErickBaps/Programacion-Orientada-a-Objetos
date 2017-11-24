import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

// Esta clase FrameDemoButton YA ES un JFrame porque hereda de JFrame, por lo que cualquier cosa 
// que agreguemos con un simple add() se agrega a la ventana. 
// Ademas, implementa la interfaz ActionListener para indicar que se deben ESCUCHAR los eventos
// de componentes cuyo escucha sea dicha interfaz (los botones, por ejemplo). 
// Al implementar ActionListener se DEBE implementar el metodo actionPerformed que ES el 
// unico metodo abstracto de dicha interfaz. EN ESE metodo indicamos que se debe hacer cuando
// se oprime un boton.


public class FrameDemoButton extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JButton boton1, boton2;
    
	// Constructor de la clase principal.
    public FrameDemoButton() {
    	
    	// Resetear la salida de default de JFrame de BorderLayout a ninguna.
        setLayout(null);
        Container contenedor = getContentPane();
        
        boton1=new JButton("Finalizar");
        // setBounds (x, y, width, height)
        boton1.setBounds(300,250,100,30);
        // Agrego el boton1 a la ventana
        contenedor.add(boton1);
        // addActionListener: Indico que el boton1 escucha eventos
        // (this): indico que el metodo actionPerformed (de la interfaz ActionListener) se 
        // encuentra implementado en esta misma clase principal: FrameDemoButton
        
        
        boton2=new JButton("Iniciar");
        boton2.setBounds(100,150,100,30);
        contenedor.add(boton2);
        
        addListeners();
        
    }
    
    private void addListeners(){
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	// e.getSource() para identifica qu� componente (boton) fue el que lanzo 
        // el evento. Es decir, que boton fue oprimido
        if (e.getSource()==boton1) {
            System.exit(0);
        }
        else
        if (e.getSource()==boton2) {
            setTitle("Hola");
       }  	
    }
    
    public static void main(String[] ar) {
    	
    	// CREAR una instancia de la clase principal para TENER una ventana
        FrameDemoButton formulario1 = new FrameDemoButton();
        
        formulario1.setBounds(100,100,450,350);
        formulario1.setVisible(true);
    }
}