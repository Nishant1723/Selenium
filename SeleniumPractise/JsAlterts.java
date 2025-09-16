package SeleniumPractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JsAlterts {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
//		Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		alert.sendKeys("Nishant");
//		
//		alert.accept();
//		
//		String elm = driver.findElement(By.id("result")).getText();
//		
//		if(elm.contains("Nishant")) {
//			System.out.println("Passed");
//		} else {
//			System.out.println("failed");
//		}
		
		
//		ALERT IS HANDLE BY USING EXPLICITWAIT
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10)); 
		
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		
		alert1.accept();
		
		
		
	}

}
