package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://flipkart.com/");
		driver.manage().window().maximize();
Actions ac=new Actions(driver);
ac.sendKeys(Keys.ESCAPE).perform();	
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(2000);
ac.moveToElement(driver.findElement(By.xpath("//a[@class='r8wNSq _2UJyWG'][text()='HTC Mobile']"))).click().perform();
Thread.sleep(2000);
driver.quit();
	}

}

















