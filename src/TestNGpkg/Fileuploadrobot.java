package TestNGpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void fileuploadpgm() throws Exception
	
	{
		
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		Fileupload("C:\\Users\\USER\\Desktop\\resume1.docx");
		
	}
	
		
		
	public void Fileupload(String p) throws AWTException, InterruptedException {
		
	
		StringSelection strselection=new StringSelection(p);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
				
				Robot robot=new Robot();
				robot.delay(3000);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_ENTER);
				
				robot.keyRelease(KeyEvent.VK_ENTER);
				//robot.delay(2000);
				Thread.sleep(2000);
		

	}

}
