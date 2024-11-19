package TestNGpkg;


import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandling {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();//single tab details akkan
		System.out.println("tilte of google"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		
		driver.switchTo().window(parentwindow);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com");
		System.out.println(driver.getTitle());
		
		
		ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());//multiple tab details akkan
		driver.switchTo().window(windowdetails.get(1));
	}
	

}
