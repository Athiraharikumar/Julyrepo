package TestNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffTestNG {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod(alwaysRun=true)
	public void beforemthd()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test(groups={"sanity","regression"})
	public void logotest()
	{
WebElement rediflogo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	
		
		if(rediflogo.isDisplayed())
	{
		System.out.println("logo is present");
	}
	else
		
	{
		
	System.out.println("logo is not present");
	}
	}
	@Test(groups= {"sanity"})
	public void Radiobutton()
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
	@Test(groups= {"regression"})
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
	}
	@Test(groups= {"smoke"})
	public void dropdown()
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


