package codes;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
public class Validation {
public static void main(String[] args) throws InterruptedException {
	WebDriver obj=new ChromeDriver();
obj.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	obj.manage().window().maximize();
	obj.findElement(new ByIdOrName("txtUsername")).sendKeys("Admin");
	obj.findElement(new ByIdOrName("txtPassword")).sendKeys("Admin");
	obj.findElement(new ByIdOrName("btnLogin")).submit();
	if(obj.getCurrentUrl().contains("dash"))
	{
System.out.println("login succes");
	}
	else {
System.out.println("login unsucces");
String message=obj.findElement(By.xpath("//span[@id='spanMessage']")).getText();
System.out.println(message);
	}
Thread.sleep(5000);
obj.quit();
	}

}
