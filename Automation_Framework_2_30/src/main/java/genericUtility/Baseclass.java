package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.Homepage;
import objectRepository.Loginpage;
import objectRepository.Welcomepage;

	public class Baseclass {
		public FileUtility fUtil=new FileUtility();
		public WebdriverUtility wUtil=new WebdriverUtility();
		public static WebDriver driver;
		@BeforeClass
			public void openBrowser() throws IOException
				{
					driver=new ChromeDriver();
					wUtil.maximize(driver);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
					driver.get(fUtil.getDataFromProperty("url"));
	
				}
		@BeforeMethod
		public void login() throws IOException
		{
			Welcomepage wp=new Welcomepage(driver);
			wp.getLoginLink().click();
			
			Loginpage lp=new Loginpage(driver);
			lp.getEmailText().sendKeys(fUtil.getDataFromProperty("email"));
			lp.getPasswordText().sendKeys(fUtil.getDataFromProperty("pswd"));
			lp.getLoginBtn().click();
		}
		@AfterMethod
		public void logout()
		{
			Homepage hp=new Homepage(driver);
			hp.getLogoutLink().click();
			
			
		}
		@AfterClass
			public void closeBrowser()
				{
					driver.quit();
	
				}
							}
