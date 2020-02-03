package twentyfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Even 
{
	static

	{System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/count.html");
		
		
		List<WebElement> allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count= allcb.size();
		System.out.println(count);
		for(int i=0; i<count;i++)
		{
			if(i%2==0)
				
		{
			WebElement cb=allcb.get(i);
			cb.click();
			Thread.sleep(1000);
			
		}
		}
		
		Thread.sleep(2000);
		driver.close();
		
	
	

}

}
