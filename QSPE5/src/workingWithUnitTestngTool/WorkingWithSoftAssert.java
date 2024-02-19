package workingWithUnitTestngTool;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert {

	@Test
	public void demoweb() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser is mximized", true);
		SoftAssert softAssert = new SoftAssert();

		String expectedUrl = "https://demowebshop.tricentis.com/login";
		String expectedEmailId = "apoorva@123";
		boolean expectedloginButton = true;

		driver.get("https://demowebshop.tricentis.com/login");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		softAssert.assertEquals(actualurl, expectedUrl, "It is not login page");
		Thread.sleep(3000);
		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("apoorva@123");
		String actualEmailId = emailId.getAttribute("value");
		System.out.println(actualEmailId);
		softAssert.assertEquals(actualEmailId, expectedEmailId, "not valid");
		Thread.sleep(3000);

		/*
		 * WebElement loginButton =
		 * driver.findElement(By.xpath("//input[@value='Log in']"));
		 * loginButton.click(); boolean actualValue = loginButton.isSelected();
		 * assertEquals(expectedloginButton,
		 * actualValue,"User is not able to click on login button"); driver.quit();
		 */
		driver.quit();
		softAssert.assertAll();

	}
}
