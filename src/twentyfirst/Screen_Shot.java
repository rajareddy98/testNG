package twentyfirst;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot 
{
	static

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./demo.png");
		
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
