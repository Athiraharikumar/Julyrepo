package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobutton {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void button()
	{
		WebElement button=driver.findElement(By.xpath("//input[1][contains(@name,'gender')]"));
		if(button.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
	}
	

}
