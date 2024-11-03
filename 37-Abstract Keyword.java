//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Abstract Keyword
		
		//for class
		//-- no need to Create the Instance.
		
		//for methods 
		// --methods are declared Without Implementation.
		
		//Balloon b1=new Balloon();
		Shapes s1=new Shapes();
		
		s1.Air();
	}
}

//Balloon Class
package Main;

public abstract class Balloon {

	abstract void Air();
}

//Shapes Class
package Main;

public class Shapes extends Balloon {

	@Override
	void Air() {
		System.out.println("The Balloon is filled with full of Air!! ");
	}

	
}
