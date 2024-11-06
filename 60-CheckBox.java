//Main Class
package Main;
public class Main {

	public static void main(String[] args) {
		//CheckBox--Creating CheckBox 	
		new frame();
	}
}

//frame Class
package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class frame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkBox;
	
	frame(){
		
	this.setSize(600,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	button=new JButton("Proceed");
	button.addActionListener(this);
	button.setFocusable(false);
	
	ImageIcon image=new ImageIcon("Correct.png");
	ImageIcon image1=new ImageIcon("Wrong.png");
	
	checkBox=new JCheckBox();
	checkBox.setText("Are You a Student?");
	checkBox.setFocusable(false);
	checkBox.setFont(new Font("Arial",Font.BOLD,24));
	checkBox.setIcon(image1);
	checkBox.setSelectedIcon(image);
	
	this.add(checkBox);
	this.add(button);
	this.pack();
	this.setVisible(true);
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}	
	}
}



