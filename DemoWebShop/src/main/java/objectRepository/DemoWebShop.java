package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShop {
	@FindBy(partialLinkText = "BOOKS")
	private WebElement Bookslink;
	
	@FindBy(id = "products-orderby")
	private WebElement dropdownlink;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement cartlink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppinglink;
	
	
	
	public DemoWebShop(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getBookslink() {
		return Bookslink;
	}

	public WebElement getDropdownlink() {
		return dropdownlink;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public WebElement getShoppinglink() {
		return shoppinglink;
	}
	

}
