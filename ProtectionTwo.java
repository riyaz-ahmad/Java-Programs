/*
 *simple package program example
 *creating a packagenamed p2
 *save this file as ProtectionTwo.java
 *This package will try to access the Protection class' members of package p1
*/

package p2;

class ProtectionTwo extends p1.Protection{
	ProtectionTwo(){
		System.out.println("ProtectionTwo constructor----other package");
		//System.out.println("n = "+n); n is default or friendly ->visible only within same class/ package
		//System.out.println("n_pri = "+n_pri);  n_pri is private-> visible in class only 
		System.out.println("n_pro = "+n_pro);
		System.out.println("n_pub = "+n_pro);
	}
	
}