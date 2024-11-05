//Main Class
package Main;

public class Main {
	public static void main(String[] args) {
		//landing Page
		currentPage cpage=new currentPage();
	}
}

//Current Page
package Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class currentPage implements ActionListener{

	JFrame frame=new JFrame(); 
	JButton button=new JButton("Click!");
	
	currentPage(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(460,460);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);
		
		button.setBounds(150,150,130,100);
		button.setFocusable(false);
		button.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			//frame.dispose();
			nextPage nPage=new nextPage();
		}
	}
}

//Next Page
package Main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class nextPage {
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Yeah!Finally,You reached the Secret Message!");
	
	nextPage(){
	label.setBounds(12,2,230,230);
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(460,460);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.add(label);

}
}