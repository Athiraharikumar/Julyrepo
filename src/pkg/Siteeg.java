package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Siteeg {
	static String baseurl="https://www.Gmail.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String actualttitle=driver.getTitle();
		String expecttitle="Gmail";
		
		if(actualttitle.equals(expecttitle))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}

		String src="My Account";
		if(src.contains(src))
		{
			System.out.println(" option available");
		}
		else
		{
			System.out.println(" option not available");
		}
		
		

	}


		

	}


