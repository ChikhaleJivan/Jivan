package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert 
{
 public static void main(String[] args) throws InterruptedException 
  {
   WebDriver driver=new ChromeDriver();
   driver.navigate().to("file:///D:/promp.html");
   //click on me button
   driver.findElement(By.xpath("/html/body/fieldset/button")).click();
   //get alert message
   String strmessage1=driver.switchTo().alert().getText();
   System.out.println(strmessage1);
   Thread.sleep(5000);
   //enter some text into pop up
   driver.switchTo().alert().sendKeys("akhilesh");
   Thread.sleep(7000);
   driver.switchTo().alert().accept();
   String message=driver.findElement(By.xpath("//*[@id='promptdemo']")).getText();
   System.out.println(message);
   Thread.sleep(5000);
   driver.quit();
  }
}
