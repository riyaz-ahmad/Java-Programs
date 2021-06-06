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
		System.out.println()
	}
}



class WIthoutInterThreadComm{
	public static void main(String [] args){
		
	}
}