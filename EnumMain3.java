/*
 * This program demonstrates the concept that java enumerations are class types.
 * They can have
  -> Instance variables
  -> Constructors
  -> Methods
 * However, unlike classes, enums are not instantiated using new keyword
*/

package Enums;

//creating an enumeration
enum Apple{
	Jonathan(54), GoldenDel(20), RedDel(90), Winesap(40), Cortland;
	
	//class variable
	private int price;
	
	//constructor
	Apple(){
		price = 10;
	}
	
	//overload constructor
	Apple(int price){
		this.price = price;
	}
	
	//Method
	int getCost(){
		return price;
	}
}

class EnumMain3{
	public static void main(String [] args){
		Apple ap;
		//Displaying price of winesap and Cortland
		System.out.println("Winesap Costs: "+Apple.Winesap.getCost());
		System.out.println("Cortland costs: "+Apple.Cortland.getCost());//we have not mentioned its price so it'll be by deafult 10 as set by default construtor
		
		//Displaying price of all apples
		System.out.println("Cost of all Apples");
		for(Apple a: Apple.values())
			System.out.println(a+" Costs: "+a.getCost());
	}
	
}