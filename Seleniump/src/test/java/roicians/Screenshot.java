package roicians;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				
				//step 2 open Roicians page
				driver.get("https://www.roicians.com/");
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile,new File("C://Users/alvin/Downloads/screenshot.jpg"));
				
	}

}
