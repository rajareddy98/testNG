package apractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("kadapa");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"onward_cal\"]"));
		String dateVal = "30-10-2019";
		
		selectDateByJS(driver, date, dateVal);
		
	}
	
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) throws InterruptedException
	{
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	Thread.sleep(2000);
	
		
	List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/span"));
	
	
	for(int i=0; i<list.size(); i++)
	{
		System.out.println(list.get(i).getText());
		
		
		
		
	}	
			
	}
	
}