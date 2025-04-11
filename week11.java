
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week11{
	public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        WebElement register=driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/div/div[1]/span[1]"));
        register.click();
        
        WebElement signup=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]"));
        signup.click();
        
        WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div/div[2]/button"));
        login.click();
        
       
		        WebElement MobileNum=driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
		        MobileNum.sendKeys("9686548596");
		        Thread.sleep(100000);
		        		        
		        WebElement registerbtn=driver.findElement(By.className("submitBottomOption"));
		        registerbtn.click();
		        Thread.sleep(20000);
		         
		        WebElement registerbtnn=driver.findElement(By.className("submitBottomOption"));
		        registerbtnn.click();
		        Thread.sleep(20000);
		        
		        WebElement otp1=driver.findElement(By.xpath("otp1"));
		        otp1.sendKeys("5"); 	
		        Thread.sleep(100);
		        
		        WebElement otp2=driver.findElement(By.xpath("otp2"));
		        otp2.sendKeys("5"); 	
		        Thread.sleep(100);
		        
		        WebElement otp3=driver.findElement(By.xpath("otp3"));
		        otp3.sendKeys("4"); 	
		        Thread.sleep(100);
		        
		        WebElement otp4=driver.findElement(By.xpath("otp4"));
		        otp4.sendKeys("8"); 	
		        Thread.sleep(100);
		       
		        
		        
		        }
	}
