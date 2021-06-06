/*
 *This program demonstrates the concept of "throws" keyword
*/

package ExceptionHandling;



class ThrowsMain5{
	static void throwsOne() throws IllegalAccessException{
		System.out.println("Inside throwsOne() method");
		throw new IllegalAccessException("Demo Exception");
	}
	
	public static void main(String [] args){
		try{
			throwsOne();
		}catch(IllegalAccessException e){
			System.out.println("Caught:"+e);
		}
	}
}