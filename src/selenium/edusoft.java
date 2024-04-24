package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class edusoft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://topsoftwarecourses.com/");
		//driver.manage().window().maximize();
		
		WebElement KOC = driver.findElement(By.xpath("//button[contains(@class,'banner-lfe-btn')]"));
		KOC.click();
		Thread.sleep(2000);
		WebElement DSM = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[1]/div[2]/a[2]"));
		DSM.click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement DAP = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[2]/div[2]/a[2]"));
		DAP.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement ML = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[3]/div[2]/a[2]"));
		ML.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement ST = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[4]/div[2]/a[2]"));
		ST.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement MSD = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[5]/div[2]/a[2]"));
		MSD.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement PFS = driver.findElement(By.xpath("//body/div[@class='our-course-container mt-4']/div[6]/div[2]/a[2]"));
		PFS.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}

}
