package roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Career {

	public static void main(String[] args) {
		
		//step 1 to open the browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				
				WebDriver driver=new ChromeDriver();
				
				//step 2 to open career
				driver.get("https://www.roicians.com/career/");
				//to enter first name
				driver.findElement(By.id("text-248418663108")).sendKeys("Shika");
				//to enter last name
				driver.findElement(By.id("text-58969147196")).sendKeys("Alvin");
				//to enter email address
				driver.findElement(By.id("text-25931186823")).sendKeys("shika1088@gmail.com");
				//to enter phone number 
				driver.findElement(By.id("field-LfRVhp7sisH0kRP")).sendKeys("6474546785");
				//to handle drop down menu
				Select obj=new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
                obj.selectByVisibleText("Automation Testing Trainer");
               // obj.selectByValue("Automation Testing Trainer");
                //obj.selectByIndex(3);
                //to enter message
                driver.findElement(By.id("textarea-27447478041")).sendKeys("Hi");
                //to upload a file
                driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\alvin\\OneDrive\\Documents\\Encapsulation in OOPs Concept.docx");
				//to click on send button
                driver.findElement(By.id("button-23567600038")).click();
		
		
		
		

	}

}
