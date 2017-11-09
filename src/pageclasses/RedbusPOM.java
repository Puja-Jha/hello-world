package pageclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusPOM {
	
	public static WebElement element;
	static Logger log = Logger.getLogger(RedbusPOM.class);
	static Properties prop=null;
	static String From,To;
	public static WebDriverWait wait;
	
	//loading Properties file
public static void getpropertyvalue() throws IOException{
		
		File file=new File("D:\\NewWorkSpace_Eclipse\\LearningSelenium\\src\\resources\\config.properties");
		FileInputStream inputstream=new FileInputStream(file);
		prop=new Properties();
		prop.load(inputstream);
		From= prop.getProperty("origin");
		To=prop.getProperty("destination");
		
	}
	
	//FROM TextBox
	public static void origintxtbox(WebDriver driver) throws IOException{
		RedbusPOM.getpropertyvalue();
		wait=new WebDriverWait(driver, 20);
		element=driver.findElement(By.xpath("//*[@id='src']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(From);
		//WebElement eleui=driver.findElement(By.className("autoFill"));
		WebElement eleui=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("autoFill")));
		//ArrayList<WebElement> source=(ArrayList<WebElement>) element.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		ArrayList<WebElement> source=(ArrayList<WebElement>) eleui.findElements(By.tagName("li"));
		for(WebElement orign:source){
			System.out.println("Selected: " + orign.getText());
				if(orign.getText().equals(From)){
				orign.click();
				//System.out.println("Selected: " + orign.getText());
				break;
			}
		}
	}
	
	/*//clicking on the textboxes
	public static WebElement origintxtboxDD(WebDriver driver){
	
	element=driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul"));
	return element;
	
}*/
	
	
	//TO TextBox
	public static void destntxtbox(WebDriver driver) throws IOException{
		RedbusPOM.getpropertyvalue();
		element=driver.findElement(By.xpath("//input[@id='dest']"));
		element.sendKeys(To);
		WebElement eleui=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("autoFill")));
		ArrayList<WebElement> dest=(ArrayList<WebElement>) eleui.findElements(By.xpath("//*[@id='search']/div/div[2]/div/ul/li"));
		for(WebElement destination:dest){
			if(destination.getText().equals(To)){
				destination.click();
			}
			
		}
	}
	
	
	//ONWARD Date
	public static void onwarddate(WebDriver driver) throws IOException{
		wait=new WebDriverWait(driver, 20);
		element=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span"));
		element.click();
		WebElement opick=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[4]"));
		wait.until(ExpectedConditions.visibilityOf(opick));
		//WebElement opick=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[4]")));
		opick.click();
		
	}
	
	   //Returning Date
		public static void returndate(WebDriver driver) throws IOException{
			wait=new WebDriverWait(driver, 20);
			element=driver.findElement(By.xpath("//*[@id='search']/div/div[4]/span"));
			element.click();
			WebElement rpick=driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody/tr[5]/td[4]"));
			wait.until(ExpectedConditions.visibilityOf(rpick));
			rpick.click();
		}
	
	
	//SearchBuses
		public static void SearchBuses(WebDriver driver){
			element=driver.findElement(By.xpath("//*[@id='search_btn']"));
			element.click();
		}
	
	//taking screenshot
		public static void Capturescreenshot(WebDriver driver) throws IOException{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\NewWorkSpace_Eclipse\\LearningSelenium\\" + "screenshot.png");
			FileUtils.copyFile(src, dest);
			
			
		}

		

}
