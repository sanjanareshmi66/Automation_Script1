package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksBySort {
 @FindBy(linkText = "Sort by")
 private WebElement bookspage;
 
 
 
 public BooksBySort(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}



 public WebElement getBookspage() {
	return bookspage;
 }

 
}
 