package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook_LogIn_Validation 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    File file=new File("C:/Users/Zero/eclipse-workspace/Selenium/file.properties");
	    FileInputStream fi=new FileInputStream(file);
	    Properties property=new Properties();
	    property.load(fi);
	    driver.findElement(By.xpath(property.getProperty("username"))).sendKeys("jivanchikhale@gmail.com");
	    driver.findElement(By.xpath(property.getProperty("password"))).sendKeys("jivan123");
	    driver.findElement(By.xpath(property.getProperty("submit"))).click();
	    Thread.sleep(5000);
	    if(driver.getCurrentUrl().contains("Post"))
	    {
	    System.out.println("Logged In Successfully");
	    }
	    else
	    {
	    System.out.println("Error in logging in ");
	    }

	}
}
