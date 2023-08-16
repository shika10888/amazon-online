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

public class Loginsecurity {
	
	  WebDriver driver=new ChromeDriver();
	  @Given("User must be user account homepage.")
	  public void user_must_be_user_account_homepage() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 driver.get("https://www.amazon.ca/"); Actions actions= new Actions(driver);
			 actions.moveToElement(driver.findElement(By.cssSelector( "#nav-link-accountList"))).build().perform();
			  driver.findElement(By.className("nav-action-inner")).click(); WebDriverWait
			  wait=new WebDriverWait(driver, Duration.ofSeconds(60));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@id=\"ap_email\"]"))).isDisplayed();
			  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(
			  "shika10888+1@gmail.com"); driver.findElement(By.id("continue")).click();
			  driver.findElement(By.id("ap_password")).sendKeys("abcdef");
			 driver.findElement(By.id("signInSubmit")).click();
			  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click(); }
	  
	
	@When("On Clicking on Login & Security option.")
	public void on_clicking_on_login_security_option() {
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(90)) .pollingEvery(Duration.ofMillis(10))
				  .ignoring(NoSuchElementException.class);
				  
				  wait2.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div"))));
	    driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div")).click();
	}

	@Then("Login & Security form must be displayed")
	public void login_security_form_must_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("auth-cnep-edit-name-button"))).isDisplayed();
	   
	}



}
