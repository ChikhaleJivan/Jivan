package codes;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com/");
		driver.manage().window().maximize();
Actions ac=new Actions(driver);	
//configure object for robot class
Robot r=new Robot();
//right click on gmail link
ac.moveToElement(driver.findElement(By.partialLinkText("Gm"))).contextClick().perform();
//down arrow
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(4000);
driver.quit();

	}

}
