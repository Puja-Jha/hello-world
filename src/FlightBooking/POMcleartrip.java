package FlightBooking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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

public class POMcleartrip {
	public static WebElement element;
	public static WebDriverWait wait;
	static BufferedWriter output = null;


	// oneway radioButton
	public static void roundtrip(WebDriver driver) {
		element = driver.findElement(By.id("OneWay"));
		element.click();

	}

	// From radioButton
	public static WebElement Fromtxtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='FromTag']"));
		element.click();
		return element;

	}

	// To radioButton
	public static WebElement Totxtbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='ToTag']"));
		element.click();
		return element;

	}

	// Departonicon
	public static void Departonicon(WebDriver driver) {
		//js=(JavascriptExecutor)driver;
		element = driver.findElement(By.id("DepartDate"));
		//element =(WebElement) js.executeScript("return document.getElementById('ui-datepicker-div')");
		 element.click();
		WebElement element1=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a"));
		element1.click();
	}

	/*// Return On
	public static WebElement ReturnOnicon(WebDriver driver) {
		element = driver.findElement(By.xpath("ReturnDate"));
		// element.click();
		return element;
	}*/

	// Adults
	public static void Adults(WebDriver driver, String num) {
		/*
		 * element=driver.findElement(By.xpath("//*[@id='Adults']"));
		 * ArrayList<WebElement> arr=(ArrayList<WebElement>)
		 * element.findElements(By.tagName("option")); for(WebElement we:arr){
		 * if(we.getText().equals(num)); we.click(); }
		 */

		Select sel = new Select(driver.findElement(By.xpath("//*[@id='Adults']")));
		sel.selectByValue(num);
	}

	// children
	public static void children(WebDriver driver, String num) {
		element = driver.findElement(By.xpath("//*[@id='Childrens']"));
		Select sel = new Select(element);
		sel.selectByValue(num);
	}
	
	//searchbutton
	public static void searchbutton(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='SearchBtn']"));
		element.click();
		
	}
	
	//click on book button
	public static void Book(WebDriver driver){
		wait=new WebDriverWait(driver, 20);
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='flightForm']/section[2]/div[4]/div/nav/ul/li[3]/table/tbody[2]/tr[2]/td[3]/button")));
		//element=driver.findElement(By.xpath("//*[@id='flightForm']/section[2]/div[4]/div/nav/ul/li[3]/table/tbody[2]/tr[2]/td[3]/button"));
		element.click();
	}
	
	//Fetching Itinerary values
	public static void Itinerary(WebDriver driver) throws IOException {
		element=driver.findElement(By.xpath("//*[@id='itinBlock']/div/div/div"));
		ArrayList<WebElement> web=(ArrayList<WebElement>) element.findElements(By.tagName("h1"));
		for(WebElement arr:web){
			System.out.println("Journey and date timings are: " + arr.getText());
			//writetofile(arr.getText());
	}

}
	//Write to file
	public static void writetofile(StringBuffer str) throws IOException{
		File file=new File("D://NewWorkSpace_Eclipse//Selenium//example.txt");
		try {
			output=new BufferedWriter(new FileWriter(file));
			output.write(str.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
	          if ( output != null ) {
	            output.close();
	          }
	}
		
	}
	
	//Indigo baggageInfo
	public static void baggageInfo(WebDriver driver) throws IOException{
		element=driver.findElement(By.className("itinerarySummary CCU_PNQ"));
		StringBuffer strbuff = null;
		ArrayList<WebElement> arr=(ArrayList<WebElement>) element.findElements(By.tagName("li"));
		for(WebElement web:arr){
			System.out.println("Journey and date timings are: " + web.getText() + "\n");
			strbuff= new StringBuffer();
			strbuff.append(strbuff);
			
		}
		writetofile(strbuff);
		
	}
	
	/*public static void logging(WebDriver driver) throws IOException{
		String n =driver.findElement(By.tagName("body")).getText();
		writetofile(n);
		
	}*/
	
	//Take screenshot
	public static void screenshot(WebDriver driver) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile= new File("D:\\NewWorkSpace_Eclipse\\LearningSelenium\\" +"screenshot.png");
		System.out.println(destFile.getAbsolutePath());
		FileUtils.copyFile(src, destFile);
	}
	
	
}
