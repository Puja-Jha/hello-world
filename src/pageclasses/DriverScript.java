package pageclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverScript {
	
	public static WebDriver driver;
	String URL;
	
  @BeforeTest
  @Parameters("browsers")
  public void SetUp(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")){
		  System.setProperty("webdriver.chrome.driver","D:/Puja/All jars required/chromedriver229/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("Firefox")){
		  driver=new FirefoxDriver(); 
	  }
	  
	  URL="http://www.amazon.in/";
	driver.manage().window().maximize();
  }
  
  
  @Test
  public void f() throws Exception {
	 
	  
	  driver.get(URL);
	  //System.out.println(driver.getCurrentUrl());
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  AmazonPOM.Opensite(driver);
	  AmazonPOM.signin(driver);
	  Signin sign=new Signin();
	  Signin.readexcelval("sigin","Sheet1",sign.path);
	  AmazonPOM.emailtextbox(driver).sendKeys(Signin.emailcell);
	  AmazonPOM.passwordbox(driver).sendKeys(Signin.passcell);
	  AmazonPOM.clickonsubmit(driver);
	  AmazonPOM.Shopbycategory(driver);
	  AmazonPOM.Book(driver);
	  AmazonPOM.IndianLanguageBooks(driver);
	  AmazonPOM.ComputngInternet(driver);
	  AmazonPOM.clickoncart(driver);
	  AmazonPOM.yourorder(driver);
	  
	  
  }

/* @AfterTest
  public void f1() {
	 
	 driver.quit();
	 Reporter.log("completed",true);
  }*/

}
