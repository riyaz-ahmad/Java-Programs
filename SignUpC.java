/*


*/

package myswing;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class SignUpC extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JRadioButton r1,r2,r3,r4;
	JButton b1,b2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JTextField t1;
	
	public SignUpC(){
		setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("NEW ACCOUNT APPLICATION FORM-PAGE 3");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad = " ";
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM-Page 3");
		
		
		l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		
		l2 = new JLabel("Account Type");
		l2.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l3 = new JLabel("Card Number");
		l3.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l4 = new JLabel("xxxx-xxxx-xxxx-4184");
		l4.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l5 = new JLabel("(Your 16 Digit Card Number)");
		l5.setFont(new Font("Raleway", Font.BOLD, 10));
		
		l6 = new JLabel("(It will be displayed on ATM card/ Cheque Book and Statements)");
		l6.setFont(new Font("Raleway", Font.BOLD, 10));;
		
		l7 = new JLabel("PIN");
		l7.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l8 = new JLabel("XXXX");
		l8.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l9 = new JLabel("4-Digit Password");
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l10 = new JLabel("Services Required");
		l10.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l11 = new JLabel("Form No.");
		l11.setFont(new Font("Raleway", Font.BOLD, 18));
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Raleway", Font.BOLD, 14));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Raleway", Font.BOLD, 14));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c2 = new JCheckBox("Intermet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c4 = new JCheckBox("SMS/E-mail Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c6 = new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway", Font.BOLD, 16));
		
		c7 = new JCheckBox("I hereby decleare that the above correct and i'll show my docs", true);
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway", Font.BOLD, 16));
		r2.setBackground(Color.WHITE);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway", Font.BOLD, 16));
		r3.setBackground(Color.WHITE);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway", Font.BOLD, 16));
		r4.setBackground(Color.WHITE);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway", Font.BOLD, 16));
		r1.setBackground(Color.WHITE);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway", Font.BOLD, 12));
		
		
		setLayout(null);
		
		
		l11.setBounds(300,10,90,30);
		add(l11);
		
		t1.setBounds(400,10,60,30);
		add(t1);
		
		l1.setBounds(250, 40,300,30);
		add(l1);
		
		l2.setBounds(100,140,200,30);
		add(l2);
		
		r1.setBounds(100,180,150,30);
		add(r1);
		
		r2.setBounds(350,180,300,30);
		add(r2);
		
		r3.setBounds(100,220,250,30);
		add(r3);
		
		r4.setBounds(350,220,250,30);
		add(r4);
		
		l3.setBounds(100,275,200,30);
		add(l3);
		
		l4.setBounds(330,275,250,30);
		add(l4);
		
		l5.setBounds(100,300,350,20);
		add(l5);
		
		l6.setBounds(330,300,750,20);
		add(l6);
		
		l7.setBounds(100,370,200,30);
		add(l7);
		
		l8.setBounds(330,370,200,30);
		add(l8);
		
		l9.setBounds(100,420,200,20);
        add(l9);		
		
		l10.setBounds(100,460,200,30);
		add(l10);
		
		c1.setBounds(100,500,200,30);
		add(c1);
		
		c2.setBounds(350,500,200,30);
		add(c2);
		
		c3.setBounds(100,550,200,30);
		add(c3);
		
		c4.setBounds(350,550,200,30);
		add(c4);
		
		c5.setBounds(100,600,200,30);
		add(c5);
		
		c6.setBounds(350,600,200,30);
		add(c6);
		
		c7.setBounds(100,650,400,30);
		add(c7);
		
		b1.setBounds(300,720,100,30);
		add(b1);
		
		b2.setBounds(420,720,100,30);
		add(b2);
		
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(850,850);
		setLocation(5,5);
		setVisible(true);
		
		b1.addActionListener(this);
		//b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		String s = null;
		if(r1.isSelected())
			s = "Saving Account";
		else if(r2.isSelected())
			s = "Fixed Deposit Account";
		else if(r3.isSelected())
			s = "Current Account";
		else if(r4.isSelected())
			s = "Recurring Deposit Account";
		
		Random ran = new Random();
		long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
		long first8 = Math.abs(first7);
		
		long first3 = (ran.nextLong() % 9000L) + 1000L;
		long first4 = Math.abs(first3);
		
		String b = "";
		if(c1.isSelected())
			b += " ATM Card";		
		else if(c2.isSelected())
			b += " Internet Banking";
		else if(c3.isSelected())
			b += " Mobile Banking";
		else if(c4.isSelected())
			b += " SMS/E-mail Alerts";
		else if(c5.isSelected())
			b += " Cheque Book";
		else if(c6.isSelected())
			b += " E-Statement";
		
		String c = t1.getText();
		
		try{
            if(ae.getSource() == b1){
				if(b.equals(""))
                JOptionPane.showMessageDialog(null, "Fill all the items required");
            
               else{
                    Conn c1 = new Conn();
					String q1 = "insert into signup3 values('"+a+"', '"+first8+"','"+first4+"','"+b+"','"+c+"')";
					String q2 = "insert into signup3 values('"+first8+"', '"+first4+"')";
					c1.s.executeUpdate(q1);
					c1.s.executeUpdate(q2);*/
					
					JOptionPane.showMessageDialog(null, "Card Number: "+ first8+"\n Pin: "+ first4);
				   
					/*new Deposit.setVisible(true);
					setVisible(false);*/
				 }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
	}
	public static void main(String [] args){
		new SignUpC().setVisible(true);
	}
	
	
}