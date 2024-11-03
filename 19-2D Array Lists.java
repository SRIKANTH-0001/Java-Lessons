package Main;
import java.util.*;
public class Main{
	public static void main(String[] args) {
	// 2D ArrayLists
	
		ArrayList<ArrayList<String>> Nature=new ArrayList();
		
		ArrayList<String> WaterBodies=new ArrayList();
		
		WaterBodies.add("Lake");
		WaterBodies.add("Stream");
		WaterBodies.add("Pond");
		WaterBodies.add("Sea");
		
		ArrayList<String> LivingThings=new ArrayList();
		
		LivingThings.add("Fish");
		LivingThings.add("Dolphin");
		LivingThings.add("Sharks");
		LivingThings.add("Lopster");
		
		ArrayList<String> NonLiving=new ArrayList();
		
		NonLiving.add("WaterFlow");
		NonLiving.add("Temperature");
		NonLiving.add("Dissolved Gases");
		NonLiving.add("Grass");
		
		
		Nature.add(WaterBodies);
		Nature.add(LivingThings);
		Nature.add(NonLiving);
		
		
		
		System.out.println(Nature);
		/*System.out.println(Nature.get(0).get(1));*/
	}
}
