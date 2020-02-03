package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectM 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/sample11.html");
		
		WebElement menu = driver.findElement(By.id("hotel"));
		Select sel=new Select(menu);
		
		boolean v=sel.isMultiple();
		if(v)
		{
			System.out.println(v);
			
		}
		
		else
		{
			System.out.println(v);
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
