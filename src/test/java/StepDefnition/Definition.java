package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	
	public WebDriver driver;
	
	@Given("Navigate to login page")
	public void navigate_to_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		driver.findElement(By.id("user-name")).sendKeys(string);
	    
	}
	
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	    
	}
	
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	   
	}
	
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		String txt = driver.findElement(By.xpath("//div[.='Swag Labs']")).getText();
		if(txt.equalsIgnoreCase("Dashboard")) {
			System.out.println("homepage id displayed");  
		}
	    
	}
	
	@When("Enter the invalid username")
	public void enter_the_invalid_username() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user1");
	   
	}
	
	@When("Enter the invalid password")
	public void enter_the_invalid_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce1");
	  
	}
	
	@Then("Homepage should not be displayed")
	public void homepage_should_not_be_displayed() {
		String errormsg = driver.findElement(By.xpath("//button[@class='error-button']")).getText();
		if(errormsg.equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service")) {
			System.out.println("invalid username");
		}	
	   
	}

	@When("Enter the invalid username {string}")
	public void enter_the_invalid_username(String string) {
		driver.findElement(By.id("user-name")).sendKeys(string);
	}
	@When("Enter the invalid password {string}")
	public void enter_the_invalid_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	



}









