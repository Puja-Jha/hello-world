package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AmazonPOM {
	
	public static WebElement element;
	static Logger log=Logger.getLogger("AmazonPOM.class");
	public static WebDriverWait wait=null;
	
	//opening amazon site
	public static void Opensite(WebDriver driver){
		
		String Title="Access to this site is blocked";
		if(driver.getTitle().contains(Title)){
			System.out.println(driver.getTitle());
			System.out.println(driver.getPageSource());
			//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		/*element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rdbBusiness']")));
		Reporter.log(driver.getTitle(),true);
		element.click();	*/
		driver.findElement(By.xpath("//*[@id='cntinue']")).click();
		
		}
		
	}
	
	//hovering over your order
	public static void yourorder(WebDriver driver){
		wait=new WebDriverWait(driver, 20);
		element=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
		
		
		
		WebElement element2= driver.findElement(By.xpath("//*[@id='nav-flyout-yourAccount']"));
		wait.until(ExpectedConditions.visibilityOf(element2));
		
		while(true){
			if(!(element2 instanceof WebElement)){
				try {
					Thread.currentThread().sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		/*Actions action=new Actions(driver);
        action.moveToElement(element).perform();
        action.click();*/
	
	}

	//clickon signinbutton
		public static void signin(WebDriver driver){
			element=driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"));
			element.click();
			
		}
		
		//emailtextbox
		public static WebElement emailtextbox(WebDriver driver){
			element=driver.findElement(By.xpath("//*[@id='ap_email']"));
			element.click();
			//element.sendKeys(email);
			return element;
		}
		
		//passwordbox
		public static WebElement passwordbox(WebDriver driver){
			element=driver.findElement(By.xpath("//*[@id='ap_password']"));
			element.click();
			return element;
		}
		
		//clickonsubmit
		public static void clickonsubmit(WebDriver driver){
			element=driver.findElement(By.xpath("//*[@id='signInSubmit']"));
			element.click();
			Reporter.log("clicked on submit",true);
		}
	
	 //mouse-hover shopbyCategory
	public static void Shopbycategory(WebDriver driver){
		wait=new WebDriverWait(driver,20);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);	
		element=driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]/span"));
		System.out.println(element);
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		action.click();
		
	}
	
	//mouse hover Books
	public static void Book(WebDriver driver){
		
		wait=new WebDriverWait(driver,20);
		element=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[13]/span"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		action.click();
	}
	
	//click on Indian Language Books
	public static void IndianLanguageBooks(WebDriver driver){
		element=driver.findElement(By.linkText("Indian Language Books"));
		element.click();
	}
	
	//click on Computing, Internet & Digital Media
	public static void ComputngInternet(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='leftNav']/ul[1]/ul/div/li[7]/span/a/span[1]"));
		element.click();
		element=driver.findElement(By.linkText("Numerical Analysis with Algorithms and Computer Programs in C++"));
		element.click();
	}
	
	//add to cart
	public static void clickoncart(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
		element.click();
		Reporter.log("Added to cart",true);
	}
	
	
	
	
}



