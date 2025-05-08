package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserLoginPage {
	protected WebDriver driver;

	// constructor
	public UserLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// actions
	public void enterUser(String username) {

		driver.findElement(By.id("user-name")).sendKeys(username);
		System.out.println("User set completed");
	}

	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Password set completed");

	}

	public void clickLogin() {
		driver.findElement(By.id("login-button")).click();
		System.out.println("Click completed");
						
	}
	
	public void incorrectUser() {
		    driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//password
			driver.findElement(By.id("password")).sendKeys("secret_saucee");
			//login
			driver.findElement(By.id("login-button")).click();
			 System.out.println("Incorrect user");
	}

}
