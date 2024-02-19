package workingWithUnitTestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {

	@Test
	public void demoweb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser is mximized", true);

		String expectedUrl = "https://demowebshop.tricentis.com/login";
		String expectedEmailId = "apoorva@123";

		driver.get("https://demowebshop.tricentis.com/login");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, expectedUrl, "User is not able to land on login page");

		WebElement emailId = driver.findElement(By.id("Email"));
		emailId.sendKeys("apoorva@123");
		String actualEmailId = emailId.getAttribute("value");
		System.out.println(actualEmailId);
		Assert.assertEquals(actualEmailId, expectedEmailId, "Email Id ios not matching");

		driver.quit();
	}
}
