package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Twenty 
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
		WebElement w=driver.findElement(By.id("u_0_6"));
		WebElement e=driver.findElement(By.id("u_0_7"));
		
		boolean v=w.isSelected();
		
		if(v)
		{
			System.out.println("selected");
			
		}
		else
		{
			System.out.println("not-selected");
			
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
