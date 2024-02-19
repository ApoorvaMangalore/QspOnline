package genricLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNgProject.UtilityMethods;

public class ToREadDatafromRow {
	@Test
	public void login() throws IOException {
		WebDriver driver = new ChromeDriver();
		UtilityMethods u = new UtilityMethods();
		driver.get(u.readingDataFromPropertyFile("./testData/data.properties", "loginurl"));
		driver.manage().window().maximize();

		String[] loginData = u.readingRowOfDataFromExcelFile("./testData/testdata.xlsx", "loginData1", 0);
		driver.findElement(By.id("Email")).sendKeys(loginData[0]);
		driver.findElement(By.id("Password")).sendKeys(loginData[1]);

	}
}
