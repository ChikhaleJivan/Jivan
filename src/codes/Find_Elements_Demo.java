package codes;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Find_Elements_Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(""+links.size());
		for(WebElement each:links)
			{
			String linkname=each.getText();
			System.out.println(linkname);
			String link=each.getAttribute("href");
			System.out.println(link);
			}
		Thread.sleep(5000);
		driver.close();
	}
}
