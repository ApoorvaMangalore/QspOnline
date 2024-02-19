package testNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_Demo_003 extends BaseClass {

	
	@Test
	public void ClickVote() {
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Reporter.log("User is able to Click on radio button",true );
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
	}
}
