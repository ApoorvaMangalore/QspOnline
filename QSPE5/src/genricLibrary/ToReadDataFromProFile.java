package genricLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromProFile {

	@Test
	public void lunchBrowser() throws IOException {
		WebDriver driver = new ChromeDriver();
		UtilityMethodsForDataRead um = new UtilityMethodsForDataRead();
		String url = um.readingTheDataFromProptyFile("./testData/data.properties", "url");
		driver.get(url);
	}
}
