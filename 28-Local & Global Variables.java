//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Local Variables:
				//Declared & used Within the Method 
		//Global variable:
				//Declared outside of method but,With in the class & used on both Within and outside of the Method 

		Book book=new Book();
		
	}
}


//Book Class
package Main;

import java.util.Random;

public class Book {
	Random random;
	int Page_No;
	Book(){
		random=new Random();
		Searcher();
	}
	void Searcher(){
		Page_No=random.nextInt(100);
		System.out.println(Page_No);
	}
}
