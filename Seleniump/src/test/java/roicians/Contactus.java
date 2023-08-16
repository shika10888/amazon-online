package roicians;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {

		//step 1 to open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//step 2 open contact us
		driver.get("https://www.roicians.com/contact-us/");
	driver.findElement(By.id("text-77525447616")).sendKeys("Emily");
	Contactus_POM pom=new Contactus_POM(driver);
		pom.typefirstname("Emily");
		pom.typelastname("Shika");
		pom.typeemail("shika10888@gmail.com");
		pom.typephonenumber("6474543564");
		pom.typemessage("hi");
		driver.close();
		
		
		
		
		
	driver.findElement(By.id("text-95374915097")).sendKeys("Shika");	
	driver.findElement(By.id("text-27022866830")).sendKeys("shika10888@gmail.com" );
	driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("6473456787");
	driver.findElements(By.id("field-kJfKGbPLNi5yFI7")).get(0).sendKeys("Hi");
	

	
	}

}
