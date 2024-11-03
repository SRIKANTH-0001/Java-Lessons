//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Static keyword is a modifier.A single copy of variable/Method is Created & Shared.  
		
		Laptop laptop1 =new Laptop("Apple");
		Laptop laptop2 =new Laptop("Hp");
		Laptop laptop3 =new Laptop("Acer");
		
		//System.out.println("You have "+Laptop.totalCount+" Laptops");

		Laptop.displayLaptops();
	}
}

//Laptop Class
package Main;

public class Laptop {
	String name;
	static int totalCount;
	Laptop(String name){
		this.name=name;
		totalCount++;
	}
	static void displayLaptops() {
		System.out.println("You have "+totalCount+" Laptops");
	}
}

