package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter 
{
	WebDriver driver=new ChromeDriver();
	@Test
	@Parameters(value={"username","password"})
	public void getdata(String username,String password) throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
	    driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	    if(driver.getCurrentUrl().contains("mobile"))
	    {
	    	System.out.println("logged in successfuly");
	    }
	    else
	    {
	    	System.out.println("login failed");
	    }
	    Thread.sleep(5000);
	    driver.quit();
	}

}
