class Main
{
	int a=10;
	static int b=20;

public static void main(String A[])
{
	Main t1 = new Main();
	t1.a=100;
	t1.b=200;
	Main t2 = new Main();
	
	System.out.println(t1.a+"   "+t1.b);
	System.out.println(t2.a+"   "+t2.b);
}
}