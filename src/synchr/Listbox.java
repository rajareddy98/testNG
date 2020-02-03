package synchr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox 
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
		 ArrayList<String> al = new ArrayList<>();
		 for(WebElement opt:allopt)
		  {
			  String text=opt.getText();
				 al.add(text);
		  }
		 HashSet<String> hs = new HashSet<>(al);
		 if(al.equals(hs))
		 {
			 System.out.println("no duplicates");
			 
		 }
		 else
		 {
			 System.out.println("duplicates");
			 
		 }
		 Thread.sleep(2000);
		 driver.close();
		 
	
	}

	
	
}
