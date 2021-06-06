/* 
 *This program demonstrates the concept of interthread communication 
 *by using the wait() and notify() methods i.e. with interthread communication
*/

package Multithreading;

class Q2{
	private int n;
	private boolean valueset = false;
	synchronized int get(){
		while(!valueset){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Exception Caught");
			}
		}
		System.out.println("Got: "+n);
		valueset = false;
		notify();
		return n;
	}
	
	synchronized void put(int n){
		while(valueset){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Exception Caught");
			}
		}
		this.n = n;
		valueset = true;
		System.out.println("Put: "+n);
		notify();
	}
}

class Producer2 implements Runnable{
	Q2 q;
	Thread t;
	Producer2(Q2 q){
		this.q = q;
		t = new Thread(this,"Producer2");
	}
	
	public void run(){
		int i=0;
		while(true)
			q.put(i++);
	}
}

class Consumer2 implements Runnable{
	Q2 q;
	Thread t;
	Consumer2(Q2 q){
		this.q = q;
		t = new Thread(this,"Consumer2");
	}
	
	public void run(){
		while(true)
			q.get();
	}
}

class WithInterThreadComm{
	public static void main(String [] args){
		Q2 q = new Q2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);
		
		p.t.start();
		c.t.start();
		
		System.out.println("Enter ctrl+c to exit");
		
	}
}