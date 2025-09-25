package googleProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchResult {

WebDriver driver;
Actions actions;
List<String> weblink=new ArrayList<>();
List<String> optionlink=new ArrayList<>();
List<String> results=new ArrayList<>();	

	public static String noOfResults(WebDriver driver,String text) {
		
		driver.findElement(By.xpath("//div[@class='GG4mbd P3mIxe']//span[text()='"+text+"']")).click();
		driver.findElement(By.xpath("//div[@class='GG4mbd P3mIxe']//span[text()='Tools']/following-sibling::span")).click();
		WebElement result = driver.findElement(By.xpath("//*[@id='result-stats']"));
		return result.getText();
	}
	
	
	public static String getScreenShot(WebDriver driver, String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator + filename);      
        try {
            FileUtils.copyFile(sourcefile, targetfile);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return targetfile.getAbsolutePath();
	}
	
	
	 public static String getWebElementScreenshot(WebElement element, String filename) {
	        File sourcefile = element.getScreenshotAs(OutputType.FILE);
	        File targetfile = new File(System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator + filename);
	        try {
	            FileUtils.copyFile(sourcefile, targetfile);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return targetfile.getAbsolutePath();
	    }

	

	@BeforeClass
	private void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	private void WebLink() {
		List<WebElement> Weblink = driver.findElements(By.xpath("//a[@href]"));
		for(WebElement link : Weblink) {
			if (!link.getText().isEmpty()) { 
				String text=link.getText();
                System.out.println(link.getText());
                ExcelUtility.writeResult("WebLink", text);
                 
            }
		}
		
		 
		 
	
		
	}
	
	@Test(priority = 2)
	private void Search() throws InterruptedException {
		actions = new Actions(driver);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Cognizant");
		List<WebElement> List = driver.findElements(By.xpath("//ul[@role='listbox']//li"));	
		System.out.println("Options Size = " + List.size());
	    ExcelUtility.writeResult("Search", "Options Size = " + List.size());
		Thread.sleep(2000);
		for(WebElement list : List) {
			System.out.println(list.getText());
		}
		
		
		 WebElement suggestionDiv = driver.findElement(By.xpath("//*[@id='Alh6id']/div[1]/div"));
	     getWebElementScreenshot(suggestionDiv, "options.png");
		
	     //ExcelUtility.writeResult("Search", "Screenshot saved: options.png");
		actions.keyDown(Keys.ENTER).perform();
		 
		 
	
		
	}
	
		
	@Test(priority = 3)
	private void All() throws InterruptedException {
		Thread.sleep(2000);
		String result=noOfResults(driver,"All");
		System.out.println(noOfResults(driver,"All"));
		getScreenShot(driver,"all.png");
		ExcelUtility.writeResult("All", result);
		 
		
	}

	
	@Test(priority = 4)
	private void News() throws InterruptedException {
		Thread.sleep(3000);
		String result= noOfResults(driver,"News");
		System.out.println(noOfResults(driver,"News"));
	    ExcelUtility.writeResult("News", result);
		getScreenShot(driver,"news.png");
	
	}
	


	@Test(priority = 5)
	private void Videos() throws InterruptedException {
		Thread.sleep(2000);
		String result=noOfResults(driver,"Videos");
		System.out.println(noOfResults(driver,"Videos"));
		getScreenShot(driver,"videos.png");
		ExcelUtility.writeResult("Videos", result);
	
	}
	
	
	@Test(priority = 6)
	private void Images() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='GG4mbd P3mIxe']//span[text()='Images']")).click();
		driver.findElement(By.xpath("//div[@class='GG4mbd']//span[text()='Tools']/following-sibling::span")).click();
		WebElement imageResult = driver.findElement(By.xpath("//*[@id='result-stats']"));
		String result=imageResult.getText();
		System.out.println(imageResult.getText());
		ExcelUtility.writeResult("Images", result);
		
	}

	
	
	@AfterClass
	private void exit() {
		driver.quit();
	}
	
}
 