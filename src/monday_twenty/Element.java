package monday_twenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element 
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
		WebElement link=driver.findElement(By.xpath("(//a)[1]"));
		boolean v=link.isDisplayed();
		if(v)
		{
			System.out.println("dispalyed");
			
		}
		else
		{
			System.out.println("not displayed");
			
			
		}
		Thread.sleep(2000);
		driver.close();
		
				
			
		
	}

}
