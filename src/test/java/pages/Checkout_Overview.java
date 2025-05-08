package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkout_Overview {
	protected WebDriver driver;

	public Checkout_Overview(WebDriver driver) {
		this.driver = driver;
}
	
	public void CheckoutProcess() throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		 System.out.println("checkout complete");

		
	}

}
