package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionR 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://www.spicejet.com/");
	
	Actions actions=new Actions(driver);
	
	actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[3]/a")).click();
	
	driver.close();
	
	
}

}
