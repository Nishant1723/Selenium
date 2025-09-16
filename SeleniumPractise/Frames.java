package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//*[@name = 'mytext1']")).sendKeys("Hello");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//*[@name = 'mytext2']")).sendKeys("Google");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//*[@name = 'mytext3']")).sendKeys("Gemini");
		
//		Inner Frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"i6\"]/div[3]/div")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
