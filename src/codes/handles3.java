package codes;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class handles3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    //get parent id
	    String parent=driver.getWindowHandle();
	    System.out.println(parent);
	    //store collection windows into arraylist
	    ArrayList<String>br=new ArrayList<String>(driver.getWindowHandles());
	    String title1=driver.switchTo().window(br.get(1)).getTitle();
	    System.out.println(title1);
	    driver.close();
	    Thread.sleep(5000);
	    driver.switchTo().window(parent);
	    driver.findElement(By.xpath("//html//div[@class='registSec']/input[1]")).click();
	}
}

