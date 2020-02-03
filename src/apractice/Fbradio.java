package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbradio 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.xpath("//*[@id=\"u_0_15\"]/span[1]/label"));
		WebElement e = driver.findElement(By.xpath("//*[@id=\"u_0_15\"]/span[2]/label"));
		
		
		boolean v = w.isSelected();
		
		if(v)
		{
			System.out.println("selectedd");
			
		}
		
		else
		{
			System.out.println("not selected");
			
		}
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}

}
