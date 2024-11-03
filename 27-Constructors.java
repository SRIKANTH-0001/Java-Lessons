//Main Class

package Main;
public class Main{
	public static void main(String[] args) {
		//Constructors
		//syntax:
		       //name of the class(){Body of method}
		Phone MyPhone=new Phone("Samsung",22,"Awesome");
		Phone MyPhone2=new Phone("Vivo",35,"Perfect");

		System.out.println(MyPhone2.Brand);
		System.out.println(MyPhone2.Quality);
        /* MyPhone.WithoutCharger();
		MyPhone2.WithCharger();*/
	}
}

//Phone Class
package Main;

public class Phone {

	String Brand;
	int Model;
	String Quality;
	
	Phone(String Brand,int Model,String Quality){
		this.Brand=Brand;
		this.Model=Model;
		this.Quality=Quality;
	}
	
	void WithoutCharger() {
		System.out.println(this.Brand+" Doesn't provide charger Within it ");
	}
	void WithCharger() {
		System.out.println(this.Brand+" provide charger Within it ");
	}
	
}

