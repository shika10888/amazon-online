package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverUtil;

public class BaseAmazonClass {

  public Properties prop = new Properties();
  WebDriver driver;

  @FindBy(id = "nav-link-accountList")
  public WebElement Hello;

  public BaseAmazonClass() {
    // try {
    // FileInputStream file=new
    // FileInputStream("C:\\Users\\alvin\\eclipse-workspace\\AmazonTDDFramework\\src\\test\\java\\environmentvariables\\Config.properties");
    // prop.load(file);
    // }
    // catch(FileNotFoundException e) {
    // e.printStackTrace();
    // }
    // catch(IOException a) {
    // a.printStackTrace();
    // }
    driver = DriverUtil.getDriver();
  }

  public void initiate() {
    // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    // driver=new ChromeDriver();
    // PageFactory.initElements(driver,this);
    // driver.manage().window().maximize();
    // driver.get(prop.getProperty("url"));
  }

  public void mousehover() {
    Actions actions = new Actions(driver);
    actions.moveToElement(Hello).build().perform();
  }
}

