package codes;
import org.testng.annotations.Test;
public class TestAnnotation 
{
	/*
	@Test(description="first test case",priority=-1)
	public void testcase1()
	{
		System.out.println("Inside first test case");
	}
	@Test(description="second test case",priority=0)
	public void testcase2()
	{
		System.out.println("inside test case 2");
	}
	*/
	@Test(priority=0,timeOut=3000)
	public void login() throws InterruptedException
	{
		System.out.println("inside login");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="login",priority=1)
	public void insidehome()
	{
		System.out.println("logged in successfuly");
	}
	@Test(dependsOnMethods= {"login","insidehome"},priority=3)
	public void logout()
	{
		System.out.println("inside logout");
	}
}
