/*
 *Another simple program in the package p2
 *save this as OtherPackage.java
 *This will try to access the members of Protection class of package p1
*/


package p2.p3;

import p1.Protection;


class OtherPackage{
	OtherPackage(){
		Protection p = new Protection();
		System.out.println("OtherPackage class' constructor");
		//System.out.println("n = "+p.n);  n is default or friendly ->visible only within same class/ package
		//System.out.println("n_pri = "+p.n_pri);  n_pri is private-> visible in class only
		//System.out.println("n_pro = "+p.n_pro);  n_pro is protected->visible in same class ,same package and sub classes in any package
		System.out.println("n_pub "+p.n_pub); //n_pub is public-> accessible any where
		
	}
}