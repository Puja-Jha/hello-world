package tutorial.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelldata {

	public static XSSFWorkbook ExcelWBook;
	public static XSSFSheet ExcelWSheet;

	public static void main(String[] args) throws IOException {
		
		File newFile = new File("D:\\NewWorkSpace_Eclipse\\Selenium\\ExcelRead.xlsx");
		FileInputStream fileIptstrm = new FileInputStream(newFile);
		ExcelWBook = new XSSFWorkbook(fileIptstrm);
		ExcelWSheet = ExcelWBook.getSheet("Searchsheet");
		int count= 1;
	    for(int i = 0;i <=2;i++){

	        for(int j = 0;j<=2;j++){
	            XSSFRow row = ExcelWSheet.getRow(j);
	            if(row.getCell(count) !=null && row.getCell(count).getStringCellValue()!=null)
	            System.out.print(row.getCell(count).getStringCellValue() + "    ");
	        }
	        count++;
	    }

	}
}
