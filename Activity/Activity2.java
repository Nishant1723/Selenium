package Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.navigate().to("https://www.geeksforgeeks.org/software-testing/selenium-basics-components-features-uses-and-limitations/");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	}

}
