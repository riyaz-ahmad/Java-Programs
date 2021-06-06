/**
  *This is a simple program of swqing which demonstrates the concept of painting in swing
  *uses PaintPanel class extending from the JPanel
 **/
 
package myswing;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//paintPanel class extends JPanel
class PaintPanel extends JPanel{
	
	//Panel Insets i.e, Dimensions
	Insets ins;
	//Random for generating the random number
	Random rand;
	
	PaintPanel(){
		//Put border around panel
		setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		rand = new Random();
	}
	
	//override Paint Component Method
	protected void paintComponent(Graphics g){
		//always call super class methods first
		super.paintComponent(g);
		int x,y,x1,y1;
		//get height and width of component
		int height = getHeight();
		int width  = getWidth();
		
		//Get Insets
		ins = getInsets();
		
		//Draw Ten lines whose end points are generated randomly
		for(int i=0;i<10;i++){
			x = rand.nextInt(width-ins.left);
			y = rand.nextInt(height-ins.bottom);
			x1 = rand.nextInt(width-ins.left);
			y1 = rand.nextInt(height-ins.bottom);
			
			//draw lines
			g.drawLine(x,y,x1,y1);
		}
	}
}


//Main Class 
class PaintMainSwing3{
	JLabel jl;
	PaintPanel pp;
	
	PaintMainSwing3(){
		JFrame jf = new JFrame("Paint Example");
		jf.setSize(800,600);
		//close program on closing the app
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating new paint panel
		pp = new PaintPanel();
		jf.add(pp);
		jf.setVisible(true);
	}
	
	public static void main(String [] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new PaintMainSwing3();
			}
		});
	}
	 
 }