package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_Iunch_Lorealparis {
	@Test(groups = "beauty")
	public void lorealparis() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lorealparis.co.in/");
		driver.quit();
	}
}
