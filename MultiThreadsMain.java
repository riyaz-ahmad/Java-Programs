/*
 *This program demonstrates the concept of creating the multi-threads is side a program
*/

package Multithreading;

class MultiThreads implements Runnable{
	String name;
	Thread t;
	MultiThreads(String name){
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New Thread "+t);
	}
	
	//creating a run function
	public void run(){
		try{
			for(int i=1;i<5;i++)
				System.out.println(this.name+" Thread: "+i);
			Thread.sleep(500);
		}catch(InterruptedException e){
			System.out.println("Caught Exception in "+name);
		}
		System.out.println("Exiting thread "+name);
	}
}


class MultiThreadsMain{
	public static void main(String [] args){
		MultiThreads t1 = new MultiThreads("One");
		MultiThreads t2 = new MultiThreads("Two");
		MultiThreads t3 = new MultiThreads("Three");
		MultiThreads t4 = new MultiThreads("Four");
		
		//strating the threads
		t1.t.start();
		t2.t.start();
		t3.t.start();
		t4.t.start();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting main Thread");
	}
}