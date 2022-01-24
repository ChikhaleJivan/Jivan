package codes;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException
	{
					
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");					
	      driver= new ChromeDriver();
	      DemoDragAndDrop.DragnDrop();
	 }
	
	public static  void  DragnDrop() throws InterruptedException					
    {		
       
         driver.get("http://demo.guru99.com/test/drag_drop.html");					
         driver.manage().window().maximize();
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.	
         Thread.sleep(1000);
         act.dragAndDrop(From, To).build().perform();
         driver.close();
         driver.quit();
	}		


}
