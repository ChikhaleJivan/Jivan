package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class drag_drop3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		int x=dst.getLocation().getX();
		int y=dst.getLocation().getY();
		ac.dragAndDropBy(src, x, y).perform();
		Thread.sleep(6000);
		driver.quit();
	}
}
