package roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificationcommands {

	public static void main(String[] args) {
		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				driver.get(("https://www.google.com/"));
				boolean result = driver.findElement(By.cssSelector(".gb_v")).isEnabled();
				
				System.out.println(result);
				
				
				
				
				
				
	}

}
