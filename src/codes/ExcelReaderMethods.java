package codes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelReaderMethods 
{
	File f;
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook wb;
	XSSFSheet ws;
	XSSFRow row;
	XSSFCell cell;
	XSSFCellStyle style;
	public ExcelReaderMethods(String inputpath)
	{
		try
		{
			f=new File(inputpath);
			fi=new FileInputStream(f);
			wb=new XSSFWorkbook(fi);
		}
		catch(IOException t)
		{
			System.out.println(t.getMessage());
		}
	}
	//count no of rows
	public int getRowCount(String sheetname)
	{
		int rowcount;
		ws=wb.getSheet(sheetname);
		rowcount=ws.getLastRowNum();
		return rowcount;
	}
	//count no of columns
	public int getCellCount(String sheetname) throws IOException
	{
		int cellcount;
		ws=wb.getSheet(sheetname);
		row=ws.getRow(0);
		cellcount=row.getLastCellNum();
		return cellcount;
	}
	public String getCellData(String sheetname, int rownum,int colnum) throws IOException
	{
		ws=wb.getSheet(sheetname);
		row=ws.getRow(0);
		String data=ws.getRow(rownum).getCell(colnum).getStringCellValue();
		return data;
	}
	public void setCellData(String sheetname, int rownum,int colnum,String data,String outputxlfile) throws IOException
	{
		ws=wb.getSheet(sheetname);
		row=ws.getRow(0);
		ws.getRow(rownum).createCell(colnum).setCellValue(data);
		fo=new FileOutputStream(new File(outputxlfile));
		wb.write(fo);
	}
	public void fillGreenColor(String sheetname, int rownum,int colnum, String excelpath) throws IOException
	{
		ws=wb.getSheet(sheetname);
		row=ws.getRow(0);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		
		ws.getRow(rownum).getCell(colnum).setCellStyle(style);
		fo=new FileOutputStream(excelpath);
		wb.write(fo);
	}
	public void fillRedColor(String sheetname, int rownum,int colnum, String excelpath) throws IOException
	{
		ws=wb.getSheet(sheetname);
		row=ws.getRow(0);
		style=wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		
		ws.getRow(rownum).getCell(colnum).setCellStyle(style);
		fo=new FileOutputStream(excelpath);
		wb.write(fo);
	}
	public void closefiles() throws IOException
	{
		fi.close();
		fo.close();
		wb.close();
	}
}