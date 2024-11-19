package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Java/Webpage.html");
		driver.manage().window().maximize();
	}
	@Test
	public void alertlogin()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alert=a.getText();
		System.out.println("Alert text"+alert);
		a.accept();
		//a.dismiss();//to cancel alert
		driver.findElement(By.name("firstname")).sendKeys("athira");
		driver.findElement(By.name("lastname")).sendKeys("harikumar");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
