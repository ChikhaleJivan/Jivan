package codes;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Using_XlUtils 
{
	WebDriver driver;
	String inputpath="./Input/webreg.xlsx";
	String outputpath="./Output/webregresults.xlsx";
	Properties p;
	FileInputStream fi;
	@BeforeTest
	public void Launch() throws IOException 
	{
		driver=new ChromeDriver();
		
    }
	@SuppressWarnings({ "deprecation" })
	@Test
	public void Register() throws IOException
    {
		p=new Properties();
		fi=new FileInputStream("D:\\Selenium_5oclock\\Testng_Framework\\Repository.properties");
        p.load(fi);
        //create reference object to call excelreadmethods
        ExcelReaderMethods xl=new ExcelReaderMethods(inputpath);
        //count rows
        int rc=xl.getRowCount("Register");
        int cc=xl.getCellCount("Register");
        System.out.println("no of rows rae::"+rc+"Columns are::"+cc);
        for(int i=1;i<=rc;i++)
        	{
        	 driver.get("http://newtours.demoaut.com");
	         driver.manage().window().maximize();
	         driver.findElement(By.xpath(p.getProperty("ObjReg"))).click();
	         driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
             String fname=xl.getCellData("Register", i, 0);
             String lname=xl.getCellData("Register", i, 1);
             String phone=xl.getCellData("Register", i, 2);
             String mail=xl.getCellData("Register", i, 3);
             String add1=xl.getCellData("Register", i, 4);
             String add2=xl.getCellData("Register", i, 5);
             String city=xl.getCellData("Register", i, 6);
             String state=xl.getCellData("Register", i, 7);
             String pcode=xl.getCellData("Register", i, 8);
             String country=xl.getCellData("Register", i, 9);
             String user=xl.getCellData("Register", i, 10);
             String pwd=xl.getCellData("Register", i, 11);
             String cpwd=xl.getCellData("Register", i, 12);
             driver.findElement(By.name(p.getProperty("fname"))).sendKeys(fname);
             driver.findElement(By.name(p.getProperty("lname"))).sendKeys(lname);
             driver.findElement(By.name(p.getProperty("phone"))).sendKeys(phone);
             driver.findElement(By.name(p.getProperty("mail"))).sendKeys(mail);
             driver.findElement(By.name(p.getProperty("add1"))).sendKeys(add1);
             driver.findElement(By.name(p.getProperty("add2"))).sendKeys(add2);
             driver.findElement(By.name(p.getProperty("city"))).sendKeys(city);
             driver.findElement(By.name(p.getProperty("state"))).sendKeys(state);
             driver.findElement(By.name(p.getProperty("pcode"))).sendKeys(pcode);
             driver.findElement(By.name(p.getProperty("country"))).sendKeys(country);
             driver.findElement(By.name(p.getProperty("username"))).sendKeys(user);
             driver.findElement(By.name(p.getProperty("password"))).sendKeys(pwd);
             driver.findElement(By.name(p.getProperty("cpassword"))).sendKeys(cpwd);
             driver.findElement(By.name(p.getProperty("submit"))).sendKeys(Keys.ENTER);
             if(pwd.equals(cpwd))
            	 {
            	  System.out.println("Register success");
            	  xl.setCellData("Register", i, 13, "Pass", outputpath);
            	  xl.fillGreenColor("Register", i, 13, outputpath);
            	 }
             else 
                 {
            	  System.out.println("Register unsuccess");
            	  xl.setCellData("Register", i, 13, "fail", outputpath);
            	  xl.fillRedColor("Register", i, 13, outputpath);
            	  }
             }
        xl.closefiles();
        }
	@AfterTest
	public void close() 
	{
		driver.quit();
	}
}