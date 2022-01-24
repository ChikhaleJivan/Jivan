package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Orange_Emp 
{
	WebDriver driver;
	File f;
	FileInputStream fi;
	FileOutputStream fo;
	Workbook wb;
	Sheet sh;
	Row r;
	Actions ac;
	@BeforeTest
	public void AdminLogin()
	{
		driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.DOWN,"Admin",Keys.UP);
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.DOWN,"Admin",Keys.UP);
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.ENTER);
	}
	@Test
	public void Verify_Emp() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		ac=new Actions(driver);
		f=new File("./Input/Emp.xlsx");
		fi=new FileInputStream(f);
		wb=WorkbookFactory.create(fi);
		sh=wb.getSheetAt(0);
		int rc=sh.getLastRowNum();
		r=sh.getRow(0);
		int cc=r.getLastCellNum();
		System.out.println("no of rows::"+rc+"no of columns ::"+cc);
		for(int rownumber=1;rownumber<=rc;rownumber++)
			{
			ac.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).click().perform();
			Thread.sleep(3000);
			ac.moveToElement(driver.findElement(By.id("btnAdd"))).click().perform();
			Thread.sleep(3000);
			String fname=sh.getRow(rownumber).getCell(0).getStringCellValue();
			String lname=sh.getRow(rownumber).getCell(1).getStringCellValue();
			String eid=sh.getRow(rownumber).getCell(2).getStringCellValue();
			driver.findElement(new ByIdOrName("firstName")).sendKeys(fname);
			driver.findElement(new ByIdOrName("lastName")).sendKeys(lname);
			driver.findElement(new ByIdOrName("employeeId")).sendKeys(eid);
			driver.findElement(new ByIdOrName("btnSave")).sendKeys(Keys.ENTER);
			String message=fname+" "+lname;
			String Actaul=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
			if(message.equals(Actaul))
				{
				System.out.println("pass");
				sh.getRow(rownumber).createCell(3).setCellValue("Emp created");
				}
			else
				{
				System.out.println("fail");
				sh.getRow(rownumber).createCell(3).setCellValue("Emp not created");
				}
			}
		fi.close();
		fo=new FileOutputStream(new File("./Output/empresults.xlsx"));
		wb.write(fo);
		fo.close();
		wb.close();
	}
	@AfterTest
	public void Logout() throws InterruptedException 
	{
		ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.partialLinkText("Welcome"))).click().perform();
		Thread.sleep(4000);
		ac.moveToElement(driver.findElement(By.partialLinkText("Log"))).click().perform();
		Thread.sleep(4000);
		driver.quit();
	}
}
