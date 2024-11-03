//Main class
package Main;

public class Main {

	public static void main(String[] args) {
	//Polymorphism-'Poly'means many 'Morphism' means Forms
		
		Root root=new Root();
		Leaves leaf=new Leaves();
		Flowers flowers =new Flowers();
		
		Tree[] parts= {root,leaf,flowers};
	
		/*root.Info();
		leaf.Info();
		flowers.Info();
	    */
		for(Tree x:parts) {
			x.Info();	
		}
	}
}

//Tree Class
package Main;

public class Tree {

	public void Info(){	
	}
}

//Root Class
package Main;

public class Root extends Tree {
	@Override
	public void Info() {
		System.out.println("Root Grows Underground & Anchors the Tree!!");
	}
}

//Leaves class
package Main;

public class Leaves extends Tree {
	@Override
	public void Info() {
		System.out.println("Leaf is a Part of tree ,Where the Photosynthesis Occures!! ");
	}
}

//Flowers class
package Main;

public class Flowers extends Tree {
	@Override
	public void Info() {
		System.out.println("The flower can produce Fruits and Vegitables");
	}
}

