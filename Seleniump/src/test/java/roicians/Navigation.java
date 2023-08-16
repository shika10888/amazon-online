package roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				//step 2 open contact us page of Roicians
				driver.get("https://www.roicians.com/contact-us/");
			// to Navigate to Google page
				driver.navigate().to("https://www.google.com/");
				
				//to Navigate back to Roicians page
				driver.navigate().back();
				
				//to Navigate to Google page
				driver.navigate().forward();
				
				//to refresh any page
				driver.navigate().refresh();
				
				//to close browser after execution of scripts
				driver.close();
				
				//to close driver after execution of scripts
				driver.quit();
				
				
				
				
				
				
				
				
	}

}
