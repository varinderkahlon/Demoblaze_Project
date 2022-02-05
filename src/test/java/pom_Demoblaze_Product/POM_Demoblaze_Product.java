package pom_Demoblaze_Product;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_demoblaze.Base_demoblaze;

public class POM_Demoblaze_Product extends Base_demoblaze{
	

	
	//Object Repository for Add To Cart Page

	@FindBy(xpath="//[@id=\"tbodyid\"]/div[2]/div") //Add To Cart Button
	WebElement Add_To_Cart;

	//Initiate Page Elements
	
	public POM_Demoblaze_Product()  {
	
		PageFactory.initElements(driver, this);
	}
	
	
	public POM_Demoblaze_Product(WebDriver driver) {
		
	}

	public void AddToCart() throws InterruptedException   {
	
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		Add_To_Cart.click();
		Thread.sleep(5000);
		Alert Add_Success= driver.switchTo().alert();
		Add_Success.accept();

	}
	
	

}