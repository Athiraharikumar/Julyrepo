package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
	WebElement createpagetxt;
	
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void checktext()
	{
		String acttxt=createpagetxt.getText();
		System.out.println(acttxt);
		String exptxt="create a page";
		if(acttxt.equalsIgnoreCase(exptxt))
		{
			System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
public void signupbtn()
{
	signup.click();

	

}
}
