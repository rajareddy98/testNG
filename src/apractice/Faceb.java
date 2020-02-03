package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faceb 
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
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rajareddy.papi@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("reddy*666",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(6);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		 
		
		
		
	}

}
