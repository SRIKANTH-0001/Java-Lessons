//Main Class
package Main;
import java.io.File;
public class Main {
	
	public static void main(String[] args) {
		//Files
		
		File txtfile=new File("NormalText.txt");
		//I have created this file in my DeskTop
		if(txtfile.exists()) {
			txtfile.delete();
			System.out.println("Yeah!Your File is Existed.Now you can do any File Operations");
			System.out.println(txtfile.getPath());
			System.out.println(txtfile.getAbsolutePath());
			System.out.println(txtfile.isFile());
		}
		else {
			System.out.println("File is not Existed");
		}
	}
}

	