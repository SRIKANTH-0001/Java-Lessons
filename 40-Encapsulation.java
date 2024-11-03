//Main Class
package Main;

public class Main {

	public static void main(String[] args) {
		Book book=new Book("Atomic habits","James Clear",256);
		
		book.setPages(257);
		System.out.println(book.getBook());
		System.out.println(book.getAuthor());
		System.out.println(book.getPages());
	
	}

}

//Book Class
package Main;

public class Book {
	
	private String Book;
	private String Author;
	private int Pages;
	
	Book(String Book,String Author, int Pages){
	
		this.setPages(Pages);
		this.Author=Author;
		this.Book=Book;
	}
	public String getBook() {
		return Book;
	}
	public String getAuthor() {
		return Author;
	}
	public int getPages() {
		return Pages;
	}
	
	public void setPages(int Pages) {
		this.Pages=Pages;
	}
}
