package pageclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class RedBusDriver {
	public static WebDriver driver;
	String URL;
	
  @BeforeTest
  @Parameters("browsers")
  public void beforeTest(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver", "D:/Puja/All jars required/chromedriver229/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("Firefox")){
		  driver=new FirefoxDriver();
	  }
	  
	  URL="https://www.redbus.in/";
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void f() throws IOException {
	  
	  
	  driver.get(URL);
	  RedbusPOM.origintxtbox(driver);
	  RedbusPOM.destntxtbox(driver);
	//  RedbusPOM.origintxtboxDD(driver).click();
	  RedbusPOM.onwarddate(driver);
	  RedbusPOM.returndate(driver);
	  RedbusPOM.Capturescreenshot(driver);
	  RedbusPOM.SearchBuses(driver);
	  }
  

  @AfterTest
  public void afterTest() {
  }

}
