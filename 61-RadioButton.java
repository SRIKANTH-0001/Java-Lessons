//Main Class
package Main;
public class Main {

	public static void main(String[] args) {
		//CheckBox--Creating CheckBox	
		new frame();
	}
}


//frame class
package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class frame extends JFrame implements ActionListener{
	JRadioButton winterButton;
	JRadioButton summerButton;
	JRadioButton springButton;
	
	frame(){
		
	this.setSize(600,600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setVisible(true);

	winterButton=new JRadioButton("Winter");
	summerButton=new JRadioButton("Summer");
	springButton=new JRadioButton("Spring");
	
	winterButton.addActionListener(this);
	summerButton.addActionListener(this);
	springButton.addActionListener(this);
	
	ButtonGroup group=new ButtonGroup();
	group.add(springButton);
	group.add(summerButton);
	group.add(winterButton);	
	
	this.add(springButton);
	this.add(summerButton);
	this.add(winterButton);;
	this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==springButton) {
			System.out.println("You are selected Spring Season!Do you want to time travel to that?");
		}
		else if(e.getSource()==winterButton) {
			System.out.println("You are selected winter Season!Do you want to time travel to that?");
		}
		else{
			System.out.println("You are selected Summer Season!Do you want to time travel to that?");
		}		
	}
}