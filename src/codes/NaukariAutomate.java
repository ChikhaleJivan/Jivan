package codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NaukariAutomate
{

	@SuppressWarnings("deprecation")
	@Test(description="Naukari Login")
	void NaukariPlay() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zero\\eclipse-workspace\\DemoMavenProject\\chromedriver.exe");
		WebDriver GC=new ChromeDriver();
	    GC.get("https://www.naukri.com/");
	    GC.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    GC.manage().window().maximize();

	    GC.findElement(By.id("login_Layer")).click();
	    GC.findElement(By.name("email")).sendKeys("chikhalejivan@gmail.com");
	    GC.findElement(By.name("PASSWORD")).sendKeys("jivan123");
	    GC.quit();
	    GC.findElement(By.xpath("//div[8]/div[2]/div[2]/form/div[7]/button")).click();
	    Thread.sleep(5000);
	   
	}

}
