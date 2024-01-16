package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver=null;
	@Before(value="@smoke",order=1)
public void browserSetUp() {
	
	System.out.println("i am inside browser setup");
	System.setProperty("Webdriver.chrome.driver","src/test/resources/Chromedrivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
	@Before(value="@smoke",order=0)
	public void browserSetUp2() {
		System.out.println("i am inside browser setup2 \n");
	}
	@After(value="@regression",order=1)
	public void tearDown() {
		System.out.println("i am inside teardown");
		driver.close();
		driver.quit();
	}
	@After(value="@regression",order=0)
	public void tearDown2() {
	System.out.println("i am inside teardown");
	}
		
	@BeforeStep
	public  void beforeSteps() {
		System.out.println("i am inside beforesetps----");
	}
	@AfterStep
	public void afterSteps() {
		System.out.println("i am inside aftersteps");
	}
	
	@Given("user is on login poage")
	public void user_is_on_login_poage() {
		
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    
	}

	@And("click on login button")
	public void click_on_login_button() {
	    
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {

	}
}
