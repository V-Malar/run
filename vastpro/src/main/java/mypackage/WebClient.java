package mypackage;

import java.net.URL;
import java.net.URLConnection;

public class WebClient {
	public static void main(String[] args)throws Exception {
		URL url=new URL("http://localhost:8080/vastpro/malarv");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();
	}
}
