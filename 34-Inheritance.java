//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Inheritance
		//It's the process where one class Acquires,the attribute and Methods of other Class 
	
		Turtle turtle=new Turtle();
		//turtle.run();
		Horse horse=new Horse();
		//horse.stop();
		System.out.println(turtle.Speed);
		System.out.println(horse.Speed1);
		
	}
}

//Animals Class
package Main;

public class Animals {

	void run() {
		System.out.println("Now,This Animal is Running!! ");
	}
	void stop() {
		System.out.println("Currently,This Animal is stooped their Running!! ");
	}
}

//Turtle Class
package Main;

public class Turtle extends Animals {

	String Speed="Turtle is Naturally runs Slowly!!";
}

//Horse
package Main;

public class Horse extends Animals{

	String Speed1="Horse is naturally runs Fastly Compared with turtle";
}
