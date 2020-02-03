package apractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelAlloptions 
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
		
		WebElement menu= driver.findElement(By.id("hotel"));
		
		Select sel=new Select(menu);
		List<WebElement> allopt = sel.getOptions();
		
		int count=allopt.size();
		System.out.println(count);
		for(WebElement opt:allopt)
		{
			String text=opt.getText();
			System.out.println(text);
			
		}
		
		Thread.sleep(1000);
		driver.close();
		
			
		
	}

}
