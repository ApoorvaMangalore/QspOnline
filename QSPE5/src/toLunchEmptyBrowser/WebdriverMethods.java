package toLunchEmptyBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().window().minimize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//driver.navigate().forward();
		driver.navigate().to("https://www.myntra.com/");
		//driver.navigate().back();
		//driver.navigate().refresh();
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();
		// driver.quit();

	}
}
