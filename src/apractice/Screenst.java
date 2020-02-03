package apractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenst 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void getscreenshot(WebDriver driver,String name)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des= new File("./" +name+ ".png");
		try
		{
			
			FileUtils.copyFile(src,des);
			
		}
		catch(IOException e)
		{

		}
	}
	
		
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			getscreenshot(driver, "raja");
			Thread.sleep(2000);
			driver.close();
			
		}
}

		