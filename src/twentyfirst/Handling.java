package twentyfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling 
{
	static
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/handling.Html");
		
		List<WebElement> alllinkes = driver.findElements(By.xpath("/a"));
		
		int count=alllinkes.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = alllinkes.get(i);
			String text = link.getText();
			System.out.println(text);
			
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
