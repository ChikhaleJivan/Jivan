package codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProvid
{
 WebDriver driver=new ChromeDriver();
 @SuppressWarnings("deprecation")
@BeforeClass
 void jiva()
  {
   driver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
  }
 @Test(dataProvider="Jivan")
 public void getdataforlogin(String username,String password) throws InterruptedException
  {
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
   driver.findElement(By.xpath(".//*[@id='email']")).clear();
   driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
   driver.findElement(By.xpath(".//*[@id='pass']")).clear();
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
  }
 @AfterClass
 void john() throws InterruptedException
  {
   Thread.sleep(5000);
   driver.quit();
  }
 @DataProvider(name="Jivan")
 public Object[][] passdata()
  {
   Object[][] obj=new Object[3][2];
   obj[0][0]="demo1@gmail.com";
   obj[0][1]= "password";
   obj[1][0]= "demo2@gmail.com";
   obj[1][1]= "password1";
   obj[2][0]= "demo3@gmail.com";
   obj[2][1]= "password2";
   return obj;		 
  }
}
