package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AccountSummaryPage;
import Pages.LoginPage;
import Pages.PayBills;
import Pages.TransferFunds;
import Pages.WelcomePage;

public class TransferFundTestCase<FromAccount, ToAccount> {


//private static final WebElement FromAccount = null;
//private static final WebElement ToAccount = null;
WebDriver driver;
LoginPage lp;
WelcomePage wp;
AccountSummaryPage asp;
TransferFunds Tf;
FromAccount fa;
ToAccount ta;


@BeforeMethod
public void Setup() {
		  System.setProperty("webdriver.chrome.driver","C:\\Software\\Drivers\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("http://zero.webappsecurity.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //lp=PageFactory.initElements(driver,LoginPage.class);
		  //wp=PageFactory.initElements(driver,WelcomePage.class);
		  //asp=PageFactory.initElements(driver,AccountSummaryPage.class);
			
			wp=new WelcomePage(driver);
			lp=new LoginPage(driver);
			
			asp=new AccountSummaryPage(driver);
			Tf=new TransferFunds(driver);
			
			
}
            @Test
            public void TransferFunds() {
	        wp.ClickSigninBtn();
	        lp.DoLogin("username","password");
	        asp.clickTransferFunds();
	        
	        Select sel1=new Select (Tf.fromaccount);
	        sel1.selectByValue("1");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Select sel2=new Select (Tf.toaccount);
	        sel2.selectByValue("1");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Tf.TransferFunds("100", "Transfering Funds");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
}
            @AfterMethod
            public void TearDown() {
        	driver.quit();
}


}

