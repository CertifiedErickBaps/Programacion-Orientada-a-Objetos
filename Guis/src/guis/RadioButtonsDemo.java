import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonsDemo extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	JRadioButton aButton, bButton, cButton;
	
	public RadioButtonsDemo(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Container contenedor = getContentPane();
                
		//Crear radio buttons   
		aButton = new JRadioButton("A",true);
		bButton = new JRadioButton("B");
		cButton = new JRadioButton("C");
		
		//Crear grupo de radio buttons, ButtonGroup
		//Es necesario colocar los botones en un grupo
		//para que puedan comportarse como un Radio Button
		//Es decir, SOLO un boton seleccionado a la vez
		ButtonGroup myButtonGroup = new ButtonGroup();
		myButtonGroup.add(aButton);
		myButtonGroup.add(bButton);
		myButtonGroup.add(cButton);

		//Colocar los botones en el JFrame
		setLayout(new FlowLayout());
		contenedor.add(aButton);
		contenedor.add(bButton);
		contenedor.add(cButton);
		
                addListeners();
                
                setSize(250,100);
		setTitle("Radio Buttons");
                
	}
	
        private void addListeners(){
            aButton.addActionListener(this);
            bButton.addActionListener(this); 
            cButton.addActionListener(this);
        }
        
        
    @Override
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource() == aButton) {
			setTitle("A");
		} 	 
		if (e.getSource() == bButton) {
			setTitle("B");
		} 	 
		if (e.getSource() == cButton) {
			setTitle("C");
		} 	 
		
	}
	
	public static void main(String[] args){
	
            RadioButtonsDemo rb=new RadioButtonsDemo();
            rb.setBounds(0,0,300,200);
            rb.setVisible(true);
	}

}