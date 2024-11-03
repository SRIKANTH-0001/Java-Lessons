//Main Class
package Main;
public class Main{
	public static void main(String[] args) {
		//Constructors OverLoading
		
		//--It's explained as the same constructor name but,different parameters.
		
		Trip trip =new Trip();
		
		System.out.println("Here,Are the things you have!!");
		System.out.println(trip.Documents);
		System.out.println(trip.Money);
		System.out.println(trip.Electronics);
		System.out.println(trip.Cloths);
	}
}

//Trip class
package Main;
public class Trip {
	String  Documents;
	int Money;
	String Electronics;
	String Cloths;
	
	Trip(String  Documents,int Money,String Electronics,String Cloths){
		this.Documents=Documents;
		this.Money=Money;
		this.Electronics=Electronics;
		this.Cloths=Cloths;
		
	}
	Trip(String  Documents,int Money,String Electronics){
		this.Documents=Documents;
		this.Money=Money;
		this.Electronics=Electronics;
	}
	
	Trip(String  Documents,int Money){
		this.Documents=Documents;
		this.Money=Money;
	}
	
	Trip(String  Documents){
		this.Documents=Documents;
	}
	
	Trip(){
	}
	
}
