/***
   *This program demonstrates the simple event handling by the swing
   *Call this program EventMainSwing2.java
**/   

package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class EventMainSwing2{
	JLabel jl;
	
	EventMainSwing2(){
		//create a new frame
		JFrame jf = new JFrame("Event Frame");
		// specify the layout
		jf.setLayout(new FlowLayout());
		//set size of frame
		jf.setSize(500,500);
		//Terminate thge program on closing the application
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Make two buttons a and b
		JButton a = new JButton("Alpha");
		JButton b = new JButton("Beta");
		
		//Add Action Listener to the Button and
		a.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jl.setText("BUtton Alpha a was pressed");
			}
		});
		
		//Add action listener for Button buttons
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jl.setText("Button Beta b was pressed");
			}
		});
		
		//add buttons to content pane
		jf.add(a);
		jf.add(b);
		
		//create text based label
		jl = new JLabel("Press Any Button");
		
		jf.add(jl);
		
		jf.setVisible(true);
	}
	
	public static void main(String [] args){
		//Event Dispatching Thread
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new EventMainSwing2();
			}
		});
	}
	
	
}