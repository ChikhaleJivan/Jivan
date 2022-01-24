package codes;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
public class Cpy_paste 
{
 public static void main(String[] args) throws AWTException, InterruptedException 
  {
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("http://primusbank.qedgetech.com/");
   driver.manage().window().maximize();
   Actions ac=new Actions(driver);
   //configure object for robot class
   Robot r=new Robot();
   driver.findElement(new ByIdOrName("txtuId")).sendKeys(Keys.DOWN,"Admin",Keys.UP);
   //select username
   r.keyPress(KeyEvent.VK_CONTROL);
   Thread.sleep(4000);
   r.keyPress(KeyEvent.VK_A);
   r.keyRelease(KeyEvent.VK_A);
   r.keyRelease(KeyEvent.VK_CONTROL);
   //copy username
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_C);
   Thread.sleep(4000);
   r.keyRelease(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_C);
   //move to password textbox
   ac.sendKeys(Keys.TAB).perform();
   //right click on password and paste
   ac.moveToElement(driver.findElement(By.id("txtPword"))).contextClick().perform();
   //down arrow
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   Thread.sleep(4000);
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   Thread.sleep(4000);
   r.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(4000);
   //click on login
   ac.sendKeys(Keys.ENTER).perform();
   Thread.sleep(4000);
   driver.quit();
  }
}