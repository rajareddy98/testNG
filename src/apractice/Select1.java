package apractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1

{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/RAJAREDDY/Desktop/selenium/sample11.html");
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"hotel\"]"));
		Select sel = new Select(menu);
		
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		sel.selectByValue("i");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("vada");
		Thread.sleep(2000);
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}
	

}
