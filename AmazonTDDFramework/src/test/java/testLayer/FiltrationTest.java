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
import pom.PomFiltration;
import utility.DriverUtil;
import utility.TimeUtils;

public class FiltrationTest extends BaseSignin {
  PomFiltration filter;
  PomAmazonHeader Searchs;
  WebDriver driver;
  Properties prop;

  public FiltrationTest() {
    super();
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    Searchs = new PomAmazonHeader();
    filter = new PomFiltration();
  }


//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
    Searchs = new PomAmazonHeader();
    filter = new PomFiltration();
  }

  @Test(groups = {"signedIn"})
  public void user_must_be_able_to_select_filters() {

    TimeUtils.explicitWait(By.id("twotabsearchtextbox"));

    Searchs.typeSearchKeyword(prop.getProperty("SearchKeyword"));
    Searchs.clickSearchbutton();
    TimeUtils.explicitWait(By.cssSelector("#p_72\\/11192170011 > span > a > section > i"));
    filter.clickCustomerReview();
    TimeUtils.explicitWait(By.cssSelector("#p_36\\/12035762011 > span > a > span"));
    filter.clickPrice();
  }

//  @AfterMethod
  public void close() {
    driver.close();
  }

}
