package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jirctc 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		 driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(2000);
		 
		 Alert a=driver.switchTo().alert();
		 
		 String text = a.getText();
		 System.out.println(text);
		 
		 a.accept();
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		
		
		
		
	}
}
