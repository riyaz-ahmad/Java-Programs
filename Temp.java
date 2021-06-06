class Temp
{
	private Temp(int data)
	{
		Sysytem.out.println("C- called");
	}
	
	protected static Temp create(int data)
	{
		Temo obj = new Temp(data);
		return obj;
	}
	public void myMeth()
	{
		System.out.println("MM called");
		
	}

}
public class Tested	
{
	public static void main(String a[])
	{
		Temp obj = new Temp(0);
		obj.myMeth();
	}
}