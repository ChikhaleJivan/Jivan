package ojt;
public class Demo {
public static void add(int a, int b)
{
	int c=a+b;
	System.out.println("Addition is:::"+c);
}
public static String verifyString(String str1,String str2)
{
	String res="";
	if(str1.equals(str2))
	{
		res="Strings are equal";
	}
	else
	{
		res="Strings are Not equal";	
	}
	return res;
}
public static boolean compare(int x,int y)
{
	if(x==y)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
	
		Demo.add(3456, 32367);
		String results =Demo.verifyString("india", "india");
		System.out.println("Verify Strings::"+results);
		boolean obj=Demo.compare(300, 300);
		System.out.println("compare values::"+obj);
		}
        }
