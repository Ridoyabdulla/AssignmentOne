package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyProductPage {
	    protected WebDriver driver;	
	    // constructor
		public MyProductPage(WebDriver driver) {
			this.driver = driver;
		}		
		//Action
		
		public void BuyFirstTwoProduct() throws InterruptedException {
			// add to cart some products
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			System.out.println("1st product add to cart completed");
			
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			System.out.println("2nd product add to cart completed");			
			Thread.sleep(4000);
		}
		
		public void addaSingleProduct() {
			driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			
			driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
			
			driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();	
			System.out.println("INTHE CHECKOUT");

		}
		
		public void priceLowToHigh() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);

			//SELECT LOW TO HIGH
		
			WebElement drowdownOption = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select dropdown = new Select(drowdownOption);
			dropdown.selectByIndex(2);
			System.out.println("LOW to HIGH COMPLETE");
			Thread.sleep(2000);
			//Verify that product is in correct order
			WebElement productNames = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
			String actProduct = productNames.getText();
			String expProduct = "Sauce Labs Onesie";
			Assert.assertEquals(actProduct, expProduct, "Condition mismatch");
			System.out.println("verify that Product is in correct order");
			
		}
		
		public void priceHighToLow() throws InterruptedException {
			
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			
			//SELECT HIGH TO LOW

			WebElement drowdownOption1 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select dropdown1 = new Select(drowdownOption1);
			dropdown1.selectByIndex(3);
			System.out.println("HIGH TO LOW COMPLETE");
			Thread.sleep(2000);
			
			//Verify that product is in correct order
			WebElement productNames1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
			String actProduct1 = productNames1.getText();
			String expProduct1 = "Sauce Labs Fleece Jacket";
			Assert.assertEquals(actProduct1, expProduct1, "Condition mismatch");
			System.out.println("verify that HIGH TO LOW Product is in correct order");
		}
		
		public void nameAToZ() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			//SELECT A TO Z
			WebElement drowdownOption2 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select dropdown2 = new Select(drowdownOption2);
			dropdown2.selectByIndex(0);
			System.out.println("A TO Z COMPLETE");
			Thread.sleep(2000);
			
			//Verify that product is in correct order
			WebElement productNames2 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
			String actProduct2 = productNames2.getText();
			String expProduct2 = "Sauce Labs Backpack";
			Assert.assertEquals(actProduct2, expProduct2, "Condition mismatch");
			System.out.println("verify that Product Z TO A is in correct order");
		}
		
		public void nameZToA() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			//SELECT Z TO A
			WebElement drowdownOption3 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
			Select dropdown3 = new Select(drowdownOption3);
			dropdown3.selectByIndex(1);
			System.out.println("Z TO A COMPLETE");
			Thread.sleep(2000);
			//Verify that product is in correct order
			WebElement productNames3 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
			String actProduct3 = productNames3.getText();
			String expProduct3 = "Test.allTheThings() T-Shirt (Red)";
			Assert.assertEquals(actProduct3, expProduct3, "Condition mismatch");
			System.out.println("verify that Product Z TO A is in correct order");
		}
				
}
