package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Youraddress {
	WebDriver driver = new ChromeDriver();
	@Given("User must be on his \\/her account page")
	public void user_must_be_on_his_her_account_page() {
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
	}

	@Given("Click on Login Message")
	public void click_on_login_message() {
	   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	}
	@When("On Clicking on Your address option must navigate to Add Address option")
	public void on_clicking_on_your_address_option_must_navigate_to_add_address_option() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2"))).isDisplayed();
		
	    driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
	    driver.findElement(By.cssSelector("#ya-myab-address-add-link > div")).click();
	}

	@Then("Add New Address window must be displayed")
	public void add_new_address_window_must_be_displayed() {
	    driver.findElement(By.className("a-section")).isDisplayed();
	}



}