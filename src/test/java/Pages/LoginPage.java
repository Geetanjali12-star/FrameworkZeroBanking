package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	// find a web element
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;

	
	@FindBy(name="submit")
	public WebElement signinbtn;
	
	@FindBy(linkText="Pay Bills")
	public WebElement paybills;
	
	
	@FindBy(linkText="Add New Payee")
	public WebElement AddNewPayee;
	
	@FindBy(name="payee")
	public WebElement payee;
	
	@FindBy(name="account")
	public WebElement account;
	
	@FindBy(name="amount")
	public WebElement amount;
	
	//@FindBy(name="date")
	//public WebElement date;
	
	@FindBy(name="description")
	public WebElement description;
	
	

	public void DoLogin(String myusername, String mypassword) {
		// TODO Auto-generated method stub
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signinbtn.click();
		
		
	}



		
	}


