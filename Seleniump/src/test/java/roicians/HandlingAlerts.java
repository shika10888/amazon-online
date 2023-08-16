package roicians;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) {
		
		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				
				// to Handle simple Alert
				
				// driver.get("https://demoqa.com/alerts");
				 /*driver.findElement(By.id("alertButton")).click(); Alert
				  a=driver.switchTo().alert(); a.accept();
				 */
				
				// To Handle Alert with Wait Event
				
				//driver.findElement(By.id("timerAlertButton")).click();
				/*
				 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
				 * wait.until(ExpectedConditions.alertIsPresent()); Alert
				 * a=driver.switchTo().alert(); a.accept();
				 */
				
				// To Handle Alert with options of Accept & Dismiss
				/*
				 * driver.findElement(By.id("confirmButton")).click(); Alert
				 * a=driver.switchTo().alert(); a.dismiss();
				 */
				
				//To Handle Alert with Prompt Box:
				/*
				 * driver.findElement(By.id("promtButton")).click(); Alert
				 * a=driver.switchTo().alert(); a.sendKeys("Shika"); a.accept();
				 */
				// To Handle Authentication Popup
				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
				
				
				
				
				
	}

}
