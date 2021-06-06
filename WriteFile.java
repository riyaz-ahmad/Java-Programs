
/*      not fully implemented             */



/*
 *This program demonstrates the concept of file writing
 *this uses writing() method to read from a file
 *Run by using thr command: java WriteFile TEST.TXT
*/

package p1;

import java.io.*;
import java.util.Scanner;

class WriteFile{
	public static void main(String [] args){
	    String s;
		int i = 0;
		FileOutputStream fout = null;
		Scanner sc = new Scanner(System.in);
		//check whether file has been mentioned or not
		if(args.length != 1){
			System.out.println("Plz mention file");
			return;
		}
		
		//writes into the file
		try{
			fout = new FileOutputStream(args[0]);
			System.out.println("plz enter data into the file");
			
			while(i != -1){
				i = sc.nextInt();
				fout.write(i);
			}
			}catch (IOException e){
				System.out.println("Error: "+e.getMessage());
			}
		
		//closing a file in a finally block
		finally{
			try{
				if(fout != null)
					fout.close();
			}catch(IOException e){
				System.out.println("Error in closing");
			}
		}
		
		
		//Reading for file
		System.out.println("=====================================================");
		FileInputStream fin = null;
		if(args.length != 1){
			System.out.println("Plz mention file");
			return;
		}
		try{
			fin  = new FileInputStream(args[0]);
			do{
				i = fin.read();
				if(i != -1)
					System.out.println(i);
			}while(i != -1);
		}catch (IOException e){
				System.out.println("Error: "+e.getMessage());
			}
			//closing a file in a finally block
		finally{
			try{
				if(fout != null)
					fout.close();
			}catch(IOException e){
				System.out.println("Error in closing");
			}
		}
		
		
	}
}