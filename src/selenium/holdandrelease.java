package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class holdandrelease {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		Boolean a,b,c;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
        WebElement po = driver.findElement(By.xpath("//button[@type='submit']"));
        a = po.isDisplayed();
        b = po.isEnabled();
        System.out.println(a);
        System.out.println(b);
        if(a== true && b == false) {
        	WebElement uname = driver.findElement(By.xpath("//input[@name= 'username']"));
            uname.sendKeys("Admin");
            WebElement pwd = driver.findElement(By.xpath("//input[@name= 'password']"));
            pwd.sendKeys("admin123");
            po.click();
            
        }
        else {
        	driver.navigate().refresh();
        	Thread.sleep(2000);
        	TakesScreenshot TS = (TakesScreenshot)driver;
            Thread.sleep(2000);
            File src = TS.getScreenshotAs(OutputType.FILE);
            File DS = new File ("D:\\Out4.png");  
            Thread.sleep(2000);
            FileUtils.copyFile(src, DS);
            System.out.println("Screenshot is Captured");

        }
	}

}
