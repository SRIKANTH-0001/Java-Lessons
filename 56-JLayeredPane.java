//Main Class
package Main;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class Main {

    public static void main(String[] args) {
        //JLayeredPane -the container that provides third Dimension for partitioning the components
    	JFrame frame=new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		
		
		JLayeredPane layeredpane=new JLayeredPane();
		layeredpane.setBounds(0,0,450,450);
    
		JLabel label1=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.blue);
		label1.setBounds(50,50,200,200);
		
		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.yellow);
		label2.setBounds(100,100,200,200);
		
		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,200,200);
		
		JLabel label4=new JLabel();
		label4.setOpaque(true);
		label4.setBackground(Color.red);
		label4.setBounds(200,200,200,200);
		
		JLabel label5=new JLabel();
		label5.setOpaque(true);
		label5.setBackground(Color.orange);
		label5.setBounds(250,250,200,200);
		
		layeredpane.add(label1,JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label2,JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label3,JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label4,JLayeredPane.DEFAULT_LAYER);
		layeredpane.add(label5,JLayeredPane.DEFAULT_LAYER);
		/*layeredpane.add(label1,Integer.valueOf(0));
		layeredpane.add(label2,Integer.valueOf(1));
		layeredpane.add(label3,Integer.valueOf(2));
		layeredpane.add(label4,Integer.valueOf(3));
		layeredpane.add(label5,Integer.valueOf(4));*/
		
		frame.add(layeredpane);
		frame.setVisible(true);
    }
}
