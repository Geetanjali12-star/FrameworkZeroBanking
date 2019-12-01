package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AccountSummaryPage;
import Pages.LoginPage;
import Pages.WelcomePage;

public class TestCase_Login {
	
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage asp;
	
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
				//asp=new AccountSummaryPage(driver);
				
	}
	@Test
	public void login() {
		wp.signinbtn.click();
		//lp.username.sendKeys("Username");
		//lp.password.sendKeys("Password");
		//lp.signinbtn.click();	
		lp.DoLogin("username","password");
		
		String  expectedTitle=driver.getTitle();
		String actualTitle="Zero - Account Summary";
		System.out.println("");

}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
