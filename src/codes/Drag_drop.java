package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drag_drop 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
        Actions ac=new Actions(driver);
        //switch to frame
        driver.switchTo().frame(0);
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dst=driver.findElement(By.id("droppable"));
        //drag and drop
        ac.clickAndHold(src).moveToElement(dst).release().perform();
        if(dst.getText().contains("Dropped!")) 
        {
        	System.out.println("drag and drop success");
        }
	}
}
















