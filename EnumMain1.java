/*
 *This program determines the basic concept of enumerations
 *An enumeration is created by using the keyword "enum"
*/

package Enums;

//creating an enum named as Apple ans has a list of constant values in it.
enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumMain1{
	public static void main(String [] args){
		//creating a variable of type Apple
		Apple ap;
		
		//assigning the values to ap
		ap = Apple.RedDel;
		
		//displaying enum values
		System.out.println("Value of ap : "+ap);
		
		//comparing to enum constants
		if(ap == Apple.RedDel)
			System.out.println("-- Maatched --");
		else
			System.out.println("-- Not Matched --");
		
		//using enum in switch statement
		switch(ap){
			case Jonathan:
			System.out.println("Jonathan is Red");
			break;
			case GoldenDel:
			System.out.println("Golden Delicious is yellow");
			break;
			case RedDel:
			System.out.println("Red Delicious is red");
			break;
			case Winesap:
			System.out.println("Ah Winesap");
			break;
			case Cortland:
			System.out.println("Cortland is red");
			break;
			default:
			System.out.println("Inavlid");
		}
		
	}
}