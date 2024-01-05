package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	
	public void locatingMethods() {
	/*
		// id
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement textInput=driver.findElement(By.id("single-input-field"));
		WebElement getTotalButton=driver.findElement(By.id("button-two"));
		WebElement valueB=driver.findElement(By.id("value-b"));
		WebElement valueA=driver.findElement(By.id("value-a"));


		
		//class
		WebElement headerTop= driver.findElement(By.className("header-top"));
		WebElement heading= driver.findElement(By.className("mb-sec"));
		WebElement clearfix= driver.findElement(By.className("clearfix"));
		WebElement footer= driver.findElement(By.className("mt-5"));
		
		driver.navigate().to("https://www.amazon.in/");
		WebElement amazonStyle1= driver.findElement(By.className("vjs-styles-defaults"));
		WebElement amazonStyle2= driver.findElement(By.className("vjs-styles-dimensions"));

		driver.navigate().back();

		//name
        WebElement viewport = driver.findElement(By.name("viewport"));
        WebElement description = driver.findElement(By.name("description"));
        WebElement keywords = driver.findElement(By.name("keywords"));
        WebElement author = driver.findElement(By.name("author"));
        
        driver.navigate().forward();// Amazone
        WebElement google = driver.findElement(By.name("google"));
        WebElement googleSV = driver.findElement(By.name("google-site-verification"));
		driver.navigate().back();// obsqura

        
        WebElement linkText1 = driver.findElement(By.linkText("Simple Form Demo"));
        WebElement linkText2 = driver.findElement(By.linkText("Checkbox Demo"));
        WebElement linkText3 = driver.findElement(By.linkText("Radio Buttons Demo"));
        WebElement linkText4 = driver.findElement(By.linkText("Select Input"));
        WebElement linkText5 = driver.findElement(By.linkText("Form Submit"));
        WebElement linkText6 = driver.findElement(By.linkText("Ajax Form Submit"));

		
	    WebElement partialLinkText1 = driver.findElement(By.partialLinkText("Simple Form"));
	    WebElement partialLinkText2 = driver.findElement(By.partialLinkText("Checkbox Dem"));
	    WebElement partialLinkText3 = driver.findElement(By.partialLinkText("Radio Buttons"));
	    WebElement partialLinkText4 = driver.findElement(By.partialLinkText("Select Inpu"));
	    WebElement partialLinkText5 = driver.findElement(By.partialLinkText("Form Sub"));
	    WebElement partialLinkText6 = driver.findElement(By.partialLinkText("Ajax Form"));
	    
	    WebElement cssSelectorId = driver.findElement(By.cssSelector("button#button-one"));
	    WebElement cssSelectorClass = driver.findElement(By.cssSelector("div.header-top"));    
	    WebElement cssSelectorAtt = driver.findElement(By.cssSelector("div[class=header-top]"));
	    WebElement cssSelectorClassAtt = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	    //WebElement cssSelectorcontains = driver.findElement(By.cssSelector("a:contains('Ajax Form Submit')"));


	    
	    //Xpath 
	    WebElement xpath = driver.findElement(By.xpath("//button[@id='button-one']"));
	    WebElement xpath11 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	    WebElement xpath12 = driver.findElement(By.xpath("//button[@id='button-two']"));
	    WebElement xpath13 = driver.findElement(By.xpath("//input[@id='value-b']"));
	    WebElement xpath14 = driver.findElement(By.xpath("//input[@id='value-a']"));
	    WebElement xpath15 = driver.findElement(By.xpath("//div[@class='header-top']"));


        WebElement xpath2= driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
        WebElement xpath21= driver.findElement(By.xpath("//div[contains(@class,'header-t')]"));
        WebElement xpath22= driver.findElement(By.xpath("//meta[contains(@name,'viewport')]"));
        WebElement xpath23= driver.findElement(By.xpath("//a[contains(@href,'simple-form')]"));
        WebElement xpath24= driver.findElement(By.xpath("//a[contains(@href,'ajax')]"));
        WebElement xpath25= driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));

        
	    WebElement xpath3= driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	    WebElement xpath31= driver.findElement(By.xpath("//div[starts-with(@class,'header')]"));
	    WebElement xpath32= driver.findElement(By.xpath("//meta[starts-with(@name,'view')]"));
	    WebElement xpath33= driver.findElement(By.xpath("//a[starts-with(@href,'ajax')]"));
	    WebElement xpath34= driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
	    WebElement xpath35= driver.findElement(By.xpath("//button[starts-with(@class,'btn')]"));

	    WebElement xpath4= driver.findElement(By.xpath("//button[text()='Show Message']"));
	  // WebElement xpath41= driver.findElement(By.xpath("//div[text()='Two Input Fields']"));
	    WebElement xpath42= driver.findElement(By.xpath("//label[text()='Enter Message']"));
	    WebElement xpath43= driver.findElement(By.xpath("//title[text()='Obsqura Testing']"));
	    WebElement xpath44= driver.findElement(By.xpath("//a[text()='Ajax Form Submit']"));
	    WebElement xpath45= driver.findElement(By.xpath("//a[text()='Select Input']"));

	    WebElement xpath5 = driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
	    WebElement xpath51 = driver.findElement(By.xpath("//a[starts-with(@href,'form') and text()='Form Submit']"));
	    WebElement xpath52 = driver.findElement(By.xpath("//label[text()='Enter Message' and @for='inputEmail4']"));
	    WebElement xpath53 = driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
	    WebElement xpath54 = driver.findElement(By.xpath("//meta[@name='viewport' and starts-with(@content,'width')]"));
	    WebElement xpath55 = driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));

	    WebElement xpath6 = driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-on']"));
	    WebElement xpath61 = driver.findElement(By.xpath("//a[starts-with(@href,'form') or text()='Form Submit']"));
	    WebElement xpath62 = driver.findElement(By.xpath("//label[text()='Enter Message' or @for='inputEmail4']"));
	    WebElement xpath63 = driver.findElement(By.xpath("//input[@class='form-control' or @id='single-input-field']"));
	    WebElement xpath64 = driver.findElement(By.xpath("//meta[@name='viewport' or starts-with(@content,'width')]"));
	    WebElement xpath65 = driver.findElement(By.xpath("//input[@id='value-a' or @class='form-control']"));

		// child--->parent
	    WebElement xpath7 = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	    WebElement xpath71 = driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//parent::div"));
	    WebElement xpath72 = driver.findElement(By.xpath("//ul[@class='navbar-nav']//parent::div"));
	    WebElement xpath73 = driver.findElement(By.xpath("//section[@class='clearfix']//parent::body"));
	    WebElement xpath74 = driver.findElement(By.xpath("//a[text()='Select Input']//parent::li"));
	    WebElement xpath75 = driver.findElement(By.xpath("//div[@class='top-logo']//parent::div"));//listed both child and parent

	   // parent--->child
	    WebElement xpath8 = driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	    WebElement xpath81 = driver.findElement(By.xpath("//div[@class='header-top']//child::a"));
	    WebElement xpath82 = driver.findElement(By.xpath("//div[@class='mb-sec']//child::button"));
	    WebElement xpath83 = driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-md navbar-dark']//child::div"));
	    WebElement xpath84 = driver.findElement(By.xpath("//section//child::div"));
	    WebElement xpath85 = driver.findElement(By.xpath("//body//child::a"));

	    
        WebElement xpath9 = driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
        WebElement xpath91 = driver.findElement(By.xpath("//a[@class='navbar-brand']//following-sibling::button"));
        WebElement xpath92 = driver.findElement(By.xpath("//a[@class='navbar-brand']//following-sibling::div"));
        WebElement xpath93 = driver.findElement(By.xpath("//link[@rel='canonical']//following-sibling::meta"));
        WebElement xpath94 = driver.findElement(By.xpath("//div[@class='header-top']//following-sibling::div"));// showing child too
        WebElement xpath95 = driver.findElement(By.xpath("//div[@class='col-lg-3 col-md-3 col-sm-12 col-xs-12']//following-sibling::div"));

        WebElement xpath0 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
        WebElement xpath011 = driver.findElement(By.xpath("//section[@class=\"clearfix\"]// following::div[@class='container page']"));
        WebElement xpath012 = driver.findElement(By.xpath("//button[@id='button-one']//following::footer"));
        WebElement xpath013 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='example my-3']"));
        WebElement xpath014 = driver.findElement(By.xpath("//div[@class='card-header' and contains(text(),'Menu')]//following::form[@method='POST']"));
        WebElement xpath015 = driver.findElement(By.xpath("//div[@class='card-header' and contains(text(),'Menu')]//following::ul"));
*/
	    WebElement xpath01 = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div"));
        WebElement xpath02 = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
        WebElement xpath03 = driver.findElement(By.xpath("//div[@class='header-top']//descendant::div"));
	}
	
    public static void main(String[] args) {
		
		Locators locators= new Locators();
		locators.inititializeBrowser();
		locators.locatingMethods();
		locators.driverQuit();
       
	}

}
