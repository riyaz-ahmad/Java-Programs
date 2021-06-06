/*
 *Another simple program in the same package p1
 *save this as Derived.java
 *This class extends Protection class
*/


package p1;


class Derived extends Protection{
	Derived(){
		System.out.println("Derived Constructor");
		System.out.println("n = "+n);
		//System.out.println("n_pri = "+p_pri); n_pri is private-> visible in class only
		System.out.println("n_pro = "+n_pro);
		System.out.println("n_pub = "+n_pub);
	}
	
}