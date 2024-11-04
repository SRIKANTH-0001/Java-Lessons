//Main Class
package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
	//Flow Layout
		
		JFrame frame=new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
		frame.setSize(500,500);
		
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(200,200));
		panel.setBackground(Color.yellow);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("A"));
		panel.add(new JButton("B"));
		panel.add(new JButton("C"));
		panel.add(new JButton("D"));
		panel.add(new JButton("E"));
		panel.add(new JButton("F"));
		panel.add(new JButton("G"));
		panel.add(new JButton("H"));
		panel.add(new JButton("I"));
		panel.add(new JButton("J"));
		panel.add(new JButton("K"));
		panel.add(new JButton("L"));
		panel.add(new JButton("M"));
		
		frame.add(panel);
		
		
}
}