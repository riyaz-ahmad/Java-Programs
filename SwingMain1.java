/**
   *This program is simple demonstration of a swing application
   * Call this program SwingMain1.java
  
**/

package myswing; 


import javax.swing.*;


class SwingMain1{
	SwingMain1(){
	//creating a new JFrame container
	JFrame f = new JFrame("Simple Application");
	
	//Setting the size of frame
	f.setSize(500,500);
	
	//Terminate thge program when user closes the application
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//create a text label
	JLabel l = new JLabel("Simple text based ");
	
	//Add the lkabel to content pane
	f.add(l);
	
	//display the frame
	f.setVisible(true);
	}
	
	public static void main(String [] a){
		//creating the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable(){
		public void run(){ new SwingMain1();}
		});
	}
}