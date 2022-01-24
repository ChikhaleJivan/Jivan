package codes;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
public class Listbox1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		WebElement Omonth=driver.findElement(new ByIdOrName("month"));
		Select monthlist =new Select(Omonth);
		boolean value=monthlist.isMultiple();
		System.out.println(value);
		monthlist.selectByIndex(3);
		Thread.sleep(4000);
		System.out.println(monthlist.getFirstSelectedOption().getText());
		monthlist.selectByVisibleText("Dec");
		System.out.println(monthlist.getFirstSelectedOption().getText());
		Thread.sleep(4000);
		//count no of items in list box
		List<WebElement>Olist=monthlist.getOptions();
		System.out.println(Olist.size());
		for(int i=1;i<Olist.size();i++)
			{
			String itemname=Olist.get(i).getText();
			System.out.println(itemname);
			}
		driver.quit();
	}
}








