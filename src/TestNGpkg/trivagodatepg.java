package TestNGpkg;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class trivagodatepg {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com.tr/");
	}
	@Test
	public void datepicker() throws Exception
	{
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
		datepickermethod("December 2024","23");
		datepickermethod("December 2024","27");
		
		
		
	}
	private void datepickermethod(String expmonth,String expdate) {
		while(true)
		{
			String month= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			System.out.println("month="+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
			
		}
		List<WebElement> dates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));
		for(WebElement d:dates)
		{
			String datetext=d.getText();
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
			
		
	}
	}
}

