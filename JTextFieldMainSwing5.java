/***
 *This program demonstrates the concept of JTextField
**/

package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JTextFieldMainSwing5{
	JTextFieldMainSwing5(){
		JFrame f = new JFrame("JTextField");
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		
		//add JTextField
		JTextField t = new JTextField(15);
		f.add(t);
		
		//add label
		JLabel l = new JLabel();
		f.add(l);
		
		//Handling the events
		t.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				l.setText(t.getText());
			}
		});
		f.setVisible(true);
	}
	
	public static void main(String [] args ){
		SwingUtilities.invokeLater( new Runnable(){
			public void run(){
				new JTextFieldMainSwing5();
			}
		});
	}
	
}