//Main class
package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//File Readers
		//When We are using read method then,it return the value in integer type
		
		try {
			FileReader get=new FileReader("NormalText.txt");
			int info=get.read();
			while(info !=-1) {
				System.out.print((char)info);
				info=get.read();
			}
			get.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	

// the text File Contains
In the still of night,
Dreams take flight ,
Star whispers secret ,
Eternal wonders in the Moon's Soft Light...

Written By Srikanth??  