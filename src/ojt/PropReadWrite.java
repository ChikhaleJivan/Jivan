package ojt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PropReadWrite
{	    
	    WebDriver driver;
	    File f;
	    FileInputStream fi;
	    Properties p;
	 
	    @BeforeMethod
	    public void setup() throws IOException
	    {
	    f=new File("C:\\Users\\admin\\eclipse-workspace\\Jivan\\Files\\login.properties");
	    fi=new FileInputStream(f);
	    p=new Properties();
		p.load(fi);
	    }
	    
        @Test
        public void operation() throws InterruptedException
        {
       
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("clear"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("username"))).sendKeys(p.getProperty("UserName"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("pass"))).sendKeys(p.getProperty("Password"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("login"))).click();
		Thread.sleep(2000);
		String tittle=driver.getTitle();
		System.out.println(tittle);
		}
        
        @AfterMethod
        public void teardown() throws IOException
        {
        	driver.quit();
        }
}
	