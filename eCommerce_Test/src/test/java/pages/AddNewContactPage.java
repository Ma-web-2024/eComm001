package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewContactPage {
	
	WebDriver driver;
	public AddNewContactPage(WebDriver driver) {
    PageFactory.initElements(driver,this);
    	this.driver = driver;
    }
	
	
	By Txt_Email = By.id("email");
	By Txt_Password = By.id("password");
	By Btn_Submit =By.id("submit");
	By Btn_Logout =By.id("logout");
	By Btn_Addcontact = By.id("add-contact");
	By Txt_Firstname = By.id("firstName");
	By Txt_Lastname = By.id("lastName");
	By Txt_Birthdate = By.id("birthdate");
	By Txt_Phone= By.id("phone");
	By Txt_Address1 = By.id("street1");
	By Txt_City = By.id("city");
	By Txt_StateProvince = By.id("stateProvince");
	By Txt_PostalCode = By.id("postalCode");
	By Txt_Country= By.id("country");
	
	//Action and Methods
	
	public void EnterYourEmail(String email) {
		driver.findElement(Txt_Email).sendKeys(email);
		
	}
	
	public void EnterYourPassword(String password) {
		driver.findElement(Txt_Password).sendKeys(password);
	
	
	}
	public void ClickSubmit() {
		driver.findElement(Btn_Submit).click();
	
	
	}
	
	public void UserIsLogged() {
		driver.findElement(Btn_Logout).isDisplayed();
	
	
	}
	
	public void ClickAddUser() {
		driver.findElement(Btn_Addcontact).click();
	
	
	}
	
	public void EnterFirstName(String firstname) {
		driver.findElement(Txt_Firstname).sendKeys(firstname);
	
	
	}
	public void EnterLastName(String lastname) {
		driver.findElement(Txt_Lastname).sendKeys(lastname);
	
	
	}
	
	public void EnterBirthday(String birthday) {
		driver.findElement(Txt_Birthdate).sendKeys(birthday);
	
	
	}
	public void EnterPoneNumber(String phone) {
		driver.findElement(Txt_Phone).sendKeys(phone);
	
	
	}
	
	public void EnterAddress(String address) {
		driver.findElement(Txt_Address1).sendKeys(address);
	
	
	}
	public void EnterCity(String city) {
		driver.findElement(Txt_City).sendKeys(city);
	
	
	}
	public void EnterStateProvince(String stateprovince) {
		driver.findElement(Txt_StateProvince).sendKeys(stateprovince);
	
	
	}
	public void EnterPostalCode(String postalcode) {
		driver.findElement(Txt_Password).sendKeys(postalcode);
	
	
	}
	public void EnterCountry(String country) {
		driver.findElement(Txt_Password).sendKeys(country);
	
	
	}
	
}
