package FlightBooking;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Cleartripdriver {
public static	WebDriver driver;

String URL;
  
  @BeforeTest
  @Parameters("browsers")
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver","D:/Puja/All jars required/chromedriver229/chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	  else if(browser.equalsIgnoreCase("Firefox")){
		  driver=new FirefoxDriver();
	  }
	  
	  
	  URL="https://www.cleartrip.com/";
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	  
  }
  
  @Test
  public void f() throws IOException {
	  driver.get(URL);
	  POMcleartrip.roundtrip(driver);
	  Exceldata ER=new Exceldata();
	  Exceldata.getdatavalues(ER.Filepath, "Pickvalues", "Sheet1");
	  POMcleartrip.Fromtxtbox(driver).sendKeys(Exceldata.celloriginorg);
	  POMcleartrip.Totxtbox(driver).sendKeys(Exceldata.celldestnd);
	  POMcleartrip.Departonicon(driver);
	//  POMcleartrip.ReturnOnicon(driver).sendKeys("Tue, 29 Aug, 2017");
	  POMcleartrip.Adults(driver, "2");
	  POMcleartrip.children(driver, "2");
	  POMcleartrip.searchbutton(driver);
	  POMcleartrip.Book(driver);
	  POMcleartrip.Itinerary(driver);
	  //POMcleartrip.logging(driver);
	  //POMcleartrip.baggageInfo(driver);
	  POMcleartrip.screenshot(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
