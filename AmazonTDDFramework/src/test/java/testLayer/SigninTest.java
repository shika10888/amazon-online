package testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseSignin;
import utility.DriverUtil;

public class SigninTest extends BaseSignin {
  WebDriver driver;

  public SigninTest() {
    super();
    driver = DriverUtil.getDriver();
  }


//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
  }

  @Test
  public void Signin() {
    LoginMessage.isDisplayed();
  }

//  @AfterMethod
  public void close() {
    driver.close();
  }


}
