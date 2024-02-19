package workingWithPom;

import org.testng.annotations.Test;

public class Tc_Reg_001 extends BaseClass {

	@Test
	public void register() {
		RegisterPage registerPage = new RegisterPage(driver);
		BasePage bp = new BasePage(driver);

		registerPage.getRegisterLink().click();
		registerPage.getFemaleRadioButton().click();
		registerPage.getFirstNameTextBox().sendKeys("apoorva");
		registerPage.getLastNameTextBox().sendKeys("mangalore");
		registerPage.getEmailTextBox().sendKeys("aa@123");

		bp.getLogoOfTheDemoWebShop().click();

	}

}
