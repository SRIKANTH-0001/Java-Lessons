//Main Classu

package Main;
public class Main {

	public static void main(String[] args) throws InterruptedException{
	
	//Threads--Thread is a tiny Program which Executed Continuously Until finding the 
		//--1.exit Method
		//--2.or After All threads died
		
		/*System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		System.out.println();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		*/
		
		/*Serial t1=new Serial();
		t1.start();
		*/
		
		/*t1.setName("Srikanth");
		System.out.println(t1.getName());
		t1.setPriority(3);
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
*/
		//System.out.println(Thread.activeCount());
		
		
		for(int x=10;x>0;x--) {
			System.out.println("Number"+x);
			Thread.sleep(1000);
		}
		
	}
}




//Serial Class
package Main;

public class Serial extends Thread{
	@Override
	public void run() {
		System.out.println("This is The thread currnetly Running!!");
	}	
}
