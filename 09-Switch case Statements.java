package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//Switch Case Statement
		
		Scanner var1=new Scanner(System.in);
		
		System.out.println("Put You");
		String Item=var1.nextLine();
		
		switch(Item) {
		case "Coffee":System.out.println("Coffee is available");
		break;
		case "Egg":System.out.println("Egg is available");
		break;
		case "Chicken":System.out.println("You can Buy the chicken");
		break;
		case "Soup":System.out.println("Soup is available");
		break;
		default:System.out.println("Sorry! It's Not Available.Ask me Later");
		}	 
	}
}

