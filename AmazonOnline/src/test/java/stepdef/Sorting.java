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

public class Sorting {
	WebDriver driver = new ChromeDriver();
	@Given("User should be on User Account Page")
	public void user_should_be_on_user_account_page() {
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

	@When("User enters any keyword.Click on Search")
	public void user_enters_any_keyword_click_on_search() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("Click on Sort option & select price Low to high sorting criteria")
	public void click_on_sort_option_select_price_low_to_high_sorting_criteria() {
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.id("s-result-sort-select_1")).click();
	}

	@Then("Items with the least price must be displayed first followed by items of higher price.")
	public void items_with_the_least_price_must_be_displayed_first_followed_by_items_of_higher_price() {
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(10))
				.ignoring(NoSuchElementException.class);

				wait2.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row"))));
		
	   
	}




}
