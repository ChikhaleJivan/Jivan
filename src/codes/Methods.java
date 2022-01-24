package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Methods 
{
	public static void main(String[] args) throws InterruptedException
	{
		String tittle,Url;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		tittle=driver.getTitle();
		Url=driver.getCurrentUrl();
		System.out.println("PAGE URL IS ="+Url);
		System.out.println("PAGE TITTLE IS="+tittle);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jivan@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jivanjivan");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
