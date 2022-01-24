package codes;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript2_Scroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.com'");
		//scroll from top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(6000);
		//bottom to up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(6000);
		//How to scroll vertically for certain pixels:
		js.executeScript("window.scrollBy(0,900)");
		//How to scroll to a particular element:
		js.executeScript("document.querySelector('#rhf-container > div.a-section.a-spacing-medium.a-spacing-top-base.a-padding-none.a-text-center > span > span > a').scrollIntoView()");
	}
}













