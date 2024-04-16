package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		Actions action = new  Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		driver.switchTo().frame((WebElement) By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		

		
		WebElement drag = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
        action.dragAndDrop(drag, drop).perform();
	}

}


