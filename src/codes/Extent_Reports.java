package codes;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Extent_Reports
{ 
	
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	void beforetest()
	{
	report=new ExtentReports("./Reports/Jivan/ExtentsReport.html");
	report.addSystemInfo("Host Name", "Ranga");
	report.addSystemInfo("Environment", "Automation Testing");
	report.addSystemInfo("User Name", "Rangaa SM");
	report.addSystemInfo("Project", "Primus Bank");
	}
	@Test
	void testtopass()
	{
		
		report.startTest("test to pass","inside pass test case");
		test.log(LogStatus.PASS,"test successfull");
    }
	@Test(timeOut=3000)
	void testtofail() throws InterruptedException
	{
		Thread.sleep(5000);
		report.startTest("test to fail","test fail");
		test.log(LogStatus.FAIL,"test fail");
	}
	@Test
	void skipp() 
	{
		report.startTest("test to skipp", "test skipped");
		test.log(LogStatus.SKIP,"skiped test");
		
	}
	@AfterMethod
	void writeresult(ITestResult itr)
	{
		if(itr.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, "Test Case Failed is "+itr.getName());
		}
		else if(itr.getStatus()==ITestResult.SKIP)
		{
			test.log(LogStatus.SKIP, "Test Case skipped is "+itr.getName());
		}
		else 
		{
			test.log(LogStatus.PASS, "Test Case is passed "+itr.getName());
		}
		report.endTest(test);
	}
	@AfterTest
	void aftertest()
	{
		report.flush();
		report.flush();
	}

}
