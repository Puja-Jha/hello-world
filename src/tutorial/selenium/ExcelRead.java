package tutorial.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class  ExcelRead {

	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFCell Cellorigin =null;
	public static XSSFCell Celldestn =null;
	public static XSSFCell Cellemail;
	//String celloriginvalue =null;
	//String celldestnvalue =null;

	String path = "D:\\NewWorkSpace_Eclipse\\Selenium\\ExcelRead.xlsx" ;
	public String celldestnvalue;
	public String celloriginvalue;
	public String Cellemailvalue;

	//String sheetName = "ddd" ;

	public void readexcel(String filename,String filepath,String sheetName) throws IOException{
		
		//filepath= this.path;
		File newFile = new File(filepath);
		FileInputStream fileIptstrm = new FileInputStream(newFile);
		ExcelWBook = new XSSFWorkbook(fileIptstrm);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		Cellorigin = ExcelWSheet.getRow(1).getCell(0);
		Celldestn = ExcelWSheet.getRow(1).getCell(1);
		Cellemail = ExcelWSheet.getRow(1).getCell(2);
		celloriginvalue = Cellorigin.getStringCellValue();
		celldestnvalue = Celldestn.getStringCellValue();
		Cellemailvalue = Cellemail.getStringCellValue();
		System.out.println("cell value is" +celloriginvalue + celldestnvalue + Cellemailvalue);
	}

}
