package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	}

	@When("^enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void enter_valid_username_and_valid_password(String un, String pwd) throws Throwable {
	    driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(un);
	    driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(pwd);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_login_button')]")).click();
		driver.quit();
	}
}
