//&& Both is true 
package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//Logical Operators
		
		Scanner var1=new Scanner(System.in);
		
		System.out.println("Enter your Team Win Percentage!!");
		int WinPercent=var1.nextInt();
		
		if(WinPercent<=100 && WinPercent>=80) {
			System.out.println("Your Team is defintly gonna Win!!");
			
		}else {
			System.out.println("No chance for win!Just Go & sleep");
		}

		}
	}

//! it's Opposite to the equals 

package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//Logical Operators
		
		Scanner var1=new Scanner(System.in);
		
		System.out.println("Put Your Key!!");
		String key=var1.next();
		
		
		if (!key.equals("U") && !key.equals("u")) {
			System.out.println("you are not Allowed");
		}else {
			System.out.println("You are allowed into the pub");
		}
		}
	}


//|| Any one is true


package Main;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		//Logical Operators
		
		Scanner var1=new Scanner(System.in);
		
		System.out.println("Put Your Key!!");
		String key=var1.next();
		
		if (key.equals("U")||key.equals("u")) {
			System.out.println("You are allowed into the pub");
		}else {
			System.out.println("you are not Allowed");
		}
		}
	}



