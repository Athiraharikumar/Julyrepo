package TestNGpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class fileupload_autoit {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
			
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testing() throws InterruptedException, IOException 
	{
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");	
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();//BUTTON CLICK
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\USER\\Downloads\\fileupload.exe");
		Thread.sleep(3000);
	}
}
