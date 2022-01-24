package codes;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.Test;
public class gridExample 
{
	WebDriver driver;
	DesiredCapabilities cap;
	@Test
	public void login() throws MalformedURLException 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		//connecting to hub
		driver=new RemoteWebDriver(new URL("http://localhost:5550/wd/hub"), cap);
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(new ByIdOrName("txtUsername")).sendKeys("Admin");
		driver.findElement(new ByIdOrName("txtPassword")).sendKeys("Admin");
		driver.findElement(new ByIdOrName("Submit")).sendKeys(Keys.ENTER);
		
	}
}
