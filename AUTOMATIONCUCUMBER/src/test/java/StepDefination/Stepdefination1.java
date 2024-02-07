package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination1 {
	
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/v1");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText()+" is visible");
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();

	
	}



}
