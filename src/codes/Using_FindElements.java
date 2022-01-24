package codes;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_FindElements {
public static void main(String[] args) {
WebDriver dr=new ChromeDriver();
dr.get("https://yahoo.com");
dr.manage().window().maximize();
//get collection of links in webpage which are having tag a
List<WebElement>Olist=dr.findElements(By.tagName("a"));
System.out.println("no of links are::"+Olist.size());
for(WebElement eachlink:Olist)
{
	//get text of each link
	String linkname=eachlink.getText();
	//get url of each link which are stored in href property 
	String url=eachlink.getAttribute("href");
	System.out.println(linkname+"\n"+url);
}
dr.close();
	}
}


















