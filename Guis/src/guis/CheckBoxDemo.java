import java.awt.Container;
import javax.swing.*;
import javax.swing.event.*;

// La interfaz a implementar con checkboxes es ChangeListener
// y el metodo a sobreescribir es stateChanged
public class CheckBoxDemo extends JFrame implements ChangeListener {
	
	private static final long serialVersionUID = 1L;
	private JCheckBox check1,check2,check3;
    
	public CheckBoxDemo() {
            setLayout(null);
            
            Container contenedor = getContentPane();
            
            check1=new JCheckBox("Ingles", true);
            check1.setBounds(10,10,150,30);
            contenedor.add(check1);
        
            check2=new JCheckBox("Frances");
            check2.setBounds(10,50,150,30);           
            contenedor.add(check2);
        
            check3=new JCheckBox("Aleman");
            check3.setBounds(10,90,150,30);
            contenedor.add(check3);
        
            addListeners();
        }
        
        private void addListeners(){
            check1.addChangeListener(this);
            check2.addChangeListener(this); 
            check3.addChangeListener(this);
        }
    
    @Override
        public void stateChanged(ChangeEvent e){
            String cad="";
            if (check1.isSelected()==true) {
                cad=cad+"Ingles-";
            }
            if (check2.isSelected()==true) {
                cad=cad+"Frances-";
            }
            if (check3.isSelected()==true) {
                cad=cad+"Aleman-";
            }
            setTitle(cad);
        }

        public static void main(String[] ar) {
            CheckBoxDemo formulario1=new CheckBoxDemo();
            formulario1.setBounds(0,0,300,200);
            formulario1.setVisible(true);
        }    
}