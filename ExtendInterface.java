/*
 *This program is used to demonstrate the concept that interfaces can be extended as classes
*/
package Interface;
interface Extend1{
	void method1();
}

interface Extend2 extends Extend1{
	void method2();
}

interface Extend3 extends Extend2{
	void method3();
}

class ExtendClass implements Extend3{
	public void method1(){
		System.out.println("Extend1's method1()");
	}
	public void method2(){
		System.out.println("Extend2's method2()");
	}
	public void method3(){
		System.out.println("Extend3's method3()");
	}
}


class ExtendInterface{
	public static void main(String [] a){
		ExtendClass e = new ExtendClass();
		e.method1();
		e.method2();
		e.method3();
	}
}