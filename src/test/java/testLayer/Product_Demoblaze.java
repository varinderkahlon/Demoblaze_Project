package testLayer;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pom_Demoblaze_Product.POM_Demoblaze_Product;

public class Product_Demoblaze  {
	WebDriver driver;
	
		
		// Declare Global variable of POM_Demoblaze_Product class
		
	
	POM_Demoblaze_Product Log = new POM_Demoblaze_Product();	// Launch Intitial Methods
	POM_Demoblaze_Product driver1=new POM_Demoblaze_Product(driver);
		
	@Test
	
	public void Add_ToCart() throws InterruptedException  {

		
	Log.AddToCart();
		
	}


}
