package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/table.Html");
		
		List<WebElement> alltables = driver.findElements(By.xpath("/table"));
		int count=alltables.size();
		System.out.println(count);
		Thread.sleep(2000);
		driver.close();
		
	}
	
	

}
