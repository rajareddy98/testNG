package apractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectone 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/sample11.html");
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"hotel\"]"));
		
		Select sel=new Select(menu);
		Thread.sleep(2000);
		
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		sel.selectByIndex(2);
		Thread.sleep(1000);
		
		sel.selectByIndex(4);
		Thread.sleep(1000);
		
		
		int count=0;
		List<WebElement> allopt = sel.getAllSelectedOptions();
		for(int i=0;i<allopt.size();i++)
		{
			count++;
			WebElement opt = allopt.get(i);
			String text=opt.getText();
			System.out.println(text);
			System.out.println(count);
			
			
		}
		
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
