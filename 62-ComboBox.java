//Frame Class
package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener{
	
	JComboBox combobox;
	
	Frame(){
		
	this.setSize(600,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setVisible(true);

	String[] studentThings= {"Pencil","Pen","NoteBook","Eraser"};
	
	combobox=new JComboBox();
	
	combobox.addActionListener(this);
	//combobox.addItem("Mobile");
	//combobox.addItem("Bag");
	
	//combobox.setEditable(true);
	//combobox.setInsertItemAt("Book",1);
	//combobox.removeItem("Book");
	
	this.add(combobox);
	this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combobox) {
			//System.out.println(combobox.getSelectedItem());
			System.out.println(combobox.getSelectedIndex());
		}
		}
	}



