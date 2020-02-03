package twentyfirst;

import java.util.ArrayList;
import java.util.List;

public class ListEx 
{
	/*static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
	}
	*/
	{System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");}
	
	
	
	
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		
		int count=al.size();
		System.out.println("count");
		
		
		for(int i=0; i<count;  i++)
		{
			String text=al.get(i);
			System.out.println(text);
		}
		
		
		
	}

}
