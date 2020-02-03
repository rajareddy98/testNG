package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
		driver.findElement(By.id("identifierId")).sendKeys("rajareddy9025@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.className("RveJvd snByac")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("likith$143");
		Thread.sleep(2000);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(2000);
		driver.close();
		
			
		
	}

}
