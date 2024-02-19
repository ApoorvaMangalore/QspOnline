package genricLibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNgProject.UtilityMethods;

public class ToReadMultipleDataFromExcel {
	@Test(dataProvider = "data")
	public void login(String un, String pw) throws IOException {

		WebDriver driver = new ChromeDriver();
		UtilityMethods u = new UtilityMethods();
		driver.get(u.readingDataFromPropertyFile("./testData/data.properties", "loginurl"));
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pw);
		driver.quit();
	}

	@DataProvider(name = "data")
	public String[][] dataSuppply() throws EncryptedDocumentException, IOException {
		return UtilityMethods.readingDataFromMultipleRowColumn("./testData/testdata.xlsx", "Sheet1");

	}

}
