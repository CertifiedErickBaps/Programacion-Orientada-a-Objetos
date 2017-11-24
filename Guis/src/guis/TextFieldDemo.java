import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TextFieldDemo extends JFrame implements ActionListener {
  
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextArea textArea;
    
    public TextFieldDemo() {
       
    	JScrollPane scrollPane;
        Container contenedor = getContentPane();
      
        textField = new JTextField(20);
     
        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        
        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        contenedor.add(textField, BorderLayout.NORTH);
        contenedor.add(scrollPane);
        
        addListeners();
    }
    
    private void addListeners(){
        textField.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        textArea.append(text + "\n");
        //Eliminar lo que previamente estaba en el TextField
        textField.selectAll();
    }
 
 
    public static void main(String[] args) {
        
    	 TextFieldDemo gui = new TextFieldDemo( );
    	 gui.pack();
         gui.setVisible(true);
    }
}