package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pages.LoginP;

public class LoginToEcommerce extends BaseClass{
	WebDriver driver = null;

	public LoginP loggin;

	@Given("browser is opened")
	public void browser_is_opened() {
	   loggin = new LoginP(driver);
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\mboudhiba\\git\\eComm001\\eCommerce_Test\\src\\test\\resources\\Drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	
	}
	
	
	

	@And("user is  on Add user page")
	public void user_is_on_add_user_page() {
	    driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
	}

	@When("user enters the user info")
	public void user_enters_the_user_info() {
		loggin = new LoginP(driver);
	    loggin.EnterFirstName("Demo");
	    loggin.EnterLastName("Test");
	    String email = randomString()+"@gmail.com";
	    loggin.SetEmail(email);
	    loggin.SetPassword("123456Atest");
	    
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
	   loggin.ClickOnSubmit();
	}

	@Then("user is logged")
	public void user_is_logged() {
	    loggin.LogoutIsDisplayed();
	    driver.quit();
	}




}
