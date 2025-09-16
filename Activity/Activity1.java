package Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); 
        driver.get("https://www.google.com/");
        
        String actual_out = driver.getTitle();
        
        if (actual_out.equals("Google")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
