package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
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
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/confirm.html");
		 
		driver.findElement(By.tagName("button")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.dismiss();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
