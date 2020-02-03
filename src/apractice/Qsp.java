package apractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsp 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("qspiders");
		
		List<WebElement> allsug = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		for(WebElement sug:allsug)
		{
			String text = sug.getText();
			if(text.equals("qspiders hebbal"))
			{
				Thread.sleep(2000);
				sug.click();
			
						
				
				
			}
			
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
