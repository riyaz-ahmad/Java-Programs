/*
 *Another simple program in the same package p1
 *save this as SamePackage.java
 *This class extends Protection class
*/


package p1;

class SamePackage{
	SamePackage(){
		Protection p = new Protection();
		System.out.println("SamePackage class' constructor");
		System.out.println("n = "+p.n);
		//System.out.println("n_pri = "+p.n_pri); n_pri is private-> visible in class only
		System.out.println("n_pro = "+p.n_pro);
		System.out.println("n_pub = "+p.n_pub);
	}
}
