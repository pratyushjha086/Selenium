package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class child {
           WebDriver driver = new ChromeDriver();
           void navigate()
           {
        	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
           }
           
}
