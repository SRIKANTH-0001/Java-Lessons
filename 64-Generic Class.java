//Main Class
package Main;
public class Main {

	public static void main(String[] args) {
	 Myclass<String,String> tree=new Myclass<>("Let's Plant the tree's to get enough Rain","32");
	 Myclass<String,String> neem=new Myclass<>("Neem has some Medical Uses","23");
	 //Myclass<String,Integer> leaf=new Myclass<>("Leaf is a Part of tree ,Where the Photosynthesis Occures!!",3);
	 //Myclass<String,Integer> flower=new Myclass<>("The flower can produce Fruits and Vegitables",2);

    System.out.println(tree.getValue()); 
	System.out.println(neem.getValue());
	//System.out.println(leaf.getValue());
	//System.out.println(flower.getValue());		
}
}
//MyClass Class
    
    package Main;
    //Bounded Types--We Can Restrict the Input by extends Keyword  
    public class Myclass <Teneric extends String,Teneric2 extends String>{
		 
	Teneric X;
	Teneric2 X2;
	
	Myclass(Teneric X,Teneric2 X2){
		this.X=X;
		this.X2=X2;
	    }
	
	public Teneric2  getValue() {
		return X2;
	    }
    }

	
	/* Tree tree=new Tree();
	 Neem neem=new Neem();
	 Leaves leaf=new Leaves();
	 Flowers flower=new Flowers();

	 tree.Info();
	 neem.Info();
	 leaf.Info();
	 flower.Info();
	*/
		
}
}
/*
//Tree class
package Main;

public class Tree {

	public void Info() {
		System.out.println("Let's Plant the tree's to get enough Rain");
	}
}

//Flowers class
package Main;

public class Flowers  {
	public void Info() {
		int count =2;
		System.out.println(count);
	}
}
//Leaves class 
package Main;

public class Leaves  {
	public void Info() {
		System.out.println("Leaf is a PAt of tree ,Where the Photosynthesis Occures!! ");
	}
}

//Neem Class
package Main;

public class Neem{
		public void Info() {
			System.out.println("Neem has some Medical Uses");
		}
}
