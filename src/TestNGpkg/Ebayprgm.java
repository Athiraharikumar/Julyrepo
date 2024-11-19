package TestNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebayprgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//it is for implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement electonics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electonics); //it is used for mouseover
		act.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		//driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		act.perform();
	}

}
