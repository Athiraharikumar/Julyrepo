package Test;

import org.testng.annotations.Test;

import Page.Fbcreatepage;

public class Fbcreatepagetxt extends Baseclass {
	@Test
	public void createpagetest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.checktext();
		ob.signupbtn();
	}
	

}
