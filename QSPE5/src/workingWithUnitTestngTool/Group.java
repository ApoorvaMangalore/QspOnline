package workingWithUnitTestngTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group {

	@Test(groups = "film",dependsOnGroups = "cabs")
	public void movie() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.quit();
	}
}
