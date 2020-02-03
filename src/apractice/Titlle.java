package apractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlle 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
