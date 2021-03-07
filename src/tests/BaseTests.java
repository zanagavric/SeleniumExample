package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CartPage;
import pages.CheckoutSteps;
import pages.PageInventory;
import pages.PageLogin;

public class BaseTests {

	WebDriver driver;
	PageLogin pageLogin;
	PageInventory pageInventory;
	CartPage cartPage;
	CheckoutSteps checkoutSteps;
	
	public final String USERNAME = "standard_user";
	public final String PASSWORD = "secret_sauce";
	public final String ASSERT1 = "Products";
	public final String ASSERT2 = "THANK YOU FOR YOUR ORDER";
	public final String FIRSTNAME = "Ana";
	public final String LASTNAME = "Anic";
	public final String ZIPCODE = "21000";
	public final String WEBSITE = "https://www.saucedemo.com";
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.pageLogin = new PageLogin(driver);
		this.pageInventory = new PageInventory(driver);
		this.cartPage = new CartPage(driver);
		this.checkoutSteps = new CheckoutSteps(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(WEBSITE);	
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void theEnd() {
		driver.close();
		driver.quit();
	}
	
	public void logout() {
		pageInventory.openMenuClick();
		pageInventory.logOutClick();
	}

}
