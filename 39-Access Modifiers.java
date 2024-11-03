//A Package
//--Lion Class
package A;
import B.*;
public class Lion {
public static void main(String[] args) {

		Circle circle=new Circle();
		
		System.out.println(circle.O);
	}
}


//--Tiger class
package A;
import B.*;
public class Tiger {
	protected String TrafficLight="Traffic light is also in Circle Shape";
}

//A Package
//--Square class
package B;
import A.*;
public class Square {
//During the lesson You Can Put something here!!
}

//--Circle Class
package B;
import A.*;
public class Circle extends Lion {

	private String O="Alphabet O is also Circle shape";
	protected String TrafficLight="Traffic light is also in Circle Shape";
	public String Coin="Coin is also A circle Shape";
	String wheel="Wheel is also a Circle Shape";
}

