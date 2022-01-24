package codes;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListnersImpliment implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Starting "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" is successful");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" got failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
        System.out.println("test case "+result.getName()+" is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" is failed with percentage");
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("context "+context.getName()+" is started");
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("context "+context.getName()+" is on finish");
		
	}
	

}
