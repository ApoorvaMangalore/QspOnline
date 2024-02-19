package workingWithUnitTestngTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {// test case id
	

	@Test
	public void register() {
		//System.out.println("User is able to register");
		Reporter.log("user is able to register",true);
	}

	@Test
	public void demo() {// tese case
		//System.out.println("Hello testNG");
		Reporter.log("hello testNg",true);
	}
	

	@Test
	public void login() {
		//System.out.println("User is able to login");
		Reporter.log("user is able to login",true);
	}

	@Test
	public void cart() {
		//System.out.println("User is able to add product to cart");
		Reporter.log("user is able to add prod",true);
	}

}
