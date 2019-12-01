package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {

	WebDriver driver;
	public AccountSummaryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(linkText="Pay Bills")
	public WebElement paybills;
	
	public void clickpaybills() {
		paybills.click();
		
	}
	@FindBy(linkText="Transfer Funds")
	public WebElement TransferFunds;
	public void clickTransferFunds() {
		TransferFunds.click();
		
	
	//public String expectedTitle=driver.getTitle();
	
	//public String actualTitle="Zero - Account Summary";
	//
}
}
