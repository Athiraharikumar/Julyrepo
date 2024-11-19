package JunitPrgm;


import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecode {
	String link="https://www.google.com";
	@Test
	public void test() throws Exception
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		int code=con.getResponseCode();
		System.out.println("response code="+ code);
	}

}
