package roicians;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn {
	WebDriver driver;
	Contactus_POM pom;
	
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	pom=new Contactus_POM(driver);
	driver.get("https://www.roicians.com/contact-us/");
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616"))).sendKeys("Shika");
}
	@Test (priority=1)
	public void validcase () {
	pom.typefirstname("shika");
	}
	
	@Test (priority=2)
	
	public void invalidcase() {
    pom.typefirstname("Abc");

}
      @AfterMethod
      public void closebrowser() {
    	  driver.close();
      }
      
      
}