import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Esta clase BorderLayoutJFrama YA es una ventana porque hereda de JFrame
// Para agregar elementos a la ventana solo se requiere la instrucciOn add()

public class BorderLayoutJFrame extends JFrame {
 
    private static final long serialVersionUID = 1L;
    public static final int WIDTH_JFRAME = 500;
    public static final int HEIGHT_JFRAME = 400;

    // Constructor de la clase. En cuanto se crea un objeto de la misma se
    // invoca a este m�todo.
    public BorderLayoutJFrame( ) {
        super("BorderLayout Demonstration" );
        setSize(WIDTH_JFRAME, HEIGHT_JFRAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Se puede agregar componentes DIRECTAMENTE al objeto tipo JFrame
        // pero se recomienda que sea DIRECTAMENTE al contenedor de ese
        // objeto tipo JFrame (es un misterio...)
        Container contenedor = getContentPane();
        
        // Indicar el tipo de salida. Por default es BorderLayout
        setLayout(new BorderLayout( ));

        JLabel label1 = new JLabel("Norte");
        contenedor.add(label1, BorderLayout.NORTH); 

        JLabel label2 = new JLabel("Sur");
        contenedor.add(label2, BorderLayout.SOUTH); 

        JLabel label3 = new JLabel("Centro", JLabel.CENTER);
        contenedor.add(label3, BorderLayout.CENTER); 
        
        JLabel label4 = new JLabel("Este");
        contenedor.add(label4, BorderLayout.EAST); 
        
        JLabel label5 = new JLabel("Oeste");
        contenedor.add(label5, BorderLayout.WEST); 
    }
    
    public static void main(String[] args) {
    	
    	// Creando un objeto de la clase principal: BorderLayoutFrame
        BorderLayoutJFrame gui = new BorderLayoutJFrame( );
        gui.setVisible(true);
    }
}

