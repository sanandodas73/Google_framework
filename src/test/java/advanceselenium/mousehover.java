package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
public static void main(String[] args) {
	
	
	webdriverManager.chomedriver().setup();
	driver.manage().window().maximize().
	driver.manage().timeouts().omplicitlyWait(30,TimeUnit.SECONDS);
	WebElement img1=driver.findelement(By.xpath("(//img[@alt='User Avatar'])[1]"));
	Webelement text1 =driver.findelement(By.xpath("(//img[@alt='User Avatar'])[1]"));
	Actions act=new Actions(driver);
	act.moveToElement(img1).build().perform();
	System.out.printlntext1.getText());
}
}
