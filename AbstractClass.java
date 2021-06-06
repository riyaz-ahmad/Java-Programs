//demonstration for abstract class

/**
* Defining an abstract class
* @Riyaz
*/
abstract class Figure{
	int d1;
	int d2;
	Figure(int a, int b){
		d1 = a;
		d2 = b;
	}
	//abstract method 
	abstract void area();
}

class Rectangle extends Figure{
	Rectangle(int a, int b){
		super(a,b);
	}
	
	//overridding area() abstract method
	void area(){
		int a;
		a = d1*d2;
		System.out.println("Rectangle-----Area : " +a);
	}
}

class Triangle extends Figure{
	Triangle(int a, int b){
		super(a,b);
	}
	
	//overridding area() abstract method
	void area(){
		int a;
		a = (d1*d2)/2;
		System.out.println("Triangle----Area : "+ a);
	}
}
class AbstractClass{
	public static void main(String [] args){
		//Figure f =  new Figure(10,5);  -> This will cause erroe as abstract class cannot be instantiated
		Rectangle r = new Rectangle(10,5);
		Triangle t = new Triangle(5,6);
		
		//creating reference of Figure class
		Figure fref;
		//Referencing Rectangle class' object
		fref = r;
		fref.area();
		
		//Referencing Triangle class' object
		
		fref = t;
		fref.area();
	}
}