package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	@FindBy(id="email")
	@CacheLookup
	WebElement textField_email;
	
	@FindBy(id="password")
	WebElement textField_password;
	
	@FindBy(name = "login")
	WebElement loginButton_login;
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;//driver instance
		
		//PageFactory.initElements(driver,this);
		// 
		 AjaxElementLocatorFactory factory =new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
	}
	
	public void enterEmail(String username) {
		textField_email.sendKeys(username);
	}
	public void enterPassword(String password) {
		textField_password.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton_login.click();
	}
}
