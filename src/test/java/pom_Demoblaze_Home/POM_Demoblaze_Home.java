package pom_Demoblaze_Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base_demoblaze.Base_demoblaze;


public class POM_Demoblaze_Home extends Base_demoblaze {

	//Object Repository for Home Page
	
	@FindBy(partialLinkText="index.ht") 			// Home Link
	static WebElement Home;
	@FindBy(partialLinkText="Contact")				// Contact Link
	WebElement Contact;
	@FindBy(partialLinkText="About us")				// About us Link
	WebElement AboutUs;
	@FindBy(partialLinkText="cart.ht")				// Cart Link
	WebElement Cart;
	@FindBy(id="login2")							// Log in Link
	WebElement Login;
	@FindBy(id="signin2")							// Sign Up Link
	WebElement SignUp;
	
	@FindBy(css="#carouselExampleIndicators > a.carousel-control-prev > span.carousel-control-prev-icon") // Previous Button
	WebElement Previous;
	@FindBy(css="#carouselExampleIndicators > a.carousel-control-next > span.carousel-control-next-icon") // Next Button
	WebElement Next;
	
	@FindBy(xpath="//*[@id=\"itemc\"][1]")			// Phones Link
	WebElement Phones;
	@FindBy(xpath="//*[@id=\"itemc\"][2]")			// Laptops Link
	WebElement Laptops;
	@FindBy(xpath="//*[@id=\"itemc\"][3]")			// Monitors Link
	WebElement Monitors;
	
	@FindBy(partialLinkText="prod.html?idp_=8")	// Sony vaio i5 Link
	WebElement Sony_vaio_i5;
	
	@FindBy(partialLinkText="prod.html?idp_=9")	// Sony vaio i7 Link
	WebElement Sony_vaio_i7;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a") // MacBook Air Link prod.html?idp_=11"
	WebElement MacBook_air;
	
	@FindBy(partialLinkText="prod.html?idp_=12") // Dell i7 8GB Link
	WebElement Dell_i7_8gb;
	
	@FindBy(partialLinkText="prod.html?idp_=13") // Dell 2017 15.6 Inch Link
	WebElement Dell_2017_15_6_Inch;
	
	@FindBy(partialLinkText="prod.html?idp_=15") // MacBook Pro Link
	WebElement MacBook_Pro;
	
	@FindBy(id="prev2")
	WebElement Previous2;						// Previous Button Link
	
	@FindBy(id="next2")
	WebElement Next2;							// Next Button Link
	
	@FindBy(partialLinkText="prod.html?idp_=14") // ASUS Full HD Link
	WebElement ASUS_Full_HD;
	
	@FindBy(id="sign-username")					// Signup Username Edit Box
	WebElement Signup_Username;
	
	@FindBy(id="sign-password")					// Signup Password Edit Box
	WebElement Signup_Password;
	
	@FindBy(css="#signInModal > div > div > div.modal-footer > button.btn.btn-primary") // Signup Button
	WebElement SignUp_Button;
	
	@FindBy(id="loginusername")				//Login Username Edit Box
	WebElement Login_Username;

	@FindBy(id="loginpassword")				//Login Password Edit Box
	WebElement Login_Password;
	
	@FindBy(css="#logInModal > div > div > div.modal-footer > button.btn.btn-primary")	// Login Button
	WebElement Login_Button;
	
	//Initiate Page Elements
	
	public POM_Demoblaze_Home() {
		PageFactory.initElements(driver, this);
	
	}//Sign Up with Username and Password
	
/*	
		public void signupLink() {
		Actions SignupLink=new Actions(driver);							//Declare Variable for Actions Class
		SignupLink.moveToElement(SignUp).click().build().perform();		// Move Mouse to Signup Link
	}
	
	public void signupPage() throws InterruptedException {
		Actions SignupPage=new Actions(driver);							//Declare variable for Actions Class
		Thread.sleep(5000);
		SignupPage.moveToElement(Signup_Username);						//Move Mouse to Username Editbox
		Thread.sleep(5000);
		SignupPage.moveToElement(Signup_Password);						//Move Mouse to Password Editbox
	}
	
	
	public void signupPageUsername(String Signup_name) {					
		Signup_Username.sendKeys(Signup_name);							// Pass data from excel sheet to Signup_name variable
	}
	
	public void signupPagePassword(String Signup_pass) {
		Signup_Password.sendKeys(Signup_pass);							// Pass data from excel sheet to Signup_pass variable
	}
	
	public void SignupButton() {
		SignUp_Button.click();											// Click Signup Button
	}
	
	
	//Log in with Username and Password
	
		public void LoginLink() {
		Actions LoginLink=new Actions(driver);							//Declare Variable for Actions Class
		LoginLink.moveToElement(Login).click().build().perform();		// Move Mouse to Login Link
	}
	
	public void Loginpage() {
		Actions LoginPage=new Actions(driver);							//Declare variable for Actions Class
		LoginPage.moveToElement(Login_Username);						//Move Mouse to Login Login_Username Editbox
		LoginPage.moveToElement(Login_Password);						//Move Mouse to Login Login_Password Editbox
	}
	
	public void LoginUsername(String Login_name) {						// Pass data from excel sheet to Login_name variable
		Login_Username.sendKeys(Login_name);
	}
	
	public void LoginPassword(String Login_pass) {						// Pass data from excel sheet to Login_pass variable
		Login_Password.sendKeys(Login_pass);
	}
	
	public void LoginButton() {											// Click Login Button
		Login_Button.click();
	}
	
	*/
	
	//Click on Laptop Button
	
	public void LaptopButton() throws InterruptedException {			// Click Laptop Button
		Laptops.click();
		Thread.sleep(5000);
		MacBook_air.click();
		
		
		
	
	
	}
	
	
	
}