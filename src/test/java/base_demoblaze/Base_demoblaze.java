package base_demoblaze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageLoadTime.PageLoadTime;

public class Base_demoblaze {
	// Declared Static so it can be used in this class and other classes too
	// Properties Class will read data from Environment.properties file and pass it in prop variable
	public static Properties prop=new Properties(); 
	public static WebDriver driver;
	
	// Create Constructor to read properties from Environment.properties file
	
	public Base_demoblaze() {
		
		// FileInputStream class will use its method  to read data from Environment.properties and store it in file variable
		
		try {
		FileInputStream file= new FileInputStream("C:\\Users\\varin\\eclipse-workspace\\Demoblaze_Project\\src\\test\\java\\environment_Variables\\Environment.properties");
		prop.load(file);  // Read data from Environment.properties
		}
		
		catch(FileNotFoundException e) { // To handle the exception if file is not found at this location
			e.printStackTrace();
		}
		
		catch(IOException a) {			// To handle exception if file is not able to read data from file variable
			a.printStackTrace();
		}
		
	}
		//Create a method under which we will keep all the common commands we will be using for child classes
		
	
		public static void initiate() {
			
		String browsername=prop.getProperty("browser"); // Browser Property will be read from Environment.properties and store it in browsername variable
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
			driver=new ChromeDriver();										// Chrome browser will open
			} 								
			else if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();										//Firefox browser will open
				
			}
			driver.manage().window().maximize();							// Window will be maximized	
			// Used pageLoadTime variable of PageLoadTime class to specify Page Load Time
			driver.manage().timeouts().pageLoadTimeout(PageLoadTime.pageLoadTime, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));	// get the value of url from Environment.properties file
			
			
		}	
	
		}
		
		


		