/*
 * This program demonstates default interface methods
 * This feature was added by JDK 8
 * It allows methods to have default implementation 
 *we make any method default bu using "default" keyword
*/

package Interface;

interface DefMethods{
	void normalMethod();
	//Default Method
	default void defaultMethod(){
		System.out.println("Deafult Interface Method");	
	}
}

class DefaultMeth implements DefMethods{
	public void normalMethod(){
		System.out.println("This is normal method of interface which must be overrided");
	}
	
}



class DefaultMethods{
	public static void main(String [] a){
		DefaultMeth d = new DefaultMeth();
		//calling normal method
		d.normalMethod();
		
		//calling Default method without overridding it
		d.defaultMethod();
	}
}