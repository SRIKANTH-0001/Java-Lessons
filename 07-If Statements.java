package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	// if statements
	 
		Scanner var1=new Scanner(System.in);
		
		System.out.println("How many stars you give for your Mobile Condition");
		int RateUrMobile=var1.nextInt();
		
		if (RateUrMobile>=5) {
			System.out.println("Yeah!Your Mobile Condition is Awesome");
		}else if(RateUrMobile==4) {
			System.out.println("It looks Ok Condtion,So take care of your mobile");
		}else {
			System.out.println("Let's take your Phone to the hospital");
		}
	 
	}
}

