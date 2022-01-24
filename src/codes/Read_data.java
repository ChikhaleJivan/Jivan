package codes;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read_data {
public static void main(String[] args) throws IOException {
//to read data from excel
	FileInputStream fi=new FileInputStream("./Input/Dummy.xlsx");
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
wb.close();
fi.close();
	
}
}










