package Main;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Main {
	
	public static void main(String[] args) {
	//GridLayout-the Format of holding components as like grids
		
		JFrame frame=new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,3));
		frame.setSize(500,500);
		
		frame.add(new JButton("First"));
		frame.add(new JButton("Second"));
		frame.add(new JButton("Third"));
		frame.add(new JButton("Fourth"));
		frame.add(new JButton("Fifth"));
		frame.add(new JButton("Sixth"));
		frame.add(new JButton("Seventh"));
		frame.add(new JButton("Eighth"));
		frame.add(new JButton("Nineth"));
		
		frame.setVisible(true);	
}
}