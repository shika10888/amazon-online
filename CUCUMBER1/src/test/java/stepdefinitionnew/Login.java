package stepdefinitionnew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("User must be on Homepageby clicking on URL\"https:\\/\\/demo.applitools.com\\/\"")
	public void user_must_be_on_homepageby_clicking_on_url_https_demo_applitools_com() {
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://demo.applitools.com/");
	   
	}

	@When("^Enter valid (.*) & (.*)$")
	public void enter_valid_username_password(String Username, String Password) {
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys(Username);
         WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
         wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(Password);
	    
	}

	@When("Click on Signin button")
	public void click_on_signin_button() {
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("log-in"))).click();
	    
	}

	@Then("User must be naviagated to their account")
	public void user_must_be_naviagated_to_their_account() {
	    driver.get("https://demo.applitools.com/app.html");
	}


	
	
	
	
	
}
