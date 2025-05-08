package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserLockedOutPage {
	
	protected WebDriver driver;

	public UserLockedOutPage(WebDriver driver) {
		this.driver = driver;
	}
	public void LockedOut() {
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		System.out.println("User set completed");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println("User password completed");
		
		driver.findElement(By.id("login-button")).click();
		System.out.println("SORRRYYYYY");
		
		WebElement find07 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
	    String Ridoy40 = find07.getText();
	    String abdulla40 = "Epic sadface: Sorry, this user has been locked out.";
    
	    //Hard assertion
	     Assert.assertEquals(Ridoy40, abdulla40);		      
	      System.out.println("Wronggggggggg USER");

	}
 
}
