package pom_Demoblaze_Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base_demoblaze.Base_demoblaze;

public class POM_Demoblaze_Cart extends Base_demoblaze{
	
	//Object Repository for Add To Cart Page

	@FindBy(xpath="//*[@id=\\\"tbodyid\\\"]/tr/td[2]")
	WebElement Title;
	
	//Initiate Page Elements
	
		public POM_Demoblaze_Cart()  {
		
			PageFactory.initElements(driver, this);
		}
		
		public void title() throws InterruptedException {
			driver.switchTo().defaultContent();
			driver.findElement(By.cssSelector("#cartur")).click();
		    driver.switchTo().defaultContent();
		    Thread.sleep(5000);
		    Title.getText();
		    System.out.println(Title);
		    Assert.assertEquals("MacBook air", Title);
			  System.out.println("Test Passed");
		}
}
