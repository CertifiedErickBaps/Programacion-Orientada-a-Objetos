/*
 * Ejemplo de uso de Botones de Swing
 * El contenedor JFrame se crea por herencia
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class BotonesDemo extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JButton boton1,boton2,boton3;
    private JTextField etiqueta1, etiqueta2, etiqueta3;
    private ImageIcon russell = new ImageIcon("imgs/louie.png");
    private ImageIcon brave = new ImageIcon("imgs/huey.png");
    private ImageIcon nemo = new ImageIcon("imgs/dewey.png");
    private JPanel panelCentro, panelNorte, panelOeste;
    
    
    public BotonesDemo() {
   
        Container contenedor = getContentPane();
        
    	// Crea un JPanel con salida de default FlowLayout
    	panelNorte = new JPanel();
    	
        // Crea un JPanel con salida modificada de 3 renglones y 1 columna
        panelOeste = new JPanel(new GridLayout(3, 1));
    	
        // Crea un JPanel con salida de default FlowLayout
    	panelCentro = new JPanel();
    	
    	boton1=new JButton("Louie");
        boton1.setSize(90,30);
        panelNorte.add(boton1);
      
        boton2=new JButton("Huey");
        boton2.setSize(90,30);
        panelNorte.add(boton2);
        
        boton3=new JButton("Dewey");
        boton3.setSize(90,30);
        panelNorte.add(boton3);
       
        contenedor.add(panelNorte, BorderLayout.NORTH);
        
        etiqueta1 = new JTextField();
        etiqueta1.setEditable(false);
        etiqueta1.setText("Louie");
        etiqueta2 = new JTextField();
        etiqueta2.setEditable(false);
        etiqueta2.setText("Huey");
        etiqueta3 = new JTextField();
        etiqueta3.setEditable(false);
        etiqueta3.setText("Dewey");
        
        panelOeste.add(etiqueta1);
        panelOeste.add(etiqueta2);
        panelOeste.add(etiqueta3);
        
        contenedor.add(panelOeste, BorderLayout.WEST);
        
        contenedor.add(panelCentro, BorderLayout.CENTER);
        addListeners();
    }
    
    private void addListeners(){
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	limpiaVentana();
        if (e.getSource()==boton1) {
            setTitle("boton 1");
            etiqueta1.setText("Louie foto");
            panelCentro.add(new JLabel(russell));
            panelCentro.updateUI();
        }
        if (e.getSource()==boton2) {
            setTitle("boton 2");
            etiqueta2.setText("Huey foto");
            panelCentro.add(new JLabel(brave));
            panelCentro.updateUI();
        }
        if (e.getSource()==boton3) {
            setTitle("boton 3");
            etiqueta3.setText("Dewey foto");
            panelCentro.add(new JLabel(nemo));
            panelCentro.updateUI();
        }        
    }
    
    public void limpiaVentana() {
    	etiqueta1.setText("Louie");
    	etiqueta2.setText("Huey");
    	etiqueta3.setText("Dewey");
    	panelCentro.removeAll();
    }
    
    public static void main(String[] ar){
        BotonesDemo botoncitos = new BotonesDemo();
        botoncitos.setBounds(100,100,350,250);
        botoncitos.setVisible(true);
    }
}