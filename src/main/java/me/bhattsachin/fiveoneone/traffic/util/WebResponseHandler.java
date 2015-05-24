package me.bhattsachin.fiveoneone.traffic.util;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/**
 * Handles origin part of the request
 * @author root
 *
 * @param <Origins>
 */
public class WebResponseHandler<T> implements ResponseHandler<T>{
	JAXBContext context= null;
	Unmarshaller unmarshaller = null;
	private Class<T> type;
	
	@SuppressWarnings("unchecked")
	public WebResponseHandler(Class<T> type) {
		super();
		this.type = type;
	}


	@SuppressWarnings("unchecked")
	public T handleResponse(
             final HttpResponse response) throws ClientProtocolException, IOException {
         int status = response.getStatusLine().getStatusCode();
         String responseText = null;
         if (status >= 200 && status < 300) {
        	 try{
        	context = JAXBContext.newInstance(this.type);
     		unmarshaller = this.context.createUnmarshaller();
        	 HttpEntity entity = response.getEntity();
        	 responseText = EntityUtils.toString(entity);
        	 StringReader reader = new StringReader(responseText);
             return (T)unmarshaller.unmarshal(reader);
        	 }catch(Exception ex){
        		 TrafficFileWriter.append(TrafficFileWriter.FILE_TYPES.EXCEPTION.name(), responseText);
        		 System.out.println(ex);
        		 return null;
        	 }
         } else {
             throw new ClientProtocolException("Unexpected response status: " + status);
         }
     }

}
