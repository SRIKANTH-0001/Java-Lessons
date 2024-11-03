package Main;
public class Main{
	public static void main(String[] args) {
	//Methods
		String tool="pencil";	
		
		int Cost=15;
		
		review(tool,Cost);
	}
	
	static void review(String tool,int Cost) {
		System.out.println("What Are you doing?");
		System.out.println("I'm Just Drawing by using "+tool);
		System.out.println("What's the cost?");
		System.out.println("I think It's "+Cost+" Rupees");
	}
	
}
