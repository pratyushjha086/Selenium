package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Firstcrylogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://firstcrystore.in/");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement Account = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/ul/a[1]"));
		Account.click();
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pratyush1@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		action.moveToElement(signin).click().perform();
	

	}

}4
