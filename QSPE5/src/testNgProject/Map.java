package testNgProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Map {
	@Test
	public void Map() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='regions']/*")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.xpath("//span[@class='infection-rate-number']"));
		System.out.println(text.getText());
	}
}
