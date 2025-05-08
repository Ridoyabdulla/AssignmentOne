package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import environment.BasicOneClass;
import pages.CartBadgeCountPage;
import pages.Checkout_Overview;
import pages.LogOutPage;
import pages.MyCart;
import pages.MyProductPage;
import pages.UserLockedOutPage;
import pages.UserLoginPage;

public class FinalTestExecution extends BasicOneClass {
	private UserLoginPage userLoginpage;
	private MyProductPage myProductpage;
	private MyCart mycart;
	private Checkout_Overview checkout_overview;
	private LogOutPage logoutpage;
    private UserLockedOutPage userlockedoutpage;
    private CartBadgeCountPage cartbadgecountpage;
	
	@BeforeMethod
	public void setupTest() throws InterruptedException {
		setup();
		userLoginpage = new UserLoginPage(getDriver());
		myProductpage = new MyProductPage (getDriver());
		mycart = new MyCart (getDriver());
		checkout_overview = new Checkout_Overview(getDriver()); 
		logoutpage = new LogOutPage(getDriver());
		userlockedoutpage = new UserLockedOutPage(getDriver());
		cartbadgecountpage = new CartBadgeCountPage(getDriver());		
	}
	
	@Test(priority = 1)
	  public void loginFunctionality() throws InterruptedException {
		 	 
		userLoginpage.enterUser("standard_user");
		userLoginpage.enterPassword("secret_sauce");
		userLoginpage.clickLogin();
	}
	@Test(priority = 2)
	 public void loginNegative() throws InterruptedException {
	 	 
			userLoginpage.enterUser("standard_user");
			userLoginpage.enterPassword("secret_sauceee");
			userLoginpage.clickLogin();
		    Thread.sleep(2000);		    
		    //incorrect user
		    userLoginpage.incorrectUser();  		    	  
  }
	@Test(priority = 3)
	 public void AddToCart() throws InterruptedException {
		 
		    userLoginpage.enterUser("standard_user");
			userLoginpage.enterPassword("secret_sauce");
			userLoginpage.clickLogin();
		    Thread.sleep(4000);
		    myProductpage.BuyFirstTwoProduct();
		    mycart.CartProcess();		  		  
	 }
	@Test(priority = 4)
	 public void CheckOut() throws InterruptedException {
		userLoginpage.enterUser("standard_user");
		userLoginpage.enterPassword("secret_sauce");
		userLoginpage.clickLogin();
	    Thread.sleep(4000);
	    myProductpage.addaSingleProduct();
		checkout_overview.CheckoutProcess();						
	}
	
	@Test(priority = 5)
	 public void Sorting_Products() throws InterruptedException {
		userLoginpage.enterUser("standard_user");
		userLoginpage.enterPassword("secret_sauce");
		userLoginpage.clickLogin();
	    Thread.sleep(2000);
	    myProductpage.priceLowToHigh();	
	    myProductpage.priceHighToLow();
	    myProductpage.nameAToZ();
	    myProductpage.nameZToA();
	}
	@Test(priority = 6)
	public void LogoutFunctionalityTest() throws InterruptedException {
		userLoginpage.enterUser("standard_user");
		userLoginpage.enterPassword("secret_sauce");
		userLoginpage.clickLogin();
	    Thread.sleep(2000);
	    logoutpage.UserLogoutTest();
	    Thread.sleep(2000);	    
	}
	@Test(priority = 7)
	public void LockedOutUserValidation() throws InterruptedException {
		userlockedoutpage.LockedOut();
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	public void CartBadgeCountValidation() throws InterruptedException {
		userLoginpage.enterUser("standard_user");
		userLoginpage.enterPassword("secret_sauce");
		userLoginpage.clickLogin();
		Thread.sleep(2000);
		cartbadgecountpage.UserCount();
		
	}
	
	 @AfterMethod
	  public void closeBrowser() {
		  closeDown();
	  }
}
