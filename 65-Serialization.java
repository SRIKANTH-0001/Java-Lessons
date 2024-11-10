//--+ Serialization
package Main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {

	public static void main(String[] args) throws IOException {
	
		//Serialization --Objects to ByteStream
		
		Serial sl=new Serial();
		
		FileOutputStream fout=new FileOutputStream("Byte.ser");
		ObjectOutputStream Oout=new ObjectOutputStream(fout);
		Oout.writeObject(sl);
		
		Oout.close();
		fout.close();
	
		sl.Name="Srikanth";
		sl.Qualification="Degree";
		sl.Age=22;
		
		System.out.println("Objects are Successfully Converted Into ByteStream");
		
		long serialVersionUID=ObjectStreamClass.lookup(sl.getClass()).getSerialVersionUID(		System.out.println(serialVersionUID);
	}
}

//Serial Class
package Main;

import java.io.Serializable;

public class Serial implements Serializable{

	private static final long serialVersionUID = 1L;
	String Name;
	String Qualification;
	int Age;
	
	public void printVal() {
		System.out.println("Hey!I know you "+Name);
	}
}

//--+ De-Serialization
//Main Class
package DeSerial;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Serial sl=null;
		
		FileInputStream fin=new FileInputStream("C:\\Users\\2020t\\eclipse-workspace\\MyFirstProgram\\Byte.ser");
		ObjectInputStream Oin=new ObjectInputStream(fin);
		sl=(Serial) Oin.readObject();
		Oin.close();
		fin.close();

		System.out.println(sl.Name);
		System.out.println(sl.Qualification);
		System.out.println(sl.Age);
		sl.printVal();	
	}
}
//Serial Class
package DeSerial;

import java.io.Serializable;
public class Serial implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	String Name;
	String Qualification;
	int Age;
	
	public void printVal() {
		System.out.println("Hey!I know you "+Name);
	}
}










