//Main Class
package Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
	//Border Layout
		
	JFrame frame=new JFrame();
	frame.setVisible(true);//To display the frame
	frame.setSize(450,450);//To fix The size of frame
	//frame.setResizable(false);//to choose whether the size should Resizable or Not.
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//To perform operations on 'X' | Exit Button 
	frame.setLayout(new BorderLayout(10,5));
	
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	JPanel panel5=new JPanel();
	
	panel1.setBackground(Color.PINK);
	panel2.setBackground(Color.white);
	panel3.setBackground(Color.GREEN);
	panel4.setBackground(Color.ORANGE);
	panel5.setBackground(Color.BLUE);
	
	panel1.setPreferredSize(new Dimension(50,50));
	panel2.setPreferredSize(new Dimension(50,50));
	panel3.setPreferredSize(new Dimension(50,50));
	panel4.setPreferredSize(new Dimension(50,50));
	panel5.setPreferredSize(new Dimension(50,50));
	
	//------------------SUB_PANELS------------------------------
	panel5.setLayout(new BorderLayout(2,5));
	
	JPanel panel6=new JPanel();
	JPanel panel7=new JPanel();
	JPanel panel8=new JPanel();
	JPanel panel9=new JPanel();
	JPanel panel10=new JPanel();
	
	panel6.setBackground(Color.green);
	panel7.setBackground(Color.gray);
	panel8.setBackground(new Color(143,145,112));
	panel9.setBackground(new Color(123,45,121));
	panel10.setBackground(Color.yellow);
	
	panel6.setPreferredSize(new Dimension(20,50));
	panel7.setPreferredSize(new Dimension(20,50));
	panel8.setPreferredSize(new Dimension(20,50));
	panel9.setPreferredSize(new Dimension(20,50));
	panel10.setPreferredSize(new Dimension(20,50));
	
	frame.add(panel1,BorderLayout.EAST);
	frame.add(panel2,BorderLayout.WEST);
	frame.add(panel3,BorderLayout.NORTH);
	frame.add(panel4,BorderLayout.SOUTH);
	frame.add(panel5,BorderLayout.CENTER);
	
	panel5.add(panel6,BorderLayout.EAST);
	panel5.add(panel7,BorderLayout.WEST);
	panel5.add(panel8,BorderLayout.NORTH);
	panel5.add(panel9,BorderLayout.SOUTH);
	panel5.add(panel10,BorderLayout.CENTER);

}
}
	