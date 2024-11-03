//Main class
package Main;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		//File Writer
	try {
		FileWriter typed=new FileWriter("NormalText.txt");
		
		typed.write("This is Srikanth & You are Reading my handTyped Text \nI slit the sheet,the sheet i slit.On the Slitted Sheet I sit");
		typed.append("\n\nWritten by Srikanth");
		typed.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}

// In Text file
This is Srikanth & You are Reading my handTyped Text 
I slit the sheet,the sheet i slit.On the Slitted Sheet I sit

Written by Srikanth