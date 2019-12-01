package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {
	WebDriver driver;
	// find a web element
	
	public PayBills(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Add New Payee")
	public WebElement AddNewPayee;
	
	@FindBy(name="name")
	public WebElement name;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(id="np_new_payee_account")
	public WebElement account;
	
	@FindBy(id="np_new_payee_details")
	public WebElement detail;
	
	@FindBy(id="add_new_payee")
	public WebElement addnewpayee;
	
	


public void Paybills(String myname,String myaddress,String myaccount,String details) {
	// TODO Auto-generated method stub
	AddNewPayee.click();
	name.sendKeys(myname);
	address.sendKeys(myaddress);
	account.sendKeys(myaccount);
	detail.sendKeys(details	);
	addnewpayee.click();
	
	
	
	
}
}