package monday_twenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/samp.html");
		WebElement unA=driver.findElement(By.id("un"));
		boolean v=unA.isEnabled();
		if(v)
		{
			System.out.println(v);
			
		}
		else
		{
			System.out.println(v);
			
		}
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
