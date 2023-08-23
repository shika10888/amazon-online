package testLayer;

import static org.testng.Assert.assertTrue;
import java.util.Properties;
import org.openqa.selenium.By;
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
import pom.PomLoginSecurity;
import utility.DriverUtil;

public class LoginSecurityTest extends BaseSignin {


  PomLoginSecurity security;

  WebDriver driver;

  Properties prop;

  public LoginSecurityTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    security = new PomLoginSecurity();
  }

//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
    
  }

  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_edit_securityDetails() throws InterruptedException {
    security.clickLoginSecurity();
    security.clickNameedit();
    
    security.typeNewname("Amy");
    security.clickSave();
    assertTrue(driver.findElement(By.tagName("body")).getText()
        .contains("You successfully changed your account!"));
  }

//  @AfterMethod
  public void close() {
    driver.close();
  }



}
