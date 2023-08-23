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
import pom.PomYourPayments;
import utility.DriverUtil;

public class YourPaymentsTest extends BaseSignin{
  
  PomYourPayments pay;

  WebDriver driver;

  Properties prop;

  public YourPaymentsTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    pay = new PomYourPayments();
  }

//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
    pay = new PomYourPayments();
  }
  
  @Test(groups = {"signedIn"}, priority = 1)
  public void user_must_get_an_error_message_on_leaving_CVVfield_empty() throws InterruptedException {
    pay.clickYourPayments();
    pay.clickAddPayment();
    Thread.sleep(1000);
    pay.clickAddCard();
    pay.typeCardnumber(prop.getProperty("cardno"));
    pay.typeNameonCard(prop.getProperty("NameonCard"));
    pay.clickExpmonth();
    pay.clickExpyear();
    pay.clickAddNewCard();
    assertTrue(driver.findElement(By.tagName("body")).getText().contains("Security code (CVV) is not correct. Look for the 3-digit code on the back of the card, near the signature line."));
  }
  
//  @AfterMethod
  public void close() {
    driver.close();
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
