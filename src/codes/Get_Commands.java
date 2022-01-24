package codes;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class Get_Commands 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//create instance object
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://login.yahoo.com");
		//get title page
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		Thread.sleep(5000);
		//get current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(url.length());
		Thread.sleep(5000);
	}
}
