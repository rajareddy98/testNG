package apractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		String atitle = driver.getTitle();
		String etitle = "Facebook- log in or sign up | Facebook";
		
		if(atitle.equals(etitle))
		{
			System.out.println("Title is matched");
			
		}
		
		else
		{
			System.out.println("Title is not matching");
			
		}
		
		Thread.sleep(2000);
		driver.close();
		
				
		
	}

}
