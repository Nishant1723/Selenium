package SeleniumPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.geeksforgeeks.org/software-engineering/software-engineering-selenium-an-automation-tool/");
		
		driver.findElement(By.xpath("//*[@id=\"post-217588\"]/div[4]/p[1]/a/span")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		System.out.println(handle);
		
		System.out.println(driver.getTitle());
		
//		APPROACH 1
		
//		List<String> list = new ArrayList(handle);
//		
//		String handle1 = list.get(0);
//		String handle2 = list.get(1);
//		
//		driver.switchTo().window(handle2);
//		
//		System.out.println(driver.getTitle());
		
		
//		APPRPOACH 2
		
//		This is approach where we perform the switching on the multiple web page we perform it
//		by checking if given title matching perform operation 
		
		for(String han  : handle) {
			
			String title = driver.switchTo().window(han).getTitle();
			
			if(title.equals("What is Software Testing? - GeeksforGeeks")) {
				System.out.println("2nd driver");
			} 
			
		}
		
		
//		CLOSING THE PARTICULAR WINDOW
		
		for(String han1  : handle) {
			
			String title1 = driver.switchTo().window(han1).getTitle();
			System.out.println(title1);
			
			if(title1.equals("What is Software Testing? - GeeksforGeeks")) {
				driver.close();
			} 
			
		}
		

		

	}

}
