package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
    public WebDriver driver;// web driver is an interface
	public static void main(String[] args) {
		Base base= new Base();
		//base.inititializeBrowser();
		//base.driverQuit();
		
		base.inititializeEdgeBrowser();
	}
	
	// Chrome
	public void inititializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sreel\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\Resources\\chromedriver.exe" );
		
		driver = new ChromeDriver();// new FireFoxDriver //new 
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();// to max page
		
	}
	
	// Edge
	public void inititializeEdgeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\sreel\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\Resources\\msedgedriver.exe" );
		
		driver = new EdgeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();// to max page
		
	}
	
	
	public void driverQuit() {// to close the page
		driver.quit();// all windows
		//driver.close();// single window
	}

}
