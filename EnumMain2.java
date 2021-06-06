/* 
 * This program demontrates the concept of values() and valueOf() methods in enumerations
 * values() return an array that conatins a list of enum constants
 * valueOf() return a constant whose value is passed through a string
*/

package Enums;

//creating an enum named as Apple ans has a list of constant values in it.
enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumMain2{
	public static void main(String [] args){
		Apple ap;
		
		//Displaying all the constants of enum Apple
		System.out.println("All Apple constants");
		Apple [] allapples = Apple.values();
		for(Apple a : allapples)
			System.out.println(a);
		//use of valueOf() method
		
		ap = Apple.valueOf("Winesap");
		System.out.println("ap = "+ap);
		
	}
}