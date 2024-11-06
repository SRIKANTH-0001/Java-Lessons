//Main Class
package Main;
public class Main {

	public static void main(String[] args) {	
		//JTextField-It's a  GUI textbox component that can be used to add,set or get the text
    
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frame extends JFrame implements ActionListener{
	JButton button;
	JTextField textField;
	
	frame(){
	this.setSize(450,450);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	
	button=new JButton("Proceed");
	button.addActionListener(this);
	button.setFocusable(false);
	
	textField=new JTextField();
	textField.setText("Put Your Name!");
	textField.setPreferredSize(new Dimension(290,27));
	textField.setFont(new Font("Roboto",Font.ITALIC,23));
	textField.setForeground(Color.orange);
	textField.setBackground(Color.black);
	
	this.add(button);
	this.add(textField);
	this.pack();
	this.setVisible(true);
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Hi!" +textField.getText());
		}		
	}
}



