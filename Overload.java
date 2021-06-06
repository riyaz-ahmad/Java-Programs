import java.util.Scanner;

//program demonstrating the concept of method overloading, add() method is overloaded
class DemoOverload{
	//Takes no parameters and return nothing
	void add(){
		int x, y, z;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		x = scan.nextInt();
		y = scan.nextInt();
		z = x+y;
		System.out.println("Addition : "+z);
	}
	
	//Takes two float type parameters and return a float
	float add(float a, float b){
		System.out.println("Addition is: ");
		return a+b;
	}
	
	//takes two Long parameters and return a double
	long add(long a, long b){
		System.out.println("Addition is : ");
		return a+b;
	}
	
	//takes parameters two int  and does not return anything
	void add(int a, int b){
		System.out.println("Addition is "+(a+b));
	}
}

//Driver class containing the main method
class Overload{
	public static void main(String [] args){
		DemoOverload d = new DemoOverload();
		d.add();
		System.out.println(d.add(500.50F, 500.50F));
		System.out.println(d.add(12000000L, 120000000L));
		d.add(240,32000);
	}
}