
public class week4 {


	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.*;


		public static void main(String args[]) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://cmritautonomous.org/BeesERP/Login.aspx?ReturnUrl=%2Fbeeserp%2FLogin");
			WebElement username=driver.findElement(By.name("txtUserName"));
			username.sendKeys("20r01a05k6p");
			Thread.sleep(2000);
			WebElement nxtbtn = driver.findElement(By.name("btnNext"));
			nxtbtn.click();
			WebElement password = driver.findElement(By.name("txtPassword"));
			password.sendKeys("20r01a05k6p");
			Thread.sleep(2000);
			WebElement submitBtn = driver.findElement(By.name("btnSubmit"));
			submitBtn.click();
		
	}

