package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import tests.BaseTests;

public class PageInventory extends BaseTests{
	
	WebDriver driver;
	WebElement addToCart;
	WebElement cart;
	WebElement openMenu;
	WebElement logOut;
	WebElement remove;

	public PageInventory(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	}

	public WebElement getCart() {
		return driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
	}
	
	public WebElement getOpenMenu() {
		return driver.findElement(By.id("react-burger-menu-btn"));
	}
	
	public WebElement getLogOut() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}
	
	public WebElement getRemove() {
		return driver.findElement(By.xpath("//button[text()='REMOVE']"));
	}
	
	public void openMenuClick() {
		this.getOpenMenu().click();
	}
	
	public void cartClick() {
		this.getCart().click();
	}

	public void addToCartClick() {
		this.getAddToCart().click();
	}
	
	public void logOutClick() {
		this.getLogOut().click();
	}
	
	public void removeClick() {
		this.getRemove().click();
	}

}
