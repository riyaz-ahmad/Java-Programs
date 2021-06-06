//simple inheritance

//Super class
class Boxx{
	private double width;
	private double length;
	private double height;
	
	//constructor when no argument is passed
	Boxx(){
		length = width = height;
	}
	
	//constructor when all dimensions are specified
	
	Boxx(double width, double length, double height){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	//method for computing volume
	
	double volume(){
		return width*length*height;
	}
}//class Box ends here

//creating a subclass
class BoxxMass extends Box{
	double mass;
	//constructor for BoxWeight
	BoxxMass(double width, double length, double height, double mass){
		
		//using super keyword to call subclass constructor
		super(width, length, height);
		this.mass = mass;
	}
}//subclass ends here
class SuperKeyword1{
	static public void main(String []args){
		BoxxMass box1 = new BoxxMass(5,4,7,5.5);
		BoxxMass box2 = new BoxxMass(50,1,2,30.3);
		
		System.out.println("Volume of Box1 : "+box1.volume()+" m^3");
		System.out.println("Mass of Box1 : "+box1.mass+" Kg");
		
		System.out.println("Volume of Box2 : "+box2.volume()+" m^3");
		System.out.println("Mass of box2 : "+box2.mass+" Kg");
		
	}
}