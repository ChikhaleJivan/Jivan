package codes;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
public class Windowhandle1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	//get parent id
	String parent=driver.getWindowHandle();
System.out.println(parent);
//click on terms link
driver.findElement(By.xpath("//*[text()='Terms']")).click();
//return all multiple window ids
Set<String>allwindows=driver.getWindowHandles();
System.out.println(allwindows);
//iterate all windows
for(String eachwin:allwindows)
{
	//compare parent window should not be equal to child window
	if(!parent.equals(eachwin))
	{
		//switch to each child window
		driver.switchTo().window(eachwin);
		Thread.sleep(5000);
		//clik on sign up link
driver.findElement(By.xpath("//span[@class='signup_box_content']//a[@role='button']")).click();
//switch back top parent window
driver.switchTo().window(parent);
Thread.sleep(5000);
driver.findElement(new ByIdOrName("email")).sendKeys("test12345");
driver.findElement(new ByIdOrName("pass")).sendKeys("tewytr");
driver.findElement(new ByIdOrName("pass")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
driver.quit();
	}
}

	}

}









