package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdrp 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		
		
		Select mon=new Select(month);
		
		//mon.selectByIndex(4);
		
		//mon.selectByVisibleText("Nov");
		mon.selectByValue("12");
		Thread.sleep(3000);
		
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select ddd=new Select(day);
		ddd.selectByIndex(5);
		Thread.sleep(2000);
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		 Select yyy=new Select(year);
		yyy.selectByVisibleText("2008");
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"u_0_15\"]/span[2]/label")).click();;
		
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
