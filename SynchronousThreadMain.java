/*
 *This program demonstratea the synchronous nature of multithreads
 *we can acieve synchronisation via two ways 
   ->by using synchronized methods
   ->by using synchronized statements(Synchronized block)
 *We use "synchronized" keyword
 *This Programs demonstrates the use of Synchronized methods
*/

package Multithreading;


class SynchronousCallMe{
	//creating a synchronized method
	synchronized void call(String msg){
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Caught Exception");
		}
		System.out.println("]");
	}
}

class SynchronousCaller implements Runnable{
	String msg;
	SynchronousCallMe target;
	Thread t;
	SynchronousCaller(SynchronousCallMe target, String msg){
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
	}
	
	public void run(){
		target.call(msg);
	}
}

class SynchronousThreadMain{
	public static void main(String [] args){
		SynchronousCallMe target = new SynchronousCallMe();
		SynchronousCaller c1 = new SynchronousCaller(target, "Hello");
		SynchronousCaller c2 = new SynchronousCaller(target, "Multithreading");
		SynchronousCaller c3 = new SynchronousCaller(target, "World");
		
		c1.t.start();
		c3.t.start();
		c2.t.start();
		
		//Waiting for threads to end by the use of join() method
		try{
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}
	}
}