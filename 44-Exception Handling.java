//Main Class
package Main;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//NullPointerException
		/*
		try {
			String name=null;

			System.out.println("Your name has"+name.length()+"Characters");
			//here the null pointer exception is occurred 	
		}
		catch(NullPointerException e) {
			System.out.println("You Name is Invalid");
		}
		
		finally {
			System.out.println("Entering You Name Is necessary");
		}
		 */
		
		//Arithmetic Exception
		try {
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter The value of a:");
		int a=A.nextInt();
		System.out.println("Enter The value of b:");
		int b=A.nextInt();
		
		int c=a/b;
		System.out.println("Obviously,The c value is"+c);
		//I gave a=1 & b=0 then,It throws Arithmetic Exception
		}
		catch(ArithmeticException e) {
			System.out.println("Your input is Invalid!!");
		}catch(Exception e) {
			System.out.println("Something Went Wrong!!");
		}finally {
			System.out.println("Now You Are Peforming Arithmetic Operations");
		}
		
	}
}

	