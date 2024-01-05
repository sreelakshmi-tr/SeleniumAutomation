package testscripts;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		
		NavigationCommands navigationcommands = new NavigationCommands();
		
		navigationcommands.inititializeBrowser();
		//navigationcommands.navigationCommands();
		navigationcommands.browserCommands();

		navigationcommands.driverQuit();
		
	}
	public void navigationCommands() {
	
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		}
	public void browserCommands() {
		
		String title=driver.getTitle();
		
		String url= driver.getCurrentUrl();
		
		String pagesource = driver.getPageSource();
	}

}
