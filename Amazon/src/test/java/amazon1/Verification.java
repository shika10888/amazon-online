package amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) {

		//to open the browser
		
				System.setProperty("webdriver.com.driver", "chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/");
				
				//to navigate to Amazon.ca
				driver.navigate().to("https://www.amazon.ca/");
				
				
				//to verify if element locator of Amazon.ca 
			boolean result=	driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
