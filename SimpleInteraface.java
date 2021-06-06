/*
 *This is demonstration to packages and  interfaces
 *Also demonstrationto references to interfaces
*/
package Interface;


interface SIntFace1{
	void callMe(int a);
	void viaReference();
} 

class CallMe implements SIntFace1{
	public void callMe(int x){
		System.out.println("callMe() Method called with "+x);
	}
	public void viaReference(){
		System.out.println("Called through Reference variable");
	}
}


class SimpleInteraface{
	public static void main(String [] a){
	CallMe c = new CallMe(); //creating object of CallMe class
	SIntFace1 i = new CallMe(); //creating reference to SIntFace1 interface
	c.callMe(10);
	i.viaReference();
	}
}