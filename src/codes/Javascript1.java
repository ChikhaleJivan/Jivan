package codes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Javascript1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.com'");
		driver.manage().window().maximize();
		//get title of page
	    String title=js.executeScript("return document.title").toString();
	    System.out.println(title);
	    System.out.println(title.length());
	    //get current url
	    String url=js.executeScript("return document.URL;").toString();
	    System.out.println(url);
	    System.out.println(url.length());
	    //get domain name
	    String Strdomain=js.executeScript("return document.domain;").toString();
	    System.out.println(Strdomain);
	    System.out.println(Strdomain.length());
	    driver.quit();
	}
}
