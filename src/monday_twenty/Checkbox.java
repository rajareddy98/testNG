package monday_twenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ch=driver.findElement(By.id("keepLoggedInLabel"));
		
		boolean v=ch.isSelected();
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
