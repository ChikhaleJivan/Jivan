package codes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Alerts 
{
 @SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException 
  {
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   //click on go button without filling login details
   driver.findElement(By.name("proceed")).click();
   WebDriverWait wait=new WebDriverWait(driver, 500);
   //wait until alert is present
   wait.until(ExpectedConditions.alertIsPresent());
   //get text of alert
   java.lang.String strmessage=driver.switchTo().alert().getText();
   System.out.println(strmessage);
   Thread.sleep(5000);
   driver.switchTo().alert().accept();
   Thread.sleep(5000);
   driver.quit();
  }
}
