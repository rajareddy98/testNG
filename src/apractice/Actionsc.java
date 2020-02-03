package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsc 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		
		act.sendKeys(Keys.CONTROL).click(link).build().perform();
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
