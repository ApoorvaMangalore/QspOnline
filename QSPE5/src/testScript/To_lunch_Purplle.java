package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_lunch_Purplle {
	@Test(groups = "beauty")
	public void purplle() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.purplle.com");
		driver.quit();
	}
}
