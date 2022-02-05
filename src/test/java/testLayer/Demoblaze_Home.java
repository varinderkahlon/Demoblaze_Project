package testLayer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base_demoblaze.Base_demoblaze;
import pageLoadTime.PageLoadTime;
import pom_Demoblaze_Home.POM_Demoblaze_Home;
import test_SignupExcel_Data.Test_SignupExcel_Data;

public class Demoblaze_Home extends Base_demoblaze{	// Make Base_demoblaze Parent class of Demoblaze_Home
	
	POM_Demoblaze_Home Log;							// Declare Global variable of POM_Demoblaze_Home class
	WebDriverWait wait;
	public Demoblaze_Home() {
		super();									// Use Methods of Parent class
	}
	
	@BeforeMethod
	
	public void initsetup() {
		initiate();
		Log= new POM_Demoblaze_Home();				// Launch Intitial Methods
	}
	
	@DataProvider 
		public Object[][] SignUpData() {
		
		Object result[][]= Test_SignupExcel_Data.readdata("Test_SignUp_Sheet"); // Read data from Excel file
		return result;
	}
	
	/*@Test (priority=1, dataProvider="SignUpData")
	
	public void Signuplink(String Signup_name,String Signup_pass) throws InterruptedException {
		Log.signupLink(); 																	// Click Signup Link
		Log.signupPage();																	// Move Mouse to Signup Page
		
		driver.manage().timeouts().pageLoadTimeout(PageLoadTime.pageLoadTime, TimeUnit.SECONDS); // Wait 
		Log.signupPageUsername(Signup_name);			 // Pass value from Excel sheet into Username Edit box
		Thread.sleep(5000);
		Log.signupPagePassword(Signup_pass); 			// Pass value from Excel sheet into Password Edit box
		Thread.sleep(5000);
		Log.SignupButton();					  			// Click Signup Button
		Thread.sleep(5000);
		Alert Success = driver.switchTo().alert(); 		// Move mouse to Alert wind
		Success.accept(); 								// Click the Ok Button 
	
	} 

	@Test (priority=2, dataProvider="SignUpData")
	
	public void LoginLink(String Login_Name, String Login_Pass) throws InterruptedException {
	
	
	
		Log.LoginLink();
		
		driver.manage().timeouts().pageLoadTimeout(PageLoadTime.pageLoadTime, TimeUnit.SECONDS); // Wait 
		Log.Loginpage();
		Thread.sleep(5000);
		Log.LoginUsername(Login_Name);
		Log.LoginPassword(Login_Pass);
		Log.LoginButton();
	}
*/
@Test (priority=3)

public void Laptops() throws InterruptedException {								// Click Laptop Button
	Log.LaptopButton();
	
}
}

