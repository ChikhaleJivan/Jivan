package codes;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windowhandle2 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		//get parent id
		String parent=driver.getWindowHandle();
	System.out.println(parent);
//get all window ids
Set<String>allwindows=driver.getWindowHandles();
System.out.println(allwindows);
for(String each:allwindows)
	{
if(!parent.equals(each))
	{
String title=driver.switchTo().window(each).getTitle();
System.out.println(title);
driver.manage().window().maximize();
driver.close();
Thread.sleep(5000);
	}
	}
driver.switchTo().window(parent);
driver.findElement(By.xpath("//html//div[@class='registSec']/input[1]")).click();
	}

}














