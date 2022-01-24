package codes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingWithTables 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> coloumnNames=driver.findElements(By.tagName("th"));
		System.out.println(coloumnNames.size());
	System.out.println("*****Printing coloumn heading*****");
		for(WebElement each:coloumnNames )
		{
			String name=each.getText();
			System.out.println(name);
		}
		List<WebElement> rownames=driver.findElements(By.tagName("td"));
		System.out.println(rownames.size());

		System.out.println("*****Printing coloumn rows*****");
		for(WebElement each:rownames )
		{
			String name=each.getText();
			System.out.println(name);
		}

	}

}
