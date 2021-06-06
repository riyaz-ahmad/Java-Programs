/*
 *This program creates an example of Bank Account
 *This shows synchronous behavior of the program
 *we have used synchronized statement in this program i.e. synchronized block
*/

package Multithreading;

import java.util.Scanner;

class SynchronousAccount{
	private String name;
	private int bal;
	SynchronousAccount(int bal){
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

class SynchronousCustomer implements Runnable{
	private SynchronousAccount account;
	private String name;
	SynchronousCustomer(String name, SynchronousAccount account){
		this.name = name;
		this.account = account;
	}
	
	public void run(){
		int amt;
		Scanner s = new Scanner(System.in);
		synchronized(account){
			
		    System.out.println(name +" Enter amount to withdwraw");
	        amt = s.nextInt();
		    if(account.isEnough(amt)){
				System.out.println("For "+name);
			    account.withdrawl(amt);
		    }
		    else
			    System.out.println("Insufficient Balance");
		}
	}
}



public class SynchronousBankMain{
	public static void main(String [] args){
		SynchronousAccount a1 = new SynchronousAccount(1000);
		SynchronousCustomer c1 = new SynchronousCustomer("Raja", a1);
		SynchronousCustomer c2 = new SynchronousCustomer("Rahi", a1);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
	}
}