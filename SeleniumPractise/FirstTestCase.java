package SeleniumPractise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String[] args) {
		// ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1809441702856353241&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061909&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		
//	--------------------------- 	BASIC SELENIUM SCRIPT  ------------------------------
//		String act_output = driver.getTitle();
//		
//		if(act_output.equals("OpenCart - Open Source Shopping Cart Solution")) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test Failed");
//		}
		
		
//	--------------------------------	LOCATOR BY NAME  --------------------------------
//		WebElement searchBox = driver.findElement(By.name("field-keywords"));
//		searchBox.sendKeys("boat");
		
//		driver.findElement(By.name("field-keywords")).sendKeys("boat");
		
		
//  ---------------------------------	LOCATOR BY USING ID  ------------------------------
		
//		boolean status = driver.findElement(By.id("nav-logo")).isDisplayed();
//		System.out.println(status);
		
		
//	---------------------------	LOCATOR BY USING LinkedText AND Partial LinkedText  -----------------------
		
//		driver.findElement(By.linkText("Mobiles")).click();
		
//		driver.findElement(By.partialLinkText("les")).click();
		
		
//	-------------------------	LOCATOR BY USING CLASSNAME  --------------------------
		
//		List<WebElement> headerLinks = driver.findElements(By.tagName("a"));
//		System.out.println(headerLinks.size());
		
		
//	------------------- 	LOCATOR USING CSS SELECTOR  ----------------------------
		
		
//		By using classname
//		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("apple");
//		driver.manage().window().maximize();
		
//		By using id
//		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("horse");
		
//		By using attribute
//		driver.findElement(By.cssSelector("placeholder='Search Amazon.in'")).sendKeys("hi name");
		
//		By using attribute and classname
//		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Tom");
	
		
//-----------	IMPLEMENTING XPATH   ------------------
		
//		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[2]/div/a]")).click();
//		driver.findElement(By.xpath("//*[@placeholder=\'Search Amazon.in\']")).sendKeys("Hello");
		
		
//		---- IMPLEMENTING XPATH WITH MULTIPLE ATTRIBUTES ----
		
//		driver.findElement(By.xpath("//*[@placeholder=\'Search Amazon.in\'][@type=\"text\"]")).sendKeys("Hello");
		
//		----- IMPLEMENTING XPATH WITH OPERATOR -----
		
//		driver.findElement(By.xpath("//*[@id='nav-logo-sprites' or @class='xyz']")).click();
//		driver.findElement(By.xpath("//*[@id='nav-logo-sprites' and @class='nav-logo-link nav-progressive-attribute']")).click();
		
//		----  XPATH USING INNER TEXT WITH HREF LINK ----
		
//		driver.findElement(By.xpath("//*[text() = 'MX Player']")).click();
		
//		----  XPATH USING INNER TEXT --------
		
//		boolean driv = driver.findElement(By.xpath("//*[text() = 'Revamp your home in style']")).isDisplayed();
//		System.out.println(driv);
//		String driv1 = driver.findElement(By.xpath("//*[text() = 'Revamp your home in style']")).getText();
//		System.out.println(driv);
		
//		------ XPATH USING CONTAINS AND STARTS WITH -----
		
//		driver.findElement(By.xpath("//*[contains(@placeholder , 'Search Amazon')]")).sendKeys("Hello");
		
//		driver.findElement(By.xpath("//*[starts-with(@placeholder , 'Search Amazon')]")).sendKeys("Hello");
		
		
//		CHAINED XPATH
		
//		driver.findElement(By.xpath("//*[@class=\'category-section\']/ul/li/a")).click();
		
		
//		-------- XPATH AXES ---------
		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Boat");
//		
//		driver.findElement(By.xpath("//*[@id=\'nav-search-bar-form\']/child::div[3]")).click();
		
		
//  -------------------------------	GET METHODS --------------------------------------
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
			
//		String url = driver.getUrl();
//		System.out.println(url);
		
		
//		String cuurl = driver.getCurrentUrl();
//		System.out.println(cuurl);
		
//		String src = driver.getPageSource();
//		System.out.println(src);
//		
		
//		String handle = driver.getWindowHandle();
//		System.out.println(handle);

//		
//		driver.findElement(By.linkText("MX Player")).click();
//		Set<String> handles = driver.getWindowHandles();
//		System.out.println(handles);
		
		


		
//		driver.close();
	}

}
