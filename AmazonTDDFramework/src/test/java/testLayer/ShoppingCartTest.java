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
import pom.PomShoppingCart;
import utility.DriverUtil;
import utility.TimeUtils;

public class ShoppingCartTest extends BaseSignin {
  PomShoppingCart cart;
  PomAmazonHeader Searchs;
  WebDriver driver;

  Properties prop;

  public ShoppingCartTest() {
    driver = DriverUtil.getDriver();
    prop = DriverUtil.getProperties();
    Searchs = new PomAmazonHeader();
    cart = new PomShoppingCart();
  }

//  @BeforeMethod
  public void initsetup() throws InterruptedException {
    signininitiate();
    PageFactory.initElements(driver, this);
    Searchs = new PomAmazonHeader();
    cart = new PomShoppingCart();
  }
@Test(groups = {"signedIn"})
public void user_must_be_able_to_add_items_to_cart() {
  TimeUtils.explicitWait(By.id("twotabsearchtextbox"));

  Searchs.typeSearchKeyword(prop.getProperty("SearchKeyword"));
  Searchs.clickSearchbutton();
  cart.clickHandbag();
  cart.displayBagdetails();
  cart.displayQuantity();
  cart.clickAddtoCart();
  cart.displayCartSubtotal();
//  driver.findElement(By.cssSelector("div.a-section.a-spacing-none.ewc-wider-compact-view-only.ewc-item-actions > div.a-row.ewc-qty-and-action-items > div.a-column.a-span4.a-text-center.a-spacing-mini.a-spacing-top-base.a-span-last > div")).click();
//  driver.navigate().refresh();
 
}

//@AfterMethod
public void close() {
  driver.close();
}  
}
