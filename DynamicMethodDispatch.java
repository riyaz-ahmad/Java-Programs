class DynamicA{
	void callMe(){
		System.out.println("callMe() of DynamicA class");
	}
}
class DynamicB extends DynamicA{
	void callMe(){
		System.out.println("callMe() of DynamicB class");
	}
}

class DynamicC extends DynamicA{
	void callMe(){
		System.out.println("callMe() of DynamicC class");
	}
}

class DynamicMethodDispatch{
	public static void main(String [] args){
		DynamicA a = new DynamicA(); 
		DynamicB b = new DynamicB();
		DynamicC c = new DynamicC();
		
		//creating reference to super class
		DynamicA r;
		
		//passing object a as reference to r
		r = a;
		//calling DynamicA's version of callMe()
		r.callMe();
		
		//passing b as reference so that DynamicB's callMe() version can be called
		r = b;
		r.callMe();
		
		//passing c as reference so that DynamicC's callMe() version can be 
		r = c;
		r.callMe();
	}
}