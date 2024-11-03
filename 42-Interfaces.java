///Main class
package Main;

public class Main {

	public static void main(String[] args) {
		
		//Interfaces
		
		Vitamin vitamin=new Vitamin();
		
		vitamin.VitaminC();
		vitamin.Potassium();
	}
	
}

//Fiber Class
package Main;

public class Fiber //implements Heart {
{
	/*@Override
	public void Potassium() {
		System.out.println("Avacado has Potassium and it's very useful for health!!\n Kiwi has Fiber and it's helpful for Digestion" );
		
	}*/

}

//Vitamin Class
package Main;

public class Vitamin implements Skin,Heart {

	public void VitaminC() {
		System.out.println("The Fruits Orange StrawBerry,BlueBerry,Orange have Vitamin C and It's Very Helpful for Skin!!");
	}

	@Override
	public void Potassium() {
		System.out.println();
		System.out.println("Avacado has Potassium and it's very useful for health!!\n Kiwi has Fiber and it's helpful for Digestion" );
		
	}

	
}


//Skin Interfaces
package Main;

public interface Skin {

	void  VitaminC();
}

//Heart Interfaces
package Main;

public interface Heart {

	void Potassium();
}
