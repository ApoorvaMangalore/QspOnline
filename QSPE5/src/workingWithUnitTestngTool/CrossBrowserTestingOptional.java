package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingOptional {
	WebDriver driver;

	@Parameters({ "browserName", "url" })
	@Test
	public void browser(@Optional("edge") String browserName, @Optional("https://www.amazon.in/") String url)
			throws InterruptedException {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser name is not valid");
		}

		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
}
