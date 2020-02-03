package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://paytm.com/");
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
				
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
