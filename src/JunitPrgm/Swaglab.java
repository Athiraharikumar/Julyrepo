package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
	}
	@Test
	public void swaglogin()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("athira");
		driver.findElement(By.id("last-name")).sendKeys("harikumar");
		driver.findElement(By.id("postal-code")).sendKeys("686610");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
	}
    
	
	
	

}
