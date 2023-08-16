package roicians;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus_POM {
WebDriver driver;
    //to store element in variable
	//fname is a WebElement storing the entire value written before it
	@FindBy(id="text-77525447616") WebElement fname;
	@FindBy(id="text-95374915097") WebElement lname;
	@FindBy(id="text-27022866830") WebElement email;
	@FindBy(id="field-tIgxvmTMez6ibt1")WebElement phonenumber;
	
	@FindBy(id="field-kJfKGbPLNi5yFI7")WebElement message;
	
	
	
	
	
	//creating constructor with parameters
	public Contactus_POM(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
		
		
		
	}
	public void typefirstname(String name) {
		fname.sendKeys("Emily");
	}
	public void typelastname (String name) {	
	       lname.sendKeys("Shika");
	}

	public void typeemail(String name) {
	email.sendKeys("shika10888@gmail.com");
	}
		
	public void typephonenumber(String name) {	
		phonenumber.sendKeys("6474543564");
		
	}
		public void typemessage (String name) {
		message.sendKeys("hi");
		
	}
	
	
	
	
	
	
	
	
	
	
}
