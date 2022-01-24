package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Write_Excel 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("./Input/input data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheetAt(0);
		XSSFRow row=ws.getRow(0);
		int no_of_rows=ws.getLastRowNum();
		int no_of_coloumns=row.getLastCellNum();
		System.out.println("number of rows are "+no_of_rows+"  number of coloumns are "+no_of_coloumns);
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		FileOutputStream fo=new FileOutputStream(new File("./Output/result.xlsx"));
		for(int i=1;i<=no_of_rows;i++)
			{
			 String username=ws.getRow(i).getCell(0).getStringCellValue();
			 driver.findElement(By.id("txtUsername")).sendKeys(username);
			 String password=ws.getRow(i).getCell(0).getStringCellValue();
			 driver.findElement(By.id("txtPassword")).sendKeys(password);
			 driver.findElement(By.id("btnLogin")).click();
			 if(driver.getCurrentUrl().contains("dash"))
			 {
				 ws.getRow(i).createCell(2).setCellValue("pass");
			 }
			 else
			 {
				 ws.getRow(i).createCell(2).setCellValue("fail");
			 }
			 
      		}
		driver.quit();
		wb.write(fo);
		wb.close();
		fo.flush();
		
	}

}