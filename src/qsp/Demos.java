package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demos 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		System.out.println("Enter Browser name");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Enter Browser Name");
			
		}
		
		Thread.sleep(2500);	
		driver.close();
		
		
	}

}
