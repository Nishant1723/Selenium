package Activity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity4 {
	public static void main(String[] args) throws InterruptedException {
		
//		Initializing the  WebDriver
		
		WebDriver driver = new ChromeDriver(); 
		 
//		 	Getting Web Link
		
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
//	        Manage the window by maximizing
	        
	        
	        driver.manage().window().maximize();
	        
//	        Find the element by using id and pass the input
	        
	        
	        driver.findElement(By.id("name")).sendKeys("Nishant");
	        
//	        Find the element by using id and pass the input
	        
	        
	        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	        
//	        Find the element by using id and pass the input
	        
	        
	        driver.findElement(By.id("phone")).sendKeys("9846485xxx");
	        
//	        Find the element by using id and pass the input
	        
	        
	        driver.findElement(By.id("textarea")).sendKeys("Hello");
	        
//		    Find the radio button using xPath and Perform Click Operation
	        

	        driver.findElement(By.xpath("//input[@type='radio']")).click();
	        
//	        Accessing all checkBox using xPath and Selecting last three checkBox
	        
	        
	        List<WebElement> list = driver.findElements(By.xpath("//*[@class = 'form-check-input' and @type = 'checkbox']"));
	        
//	        Perform Click operation on last three check box using for loop
	        
	        
	        for(int i=4; i<list.size(); i++) {
	        	
	        	list.get(i).click();
	        	
	        }
	        
//	        Performing operations on select tag 
	        
	        
	        WebElement elm = driver.findElement(By.id("country"));
	        
//	        Implementing Select Class
	        
	        
	        Select sel = new Select(elm);
	        
	        sel.selectByContainsVisibleText("India");
	        
//	        Printing all the country in the console
	        
	        
	        List<WebElement> we = sel.getOptions();
	        
	        System.out.println(we.size());
	        
	        for(WebElement i : we) {
	        	System.out.println(i.getText());
	        }
	        
//	        Implementing the multiSelect Drop down on Colors
	        
	        
	        WebElement color = driver.findElement(By.id("colors"));
	        
	        Select col = new Select(color);
	        
//	        col.selectByVisibleText("Red");
	        
	        List<WebElement> cl = col.getOptions();
	        
	        System.out.println(cl.size());
	        
	        for(WebElement j : cl) {
	        	System.out.println(j.getText());
	        }
	        
	        for(int i=3; i<cl.size(); i++) {
	        	cl.get(i).click();
	        }
	        
	        
//	        Implementing the multiSelect Drop down on Sorted List
	        
	        WebElement sort = driver.findElement(By.id("animals"));
	        
	        Select ani = new Select(sort);
	        
//	        col.selectByVisibleText("Cat");
	        
	        List<WebElement> animal= ani.getOptions();
	        
	        System.out.println(animal.size());
	        
	        for(WebElement k : animal) {
	        	System.out.println(k.getText());
	        }
	        
	        for(int i=0; i<animal.size(); i++) {
	        	animal.get(i).click();
	        }
	        
	        
//	        Implementing Operations on Static Table
	        
	        int row = driver.findElements(By.xpath("//*[@name = 'BookTable']//tr")).size();
	        System.out.println(row);
	        
	        int colu = driver.findElements(By.xpath("//*[@name = 'BookTable']//th")).size();
	        System.out.println(colu);
	        
	        String elm3 = driver.findElement(By.xpath("//*[@name = 'BookTable']//tr[5]//td[3]")).getText();
	        System.out.println(elm3);

	        
//			Static Table
//	        Printing all the data from the table
	        
	        for(int i=2; i<row; i++) {
	        	for(int j=1; j<colu; j++) {
	       		
	        		 String cellXPath = "//*[@name='BookTable']//tr[" + i + "]//td[" + j + "]";
	        		 String cellValue = driver.findElement(By.xpath(cellXPath)).getText();
	        			        		 
	        		 System.out.print(cellValue + "\t");
	        	}
	        	
       		 String price = "//*[@name = 'BookTable']//tr[" + i + "]//td[4]";
       		 int pricrR = Integer.parseInt(driver.findElement(By.xpath(price)).getText());
	        	
       		System.out.print("\t" + pricrR);
	        System.out.println();
	        
	        }
	
	        
	        
//	        Handling Dynamic Table
	        
       
        	List<WebElement> paginationLinks = driver.findElements(By.xpath("//*[@id='pagination']/li/a"));
            int numberOfPages = paginationLinks.size();
  
            for (int i = 0; i < numberOfPages; i++) {
            
                paginationLinks = driver.findElements(By.xpath("//*[@id='pagination']/li/a"));
                
                paginationLinks.get(i).click();
                
            	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                
                List<WebElement> names = driver.findElements(By.xpath("//table[@id='productTable']//td[2]"));
                
                for (WebElement nameElement : names) {
                    String name = nameElement.getText();
                    System.out.println(name);
                }
            }  
            
            
//            Handling Alerts
            
            WebElement al = driver.findElement(By.id("alertBtn"));
            al.click();
            driver.switchTo().alert().accept();
            
            
            WebElement al2 = driver.findElement(By.id("confirmBtn"));
            al2.click();
            driver.switchTo().alert().accept();
//            driver.switchTo().alert().dismiss();
            
            
            driver.findElement(By.id("promptBtn")).click();
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("World");
            alert.accept();
            
            
//            Performing different Actions class
//            MouseHover
            
            WebElement btn = driver.findElement(By.xpath("//button[@class='dropbtn']"));
            WebElement subBtn = driver.findElement(By.xpath("//*[@class=\"dropdown-content\"]/a[text()='Mobiles']"));
            Actions act = new Actions(driver);
            act.moveToElement(btn).moveToElement(subBtn).build().perform();
            act.click();
            
//            doubleClick
            
            WebElement inp1 = driver.findElement(By.xpath("//*[@id='field1']"));
            WebElement inp2 = driver.findElement(By.xpath("//*[@id='field2']"));
            WebElement btn1 = driver.findElement(By.xpath("//*[text() = 'Copy Text']"));
            
            inp1.clear();
            inp1.sendKeys("Nishant");
            
            act.doubleClick(btn1).perform();

            String tex1 = inp1.getAttribute("value");
//            System.out.println("Text for inp1 "+tex1);
            String tex2 = inp2.getAttribute("value");
 //           System.out.println("Text for inp2 "+tex2);
            
            if(tex1.equals(tex2)) {
            	System.out.println("Both the text are equal...");
            } else {
            	System.out.println("Text is not matching...");
            }
            
            
//            Drag and Drop
            
            WebElement src = driver.findElement(By.xpath("//*[@id = 'draggable']"));
            WebElement des = driver.findElement(By.xpath("//*[@id = 'droppable']"));
         
            act.dragAndDrop(src, des).perform();

            
            
            
            
            
           driver.quit();
            
            

	}
		

}
