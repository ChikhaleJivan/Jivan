package codes;
public class Expection_Example 
{
	public static void main(String[] args)
	{
		try
		{
			int x=6,y=0,z;
			z=x/y;
			System.out.println("Division is::"+z);
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		int a=56,b=5,c;
		c=a*b;
		System.out.println("Multiplication is::"+c);
	}
}
