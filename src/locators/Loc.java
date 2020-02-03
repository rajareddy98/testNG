package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc 
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
		driver.get("C:\\Users\\RAJAREDDY\\Desktop/loc");
		
		
		
		driver.findElement(By.id("g")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.name("gm")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.className("gmail")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.linkText("FaceBook")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		
		
		driver.findElement(By.partialLinkText("il")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}



