/***
  * Thiws program simply demonstrates the concept of JScrollPane
**/


package myswing;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class JScrollPaneMainSwing9{
	public JScrollPaneMainSwing9(){
		//set up the Frame
		JFrame f = new JFrame("JScroll Pane");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(60,500);
		
		//CREATE A PANEL AND ADD 400 BUTTONS
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout());
		int b = 0;
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				jp.add(new JButton("Button "+ b));
				b++;
			}
		}
		
		//create the Scroll Pane
		JScrollPane jsp = new JScrollPane(jp);
		f.add(jsp, BorderLayout.CENTER);
		f.setVisible(true);
		
	}
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new JScrollPaneMainSwing9();
			}
		});
	}
}