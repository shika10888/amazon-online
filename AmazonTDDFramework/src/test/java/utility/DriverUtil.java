package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {

  private static Properties prop;

  private static WebDriver driver;

  public static void initialize() {

    if (driver == null) {
      try {
        prop = new Properties();
        FileInputStream file = new FileInputStream(
            "C:\\Users\\alvin\\eclipse-workspace\\AmazonTDDFramework\\src\\test\\java\\environmentvariables\\Config.properties");
        prop.load(file);
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException a) {
        a.printStackTrace();
      }
    }
  }

  public static WebDriver getDriver() {
    initialize();
    return driver;
  }

  public static Properties getProperties() {
    return prop;
  }
}
