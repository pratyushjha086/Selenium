package selenium;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
         WebDriver  driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
        // driver.manage().window().fullscreen();
         Thread.sleep(5000);
         WebElement uname = driver.findElement(By.xpath("//input[@name= 'username']"));
         uname.sendKeys("Admin");
         WebElement pwd = driver.findElement(By.xpath("//input[@name= 'password']"));
         pwd.sendKeys("admin123");
         WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
         login.click();
         Thread.sleep(5000);
//         driver.navigate().back();
         Thread.sleep(5000);

         WebElement buzz = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
         buzz.click();
        Thread.sleep(5000);
        WebElement post = driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
        post.sendKeys("Pratyush kumar");
        TakesScreenshot TS = (TakesScreenshot)driver;
        Thread.sleep(2000);
        File src = TS.getScreenshotAs(OutputType.FILE);
        File DS = new File ("D:\\Out5.png");  
        Thread.sleep(2000);
        FileUtils.copyFile(src, DS);
        System.out.println("Screenshot is Captured");

        
        WebElement po = driver.findElement(By.xpath("//button[@type='submit']"));
        po.click();
        
        //Thread.sleep(5000);
//        Alert a= driver.switchTo().alert();
//        System.out.println(a.getText());
        driver.quit();
        
	}
}