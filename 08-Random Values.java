package Main;
import java.util.Random;
public class Main{
	public static void main(String[] args) {
		//Generating Random Values
	 Random var1=new Random();
	 
	 int a=var1.nextInt(10);
	 float b=var1.nextFloat(10);
	 long c=var1.nextLong(10);
	 boolean d=var1.nextBoolean();
	 
	 System.out.println("Integer random value"+a);
	 System.out.println("float random value"+b);
	 System.out.println("long random value"+c);
	 System.out.println("boolean random value"+d);
	
	}
}

