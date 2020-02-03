package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fr1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/page1.html");
		driver.findElement(By.id("me")).sendKeys("raja");
		WebElement f= driver.findElement(By.xpath("//iframe"));
		
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gf2")).sendKeys("xyz");
		
		driver.switchTo().frame(f);
		driver.findElement(By.id("gf1")).sendKeys("abc");
		
		Thread.sleep(2000);
		driver.close();
		
		
		 
		
	}

}
