package twentyfirst;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Screenshot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void getScreenshot(WebDriver  driver, String string)
	
	{
TakesScreenshot ts= (TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./name.png");
		
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) 
		{
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		getScreenshot(driver,"abc");
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
