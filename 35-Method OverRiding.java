//Main class
package Main;
public class Main{
	public static void main(String[] args) {
		//Method OverRiding Concepts
		//--It's a Process of declaring the method in subclass ,which is already presented 
		//-in parent class.
		
		Shapes shapes=new Shapes();
		Square square=new Square();
		
		shapes.Sides();
		//square.Sides();
		
	}
}

//Shapes Class
package Main;

public class Shapes {

	void Sides() {
		System.out.println("Different shapes have different sides!!");
	}
}

//Square class
package Main;

public class Square extends Shapes {
	@Override
	void Sides() {
		System.out.println("Square Shape has four sides!!");
	}
}
