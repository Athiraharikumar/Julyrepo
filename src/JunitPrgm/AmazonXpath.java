package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();//for maximise inspect screen
	}
	@Test
	public void  amazonlogin()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.navigate().back();  //to move into back page
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	}

}
