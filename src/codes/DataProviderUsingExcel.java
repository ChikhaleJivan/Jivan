package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderUsingExcel 
{
	WebDriver driver=new ChromeDriver();
	@SuppressWarnings("deprecation")
	@BeforeClass
	void jiva() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
	}
	@Test(dataProvider="Jivan")
	public void getdataforlogin(String username,String password) throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath(".//*[@id='pass']")).clear();
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
        driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
        if(driver.getCurrentUrl().contains("mobile"))
        	{
        	System.out.println("logged in successfuly");
        	}
        else
        	{
        	System.out.println("Test Case Successful");
        	}
    }
	@AfterClass
	void john() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
        driver.quit();
	}
	@DataProvider(name="Jivan")
	public Object[][] passdata() throws IOException
	{
		Object[][] obj=new Object[3][2];
		File f=new File("C:\\Users\\Zero\\eclipse-workspace\\TestNG\\TestData\\Test Data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int lastrow=ws.getLastRowNum();		
		for(int i=0;i<=lastrow;i++)
		{
			obj[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
			obj[i][1]=ws.getRow(i).getCell(0).getStringCellValue();	
		}
		return obj;
		
		 		 
	}
}
