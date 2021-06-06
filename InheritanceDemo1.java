//simple inheritance

//Super class
class Box{
	double width;
	double length;
	double height;
	
	//constructor when no argument is passed
	Box(){
		length = width = height;
	}
	
	//constructor when all dimensions are specified
	
	Box(double width, double length, double height){
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
class BoxMass extends Box{
	double mass;
	//constructor for BoxWeight
	BoxMass(double width, double length, double height, double mass){
		this.width = width;
		this.length = length;
		this.height = height;
		this.mass = mass;
	}
}//subclass ends here
class InheritanceDemo1{
	static public void main(String []args){
		BoxWeight box1 = new BoxWeight(5,4,7,5.5);
		BoxWeight box2 = new BoxWeight(50,1,2,30.3);
		
		System.out.println("Volume of Box1 : "+box1.volume()+" m^3");
		System.out.println("Mass of Box1 : "+box1.weight+" Kg");
		
		System.out.println("Volume of Box2 : "+box2.volume()+" m^3");
		System.out.println("Mass of box2 : "+box2.weight+" Kg");
		
	}
}