package codes;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screen {
public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		DateFormat df=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
		Date d=new Date();
		String datef=df.format(d);
		//take screen shot and store
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//copy into local system
FileUtils.copyFile(src, new File("d://5oclock//screen//"+datef+"loginpage.png"));


	}

}
