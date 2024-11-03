//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//How to Pass an Objects As Arguments
		
		Bag bag=new Bag();
		Book book1=new Book("English");
		Book book2=new Book("Spanish");
		
		bag.put(book1);
		bag.put(book2);
		
	}
}
//Bag Class
package Main;
public class Bag {
	
	void put(Book book) {
		System.out.println("The "+book.Book_Name+" Book is Presented in Your Bag!");
	}

}

//Book Class
package Main;

public class Book {
	String Book_Name;
	Book(String Book_Name){
		this.Book_Name=Book_Name;
	}
}
