package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP {
	
	@FindBy(id = "firstName")
	@CacheLookup
	WebElement Txt_FirstName;
	
	@FindBy(id = "lastName")
	@CacheLookup
	WebElement Txt_LastName;
	
	@FindBy(id = "email")
	@CacheLookup
	WebElement Txt_Email;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement Txt_Password;
	
	@FindBy(id = "submit")
	@CacheLookup
	WebElement Btn_Submit;
	
	
	@FindBy(id = "logout")
	@CacheLookup
	WebElement Btn_logout;
	
	
	WebDriver driver;
	public LoginP(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterFirstName(String firstname) {
		//Txt_user.clear();
		Txt_FirstName.sendKeys(firstname);
	}
	
	public void EnterLastName(String lastname) {
		
		Txt_LastName.sendKeys(lastname);
	}
	
	public void SetEmail(String email) {
		Txt_Email.sendKeys(email);
		
	}
	
	public void SetPassword(String password) {
		Txt_Password.sendKeys(password);
		
	}
	
	
	public void ClickOnSubmit() {
		Btn_Submit.click();
	}

	public void LogoutIsDisplayed() {
		if(Btn_logout.isDisplayed()) {
		System.out.println("user is signed successfully");
		}
	}
}
