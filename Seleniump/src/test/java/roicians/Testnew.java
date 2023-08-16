package roicians;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew {
	
	//step 1 System.setproperty(location of driver)
	//step 2 Get url
	//Step 3 Perform action on particular element
	//Step 4 close browser
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	
	@Test(priority=1)
	public void writetestcases() {
	System.out.println("First write test cases");
	
	}
	@Test(priority=2)
	public void executetestcases() {
		System.out.println("Then execute test cases");
	}
	@Test(priority=3)
	public void Defect() {
		System.out.println("Log Defect");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	
	
	
}	


