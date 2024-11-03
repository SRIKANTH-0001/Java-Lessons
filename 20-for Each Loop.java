package Main;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
	// for-Each Loop
		
	
		//String[] Animals= {"Cat","goat","Cow","Dog"};
		
		ArrayList<String> Animals=new ArrayList<String>();
		
		Animals.add("Cat");
		Animals.add("goat");
		Animals.add("Cow");
		Animals.add("Dog");
		
		
		for(String i:Animals) {
			System.out.println(i);
		}
		
		
		
	}
}
