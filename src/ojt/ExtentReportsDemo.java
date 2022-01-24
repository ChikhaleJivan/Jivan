package ojt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo 
{ 
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	String gactualtittle="",gexpectedtittle="Google";
	String gmactualtittle="",gmexpectedtittle="Gail";
	
	@BeforeMethod
	public void setup()
	{
		report=new ExtentReports("./Reports/Demo.html");
        driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test()
	public void VerifyGoogleTittle()
	{
		test= report.startTest("Test for google");
		test=new ExtentTest("Google verify","This test case is verifying tittle for google home page");
		driver.get("https://www.google.co.in/");
		gactualtittle=driver.getTitle();
		if(gactualtittle.equals(gexpectedtittle))
		{
			test.log(LogStatus.PASS, gactualtittle);
		}
		else
		{
			test.log(LogStatus.PASS, gactualtittle);
		}
		
				
	}
	
	@Test()
	public void VerifyGmailTittle()
	{
		test= report.startTest("Test for gmail");
		test=new ExtentTest("Gmail verify","This test case is verifying tittle for gmail home page");
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		gmactualtittle=driver.getTitle();	
		if(gmactualtittle.equals(gmexpectedtittle))
		{
		test.log(LogStatus.PASS, gmactualtittle);
		}
		else
		{
			test.log(LogStatus.FAIL, gmactualtittle);
		}
		
	}
	
	@AfterMethod
	public void teardown()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
