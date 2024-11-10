//Main Package
package Main;
import Main1.display;
public class Main {

	public static void main(String[] args) throws InterruptedException{
	
		display dis=new display();
		
		dis.name();
	}
}

//Main1 Package
package Main1;
import java.util.Scanner;

public class display {

	public void name() {
	Scanner scanner=new Scanner(System.in);
	
	String name;
	
	System.out.println("Enter your Name:");
	name = scanner.nextLine();
	
	System.out.println("Hello "+name);
}
}


