/*
 * This program demonstrstes the concept of Nested Try
*/


package ExceptionHandling;

class NestedTryMain3{
	public static void main(String [] args){
		try{
			int a = args.length;
			int b = 40/a;
			System.out.println("a = "+a);
		    try{
			    if(a==1)
				    a = a/(a-a);
			    if(a==2){
				    int []c = new int[2];
				    c[5] = 45;
			    }
		   }catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception:" +e.getMessage());
		}
		}
		catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}
