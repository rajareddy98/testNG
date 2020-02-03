package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_Page
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
		
		String atitle=driver.getTitle();
		String etitle="Login to facebook ! Facebook";
		
		if(atitle.equals(etitle))
		{
			System.out.println("title is matching");
			
		}
			
		else
		{
			System.out.println("title is not matching");
			
		}
		Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
