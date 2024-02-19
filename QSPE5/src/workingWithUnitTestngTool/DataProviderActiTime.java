package workingWithUnitTestngTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderActiTime {

	@Test(dataProvider = "data")
	public void actiTime(String un,String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(un);
		Thread.sleep(4000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(4000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.quit();
	}

	@DataProvider(name = "data")
	public String[][] dataSet() {
		String[][] data = { { "apoorva", "acm" }, { "Taini", "1234" } };
		return data;
	}
}
