//Main class
package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//Dynamic Polymorphism

		Tree tree;
		Scanner A=new Scanner(System.in);
		
		System.out.println("What tree Are you Want to buy??\nHere are the Options");
		System.out.println("Option 1.Neem tree\nOption 2.Coconut tree");
		int reply=A.nextInt();
		
		if(reply==1) {
			tree=new Neem();
			tree.Info();
		}
		else if(reply==2) {
			tree=new Coconut();
			tree.Info();
		}
		else {
			tree=new Tree();
			System.out.println("Your Choice isn't Available");
			tree.Info();
		}
	}	
}

//Tree Class
package Main;

public class Tree {

	public void Info() {
		System.out.println("Let's Plant the tree's to get enough Rain");
	}
}

//Neem Class
package Main;

public class Neem extends Tree{
    @Override
		public void Info() {
			System.out.println("Neem has some Medical Uses");
		}
}

//Coconut Class
package Main;

public class Coconut extends Tree {
		@Override
		public void Info() {
			System.out.println("Coconut used for cosmetic Purposes");
		}
}
