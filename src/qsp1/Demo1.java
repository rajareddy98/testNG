package qsp1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.ie.driver";
		String value="./drivers/IEDriverserver.exe";
		System.setProperty(key,value);
		InternetExplorerDriver ie=new InternetExplorerDriver();
		Thread.sleep(2000);
		ie.close();
		
		
	}

}
 