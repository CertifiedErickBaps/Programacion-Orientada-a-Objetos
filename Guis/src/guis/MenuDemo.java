import java.awt.event.*;
import javax.swing.*;

public class MenuDemo extends JFrame implements ActionListener {
	
	JMenuItem authorItem = null;
	
	public MenuDemo() {
		super("Menu example");
		
		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenuItem newItem = new JMenuItem("New");
		newItem.setMnemonic('N');
		file.add(newItem);
		JMenuItem openItem = new JMenuItem("Open");
		openItem.setMnemonic('O');
		file.add(openItem);	
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		file.add(exitItem);
		
		JMenu about = new JMenu("About");
		about.setMnemonic('A');
		authorItem = new JMenuItem("Author");
		authorItem.setMnemonic('t');
		about.add(authorItem);
		JMenuItem versionItem = new JMenuItem("Version");
		versionItem.setMnemonic('s');
		about.add(versionItem);
						
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(file);
		bar.add(about);
		
                addListeners();
                
		setSize(200, 200);
		setVisible(true);
                
	}
	
        private void addListeners(){
           authorItem.addActionListener(this);
        }
 
    @Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == authorItem) {
                     JOptionPane.showMessageDialog(this, "Autor: Un programador misterioso");
		}
		
	}
	
	public static void main(String[] args)
	{
		MenuDemo app = new MenuDemo();
                 
                app.setBounds(100,100,450,350);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}