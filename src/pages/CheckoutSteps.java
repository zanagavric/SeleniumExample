package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTests;

public class CheckoutSteps extends BaseTests {

	WebDriver driver;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement zipCode;
	WebElement continueButton;
	WebElement finishButton;
	WebElement textAssert;

	public CheckoutSteps(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastNameField() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getFinishButton() {
		return driver.findElement(By.xpath("//a[text()='FINISH']"));
	}
	
	public WebElement getTextAssert() {
		return driver.findElement(By.xpath("//h2[@class='complete-header']"));
	}

	public void insertData(String firstName, String lastName, String zip) {
		this.getFirstNameField().sendKeys(firstName);
		this.getLastNameField().sendKeys(lastName);
		this.getZipCode().sendKeys(zip);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(By.xpath("//input[@value='CONTINUE']"));
	}

	public void continueButtonClick() {
		this.getContinueButton().click();
	}
	
	public void finishButtonClick() {
		this.getFinishButton().click();
	}
	
	public String textAssert() {
		return this.getTextAssert().getText();
	}
	
}
