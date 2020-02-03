package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/frame1.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("me")).sendKeys("raja");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.findElement(By.id("gf2")).sendKeys("xyz");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.findElement(By.id("gf1")).sendKeys("abc");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		driver.findElement(By.id("g")).sendKeys("def");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ph")).sendKeys("25478");
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		
		
	}

}
