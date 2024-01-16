package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	@FindBy(linkText = "Forgotten password?")
	WebElement txt_forgottenpassword;
	
	WebDriver driver;
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;//driver instance
		
		PageFactory.initElements(driver,LoginPage_PF.class);
	}
	
	public void checkForgottenPasswordIsdispalayed() {
		txt_forgottenpassword.isDisplayed();
	}
}
