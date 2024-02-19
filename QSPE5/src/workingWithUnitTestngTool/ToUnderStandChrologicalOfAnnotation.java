package workingWithUnitTestngTool;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderStandChrologicalOfAnnotation {

	@Test //
	public void run() {
		System.out.println("I am run");
	}

	@Test //
	public void test() {
		System.out.println("I am test");
	}
	@Test
	public void fail() {
		System.out.println("i am fail");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println(" I am Before suite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println(" I am after suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("i am after test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println(" I am after class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("I am before method");

	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("I am after method");
	}

}
