import java.awt.*;
 class Awt1 extends Frame{
	 Awt1(){
		 Button b = new Button("click me");
		 b.setBounds(30,100,30,80);
		 
		 TextField t = new TextField();
		 t.setBounds(30,100,80,30);
		 
		 add(t);
		 add(b);
		 setSize(600,600);
		 setLayout(null);
		 setVisible(true);
	 }
	 public static void main(String ar[])
	 {
		 Awt1 a = new Awt1();
	 }
 }