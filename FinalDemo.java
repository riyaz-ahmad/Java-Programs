class FinalDemo{
	final static int AD = 120;
	final static long LN = 3000000000L;
	
	static void changeFinal(){
		System.out.println("Final AD :"+AD +" \nFinal LN : "+LN);
		//AD = 150;  This line will cause compilation error can't assign value to final variable AD
		System.out.println("Changed AD : "+AD);
	}
	
	public static void main(String [] a){
		changeFinal();
	}
}