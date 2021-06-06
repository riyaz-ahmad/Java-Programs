/*
 *Multiple inheritance is not supported by java classes
 * It is achieved throug the interfaces
 *Also Hybrid inheritance is achieved throug java interfaces as these are also not supported by java classes
*/

package Interface;

interface One{
	public void printOne();
}

interface Two{
	public void printTwo();
}

interface Three extends One, Two{
	public void printThree();
}

class MultipleInher implements Three{
	public void printOne(){
		System.out.println("printOne() method of class One");
	}
	
	public void printTwo(){
		System.out.println("printTwo() method of class Two");
	}
	
	public void printThree(){
		System.out.println("printThree() method of class Three");
	}
}





class MultipleInheritance{

	public static void main(String []a){
		MultipleInher m = new MultipleInher();
		m.printOne();
		m.printTwo();
		m.printThree();
	}
	
}