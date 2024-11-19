package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demogureu99dragndrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	    WebElement destination=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
	    Actions act=new Actions(driver);
		act.dragAndDrop(source,destination).perform();
		
		

		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	    WebElement acc=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(sales,acc).perform();
		
		WebElement am1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement am2 =driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(am1,am2).perform();
		
		WebElement am3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement am4 =driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(am3,am4).perform();
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		
		if(button.isDisplayed()) {
			System.out.println("The butto is displayed");
		}
		else
		{
			System.out.println("The butto is not displayed");
		}
		
		
	}

}
