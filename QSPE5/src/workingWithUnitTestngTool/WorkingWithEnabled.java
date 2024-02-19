package workingWithUnitTestngTool;

import org.testng.annotations.Test;

public class WorkingWithEnabled {

	@Test(priority = 3)
	public void register() {
		System.out.println("Register");
	}

	@Test(priority = 1)
	public void openBrowser() {
		System.out.println("User is able to open browser");
	}

	@Test(priority = 2)
	public void url() {
		System.out.println("User is able to enter url");
	}

	@Test(priority = 4)
	public void login() {
		System.out.println("User is able to login");
	}
	//to skip any test case
	//defalut value is true
	@Test(enabled = false)
	public void logout() {
		System.out.println("User is able to logout");
	}
}
