package StepDef.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefClass {
	WebDriver driver;
	
	@Given("User is on Google page")
	public void user_is_on_Google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace1\\Retail\\Driver\\chromedrivernew.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	}

	@When("User should enter CTS in search box")
	public void user_should_enter_CTS_in_search_box() {
		WebElement searchtxt = driver.findElement(By.name("q"));
		searchtxt.sendKeys("CTS");
	    
	}

	@Then("Hit search")
	public void hit_search() {
		WebElement hit = driver.findElement(By.className("gNO89b"));
		hit.click();
	    
	}

	@Then("Check the visible details")
	public void check_the_visible_details() {
		
	     
	}




}
