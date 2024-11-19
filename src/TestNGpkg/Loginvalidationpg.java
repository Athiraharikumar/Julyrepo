package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginvalidationpg {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void login() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("sreeja@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("hari123");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(3000);
	
		String eurl="/https://keralaproperty.in/member/myhome/";
		
		
		String aurl=driver.getCurrentUrl();
		if(eurl.equalsIgnoreCase(aurl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}



























//https://keralaproperty.in/member/myhome/