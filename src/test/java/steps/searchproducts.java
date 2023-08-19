package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.searchproductpage;

public class searchproducts extends googleBase {
	
	searchproductpage sp;
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
	   
		launchBrowser();
		}
        
        
	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String Product_name) {
		sp =new searchproductpage(driver); 
		sp.enterproductName(Product_name);
		
	    
		
	}

	@When("i click on the search butoon")
	public void i_click_on_the_search_butoon() {
	   
		sp =new searchproductpage(driver);
		sp.clickOnSearchButton();
	}
    
	@Then("i can see the search results successfully")
	public void i_can_see_the_search_results_successfully() throws InterruptedException {
		sp =new searchproductpage(driver);
		
	 Assert.assertTrue(sp.isSearchResultDisplayed());
	 
		Thread.sleep(5000);
		closeAll();
	}
	
		
}
