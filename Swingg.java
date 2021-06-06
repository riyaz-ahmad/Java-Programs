import javax.swing.*;

class Swingg{
	
	//Swingg(){
		
	//}
	
	public static void main(String []a){
		JFrame f;
		//new Swingg();
		f = new JFrame();
		JButton b = new JButton("click me");
		b.setBounds(130,100,100,40);
		f.add(b);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}