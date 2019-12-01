package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AccountSummaryPage;
import Pages.LoginPage;
import Pages.PayBills;
import Pages.WelcomePage;

public class PayBillsTestCase {

	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage asp;
	PayBills pb;
	
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
				pb=new PayBills(driver);
				
				
	}
	@Test
	public void addPayBills() {
		wp.ClickSigninBtn();
		lp.DoLogin("username","password");
		asp.clickpaybills();
		
		pb.Paybills("Geeta", "777 bay", "212121", "not available");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
}

	

