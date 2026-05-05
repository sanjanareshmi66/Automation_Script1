package generiUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	
	public JavaUtility jutil = new JavaUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	public FileUtility futil = new FileUtility();
	public ExcelUtility eutil = new ExcelUtility();
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(futil.getDataFromProperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginlink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailtext().sendKeys(futil.getDataFromProperty("email"));
		lp.getPasswordtext().sendKeys(futil.getDataFromProperty("password"));
		lp.getButton().click();
	 }
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.getLogoutlink().click();
		Thread.sleep(2000);
		
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
		
		  
	}
	





