package codes;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;
public class Drop_Down_List
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();                                     //web driver object
		driver.navigate().to("https://www.facebook.com/");                       //goes to facebook.com
		driver.manage().window().maximize();                                     //maximizes the tab of browser
		WebElement Day_List=driver.findElement(new ByIdOrName("day"));           //finds the drop down list which shows the days,we need to have web element to pass as argument in select class constructor
		Select day_list=new Select(Day_List);                                    //select class for drop down with day list as a argument of type web element
		day_list.selectByIndex(2);                                               //select by index method selects element based on index of element 
		Thread.sleep(5000);                                                      //wait for 5 seconds
		day_list.selectByVisibleText("30");                                      //selects element by visible text
		Thread.sleep(5000);                                                      //waits for 5 seconds
		String first_selected_option=day_list.getFirstSelectedOption().getText();
		System.out.println(first_selected_option);
		boolean multiple=day_list.isMultiple();
		System.out.println("Day drop down is multiple is "+multiple);
		List<WebElement> olist=day_list.getOptions();
		for(WebElement each:olist)
		{
			String value=each.getText();
			System.out.println(value);
			Thread.sleep(1000);
		}
		System.out.println(day_list.getFirstSelectedOption().getText());
			
		
	}
}