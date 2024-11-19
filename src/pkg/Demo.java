package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); //to open chrome browser
		driver.get("https://www.google.com");    //to launch web application
		String actualttitle=driver.getTitle();
		String expecttitle="Google";
		
		if(actualttitle.equals(expecttitle))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}

}
