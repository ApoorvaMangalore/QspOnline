package workingWithPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class p1 extends BaseClass {

	@Test
	public void testCase() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		Thread.sleep(3000);
		searchBox.sendKeys("books");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		searchBox.sendKeys("b");
		Thread.sleep(3000);
	}
}
