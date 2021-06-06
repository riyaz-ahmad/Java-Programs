/**
  * This program demonstrates the concept of ToggleButtons
**/


package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class JToggleButtonsMainSwing7{
	
	JToggleButtonsMainSwing7(){
		JFrame f = new JFrame("JToggleBGuttons");
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		
		JLabel jl = new JLabel("Button is off");
		
		//Make the Toggle Buttons
		
		JToggleButton j= new JToggleButton("ON / OFF");	
		
		//Add ItemListener
		j.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent ie){
				if(j.isSelected())
					jl.setText("Button is ON");
				else
					jl.setText("Button is OFF");
			}
		});
		
		f.add(j);
		f.add(jl);
		
		f.setVisible(true);
	}
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new JToggleButtonsMainSwing7();
			}
		});
	}
}