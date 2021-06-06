/*
 *This program demonstratea the asynchronous nature of multithreads
*/

package Multithreading;


class AsynchronousCallMe{
	void call(String msg){
		System.out.println("["+msg);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Caught Exception");
		}
		System.out.println("]");
	}
}

class AsynchronousCaller implements Runnable{
	String msg;
	AsynchronousCallMe target;
	Thread t;
	AsynchronousCaller(AsynchronousCallMe target, String msg){
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
	}
	
	public void run(){
		target.call(msg);
	}
}

class AsychronousThreadsMain{
	public static void main(String [] args){
		AsynchronousCallMe target = new AsynchronousCallMe();
		AsynchronousCaller c1 = new AsynchronousCaller(target, "Hello");
		AsynchronousCaller c2 = new AsynchronousCaller(target, "Multithreading");
		AsynchronousCaller c3 = new AsynchronousCaller(target, "World");
		
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