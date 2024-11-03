//Main Class
package Main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	
	public static void main(String[] args) {

	//JLabel is an Area where we can place our Image or Text or Both 
		ImageIcon image=new ImageIcon("walpaper.jfif");
		
		Border border=BorderFactory.createLineBorder(Color.yellow,5);
		JLabel label=new JLabel();
		label.setText("This is my Desktop Walpaper..");
		label.setIcon(image);//Displaying the image
		label.setHorizontalTextPosition(JLabel.CENTER);//Choose the position to place the LEFT,RIGHT & CENTER 
		//the following is used to set the text position at TOP,BOTTOM & CENTER
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.black);//Used to set the Font Color
		label.setFont(new Font("Arial",Font.ITALIC,21));//It's used to set font style
		label.setIconTextGap(-2);//define the gap between the text & the Picture
		label.setBackground(Color.blue);//Set the Background color
		label.setOpaque(true);//Display the background Color
		label.setBorder(border);
		label.setHorizontalAlignment(JLabel.CENTER);//horizontal position of text and Pic
		label.setVerticalAlignment(JLabel.CENTER);//vertical position of both text and Pic
		//label.setBounds(0,0,320,320);//to define the x,y positions
		
		JFrame frame=new JFrame();
		frame.setVisible(true);//To display the frame
		
		frame.setSize(450,450);//To fix The size of frame
		//frame.setResizable(false);//to choose whether the size shoule Resizable or Not.
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//To perforrm perations on 'X' | Exit Button 
		frame.add(label);
        frame.pack();

	}
}

	