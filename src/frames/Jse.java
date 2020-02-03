package frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/fb.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"un\").value=\"\" ");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById(\"un\").value=\"raja\" ");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('fb').click()");
		Thread.sleep(2000);
		driver.close();
		
	}

}
