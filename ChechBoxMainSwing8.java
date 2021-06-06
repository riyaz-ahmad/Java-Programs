/**
  * This Program simply demonstrates the concept of Check Boxes
**/


package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ChechBoxMainSwing8 implements ItemListener{
	JLabel jl;
	ChechBoxMainSwing8(){
		JFrame f = new JFrame("Check Boxes");
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,500);
		
		//add Check Boxes
		JCheckBox cb = new JCheckBox("C-Language");
		cb.addItemListener(this);
		f.add(cb);
		
		cb = new JCheckBox("C++ Language");
		cb.addItemListener(this);
		f.add(cb);
		
		cb = new JCheckBox("Java Language");
		cb.addItemListener(this);
		f.add(cb);
		
		//create and add Label
		jl = new JLabel("Select any Language");
		f.add(jl);
		
		f.setVisible(true);		
	}
	
	//Handle Item Events for the Checkbox
	public void itemStateChanged(ItemEvent ie){
		JCheckBox cb = (JCheckBox) ie.getItem();
		if(cb.isSelected())
			jl.setText(cb.getText() + "is selected");
		else
			jl.setText(cb.getText() + " is selected");	
	}
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new ChechBoxMainSwing8();
			}
		});
	}
}