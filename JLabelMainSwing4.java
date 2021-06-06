/**
   * This program demonstrates the concept of JLabel
   * It adds a lebale having both icon as well as text
**/


package myswing;


import java.awt.*;
import javax.swing.*;


public class JLabelMainSwing4{
	public JLabelMainSwing4(){
		JFrame f = new JFrame("JLabel Program");
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,800);
		
		//create an icon
		ImageIcon i = new ImageIcon("IMG.jpg");
		
		//create a Label
		JLabel l = new JLabel("Nature", i, JLabel.CENTER);
		f.add(l);
		f.setVisible(true);
	}
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new JLabelMainSwing4();
			}
		});
	}
}