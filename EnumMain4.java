/*
 * This program demonstrates the concept that the java enumerations inherit the Enum
 * We can obttain ordinal values of constants of an enumerations using ordinal() method (i.e. indices)
 * We can compare oridinal constants of same enumeration using compareTo() method
 * We can also check two constants for equality using equals() method or even using ==
*/


package Enums;

enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumMain4{
	public static void main(String [] args){
		Apple ap1, ap2, ap3;
		//all constants and their ordinal values
		System.out.println("All constants with their ordinal values");
		for(Apple a : Apple.values())
			System.out.println(a+" : "+a.ordinal());
		
		ap1 = Apple.RedDel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.RedDel;
		
		//Demostrates the concept of equals() and compareTo()
		System.out.println("compareTo() method");
		if(ap1.compareTo(ap2)<0)
			System.out.println("Before");
		else if(ap1.compareTo(ap2)>0)
			System.out.println("After");
		else if(ap1.compareTo(ap2)==0)
			System.out.println("Same");
		else
			System.out.println("Does not exist");
		
		System.out.println("equals() method");
		
		if(ap1.equals(ap2))
			System.out.println(ap1+" = "+ ap2);
		else
			System.out.println(ap1+" != "+ ap2);
		
		
		if(ap1.equals(ap3))
			System.out.println(ap1+" = "+ ap3);
		else
			System.out.println(ap1+" != "+ ap3);
		
		System.out.println("== operator");
		if(ap1 == ap3)
			System.out.println(ap1+" = "+ ap3);
		else
			System.out.println(ap1+" != "+ ap3);
	
	}
}