/*
 *This program demonstrates the concept of Multithtreading  by implementing the Runnable class
*/

package Multithreading;

class NewThread implements Runnable{
	Thread t;
	NewThread(){
		
		//creating the a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread "+t);
	}
	//Entry point for the second thread
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
			System.out.println("Child Thread Inteerrupted");
		}
	    System.out.println("Child Thread Exiting");
	}
}


class RunnableThreadMain{
	public static void main(String [] args){
		NewThread nt = new NewThread();
		nt.t.start();
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
	
}