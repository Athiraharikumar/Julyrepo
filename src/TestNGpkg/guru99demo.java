package TestNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru99demo {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test() throws Exception
	{
		WebElement but1=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(but1);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]")).click();
		driver.switchTo().alert().accept();
		WebElement d=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(d);
		act.perform();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
	
	
		
		
		
	}

}
