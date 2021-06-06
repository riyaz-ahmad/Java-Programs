class A{
	int i;
	int j;
	A(int z, int x){
		i = z;
		j = x;
	}
}
class B extends A{
	int i;
	int j;
	B(int a, int b, int c, int d){
		super(a,b);
		i = c; j = d;
	}
	
	
	void addition(){
		int ad1, ad2;
	    ad1 = i+j;
	    //second use of super for accessing the superclass members that can remian hidden because of namespace
	    ad2 = super.i+super.j;
	    System.out.println("Addition of subclass i and j :"+ad1);
	    System.out.println("Addition of Superclass i and j :"+ad2);
	}
	
}

class SuperKeyword2{
	public static void main(String []a){
		B b = new B(10,20,30,10);
		b.addition();
	}
}