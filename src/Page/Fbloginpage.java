package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpwd=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String pwd)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpwd).sendKeys(pwd);
	}
	public void login()
	{
		driver.findElement(fblogin).click();;
	}

}
