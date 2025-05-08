package environment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOneClass {
	  
	protected WebDriver driver;
		
		public void setup() {
			
			//lunch chrome browser
			    driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Setup Completed");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.get("https://www.saucedemo.com/");
		}
		
		//driver quit or close
		
		public void closeDown() {
			if (driver != null) {
				driver.quit();
			}

		}
	     //return the driver
		public WebDriver getDriver() {
			return driver;

		}
}
