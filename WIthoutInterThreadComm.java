/* 
 *This program demonstrates the concept of interthread communication 
 *without using the wait() and notify() methods i.e. without interthread communication
*/

package Multithreading;

class Q1{
	private int n;
	synchronized int get(){
		System.out.println("Got: "+n);
		return n;
	}
	
	synchronized void put(int n){
		this.n = n;
		System.out.println("Put: "+n);
	}
}

class Producer1 implements Runnable{
	Q1 q;
	Thread t;
	Producer1(Q1 q){
		this.q = q;
		t = new Thread(this,"Producer1");
	}
	
	public void run(){
		int i=0;
		while(true)
			q.put(i++);
	}
}

class Consumer1 implements Runnable{
	Q1 q;
	Thread t;
	Consumer1(Q1 q){
		this.q = q;
		t = new Thread(this,"Consumer1");
	}
	
	public void run(){
		while(true)
			q.get();
	}
}



class WIthoutInterThreadComm{
	public static void main(String [] args){
		Q1 q = new Q1();
		Producer1 p = new Producer1(q);
		Consumer1 c = new Consumer1(q);
		
		p.t.start();
		c.t.start();
		
		System.out.println("Enter ctrl+c to exit");
		
	}
}