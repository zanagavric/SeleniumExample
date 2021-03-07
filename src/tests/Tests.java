package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {

	@BeforeMethod
	public void start() {
		driver.navigate().refresh();
	}
	@Test (priority = 0)
	public void login() {
		pageLogin.loginUser(USERNAME, PASSWORD);	
		
		Assert.assertEquals(pageLogin.getAssertText().getText(), ASSERT1);
	}
	
	@Test (priority = 1)
	public void addProduct() {
		pageLogin.loginUser(USERNAME, PASSWORD);
		pageInventory.addToCartClick();
		pageInventory.cartClick();
		cartPage.checkoutButtonClick();
		checkoutSteps.insertData(FIRSTNAME, LASTNAME, ZIPCODE);
		checkoutSteps.continueButtonClick();
		checkoutSteps.finishButtonClick();
		
		Assert.assertEquals(checkoutSteps.textAssert(), ASSERT2);
	}
	
	@AfterMethod
	public void afterTest() {
		logout();
	}
	
}
 