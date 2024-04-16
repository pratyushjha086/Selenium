package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class uncodemy {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://uncodemy.com/");
        //driver.manage().window().fullscreen();
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        WebElement bot = driver.findElement(By.xpath("//i[@class='fa-regular fa-rectangle-xmark chatb']"));
        bot.click();
        WebElement abc = driver.findElement(By.xpath("//span[@class='mainc Mane']"));
        a.moveToElement(abc).perform();
        Thread.sleep(5000);
        WebElement ab = driver.findElement(By.xpath("//*[@id=\"categories-menu\"]/menuitem/menu/menuitem[3]/a"));
        a.moveToElement(ab).perform();
		Thread.sleep(1000);
        
	}

}
