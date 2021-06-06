/*
 *This program demonstrates the concept of Multithtreading  by implementing the Runnable class
*/

package Multithreading;

class NewThreadOne extends Thread{
	NewThreadOne(){
		//creating a new second thread
		super(" Demo Thread");
		System.out.println("Child Thread "+this);
	}
		
		//creating a run function
		public void run(){
			try{
				for(int i=1;i<6;i++)
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("Exception Caught in child thread");
			}
			System.out.println("Exiting child thread");
		}
}

class ExtendThreadMain{
	public static void main(String [] args){
		NewThreadOne n = new NewThreadOne();
		n.start();
		try{
			for(int i=1;i<6;i++)
				System.out.println("Main Thread: "+ i);
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Caught Exception in main thread");
		}
		System.out.println("Exiting Main Thread");
	}
	
}