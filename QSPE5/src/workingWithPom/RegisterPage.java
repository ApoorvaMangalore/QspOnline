package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	// step 1 create a constutor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement emailTextBox;

}
