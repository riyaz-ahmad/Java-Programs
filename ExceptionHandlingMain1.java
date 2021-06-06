/*
 *This program demonstrate the concept of Exception Handling
*/

package ExceptionHandling;



class ExceptionHandlingMain1{
	public static void main(String [] args){
		int a, b;
		try{
		b = 0;
		a = 60/b;
		System.out.println("a = "+a);
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			}
		finally{
			System.out.println("In finally block");
			
		}
	}
}