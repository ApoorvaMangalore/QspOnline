package workingWithPom;

import org.testng.annotations.Test;

public class p2 extends BaseClass {

	@Test
	public void testCase1() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		bp.getSearchtestBox().sendKeys("Books");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		bp.getSearchtestBox().sendKeys("b");
		Thread.sleep(3000);

	}

}
