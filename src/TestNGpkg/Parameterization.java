package TestNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters("s")
	@Test
	public void test(String s)
	{
		System.out.println("Jmeter");
	}

}
