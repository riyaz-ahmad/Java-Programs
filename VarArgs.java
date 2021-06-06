//variable length arguments : varargs
class VarArgs{
	
	//difining varargs method
	static void vaArgs(int...v){
		System.out.print("No. of args: "+v.length+" Args are :");
		for(int x : v)
			System.out.print(x+" ");
		System.out.println();
	}
	
	//varargs methods cal also be overloaded
	static void vaArgs(boolean...v){
		System.out.print("No. of args: "+v.length+" Args are :");
		for(boolean	x : v)
			System.out.print(x+" ");
		System.out.println();
		
	}
	
	
	public static void main(String [] a){
		vaArgs(1);
		vaArgs(1,2,5);
		vaArgs(1, 1, 25, 35, 45);
	//	vaArgs();   // this call result in amibuity as compiler cant't decide which overloadedversion to call
		vaArgs(true);
		vaArgs(true, false);
		vaArgs(true, false, true);
	//	vaArgs();   // this call result in amibuity as compiler cant't decide which overloadedversion to call
	}
	
}