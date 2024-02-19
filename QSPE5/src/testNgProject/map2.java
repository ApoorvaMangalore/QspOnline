package testNgProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class map2 {
	@Test
	public void Map() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		List<WebElement> eachCountry = driver.findElements(By.xpath("//*[@id='regions']/*"));

		// for (WebElement allCountry : eachCountry) {

		for (int i = 0; i < eachCountry.size(); i++) {

			// Country.click();

			try {
				eachCountry.get(i).click();
			} catch (ElementClickInterceptedException e) {
				System.out.println("No able to find");
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			try {
				WebElement text = driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
				String value = text.getText();
				System.out.println(value);
			} catch (NoSuchElementException e) {
				System.out.println("No data");
			}

			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			eachCountry = driver.findElements(By.xpath("//*[@id='regions']/*"));

		}

	}

}
