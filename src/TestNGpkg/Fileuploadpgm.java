package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {
	ChromeDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\USER\\Desktop");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		String buttontxt=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		if(buttontxt.equals("submit"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
}

