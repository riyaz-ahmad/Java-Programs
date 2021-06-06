/*
 *This program creates an example of Bank Account
 *This shows Asynchronous behavior of the program
*/

package Multithreading;

import java.util.Scanner;

class AsynchronousAccount{
	private String name;
	private int bal;
	AsynchronousAccount(int bal){
		this.bal = bal;
	}
	
	public boolean isEnough(int w_amt){
		if (w_amt<bal)
			return true;
		else 
			return false;
	}
	
	public void withdrawl(int w_amt){
		bal -= w_amt;
		System.out.println("Withdrawl money : "+w_amt);
		System.out.println("Current Balance: "+bal);
	}
	
}

class AsynchronousCustomer implements Runnable{
	private AsynchronousAccount account;
	private String name;
	AsynchronousCustomer(String name, AsynchronousAccount account){
		this.name = name;
		this.account = account;
	}
	
	public void run(){
		int amt;
		Scanner s = new Scanner(System.in);
		System.out.println(name +" Enter amount to withdwraw");
	    amt = s.nextInt();
		
		if(account.isEnough(amt)){
			account.withdrawl(amt);
		}
		else
			System.out.println("Insufficient Balance");
	}
}



public class AsynchronousBankMain{
	public static void main(String [] args){
		AsynchronousAccount a1 = new AsynchronousAccount(1000);
		AsynchronousCustomer c1 = new AsynchronousCustomer("Raja", a1);
		AsynchronousCustomer c2 = new AsynchronousCustomer("Rahi", a1);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
	}
}