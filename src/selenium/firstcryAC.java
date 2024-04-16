package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class firstcryAC {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		driver.get("https://firstcrystore.in/");
		Thread.sleep(2000);
		WebElement Account = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/ul/a[1]"));
		Account.click();
		Thread.sleep(1000);
		WebElement CA = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div/span/a"));
		CA.click();
		WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']"));
		FN.sendKeys("Pratyush");
		WebElement LN = driver.findElement(By.xpath("//input[@name='lastname']"));
		LN.sendKeys("Kumar");
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pratyush124@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("123456789");
		WebElement cpwd = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		cpwd.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.xpath("//button[@class='submit-btn']"));
        action.moveToElement(Signin).click().perform();
        Thread.sleep(2000);
//        Alert a = driver.switchTo().alert();
//        Thread.sleep(2000);
//        System.out.println(a.getText());
//        
        TakesScreenshot TS = (TakesScreenshot)driver;
        Thread.sleep(2000);
        File src = TS.getScreenshotAs(OutputType.FILE);
        File DS = new File ("D:\\Out3.png");  
        Thread.sleep(2000);
        FileUtils.copyFile(src, DS);
        System.out.println("Screenshot is Captured");
        //a.accept();
        //Thread.sleep(1000);
        //driver.quit();
 
        	}

}
