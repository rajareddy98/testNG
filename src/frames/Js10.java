package frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js10 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<10;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,-500)");
		
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
