//Main Class
package Main;
public class Main {

	public static void main(String[] args) {

		Integer[] numbers= {21,34,65,78};
		Character[] character= {'W','O','R','L','D'};
		String[] string= {"Banana","Apple","Orange","Pomegranate"};
		
		displayVal(numbers);
		displayVal(character);
		displayVal(string);
		
		displayVal(getFirst(numbers));
		displayVal(getFirst(character));
		displayVal(getFirst(string));
		
	}
	public static <Teneric> void displayVal(Teneric[] num) {
		for(Teneric e : num) {
			System.out.println(e);
		}
		System.out.println();
	}
	
	public static <T> T getFirst(T[] num) {
		return num[0];
	}

	/*public static void displayVal(Integer[] num) {
		for(Integer e : num) {
			System.out.println(e);
		}
		System.out.println();
	}
	public static void displayVal(Character[] Char) {
		for(Character e : Char) {
			System.out.println(e);
		}
		System.out.println();
	}
	public static void displayVal(String[] str) {
		for(String e : str) {
			System.out.println(e+"\t");
		}
		System.out.println();
	}*/
}
