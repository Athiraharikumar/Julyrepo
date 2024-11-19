package JunitPrgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		WebElement searchfield= driver.findElement(By.name("//textarea[@id='APjFqb']"));
		searchfield.sendKeys("books",Keys.ENTER);
	}

}
