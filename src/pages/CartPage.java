package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTests;

public class CartPage extends BaseTests {

	WebDriver driver;
	WebElement checkoutButton;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCheckoutButton() {
		return driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
	}
	
	public void checkoutButtonClick() {
		this.getCheckoutButton().click();
	}
	
	
}
