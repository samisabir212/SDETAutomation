package HttpUrlConnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.testng.annotations.Test;

public class Test_PostCall {
	
	
	@Test()
	public void testPostCall() throws Exception {
		
		sendPost();
		
	}
	
	private static void sendPost() throws Exception {

		String url = "https://api.flickr.com/services/rest";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
//		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
//		https://api.flickr.com/services/rest?method=flickr.cameras.getBrands&api_key=de2c6955bf435096d9b7247694d33b75&format=soap&nojsoncallback=1
		String urlParameters = "method=flickr.cameras.getBrands&api_key=de2c6955bf435096d9b7247694d33b75&format=soap&nojsoncallback=1";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());

	}

	

}
