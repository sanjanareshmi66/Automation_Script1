package books;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import generiUtility.BaseClass;
import objectRepository.BooksBySort;
import objectRepository.HomePage;


public class Cls_TC_01 extends BaseClass {
	@Test
	public void launch() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		//FileInputStream fis = new FileInputStream("./src/test/main/java/objectRepository/DemoWebShop");
		//Properties prop = new Properties();
		//prop.load(fis);
		
		HomePage hp = new HomePage(driver);
		hp.getBookslink().click();
		
		BooksBySort bs = new BooksBySort(driver);
		bs.getBookspage().click();
		
	
		wutil.selectDropdown(futil.getDataFromProperty("lowToHigh"),bs.getBookspage());
		//List<WebElement> pro = wutil.multi(driver,"//div[@class='product-item']");

		double lowest = 0.0;
		for(WebElement op:pro) {
			String price = wutil.single(driver,"//span[@class='price actual-price']").getText().trim();
			double pri =Double.parseDouble(price);

					if(lowest<=pri) {
						lowest=pri;
						bp.getAddToCart().click();
					}
	
		
	    
		
         @Test(priority = 2)
		 public void shoppingCsrt() throws IOException {
							
		//HomePage hp=new HomePage(driver);
		//hp.getShoppingCart().click();
					
	//List<WebElement> opt = wutil.multi(driver,"//td[@class='product-picture']/..//input[@type='checkbox']");
	// for(WebElement options:opt) {
		//options.click();
			}
	//ShoppingCart scr=new ShoppingCart(driver);
							//wutil.selectDropdown(futil.getDataFromProperty("country"),scr.getCountrySelection());
							//wutil.selectDropdown(futil.getDataFromProperty("state"),scr.getStateSelection());
							//scr.getZipcode().sendKeys("zipcode");
							//scr.getEstimationShipping().click();
							//scr.getiAgreeChekbox().click();
							//scr.getCheckout().click();
					  }
		@Test(priority = 3)
		public void checkout() {
		
			CheckoutPage cp=new CheckoutPage(driver);
			cp.getBillingAddresContinue().click();
			
			cp.getShippingAddresscheckbox().click();
			cp.getShippingAddressContinue().click();
			
			cp.getPaymentMethodContinue().click();
			
			cp.getPaymentInformationContinue().click();
			
			cp.getConfirmOrderconfirmButton().click();
	  }	
			@Test(priority = 4)
			public void orderDetails() throws IOException, InterruptedException {

			OrderDetailsPAge op=new OrderDetailsPAge(driver);
			op.getOrderDetails().click();
			
			
			WebElement order = wutil.single(driver,"//h3[text()='Information']");
			
			wutil.ScrollToElement(driver, order);
			Thread.sleep(3000);
			wutil.getPhoto(driver);
			
		}
	  
	}
		
	
	


