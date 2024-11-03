//Main Class
package Main;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {
	public static void main(String[] args) {
	//JPanel -It's an Graphical User Interface Component that functions as a Container to other Components 

		ImageIcon image=new ImageIcon("walpaper.jfif");
		
		JLabel label=new JLabel();
		label.setIcon(image);
		label.setText("Walpaper");
		label.setIconTextGap(2);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.black);
		label.setFont(new Font("Roboto",Font.BOLD,12));
		label.setBounds(23,21,250,302);
		
		JPanel redpanel =new JPanel();//First Panel
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		
		JPanel yellowpanel =new JPanel();//Second Panel
		yellowpanel.setBackground(Color.yellow);
		yellowpanel.setBounds(250,0,350,250);
		
		JPanel graypanel =new JPanel();//Third Panel
		graypanel.setBackground(Color.gray);//BackgroundColor
		graypanel.setBounds(0,250,500,250);//giving the value of x,y,width and Height
		
		JFrame frame=new JFrame();//Creating a Frame
		frame.setVisible(true);//To display the frame
		frame.setLayout(null);
		frame.setSize(450,450);//To fix The size of frame
		//frame.setResizable(false);//to choose whether the size shoule Resizable or Not.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//To perforrm perations on 'X' | Exit Button 
		frame.add(redpanel);
		frame.add(yellowpanel);
		frame.add(graypanel);
		yellowpanel.add(label);
		frame.add(frame);

	}
}

	