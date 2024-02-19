package toReadFromFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForDemoWebShop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1:Create obj for File
		File file = new File("./testData/testdata.xlsx");

		// step1:Create obj for File input stream
		FileInputStream fis = new FileInputStream(file);

		// it will take about yout xl extension
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		String userName = workbook.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

	}

}
