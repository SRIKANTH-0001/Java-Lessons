//Main class

package Main;
public class Main{
	public static void main(String[] args) {
		//What is Objects
		
		Phone MyPhone=new Phone(); 
	
		System.out.println(MyPhone.Brand);
		System.out.println(MyPhone.Sub_Brand);
		System.out.printf("%.2f",MyPhone.Price);
		
		
		MyPhone.Leave();
		MyPhone.Buy();
}
}

//Phone class

package Main;

public class Phone {

	String Brand="Apple";
	String Sub_Brand="iPhone";
	String Color="Purple";
	int Model=16;
	String OS="iOS";
	double Price=89900.00;
	
	void Buy() {
		System.out.println("Now,You Have the money so you Can buy it!!");
	}
	
	void Leave() {	
		System.out.println("First You should get enough money.Then,You can Plan about buying");
		
	}
}
