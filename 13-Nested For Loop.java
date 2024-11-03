package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	
		//Nested for Looping Statements
		
		Scanner var1=new Scanner(System.in);
		
		int rows;
		int columns;
		String letter;
		
		System.out.println("Give the limit of the ROW??");
		rows=var1.nextInt();
		
		System.out.println("Give the limit of the Column??");
		columns=var1.nextInt();
				
		System.out.println("What symbol do you want Print in Matrix Format??");
		letter=var1.next();
		
		for(int i=1;i<=rows;i++) {
			System.out.println();
			for(int j=1;j<=columns;j++) {
				System.out.print(letter);
			}
		}
	}
}
