package codes;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners()
public class TestNGListenerImplimentation 
{
	@Test(timeOut=5000)
	void demo() throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("simple demo");
	}

}
