package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("user is on adaction login page")
	public void user_is_on_adaction_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://adactinhotelapp.com/");
	    driver.manage().window().maximize(); 
	    
	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String name, String password) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(name);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(password);
	    
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	    
	}

	@When("user is on adacitin search hotel page")
	public void user_is_on_adacitin_search_hotel_page() {
	    
	}

	@Then("user should select all the details	{string},{string},{string},{string},{string},{string},{string}and {string}")
	public void user_should_select_all_the_details_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByIndex(5);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotels);
		select1.selectByIndex(3);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select select2 = new Select(roomtype);
		select2.selectByIndex(2);
		
		WebElement numofRooms = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(numofRooms);
		select3.selectByIndex(3);
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		Actions actions = new Actions(driver);
		actions.doubleClick(date).perform();
		date.clear();
		date.sendKeys("22/01/2021");
		
		WebElement toDate = driver.findElement(By.id("datepick_out"));
		Actions actions1 = new Actions(driver);
		actions1.doubleClick(toDate).perform();
		toDate.clear();
		toDate.sendKeys("24/01/2021");
		
		WebElement adperRoom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adperRoom);
		select4.selectByIndex(2);
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(childRoom);
		select5.selectByIndex(2);
		
		
	}

	@Then("user should click the search button")
	public void user_should_click_the_search_button() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@Then("select the hotel radio button")
	public void select_the_hotel_radio_button() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
	    
	}

	@Then("Hit continue button")
	public void hit_continue_button() {
		WebElement hit = driver.findElement(By.id("continue"));
		hit.click();
	    
	}

	@When("user in Book a hotel page fill {string},{string},{string},{string}and{string}")
	public void user_in_Book_a_hotel_page_fill_and(String string, String string2, String string3, String string4, String string5) {
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("Kumar");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("k");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Chennai");
		
		WebElement cardnum = driver.findElement(By.id("cc_num"));
		cardnum.sendKeys("1234567890000033");
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select select7 =new Select(cardType);
		select7.selectByIndex(2);
		
		WebElement edate = driver.findElement(By.id("cc_exp_month"));
		Select select6 = new Select(edate);
		select6.selectByVisibleText("August");
		
		WebElement eYear = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(eYear);
		select8.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
	}

	@When("user should click the book now")
	public void user_should_click_the_book_now() throws InterruptedException {
		WebElement proceed = driver.findElement(By.id("book_now"));
		proceed.click();
		Thread.sleep(5000);
	}

	@When("user should verify the sucess msg")
	public void user_should_verify_the_sucess_msg() {
		WebElement orderID = driver.findElement(By.name("order_no"));
		String data = orderID.getAttribute("value");
		System.out.println(data);
	}



}
