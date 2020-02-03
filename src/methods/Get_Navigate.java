package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Navigate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}

}
