package pageclasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Signin {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet Wsheet;
	public static XSSFCell Wcell1,wCell2;
	static String emailcell,passcell;
	String path="D://NewWorkSpace_Eclipse//Selenium//signin.xlsx";
	
	public static void readexcelval(String filename,String sheetname,String path) throws Exception{
		File file=new File(path);
		FileInputStream Finputstream= new FileInputStream(file);
		workbook=new XSSFWorkbook(Finputstream);
		Wsheet=workbook.getSheet(sheetname);
		Wcell1=Wsheet.getRow(1).getCell(0);
		wCell2=Wsheet.getRow(1).getCell(1);
		emailcell=Wcell1.getStringCellValue();
		passcell=wCell2.getStringCellValue();
		System.out.println("emailid and pass is" +emailcell +passcell);
	}
	

}
