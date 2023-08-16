package amazon1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) {
         
		//to open the browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//to navigate to Amazon.ca
		driver.navigate().to("https://www.amazon.ca/");
		
		
		
		
		
		
		
		
	}

}
