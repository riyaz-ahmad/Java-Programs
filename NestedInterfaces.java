/*
 *This programs provides demonstration about the nested interfaces
 *when we are dealing with nested interfaces we should always use fully qualified names
*/
package Interface;

//class will contain the nested interfaces
class NestedInterace1{
	public interface NestedIface{
		boolean isPositive(int n);
	}
}

class NestedInterace2 implements NestedInterace1.NestedIface{
	public boolean isPositive(int num){
		return num>0?true:false;
	}
}

class NestedInterfaces{
	public static void main(String [] a){
		NestedInterace2 n = new NestedInterace2();
		if(n.isPositive(-8))
			System.out.println("Number is positive");
		else System.out.println("Negative number");
	
	}
}