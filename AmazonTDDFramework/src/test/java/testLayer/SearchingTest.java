package testLayer;

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
import pom.PomAmazonHeader;
import utility.DriverUtil;
import utility.TimeUtils;

public class SearchingTest extends BaseSignin {
  PomAmazonHeader Searchs;
  WebDriver driver;
  Properties prop;

  public SearchingTest() {
    super();
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    PageFactory.initElements(driver, this);
    Searchs = new PomAmazonHeader();
  }


//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
    Searchs = new PomAmazonHeader();
  }

  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_search_with_keyword() throws InterruptedException {
    //PageFactory.initElements(driver, Searchs);
    Thread.sleep(1000);
    Searchs.typeSearchKeyword(prop.getProperty("SearchKeyword"));
    Searchs.clickSearchbutton();
    TimeUtils.explicitWait(By.className("s-no-outline"));
    
  }

//  @AfterMethod
  public void close() {
    driver.close();
  }



}
