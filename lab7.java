
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class lab7 {
	public static void main(String args[]) throws InterruptedException{

		System.setProperty("webDriver.chrome.driver","C:\\Users\\student\\Desktop\\5AH\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement searchBar = driver.findElement(By.name("q"));
	    searchBar.sendKeys("CMRIT");
	    searchBar.sendKeys(Keys.ENTER);
	    Thread.sleep(15000);
	    driver.quit();
	    
		}

	}
			