package codes;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Extents_Reports_Example 
{
	ExtentReports report;
    ExtentTest logger;
    @BeforeTest
    public void launch() 
    {
    	//creating html report under folder
        report=new ExtentReports("./Reports/ExtentsReport.html");
	    report.addSystemInfo("Host Name", "Ranga");
	    report.addSystemInfo("Environment", "Automation Testing");
	    report.addSystemInfo("User Name", "Rangaa SM");
	    report.addSystemInfo("Project", "Primus Bank");
	}
    @Test
    public void passTest()
    {
    	logger=report.startTest("passed test case");
	    logger.log(LogStatus.PASS, "Test case 1 passed");
    }
    @Test(timeOut=5000)
    public void failtest() throws InterruptedException 
    {
    	logger=report.startTest("fail test case");
        Thread.sleep(10000);
        logger.log(LogStatus.FAIL, "Test case 2 fail");
    }
    @Test
    public void skipTest()
    {
    	logger=report.startTest("Skip test case");
	    logger.log(LogStatus.SKIP, "Skipping test case");
	    try 
	    {
	    	throw new SkipException("Skipping - This is not ready for testing ");
	    }
	    catch(SkipException t)
	    {
	    	System.out.println(t.getMessage());
	    }
    }
    @AfterMethod
    public void getResult(ITestResult result)
    {
    	if(result.getStatus() == ITestResult.FAILURE)
    	{
    		logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
        }
    	else if(result.getStatus() == ITestResult.SKIP)
    	{
    		logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
        }
    	//	 ending test
        //endTest: It ends the current test and prepares to create HTML report
        report.endTest(logger);
    }
    @AfterTest
    public void endReport()
    {
    	// writing everything to document
        //flush() - to write or update test information to your report.  
        report.flush();
       //Call close() at the very end of your session to clear all resources. 
       report.close();
    }
    
}