package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
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
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rajareddy.papi@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		
			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reddy*666",Keys.ENTER);
		
		driver.close();
		
		
	}
}