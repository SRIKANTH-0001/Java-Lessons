package Main;

public class Main{
	public static void main(String[] args) {
	
		//2D Arrays
String[][] Mobiles= new String[3][3];
		
		Mobiles[0][0]="Oppo";
		Mobiles[0][1]="Samsung";
		Mobiles[0][2]="Infinix";
		
		Mobiles[1][0]="Iphone";
		Mobiles[1][1]="Redmi";
		Mobiles[1][2]="Realme";
		
		Mobiles[2][0]="Vivo";
		Mobiles[2][1]="Micomax";
		Mobiles[2][2]="Nokia";
		
		for(int i=0;i<Mobiles.length;i++) {
			System.out.println();
			for(int j=0;j<Mobiles[i].length;j++) {
				System.out.print(Mobiles[i][j]+" ");
			}
		}
		
		
		
	
	}
}


/*package Main;

public class Main{
	public static void main(String[] args) {
	
		//2D Arrays
String[][] Mobiles= {
						{"Oppo","Samsung","Infinix"},
						{"Iphone","Redmi","Realme"},
						{"Vivo","Micomax","Nokia"}
					};

		for(int i=0;i<Mobiles.length;i++) {
			System.out.println();
			for(int j=0;j<Mobiles[i].length;j++) {
				System.out.print(Mobiles[i][j]+" ");
			}
		}
		
		
		
	
	}
}*/

