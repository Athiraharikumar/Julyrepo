package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void drop()
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select ob=new Select(day);
		ob.selectByValue("16");
		
		WebElement Month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select ob1=new Select(Month);
		ob1.selectByVisibleText("JAN");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select ob2=new Select(year);
		ob2.selectByIndex(1);
		
	}

}
