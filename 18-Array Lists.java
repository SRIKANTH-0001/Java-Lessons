package Main;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args) {
	//ArrayLists
	
		ArrayList<String> Vegetables=new ArrayList<String>();
		
		Vegetables.add("Carrot");
		Vegetables.add("Pumpkin");
		Vegetables.add("Drumstick");
		Vegetables.add("Bottle Guard");
		
		Vegetables.set(0, "Bitter Guard");
		Vegetables.remove(1);
		
		for(int i=0;i<Vegetables.size();i++) {
			System.out.println(Vegetables.get(i));
		}
		
	}
}
