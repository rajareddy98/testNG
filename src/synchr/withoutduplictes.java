package synchr;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutduplictes 
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
			  LinkedHashSet<String> ls = new  LinkedHashSet<>();
			 for(WebElement opt   :  allopt)
			 {
				 String text=opt.getText();
				 ls.add(text);
				 
			 }
			 for(String h : ls)
			 {
				 System.out.println(h);
				 
			 }
			 Thread.sleep(2000);
			 driver.close();
				 
		
	}

}
