package Activity;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
//------------------------------------	IMPLICIT WAIT ---------------
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//	---------------------------	EXPLICIT WAIT ---------------------------
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//	---------------------------------	FLUENT WAIT --------------
		
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		driver.get("https://www.geeksforgeeks.org/software-engineering/software-engineering-selenium-an-automation-tool/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"post-217588\"]/div[4]/p[1]/a/span")).click();
		
//		WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Advertise with us")));
//		text.click();
		
		WebElement textElement = mywait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                // Find the element with the link text "Advertise with us"
                return driver.findElement(By.linkText("Advertise with us"));
            }
        });
        
        // Click the element after it's found
        textElement.click();
        
        
//		driver.findElement(By.linkText("Advertise with us")).click();
		
//		 Set<String> allWindowHandles = driver.getWindowHandles();
//		 System.out.println(allWindowHandles);


	}

}

