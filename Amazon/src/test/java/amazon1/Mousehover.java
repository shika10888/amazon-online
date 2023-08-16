package amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {

		
		//to open the browser
		
				System.setProperty("webdriver.com.driver", "chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/");
				
				//to navigate to Amazon.ca
				driver.navigate().to("https://www.amazon.ca/");
				
				// to mouse hover on Hello, Sign in
				Actions action=new Actions(driver);
				action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
				
		driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
