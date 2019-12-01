package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFunds {


WebDriver driver;
// find a web element

public TransferFunds(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(id="tf_fromAccountId")
public WebElement fromaccount;

@FindBy(id="tf_toAccountId")
public WebElement toaccount;

@FindBy (id="tf_amount") 
public WebElement amount;

@FindBy (id="tf_description")
public WebElement description;

@FindBy (id="btn_submit")
public WebElement Continue;

//@ FindBy (id="btn_submit")
//public WebElement submit;

//@ FindBy (className="alert alert-success")
//public WebElement Successtext;



public void TransferFunds(String myamount,String mydescription) {
	// TODO Auto-generated method stub
	
	fromaccount.click();
	toaccount.click();
	amount.sendKeys(myamount);
	description.sendKeys(mydescription);
	Continue.click();
}
	
}



	


