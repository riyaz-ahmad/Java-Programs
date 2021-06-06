/*
 *This program demonstrates the concept of creating our own Exception classes
 *We can create our own Exception classes by extending it from class Exception which is in turn subclass of Throwable
*/

package ExceptionHandling;

class MyOwnException extends Exception{
	private int detail;
	MyOwnException(int detail){
		this.detail = detail;
	}
	public String toString(){
	return "MyOwnException["+detail+"]";
	}
}

class MyOwnExceptionMain6{
	static void compute(int a) throws MyOwnException{
		System.out.println("Called compute ("+a+")");
		if(a>18)
			throw new MyOwnException(a);
	    System.out.println("Normal Exit");
	}
	
	public static void main(String [] args){
		try{
			compute(2);
		    compute(30);
		}catch(MyOwnException e){
			System.our.println("Caught "+ e);
		}
	}
}