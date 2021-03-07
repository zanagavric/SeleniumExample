package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTests;

public class PageLogin extends BaseTests {

	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton;
	WebElement assertText;

	public PageLogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	public WebElement getAssertText() {
		return driver.findElement(By.className("product_label"));
	}
	
	public void loginButtonClick() {
		this.getLoginButton().click();
	}
	
	public void loginUser(String customer, String password) {
		this.getUsernameField().sendKeys(customer);
		this.getPasswordField().sendKeys(password);
		this.getLoginButton().click();
	}
	
}
