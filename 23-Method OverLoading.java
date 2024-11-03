package Main;
public class Main{
	public static void main(String[] args) {
	//Method OverLoading Concepts
	
		String a="Hi!";
		String b="Hello!";
		String c="Welcome!";
		
		Message(a,b,c);
	}
	static void Message(String a) {
		System.out.println("The first Message function is Executed");
	}
	static void Message(String a,String b) {
		System.out.println("The 2nd Message function is Executed");
	}
	static void Message(String a,String b,String c) {
		System.out.println("The 3rd Message function is Executed");
	}
}
