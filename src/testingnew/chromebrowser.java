package testingnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Puja/All jars required/chromedriver229/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL ="https://www.expedia.co.in/";
		driver.get(URL);
		driver.findElement(By.id("tab-flight-tab")).click();
		

	}

}
