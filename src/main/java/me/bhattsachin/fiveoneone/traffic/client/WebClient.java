package me.bhattsachin.fiveoneone.traffic.client;
import java.io.IOException;

import me.bhattsachin.fiveoneone.traffic.model.destination.Destinations;
import me.bhattsachin.fiveoneone.traffic.model.origin.Origins;
import me.bhattsachin.fiveoneone.traffic.model.path.Paths;
import me.bhattsachin.fiveoneone.traffic.util.WebResponseHandler;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * This example demonstrates the use of the {@link ResponseHandler} to simplify
 * the process of processing the HTTP response and releasing associated resources.
 */
public class WebClient {
	
	private final String BASE_URL = "http://services.my511.org/traffic/";
	private final String TOKEN = "33f74986-ede3-4e51-9755-05eb1486e4f7";
	
	
	public Origins fetchOrigin() throws ClientProtocolException, IOException{
		 CloseableHttpClient httpclient = HttpClients.createDefault();
		 Origins response=null;
	        try {
	            HttpGet httpget = new HttpGet("http://services.my511.org/traffic/getoriginlist.aspx?token=33f74986-ede3-4e51-9755-05eb1486e4f7");
	           
	           response = httpclient.execute(httpget, new WebResponseHandler<Origins>(Origins.class)); 
	            System.out.println("----------------------------------------");
	           if(response!=null){
	        	   
	        	   for(Origins.Origin destin : response.getDestination()){
	        		   System.out.println(destin);
	        		   
	        	   }
	        	   System.out.println("total of : " + response.getDestination().size());
	           }
	        } finally {
	            httpclient.close();
	        }
		
		return response;
	}
	
	public Destinations fetchDestination(String origin) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		 Destinations response=null;
	        try {
	            HttpGet httpget = new HttpGet("http://services.my511.org/traffic/getdestinationlist.aspx?token=33f74986-ede3-4e51-9755-05eb1486e4f7&o=" + origin);
	           
	           response = httpclient.execute(httpget, new WebResponseHandler<Destinations>(Destinations.class)); 
	            System.out.println("----------------------------------------");
	           if(response!=null){
	        	   
	        	   for(Destinations.Destination destin : response.getDestination()){
	        		   System.out.println(destin);
	        		   
	        	   }
	        	   System.out.println("total of : " + response.getDestination().size());
	           }
	        } finally {
	            httpclient.close();
	        }
		
		return response;
		
	}
	
	public Paths fetchPath(String origin, String destination) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient = HttpClients.createDefault();
		Paths response=null;
	        try {
	        	String url = "http://services.my511.org/traffic/getpathlist.aspx?token=33f74986-ede3-4e51-9755-05eb1486e4f7&o=" + origin + "&d=" + destination;
	        	//System.out.println(url);
	            HttpGet httpget = new HttpGet(url);
	           
	           response = httpclient.execute(httpget, new WebResponseHandler<Paths>(Paths.class)); 
	            //System.out.println("----------------------------------------");
	           if(response!=null){
	        	   
	        	  
	        	   //System.out.println("total of : " + response.getPath().size());
	           }
	        } finally {
	            httpclient.close();
	        }
		
		return response;
	}
	

    //public final static void main(String[] args) throws Exception {
      //  WebClient client = new WebClient();
       // client.fetchOrigin();
        //client.fetchDestination("332");
      //  client.fetchPath("56", "332");
    //}


	private static void sampleMethod() throws IOException,
			ClientProtocolException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet("http://www.google.com/");

            System.out.println("Executing request " + httpget.getRequestLine());

            // Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }

            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("----------------------------------------");
            System.out.println(responseBody);
        } finally {
            httpclient.close();
        }
	}

}
