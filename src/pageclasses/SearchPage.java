package pageclasses;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import tutorial.selenium.PageObjectModel;


public class SearchPage {

	public static WebElement element=null;
	static Logger log = Logger.getLogger(SearchPage.class);
	
	
	//navigate flights tab
	
	public static void ClickOnFlightstab(WebDriver driver)
	{	
		element = PageObjectModel.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("tab-flight-tab")));
		element.click();
		//log.info("clicking on flights tab");
		Reporter.log("clicking on flights tab||",true);

	}
	
	//flying from textbox
	
	public static WebElement FlyingFrom(WebDriver driver){
		
		element=driver.findElement(By.id("flight-origin"));
		return element;
		
	}
	//clicking on the textboxes
		public static WebElement FlyingFromDD(WebDriver driver){
		
		element=driver.findElement(By.xpath("//*[@id='aria-option-0']/div/div"));
		return element;
		
	}
	
	//flying to textbox
	public static WebElement FlyingTo(WebDriver driver){
		
		element=driver.findElement(By.id("flight-destination"));
		return element;
		
	}
	
	//filling flying from textbox

	
	public static void fillflyingfrom(WebDriver driver,String origin){
		
		element=FlyingFrom(driver);
		element.sendKeys(origin);
	
	}
	
	//filling flying to textbox
	
public static void fillflyingto(WebDriver driver,String origin){
		
		element=FlyingTo(driver);
		element.sendKeys(origin);
	
	}
     //filling departing tab and returning tab

public static WebElement Departingdate(WebDriver driver)
	{
	element= driver.findElement(By.id("flight-departing"));
	return element;	
	}


public static WebElement Returningdate(WebDriver driver)
{
	
	element= driver.findElement(By.id("flight-returning"));
	return element;
}

//click on search button

public static WebElement Clickonsearchbttn(WebDriver driver) {
	element = driver.findElement(By.id("search-button"));
	Reporter.log("clicking on search button||",true);
	return element;
}

//selecting adults as 2 from dropdown


/*public static void Adults(WebDriver driver, String num)
{
  Select sel = new Select(driver.findElement(By.id("flight-adults"))); 
 sel.selectByValue(num);

}*/

public static void Adults(WebDriver driver, String num)
{
  
	WebElement wb = driver.findElement(By.id("flight-adults"));
	ArrayList<WebElement> bh = (ArrayList<WebElement>) wb.findElements(By.tagName("option"));
	for(WebElement er : bh){
		if(er.getText().contains(num)){
			er.click();
		}
	}
	

}

public static void click9W621(WebDriver driver){
	
 element = 	driver.findElement(By.xpath("//*[@id='outbound']/table/tbody[4]/tr[2]/td[1]"));
 element = driver.findElement(By.xpath("//*[@id='return']/table/tbody[3]/tr[2]/td[1]"));
 element.click();
}

public static void Book(WebDriver driver){
	element = driver.findElement(By.id("btnBook"));
	Reporter.log("clicking on Book||",true);
	element.click();
}

public static void Continue(WebDriver driver){
	element = driver.findElement(By.xpath("//*[@id='step_1']/form/div/button"));
	element.click();
}

public static WebElement emailtext(WebDriver driver){
	element = driver.findElement(By.id("username"));
	Reporter.log("Provided email||",true);
	return element;
}

//capture screenshot

public static void Capturescreenshot(WebDriver driver) throws IOException{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\NewWorkSpace_Eclipse\\LearningSelenium\\" +"screenshot.png"));	
}

}
