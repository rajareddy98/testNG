package apractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
			Actions act = new Actions(driver);
			act.contextClick(link).perform();
			Thread.sleep(1000);
			
			Robot r= new Robot();
			
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(1000);
			
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(1000);
			driver.close();
			
		
	}

}
