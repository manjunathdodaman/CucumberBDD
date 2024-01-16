package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 protected WebDriver driver ;
	// ill create locator for username and password
private	By textField_username =By.id("email");
	
private	By textField_password = By.id("pass");
	
private	By btn_loginButton =By.name("login");
private By ForottenPasswordLinkText =By.linkText("Forgotten password?");
			
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		if (driver.getTitle().equals("Facebook -login or signup page")) {
			throw new IllegalStateException("this is not login page.the current page is"
		+driver.getCurrentUrl());
		}
	}
	
	//now ill create fucntions so that i can perform actions
	
	public void enterUsername(String username) {
		driver.findElement(textField_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(textField_password).sendKeys(password);
		
	}
	public void clickLogin() {
		driver.findElement(btn_loginButton).click();
	}
	
	public void checkForottenPasswordIsDisplayed() {
		driver.findElement(ForottenPasswordLinkText).isDisplayed();
		
	}
	public void loginValidUser(String username,String password) {
		driver.findElement(textField_username).sendKeys(username);
		driver.findElement(textField_password).sendKeys(password);
		driver.findElement(btn_loginButton).click();
	}
}
