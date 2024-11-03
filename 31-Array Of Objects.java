//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Array Of Objects
		//Generally,It's a Collection where Each Element is Objects of a Class.
		
		Food food1=new Food("Corn Bread");
		Food food2=new Food("Fried Chicken");
		Food food3=new Food("Apple Pie");
		
		Food[] Village= {food1,food2,food3};
		
		System.out.println(Village[0].name);
		System.out.println(Village[2].name);
		System.out.println(Village[1].name);		
	}
}

//Food Class
package Main;

public class Food {
	String name;
	Food(String name){
		this.name=name;
	}
}
