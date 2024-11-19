package JunitPrgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redifflink {
	ChromeDriver driver;
	WebDriverWait wait;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		int linkcount=li.size();
		if(linkcount==30)
		{
			System.out.println("link count=30");
		}
		else
		{
			System.out.println("link count is actually"+linkcount);
		}
		//for (WebElement eke:li)
		{
			//System.out.println("Link Text:"+ele.getText());
		//	System.out.println("Link URL:"+ele.getAttribute("href"));
		}
	}
	@Test
	public void checktext()
	{
		String etext="Create a Rediffmail account";
		String src=driver.getPageSource();
		if(src.contains(etext))
		{
			System.out.println("Contains text");
		}
		else
		{
			System.out.println("not contains");
		}
	}
	
	
	}


