package DataDrivenDemo;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM {

		WebDriver driver;
		
		//contact info
		@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a") WebElement REGISTER;
		
		@FindBy(name="firstName") WebElement FirstName;
		
		@FindBy(name="lastName") WebElement LastName;
		
		@FindBy(name="phone") WebElement Phone;
		
		@FindBy(name="userName") WebElement Email;
		
		//Mailing info
		@FindBy(name="address1") WebElement Address;
		
		@FindBy(name="city") WebElement City;
		
		@FindBy(name="state") WebElement State;
		
		@FindBy(name="postalCode") WebElement PostalCode;
		
		//User info
		@FindBy(name="email") WebElement UserName;
		
		@FindBy(name="password") WebElement Password;
		
		@FindBy(name="confirmPassword") WebElement ConfirmPassword;
		
		@FindBy(name="submit") WebElement Submit;
		
		RegistrationPOM(WebDriver d){
			
			driver=d;
			PageFactory.initElements(d, this);
		}
		
		public void Register()
		{
			REGISTER.click();
		}
		
		public void setFirstName(String fname)
		{
			FirstName.sendKeys(fname);
		}
		
		public void setLastName(String lname)
		{
			LastName.sendKeys(lname);
		}
		
		public void Phone(String phone)
		{
			Phone.sendKeys(phone);
		}
		
		public void Email(String email)
		{
			Email.sendKeys(email);
		}
		
		public void Address(String address)
		{
			Address.sendKeys(address);
		}
		
		public void City(String city)
		{
			City.sendKeys(city);
		}
		
		public void State(String state)
		{
			State.sendKeys(state);
		}
		
		public void PostalCode(String pcode)
		{
			PostalCode.sendKeys(pcode);
		}
		
		public void UserName(String uname)
		{
			UserName.sendKeys(uname);
		}
		
		public void Password(String pword)
		{
			Password.sendKeys(pword);
		}
		
		public void ConfirmPassword(String cpword)
		{
			ConfirmPassword.sendKeys(cpword);
		}
		
		public void Submit()
		{
			Submit.click();
		}	
		
	}


