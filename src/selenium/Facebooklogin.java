package selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
//			driver.manage().window().fullscreen();
//			WebElement uname = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
//			uname.sendKeys("pratyushjha086@gmail.com");
//			WebElement pwd = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
//			pwd.sendKeys("Jha659656");
//			WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
//			login.click();
			String parentwid = driver.getWindowHandle();
			System.out.println(parentwid);
			Set<String> allwid = driver.getWindowHandles();
			System.out.println(allwid);
			WebElement insta = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
			insta.click();
			WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
			uname.sendKeys("126");
			WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
			pwd.sendKeys("5648");
			
			
			
	}

}
