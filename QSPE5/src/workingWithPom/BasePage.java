package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//we keep cmn elements which are present in your app
public class BasePage {

	// step 1
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// step 2
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement logoOfTheDemoWebShop;

	@FindBy(id = "small-searchterms")
	private WebElement searchtestBox;

	public WebElement getLogoOfTheDemoWebShop() {
		return logoOfTheDemoWebShop;
	}

	public WebElement getSearchtestBox() {
		return searchtestBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

}
