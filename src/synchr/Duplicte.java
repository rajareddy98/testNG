package synchr;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicte 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
			driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/sample11.html");
		WebElement menu = driver.findElement(By.id("hotel"));
			 Select sel=new Select(menu);
			 List<WebElement> allopt = sel.getOptions();
			HashSet<String> hs = new HashSet<>();
			 
			 for(WebElement opt   :  allopt)
			 {
				 String text=opt.getText();
				 if(!hs.add(text))
				 {
					 System.out.println(text);
			
				 }
				 
			 }
			 
				 
			 
			 Thread.sleep(2000);
			 driver.close();
	}
}
		
	


