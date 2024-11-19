package TestNGpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("before test,browser open");
	}
	@BeforeMethod
	public void mthd()
	{
		System.out.println("url loading");
	}
	@Test(priority=4,dependsOnMethods= {"test2"})
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority=2,enabled=false)
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(priority=5,invocationCount=2)
	public void test4()
	{
		System.out.println("test 4");
	}
	@Test(priority=1)
	public void test5()
	{
		System.out.println("test 5");
	}
	@AfterMethod
	public void aftermth()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}

}
