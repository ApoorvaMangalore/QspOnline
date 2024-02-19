package testScript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class To_lunch_Samsung {
	@Test(groups = "mobile")
	public void samsung() {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in");
		driver.quit();
	}
}
