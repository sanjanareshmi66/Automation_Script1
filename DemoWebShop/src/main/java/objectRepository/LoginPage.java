package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailtext;
	
	@FindBy(id = "Password")
	private WebElement passwordtext;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement button;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailtext() {
		return emailtext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getButton() {
		return button;
	}
	
	
	

}
