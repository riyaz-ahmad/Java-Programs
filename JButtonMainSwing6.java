/**
  *This is program simply demonstrates the icon basewd JButton
**/

package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class JButtonMainSwing6 implements ActionListener{
	JLabel jl;
	
	JButtonMainSwing6(){
		//set up the frame
		JFrame f = new JFrame("JButton");
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,450);
		
		//Add buttons to content Panel
		ImageIcon i1 = new ImageIcon("imga.jpg");
		JButton jb = new JButton(i1);
		jb.setActionCommand("IMG A");
		jb.addActionListener(this);
		f.add(jb);
		
		ImageIcon i2 = new ImageIcon("imgb.jpg");
		jb = new JButton(i2);
		jb.setActionCommand("IMG B");
		jb.addActionListener(this);
		f.add(jb);
		
		ImageIcon i3 = new ImageIcon("imgc.jpg");
		jb = new JButton(i3);
		jb.setActionCommand("IMG C");
		jb.addActionListener(this);
		f.add(jb);
		
		ImageIcon i4 = new ImageIcon("imgd.jpg");
		jb = new JButton(i4);
		jb.setActionCommand("IMG D");
		jb.addActionListener(this);
		f.add(jb);
		
		//create and add a label
		jl = new JLabel("Choose One");
		f.add(jl);
		
		//display the frame
		f.setVisible(true);
	}
	
	//Handle the Button Events
	public void actionPerformed(ActionEvent ae){
		jl.setText("You Selected "+ ae.getActionCommand());
	}
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			new JButtonMainSwing6(); 
			}
		});
	}
}