//Main Class
package Main;

public class Main {

	public static void main(String[] args) {
		
		//Copying The Objects
		
		SchoolBoy David=new SchoolBoy(true,true,true);
		
		SchoolBoy Mitchell=new SchoolBoy(David);
		
	//	Mitchell.copy(David);
		
		
		System.out.println(David);
		System.out.println(Mitchell);
		System.out.println();
		System.out.println(David.getLunch()); 
		System.out.println(David.getPen()); 
		System.out.println(David.getPencil()); 
		System.out.println();
		System.out.println(Mitchell.getLunch()); 
		System.out.println(Mitchell.getPen()); 
		System.out.println(Mitchell.getPencil()); 
	}

}

//SchoolBoy Class
package Main;

public class SchoolBoy {

	private boolean Pen;
	private boolean Pencil;
	private boolean Lunch;
	
	SchoolBoy(boolean Pen,boolean Pencil,boolean Lunch){
		this.setPen(Pen);
		this.setPencil(Pencil);
		this.setLunch(Lunch);
	}
	
	SchoolBoy(SchoolBoy Z){
		copy(Z);
	}
	
	public boolean getPen() {
		return Pen;
	}
	public boolean getPencil() {
		return Pencil;
	}
	public boolean getLunch() {
		return Lunch;
	}
	public void setPen(boolean Pen) {
		this.Pen=Pen;
	}
	public void setPencil(boolean Pencil) {
		this.Pencil=Pencil;
	}
	public void setLunch(boolean Lunch) {
		this.Lunch=Lunch;
	}
	
	public void copy(SchoolBoy z) {
		this.setPen(z.getPen());
		this.setPencil(z.getPen());
		this.setLunch(z.getLunch());
	}

}

