//Main Class
package Main;
public class Main {
	
	public static void main(String[] args) {
		new Frame();
	}
}

	

//Frame Class
package Main;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	Frame(){
	
	ImageIcon image =new ImageIcon("walpaper.jfif");
		
	label=new JLabel();
	label.setIcon(image);
	label.setBounds(110,150,240,190);
	label.setVisible(false);
	
	
	button=new JButton();
	button.setBounds(100,100,250,50);
	button.addActionListener(this);
	button.setText("Click Me");
	button.setForeground(new Color(123,235,155));
	button.setBackground(Color.black);
	
	JFrame frame=new JFrame();
	frame.setVisible(true);//To display the frame
	frame.setSize(450,450);//To fix The size of frame
	//frame.setResizable(false);//to choose whether the size should Resizable or Not.
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//To perform operations on 'X' | Exit Button 
	frame.setLayout(null);
	frame.add(button);
	frame.add(label);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("You are Clicked");
			label.setVisible(true);
		}
		
	}

}
