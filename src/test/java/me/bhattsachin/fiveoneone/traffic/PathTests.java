package me.bhattsachin.fiveoneone.traffic;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import me.bhattsachin.fiveoneone.traffic.client.WebClient;
import junit.framework.TestCase;

public class PathTests extends TestCase {

	public static void main(String args[]) throws ClientProtocolException, IOException{
		WebClient client = new WebClient();
		System.out.println(client.fetchPath("759", "797"));
	}
}
