package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pw = driver.findElement(By.name("pwd"));
		
		
		
		Dimension und = un.getSize();
		int unh = und.getHeight();
		int unw = und.getWidth();
		System.out.println(unh +"\t"+ unw);
		
		
		Dimension pwd = pw.getSize();
		int pwh = pwd.getHeight();
		int pww = pwd.getWidth();
		System.out.println(pwh +"\t"+ pww);
		
		if(unh==pwh && unw==pww)
		{
			System.out.println("both text boxes are same");
			
		}
		
		else
		{
			System.out.println("both are not same");
			
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
		
				
	}

}
