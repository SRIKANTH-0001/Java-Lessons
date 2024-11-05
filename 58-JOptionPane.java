//Main Class
package Main;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//JOptionPane --it's Pop Up a standard dialog box that prompts users for a value or some other Informations
		
		//JOptionPane.showMessageDialog(null,"Hi!This is Srikanth.How are You??","Name",JOptionPane.PLAIN_MESSAGE);

		//JOptionPane.showMessageDialog(null,"Your Name is Good to Pronounce","Info",JOptionPane.INFORMATION_MESSAGE);

		//JOptionPane.showMessageDialog(null,"Is this your Name?","Questioning",JOptionPane.QUESTION_MESSAGE);

		//JOptionPane.showMessageDialog(null,"You Gave Wrong Name!!","Warning!",JOptionPane.WARNING_MESSAGE);

		//JOptionPane.showMessageDialog(null,"Oh No! Error is Found","Error",JOptionPane.ERROR_MESSAGE);

		//JOptionPane.showConfirmDialog(null, "Srikanth,Are you a Bro?","Message",JOptionPane.YES_NO_CANCEL_OPTION);
        
	    //JOptionPane.showInputDialog("What's Your Name?");
		ImageIcon image=new ImageIcon("walpaper.jfif");
		Integer[] numbers= {1,2,3,4};
		
		JOptionPane.showOptionDialog(null,"How Many Bag Do you have?","Info_about_Bag",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,image,numbers,0);
	}

}
