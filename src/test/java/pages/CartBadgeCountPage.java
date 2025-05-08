package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartBadgeCountPage {
	
	protected WebDriver driver;

	public CartBadgeCountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void UserCount() throws InterruptedException {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		System.out.println("1st product add to cart completed");
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		System.out.println("2nd product add to cart completed");			
		Thread.sleep(2000);
     
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		System.out.println("This item removed");
		Thread.sleep(2000);
		
	}
  
}
