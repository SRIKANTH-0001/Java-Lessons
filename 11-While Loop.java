package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//While loop
		Scanner var1=new Scanner(System.in);
		String name="";
		
		do{
			System.out.println("Till now your restaurant is not Registered.So,");
			System.out.println("Enter Your Reataurant Name?:");
			name=var1.nextLine();
		}while(name.isBlank());
		System.out.println("Now,You Are registered your Restaurant Name "+name+" Successfully!!");
		}
				
	 
	}


