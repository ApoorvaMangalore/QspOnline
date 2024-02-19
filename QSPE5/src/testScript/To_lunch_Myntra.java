package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_lunch_Myntra {
	@Test(groups = "ecom")
	public void myntra() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		driver.quit();

	}
}
