package codes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample_HTML {
public static void main(String[] args) {
WebDriver dr=new ChromeDriver();
dr.navigate().to("file:///E:/LoginPage.html");
dr.manage().window().maximize();		
dr.findElement(By.xpath("//*[contains(@name,'ern')]")).sendKeys("Admin");
dr.findElement(By.xpath("//*[@name='password']")).sendKeys("Admin");
dr.findElement(By.xpath("//*[@name='login']")).click();
	}

}
