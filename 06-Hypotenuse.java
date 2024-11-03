package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//how to find hypotenuse
	 int a;
	 int b;
	 double c;
	 
	 Scanner a1=new Scanner(System.in);
	 
	 System.out.println("Enter the value of A");
	 a=a1.nextInt();
	 
	 System.out.println("Enter the value of B");
	 b=a1.nextInt();
	 
	 c=Math.sqrt((a*a)+(b*b));
	 
	 System.out.println("The hypotenuse value is\n15"+c);
	 
	 
	}
}

