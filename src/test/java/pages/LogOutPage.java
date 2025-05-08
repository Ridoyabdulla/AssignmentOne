package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogOutPage {
	
	protected WebDriver driver;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void UserLogoutTest() throws InterruptedException {
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();		
		System.out.println("USER LOGOUT");
		Thread.sleep(2000);
		//Assertion
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		System.out.println(" Verify that the user is redirected to the login page.");
		Thread.sleep(2000);

	}

}
