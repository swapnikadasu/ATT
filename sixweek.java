
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class sixweek{
	public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");
        WebElement register=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span"));
        register.click();
        
       
		        WebElement MobileNum=driver.findElement(By.className("username"));
		        MobileNum.sendKeys("9874563421");
		        Thread.sleep(1000);
		        		        
		        WebElement registerbtn=driver.findElement(By.className("login-btn"));
		        registerbtn.click();
		        Thread.sleep(2000);
		        
		        WebElement gendbtn=driver.findElement(By.className("gender-opt"));
		        gendbtn.click();
		        Thread.sleep(1000);
		        
		        WebElement first=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[5]/input"));
		        first.sendKeys("swapnika");
		        Thread.sleep(1000);
		        
		        WebElement email=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[7]/input"));
		        email.sendKeys("abftrdt1234@gmail.com");
		        Thread.sleep(1000);
		        
		        WebElement tnc=driver.findElement(By.xpath("//*[@id=\"tncCheckbox\"]"));
		        tnc.click();
		        Thread.sleep(1000);
		        
		        WebElement submitter=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div[12]/input"));
		        submitter.click();
		        Thread.sleep(1000);
		        
		        WebElement otp=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div/div[2]/div[1]/input"));
		        otp.sendKeys("568785");
		        Thread.sleep(1000);
		        
		        WebElement finalsub=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div[2]/form/div/div[3]/input"));
		        finalsub.click();
		        Thread.sleep(2000);
		        driver.quit();	}
	}