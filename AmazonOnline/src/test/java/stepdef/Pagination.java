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

public class Pagination {
	WebDriver driver = new ChromeDriver();
	@Given("User must be on User accountpage.")
	public void user_must_be_on_user_accountpage() {
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

	@When("User must enter any keyword.")
	public void user_must_enter_any_keyword() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women handbags");
	}

	@When("Click on search button")
	public void click_on_search_button() {
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().window().maximize();
	}

	@Then("Only {int} items must be displayed per page.")
	public void only_items_must_be_displayed_per_page(Integer int1) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]"))).isDisplayed();
		
	}

	


}
