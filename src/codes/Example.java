package codes;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Example
{
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	void initiate()
	{		
		report=new ExtentReports("C:\\Users\\Zero\\eclipse-workspace\\Extentdemo\\Output\\output.html");
		report.addSystemInfo("Name","Jivan Balasaheb Chikhale");
		report.addSystemInfo("class", "Demo class");
	}
	@Test
	void one()
	{
		test=report.startTest("test to pass");
        test.log(LogStatus.PASS,"passed");
	}
	@Test
	void two()
	{
		test=report.startTest("test to fail");
        test.log(LogStatus.FAIL,"failed");
		
	}
	@Test
	void three()
	{
		test=report.startTest("test to skipp");
        test.log(LogStatus.SKIP,"passed");
		
	}
	@AfterTest
	public void getResult(ITestResult result)
	    {
	    	if(result.getStatus() == ITestResult.FAILURE)
	    	{
	    		test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	        }
	    	else if(result.getStatus() == ITestResult.SKIP)
	    	{
	    		test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	        }
	    	else
	    	{
	    		test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	    	}
	    	//	 ending test
	        //endTest: It ends the current test and prepares to create HTML report
	        report.endTest(test);
		report.flush();
	   }   
	
	
}
