package SeleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlinDynamicDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@role = 'combobox']")).sendKeys("Cognizant");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox' ]//li//div[@role='presentation']//span"));
		
		System.out.println(list.size());
		
	}

}
