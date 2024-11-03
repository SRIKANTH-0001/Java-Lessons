package Main;
public class Main{
	public static void main(String[] args) {
		//Informations about printf
		//Syntax: %[flags][precision][width][Conversion Character]
		
		boolean a=true;
		String b="Srikanth";
		double cgpa=8.21;
		char Symbol='/';
		int Year=2024;
		
		System.out.printf("This is Java Related Video.Reply %b",a);
		System.out.printf("\nWhat is My name? %s",b);
		System.out.printf("\n What's your CGPA?%.2f",cgpa);
		System.out.printf("\n Type any Character!%c",Symbol);
		System.out.printf("\n What is the Current Year?%d",Year);
		
		String bike="Ninja H2";
		double cost=100000;
		
		System.out.printf("This is my bike Name.-> %20s",bike);
		
		System.out.printf("\nCost of bike %020f",cost);
		
		
	
		
		
}
	
	
}