package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {
 
	static String baseurl="https://www.google.com";
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		String exp="About";
		if(src.contains(exp))
		{
			System.out.println("The page contain about option");
		}
		else
		{
			System.out.println("The page doesnot contain about option");
		}
		
		

	}

}
