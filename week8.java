import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wk8 {
	public static void main(String[] args) throws InterruptedException,AWTException{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("cmrit hyderabad");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement img=driver.findElement(By.xpath("//*[@id=\"hdtb-sc\"]/div/div[1]/div[1]/div/div[2]/a/div"));
		img.click();
		WebElement imgCmrit=driver.findElement(By.xpath("//*[@id=\"dimg_36cAaM7OI5CRnesPp_G1wQ0_25\"]"));
		Actions action = new Actions(driver);
		action.contextClick(imgCmrit).build().perform();
		Robot robot=new Robot();
		
//		for(int i=1;i<=7;i++)
//		{
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
//		}
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("downloaded");
		Thread.sleep(4000);
		driver.quit();
		
}
}