package codes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class naukariSearch
{
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri2000.com/careers/it_hyderabad.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement>companies=driver.findElements(By.tagName("a"));
		for(WebElement each:companies)
		{
		String onclick=each.getAttribute("onclick");
		String link=each.getAttribute("href");
		/*
		if(onclick.contains("showMember"))
			{
			String link name=onclick.toString();
			System.out.println(link name);
			}
			*/
		if(onclick!=null) 
		{
		System.out.println(onclick);
		System.out.println(link);
		}
		else
		{
		}
		}
			    
		driver.quit();	
		}
}

