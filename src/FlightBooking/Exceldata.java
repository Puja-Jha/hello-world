package FlightBooking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;
	public static XSSFCell cellorigin;
	public static XSSFCell celldestn;
	static String celloriginorg,celldestnd;
	
	
	public String Filepath="D://NewWorkSpace_Eclipse//Selenium//Pickvalues.xlsx";
	
	public static void getdatavalues(String Filepath,String Filename,String Sheetname) throws IOException{
		File file= new File(Filepath);
		FileInputStream Input=new FileInputStream(file);
		ExcelWBook=new XSSFWorkbook(Input);
		ExcelWSheet=ExcelWBook.getSheet(Sheetname);
		cellorigin=ExcelWSheet.getRow(1).getCell(0);
		celldestn=ExcelWSheet.getRow(1).getCell(1);
		celloriginorg=cellorigin.getStringCellValue();
		celldestnd=celldestn.getStringCellValue();
	}

}

