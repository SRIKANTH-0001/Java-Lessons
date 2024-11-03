//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//toString() Method
		//--It's used to return the string in textual representation of an object.
		//--we can use this in Implicitly & as well as explicitly.
		
		Laptop details=new Laptop();
		System.out.println(details);
		//System.out.println(details.toString());
	}
}


//Laptop Class
package Main;

public class Laptop {
	String Brand="Hp";
	String Color="Silver";
	int RAM=8;
	int SSD=512;
	
	public String toString() { 
		return Brand+"\n"+Color+"\n"+RAM+"\n"+SSD;
	}
	
}
