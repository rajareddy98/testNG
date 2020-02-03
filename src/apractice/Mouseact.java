package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseact 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/");
		
		Actions actions= new Actions(driver);
		
		WebElement main = driver.findElement(By.linkText("Main page"));
		 actions.moveToElement(main);
		 
		 driver.navigate().forward();
		 
		 WebElement main1 = driver.findElement(By.linkText("Biography"));
		 actions.moveToElement(main1);
		 
		 //actions.click().build().perform();
		 
		 
		 try
		 {
			 Thread.sleep(2000);
			 actions.click().build().perform();
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		
		 Thread.sleep(2000);
		 driver.close();
		 
		
	}
}
