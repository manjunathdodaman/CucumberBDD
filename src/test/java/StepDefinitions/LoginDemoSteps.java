package StepDefinitions;

//import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

//public class LoginDemoSteps {
//	WebDriver driver =null;
//	
//	@Given("browser is open")
//	public void broser_is_open() {
//		
//		System.out.println("inside step-browser is open");
//	
//	String projectPath =System.getProperty("user.dir");
//	System.out.println("Project path is:"+projectPath);
//		System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\Chromedrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://www.facebook.com/");
//	}
//
//	@When("^user enetrs (.*) and (.*)$")
//	public void user_enetrs_username_and_password(String username,String password) throws InterruptedException  {
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("pass")).sendKeys(password);
//		Thread.sleep(2000);
//		
//	   
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login()  {
//		driver.findElement(By.name("login")).click();
//		
//	  
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		driver.findElement(By.linkText("Forgotten password?")).isDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	  
//	}


//}
