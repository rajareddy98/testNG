package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("rajareddy.papi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("sqwert12");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logoutbutton")).click();
		Thread.sleep(2000);
		driver.close();
		
			
		
		
	}

}
