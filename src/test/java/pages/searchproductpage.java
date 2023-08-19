package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class searchproductpage {
	
	
	WebDriver driver;
	
	public searchproductpage(WebDriver dr) {
		
		driver=dr;
		PageFactory.initElements(driver,this);
	}
      @FindBy(id="APjFqb")
   WebElement searchBar;

      @FindBy(name="btnK")
      WebElement searchButton;
      
      @FindBy(id="result-stats")
      WebElement searchResult;
      
      
      public void enterproductName(String productName) {
    	  searchBar.sendKeys(productName);
    	      
      }
      public void clickOnSearchButton() {
    	  searchButton.click();
      }
      public boolean isSearchResultDisplayed() {
    	  return searchResult.isDisplayed();
      }
      
}