package tutorial.selenium;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageclasses.SearchPage;


public class PageObjectModel {
	
	private WebDriver driver;
	private String URL;
	public static WebDriverWait wait =null;
  
	public static WebDriverWait getWait() {
		return wait;
	}

@Parameters("Browser")
  @BeforeTest
//Passing Browser parameter from TestNG xml
  public void SetUp(String browser) {
	
	PropertyConfigurator.configure("D:/NewWorkSpace_Eclipse/LearningSelenium/src/log4j.properties");
	
	// If the browser is Firefox, then do this
	  if(browser.equalsIgnoreCase("Chrome")){
	  System.setProperty("webdriver.chrome.driver","D:/Puja/All jars required/chromedriver229/chromedriver.exe");
	  driver= new ChromeDriver();
	  }
	// If the browser is IE, then do this
	  else if (browser.equalsIgnoreCase("IE"))
	  {
		  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		  capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		  System.setProperty("webdriver.ie.driver","D:/Puja/All jars required/IEDriverServer_Win32_2.53.1/IEDriverServer.exe");
		  driver= new InternetExplorerDriver(capabilities);
		  
	}
	 
	  //website to launch
	  URL="https://www.expedia.co.in/";
	  
	  //maximize the browsers window
	  driver.manage().window().maximize();
	  
	  wait = new WebDriverWait(driver,10);
	  
  }
  
  @Test
  public void f() throws IOException {

	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  
	  SearchPage.ClickOnFlightstab(driver);
	  ExcelRead ER = new ExcelRead();
	  ER.readexcel("ExcelRead", ER.path, "Searchsheet");
	  
	  SearchPage.fillflyingfrom(driver, ER.celloriginvalue);
	  SearchPage.FlyingFromDD(driver).click();
	  SearchPage.fillflyingto(driver, ER.celldestnvalue);
	  SearchPage.FlyingFromDD(driver).click();
	  SearchPage.Departingdate(driver).clear();
	  SearchPage.Departingdate(driver).sendKeys("05/08/2017");
	  SearchPage.Returningdate(driver).clear();
	  SearchPage.Returningdate(driver).sendKeys("10/08/2017");
	  SearchPage.Adults(driver,"4");
	  SearchPage.Capturescreenshot(driver);
	  SearchPage.Clickonsearchbttn(driver).click();
	  SearchPage.click9W621(driver);
	  SearchPage.Book(driver);
	  SearchPage.Continue(driver);
	  SearchPage.emailtext(driver).sendKeys(ER.Cellemailvalue);
	  SearchPage.Capturescreenshot(driver);
	  Reporter.log("Screenshot captured");
	
	 
  }
  
 /*@AfterTest
  
  public void f1(){
	  driver.quit();
  }*/
}
