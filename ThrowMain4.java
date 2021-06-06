/*
 *This program demostrates the concept of "throw" keyword
*/

package ExceptionHandling;



class ThrowMain4{
	static void pros(){
		try{
			throw new NullPointerException("Demo Exception");
		}catch(NullPointerException e){
			System.out.println("Caught Inside pros()"+e);
			throw e;//rethrowing
		}
	}
	public static void main(String [] Args){
		try{
			pros();
		}catch(NullPointerException e){
			System.out.println("Recaught: "+e.getMessage());
		}
	}
}