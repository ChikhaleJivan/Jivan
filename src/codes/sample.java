package codes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class sample {
WebDriver driver;
ExtentReports report;
ExtentTest test;
@BeforeTest
public void Start() {
	report=new ExtentReports("./Reports/anjum/ExtentReports.html");
}
	@Test
	public void login() {
	test=report.startTest("Verify Login");
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
test.log(LogStatus.INFO, "launching browser");
driver=new ChromeDriver();
driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
test.log(LogStatus.INFO, driver.getCurrentUrl());
driver.manage().window().maximize();
WebElement username=driver.findElement(new ByIdOrName("txtUsername"));
username.sendKeys("rita");
String usernametext=username.getAttribute("value");
WebElement password=driver.findElement(new ByIdOrName("txtPassword"));
password.sendKeys("Admin");
String passwordtext=password.getAttribute("value");
test.log(LogStatus.INFO, usernametext+"  "+passwordtext);
System.out.println(usernametext+"  "+passwordtext);
driver.findElement(new ByIdOrName("Submit")).sendKeys(Keys.ENTER);
String acval="dash";
String expval=driver.getCurrentUrl();
if(expval.contains(acval))
{
test.log(LogStatus.PASS, expval+"  "+acval);
System.out.println("login success");
}
else {
test.log(LogStatus.FAIL, expval+"  "+acval);
System.out.println("login unsuccess");
}
report.endTest(test);

}
@AfterTest
public void close_Report() {
report.flush();
report.close();
driver.quit();
}
}
