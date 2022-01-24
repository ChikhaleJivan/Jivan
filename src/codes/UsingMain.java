package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class UsingMain
{
 @SuppressWarnings("resource")
 public static void main(String[] args) throws IOException
  {
   File f=new File("C:\\Users\\Zero\\eclipse-workspace\\POI\\TestData\\Test Data.xlsx");
   FileInputStream fis=new FileInputStream(f);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sheet=wb.getSheetAt(0);
   int lastrow=sheet.getLastRowNum();
   for(int i=0;i<=lastrow;i++)
    {
     String username=sheet.getRow(i).getCell(0).getStringCellValue();
     String password=sheet.getRow(i).getCell(1).getStringCellValue();
     System.out.println(username);
     System.out.println(password);
    }
  }
}
