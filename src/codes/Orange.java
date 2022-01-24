package codes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange {
WebDriver driver;
File f;
FileInputStream fi;
FileOutputStream fo;
XSSFWorkbook wb;
XSSFSheet ws;
XSSFRow r;
@BeforeTest
public void launch_browser() {
	driver=new ChromeDriver();
}
@Test
public void Login() throws IOException {
	f=new File("./Input/Oranagelogin.xlsx");
	fi=new FileInputStream(f);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheetAt(0);
	int rc=ws.getLastRowNum();
	r=ws.getRow(0);
	int cc=r.getLastCellNum();
	System.out.println("no of rows::"+"  "+rc+"no of columns ::"+cc);
	for(int i=1;i<=rc;i++)
	{
driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
driver.manage().window().maximize();
String username=ws.getRow(i).getCell(0).getStringCellValue();
String password=ws.getRow(i).getCell(1).getStringCellValue();
driver.findElement(new ByIdOrName("txtUsername")).sendKeys(username);
driver.findElement(new ByIdOrName("txtPassword")).sendKeys(password);
driver.findElement(new ByIdOrName("btnLogin")).sendKeys(Keys.ENTER);
if(driver.getCurrentUrl().contains("dash"))
{
	System.out.println("login success");
	ws.getRow(i).createCell(2).setCellValue("pass");
}
else {
	System.out.println("login unsuccess");
String message=driver.findElement(By.id("spanMessage")).getText();
ws.getRow(i).createCell(2).setCellValue(message);
}
}
	fi.close();
	fo=new FileOutputStream(new File("./Output/LoginResults.xlsx"));
	wb.write(fo);
	fo.close();
	wb.close();
}
@AfterTest
public void close() {
	driver.quit();
}
}
















