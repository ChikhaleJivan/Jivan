package codes;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;
public class Listbox2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://amazon.com/");
		WebElement list=driver.findElement(new ByIdOrName("url"));
		Select Listbox=new Select(list);
		boolean value=Listbox.isMultiple();
		System.out.println(value);
		Listbox.selectByIndex(40);
		System.out.println(Listbox.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		Listbox.selectByVisibleText("Baby");
		System.out.println(Listbox.getFirstSelectedOption().getText());
		List<WebElement>count=Listbox.getOptions();
		System.out.println(count.size());
		for(int i=1;i<count.size();i++)
			{
			String itemname=count.get(i).getText();
			System.out.println(itemname.trim());
			Thread.sleep(1000);
			Listbox.getOptions().get(i).click();
			}
	}
}














