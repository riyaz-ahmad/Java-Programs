//Outer Class
class Outer{
	int outer_x = 100;
	int outer_y = 150;
	
	//Inner Class
	class Inner{
		int inner_z;
		//method of inner class
		void add(){
			
		   //inner class manipulating the data of outer class
		   inner_z = outer_x + outer_y;
		   System.out.println("Addition of "+ outer_x +" and "+ outer_y +" is: "+inner_z);
		}
		
	}//inner class ends here
	
	//method of outer class
	void showAdd(){
		Inner i = new Inner();
		i.add();
	}
	
	/*
	//this method will cause compile error as inner_z variable is not known here
	void showInnerZ(){
		System.out.println("Inner class' inner_z = "+inner_z);
	}
	*/
}//class outer ends here;

class NestedClass{
	public static void main(String[] args){
		Outer o = new Outer();
		o.showAdd();
		//o.showInnerZ();   //This will cause error
		
		/* If we will create instance of inner class here, it will produce compile error as inner class doesnot exist independetly of Outer class
		Inner i = new Inner();
		i.add();
		*/
	}
}