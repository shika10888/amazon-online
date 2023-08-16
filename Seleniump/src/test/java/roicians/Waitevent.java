package roicians;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitevent {

	public static void main(String[] args) {
		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				
				//Implicit Wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.roicians.com/contact-us/");


           // Explicit Wait

               WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616"))).sendKeys("Shika");
     WebElement fname=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616")));
                   fname.sendKeys("Shika");
                   
                   //Fluent Wait

Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofMillis(10))
.ignoring(NoSuchElementException.class);

wait2.until((ExpectedConditions.visibilityOfElementLocated(By.id("text-77525447616"))));











}
}