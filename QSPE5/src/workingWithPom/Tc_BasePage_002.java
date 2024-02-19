package workingWithPom;

import org.testng.annotations.Test;

public class Tc_BasePage_002 extends BaseClass {

	@Test
	public void basePage() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getSearchtestBox().sendKeys("Books");
		Thread.sleep(3000);
		bp.getSearchButton().click();
		Thread.sleep(3000);
		bp.getLogoOfTheDemoWebShop().click();
		Thread.sleep(3000);
		
	}
}
