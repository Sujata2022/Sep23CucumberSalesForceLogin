package com.cucumber.stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceStepDefinition {	
	
	WebDriver driver=null;	
	
//	@BeforeStep
//	public void before_step() {
//		System.out.println("printed before step");		
//	}
//	@AfterStep
//	public void aftersx_step() {		
//		System.out.println("printed after step");
//	}
	@Before
	public void setup() {
	driver = new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.close();	
		}	
	
@Given("browser is open")
public void browser_is_open() {
	//WebDriver driver = new ChromeDriver();
   
}
@When("user is on login page")
public void user_is_on_login_page() {
	String url = "https://login.salesforce.com/";
	driver.get(url);	
	driver.manage().window().maximize();
    
}
@And("user enters username and password")
public void user_enters_username_and_password() throws InterruptedException {
	
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		System.out.println("username entered");  
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing123");
		System.out.println("Password entered");
}

@And("user clicks on login")
public void user_clicks_on_login() throws InterruptedException {

	driver.findElement(By.id("Login")).click();
	Thread.sleep(2000);
	System.out.println("Login button clicked");
    
}
@Then("user is navigated to homepage")
public void user_is_navigated_to_homepage() throws InterruptedException {
	String expectTitle = "Lightning Experience";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(expectTitle, actualTitle);
	Thread.sleep(2000);
   
	}
}


