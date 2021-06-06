/*
 * This program demonstates the concept of multiple catches
 * More specfic classes i.e subclasses must be written first and the superclass 
*/

package ExceptionHandling;

class MultipleCatchesMain2{
	public static void main(String [] args){
		try{
			int a = args.length;
			System.out.println("a = "+a);
			int b = 51/a;
			int [] c = new int[5];
			c[41] = 45;
		}
		catch(ArithmeticException e){
			System.out.println("Exception catch I: "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Exception catch II: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception catch III: "+e.getMessage());
		}
	}
	
}