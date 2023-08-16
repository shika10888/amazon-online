package stepdef;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yourorders {
	WebDriver driver=new ChromeDriver();
	@Given("User must be on his \\/her account homepage. Click on Login Message")
	public void user_must_be_on_his_her_account_homepage_click_on_login_message() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://www.amazon.ca/");
		Actions actions= new Actions(driver);
		   actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		   driver.findElement(By.className("nav-action-inner")).click();
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ap_email\"]"))).isDisplayed();
		   driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("shika10888+1@gmail.com");
		   driver.findElement(By.id("continue")).click();
		   driver.findElement(By.id("ap_password")).sendKeys("abcdef");
		   driver.findElement(By.id("signInSubmit")).click();
		   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	}

	@When("On Clicking on Your orders option.")
	public void on_clicking_on_your_orders_option() {
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(90)) .pollingEvery(Duration.ofMillis(10))
				  .ignoring(NoSuchElementException.class);
				  
				  wait2.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div"))));
		
	    driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div")).click();
	}

	@Then("User must navigate to order history page.")
	public void user_must_navigate_to_order_history_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-link-normal"))).isDisplayed();
			
	}
}
