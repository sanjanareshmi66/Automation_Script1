package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText =  "BOOKS")
	private WebElement Bookslink;
	
	@FindBy(partialLinkText =  "COMPUTER")
	private WebElement computerlink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicslink;
	
	@FindBy(partialLinkText = "GIFT CARD")
	private WebElement giftcardlink;
	
	@FindBy(id = "products-orderby")
	private WebElement postiondropdown;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getBookslink() {
		return Bookslink;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

	public WebElement getGiftcardlink() {
		return giftcardlink;
	}

	public WebElement getPostiondropdown() {
		return postiondropdown;
	}
	
}
