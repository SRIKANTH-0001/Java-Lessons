//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Super Keyword
		//It refers to the Super Class of an object or we can say it's similar to this keyword 
		
		copyPhoto p1=new copyPhoto(2.5,"Yellow","Don't Worry!",true);
		copyPhoto p2=new copyPhoto(5.5,"Red","You gonna Worry!",true);
		
		System.out.println(p2.toString());
		
	}
}

//originalPhoto Class
package Main;

public class originalPhoto {
	
	double Size;
	String Color;
	originalPhoto(double Size,String Color){
		this.Size=Size;
		this.Color=Color;
	}
	
	public String toString() {
		return this.Size+"\n"+this.Color+"\n";
	}
}

//copyPhoto Class
package Main;

public class copyPhoto extends originalPhoto {

	String CopyMiss;
	boolean isitCopy;
	
	copyPhoto(double Size,String Color,String CopyMiss,boolean isitCopy){
		super(Size,Color);
		this.CopyMiss=CopyMiss;
		this.isitCopy=isitCopy;
	}
	public String toString() {
		return super.toString()+"\n"+this.CopyMiss+"\n"+isitCopy+"\n";
	}
}
