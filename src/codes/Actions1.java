package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions1 
{
 public static void main(String[] args) throws InterruptedException 
  {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Jivan\\Selenium runtime\\chrome driver\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("https://flipkart.com/");
   driver.manage().window().maximize();
   Actions ac=new Actions(driver);
   ac.sendKeys(Keys.ESCAPE).perform();
   //mouse hover to electronics
   ac.moveToElement(driver.findElement(By.xpath("//html//ul[@class='_114Zhd']/li[1]/a[1]/span[1]"))).click().perform();
   Thread.sleep(4000);
   //mouse hover to mouse link
   ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mouse')]"))).click().perform();
   Thread.sleep(4000);
   driver.quit();
  }
}















