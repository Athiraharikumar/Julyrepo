package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathfblogin {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void pathfblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
