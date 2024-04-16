package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("www.facebook.com");
        
        
        
        
        
	}

}
