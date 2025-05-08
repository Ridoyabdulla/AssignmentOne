package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCart {
	protected WebDriver driver;

	public MyCart(WebDriver driver) {
		this.driver = driver;
	}

	public void CartProcess() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();

		WebElement find80 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div"));
		String Ridoy11 = find80.getText();
		String abdulla11 = "Sauce Labs Backpack";

		Assert.assertEquals(Ridoy11, abdulla11, "condition mismatch");
		System.out.println("1st product assrsion");
		Thread.sleep(2000);

		WebElement find02 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div"));
		String Ridoy12 = find02.getText();
		String abdulla12 = "Sauce Labs Bike Light";
		Assert.assertEquals(Ridoy12, abdulla12, "condition mismatch");
		System.out.println("2nd product assertion");
		Thread.sleep(2000);

	}
}
