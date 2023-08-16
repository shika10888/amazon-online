package amazon1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws IOException {
		//to open the browser
		
				System.setProperty("webdriver.com.driver", "chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/");
				//to navigate to Amazon.ca
				driver.navigate().to("https://www.amazon.ca/");
				
				//to take screen shot of Amazon.ca page
			driver.get("https://www.amazon.ca/");
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("C://Users/alvin/Downloads/screenshot.jpg"));
				
				
				
				
				
				
				
				
				
				
				
	}

}
