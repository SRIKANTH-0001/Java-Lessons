//Main Class
package Main;
public class Main {
	
	public static void main(String[] args) {

	new thisClass();
}
}

//this Class
package Main;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class thisClass extends JFrame{
	thisClass(){	
		this.setVisible(true);//To display the frame
		this.setTitle("Frame Application");//the title of the frame
		this.setSize(450,450);//To fix The size of frame
		this.setResizable(false);//to choose whether the size shoule Resizable or Not.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//To perforrm perations on 'X' | Exit Button 
		
		ImageIcon image=new ImageIcon("walpaper.jfif");//To get the Image
		this.setIconImage(image.getImage());//To display the image 
		this.getContentPane().setBackground(new Color(123,23,150));//To choose the background color--we can also use (Color."The name of color you want")
	}
}
