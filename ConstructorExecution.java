class Cons1{
	Cons1(){
		System.out.println("Constructor of Super class Cons1");
	}
}

class Cons2 extends Cons1{
	Cons2(){
		System.out.println("Constructor of class Cons2 i.e first derived subclass");
	}
}

class Cons3 extends Cons2{
	Cons3(){
		System.out.println("Constructor of class cons3 i.e second derived subclass");
	}
}

class ConstructorExecution{
	public static void main(String [] args){
		Cons3 c = new Cons3();
	}
}