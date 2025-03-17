package Main;
//Import necessary packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the Number:");
		InputStreamReader in=new InputStreamReader(System.in);
  
  //To use the bufferedReader ,first we have to declare InputStreamReader
		BufferedReader bf=new BufferedReader(in);
  
  //Now, we can read the input from user and it can only read string 
  //so,convert the int to string
		int num=Integer.parseInt(bf.readLine());
		
		System.out.println(num);
	}
}
