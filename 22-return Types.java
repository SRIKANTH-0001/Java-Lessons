package Main;
public class Main{
	public static void main(String[] args) {
	
	//return Types In Methods
		
		int a=100;
		int b=155;
		int c=add(a,b);
		System.out.println(c);
	}
	
	static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
}
/*
public static void main(String[] args) {
	
	//return Types In Methods
		
		int a=100;
		int b=155;
		
		System.out.println(add(a,b));
	}
	
	static int add(int a,int b) {
		
		return a+b;
	}
    
	 */