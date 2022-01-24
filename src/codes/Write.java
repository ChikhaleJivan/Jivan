package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Write 
{
 public static void main(String[] args) throws IOException 
  {
   File f=new File("./Input/Dummy.xlsx");
   //to read data from excel
   FileInputStream fi=new FileInputStream(f);
   XSSFWorkbook wb=new XSSFWorkbook(fi);
   //get sheet
   XSSFSheet ws=wb.getSheetAt(0);
   //count no of row from sheet
   int rc=ws.getLastRowNum();
   //get row from sheet
   XSSFRow row=ws.getRow(0);
   //count no of columns
   int cc=row.getLastCellNum();
   System.out.println("no of rows::"+rc+"   "+"no of columns are::"+cc);
   //get username column from sheet
   String username=ws.getRow(1).getCell(0).getStringCellValue();
   String password=ws.getRow(1).getCell(1).getStringCellValue();
   System.out.println(username+"   "+password);
   //write pass into result column
   ws.getRow(1).createCell(2).setCellValue("Iam so lazy person to practise");
   fi.close();
   FileOutputStream fo=new FileOutputStream(new File("./Output/Results.xlsx"));
   wb.write(fo);
   fo.close();
   wb.close();
  }
}
