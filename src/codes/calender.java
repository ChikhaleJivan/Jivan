package codes;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
public class calender
{
 @Test(description="Calender Funtionality Check")
 void calenderdemo() throws InterruptedException
  {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\chromedriver.exe");
   WebDriver GC=new ChromeDriver();
   GC.get("http://demo.guru99.com/test/");
   WebElement dateBox = GC.findElement(By.xpath("//form//input[@name='bdaytime']"));
   dateBox.sendKeys("09252013");
   dateBox.sendKeys(Keys.TAB);
   dateBox.sendKeys("0245PM");
   Thread.sleep(5000);
   GC.quit();
  }
 @Test(description="Launch GC")
 void GoogleChrome() throws InterruptedException
  {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\chromedriver.exe");
   WebDriver GC=new ChromeDriver();
   GC.get("https://www.facebook.com/");
   Thread.sleep(5000);
   GC.quit();
  }
 @SuppressWarnings("deprecation")
@Test(description="Launch IE")
 void InternetExplorer() throws InterruptedException
  {
   DesiredCapabilities capabilities = DesiredCapabilities();
   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
   @SuppressWarnings("unused")
File file = new File("C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\IEDriverServer.exe");
   System.setProperty("webdriver.ie.driver","C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\IEDriverServer.exe");
   WebDriver driver = new InternetExplorerDriver(capabilities);
   driver.get("https://www.google.com/");
   Thread.sleep(5000);
   driver.close();
  }
 private DesiredCapabilities DesiredCapabilities() {
	// TODO Auto-generated method stub
	return null;
}
@Test(description="Launch FF")
 void FireFox() throws InterruptedException
  {
   System.setProperty("webdriver.gecko.drive","C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\geckodriver.exe");
   WebDriver CH=new ChromeDriver();
   CH.get("https://www.flipkart.com/");
   Thread.sleep(5000);
   CH.close();
  }
}
